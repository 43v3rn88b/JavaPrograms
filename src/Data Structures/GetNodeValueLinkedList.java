class GetNodeValueLinkedList{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static int findNodeValueFromTail(Node head, int positionFromTail){
        if(head == null|| positionFromTail<0){
            throw new IllegalArgumentException("invalid");
        }
        int length = findLength(head);
        int position= length - positionFromTail - 1;
        if(position<0){
            throw new IllegalArgumentException("position from tail is out of bounds");
        }
        Node current = head;
        for(int i=0;i<position; i++){
            current = current.next;
        }
        return current.data;
    }
    private static int findLength(Node head){
        int length = 0;
        Node current = head;
        while(current != null){
            length++;
            current = current.next;
        }
        return length;
    }

    public static void main(String[] args) {
        //create singly linkedlist
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next= new Node(5);

        //find the data value at position 2 from the tail
        int positionFromTail = 4;
        int value = findNodeValueFromTail(head, positionFromTail);
        System.out.println("Value " + positionFromTail + " positions from the tail: " + value);
    }
}
