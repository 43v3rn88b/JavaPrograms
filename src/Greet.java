import java.util.Scanner;

public class Greet {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("name: ");
    String name = sc.nextLine();
    System.out.println("Hello, " + name.toUpperCase());
    sc.close();
  }
}
