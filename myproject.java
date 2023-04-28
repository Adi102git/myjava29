import java.util.Scanner;

public class Customer {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      // Prompt the user to enter their username
      System.out.print("Enter your username: ");
      String username = input.nextLine();

      // Display the entered username
      System.out.println("Your username is: " + username);
   }
}

