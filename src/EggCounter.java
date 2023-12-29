import java.util.Scanner;

public class EggCounter {
    public static void main(String[] args) {
        
        System.out.print("How many eggs? ");
        Scanner sc = new Scanner(System.in);
        int egg = sc.nextInt();
        int gross = egg / 144;
        int dozen = egg % 144 / 12;
        int left = egg % 144 % 12;

        System.out.println("Number of eggs is " + gross + " gross, " + dozen + " dozen, and " + left);
        sc.close();
    }
}
