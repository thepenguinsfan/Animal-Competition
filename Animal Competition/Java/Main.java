import java.util.Scanner;

// will add 2 players into the game in coming days
class Main {
  public static void main(String[ ] args) {
    // opening statement
    String greeting = "Hello! Welcome to (insert name here)!";

    System.out.println(greeting);
    // makes a new scanner to scan for user input
    Scanner userNameInput = new Scanner(System.in);
    // prompts user for username
    System.out.println("Enter your Username:");

    String userName = userNameInput.nextLine();
    // welcome user with their desired username
    System.out.println("Welcome " + userName + "!");

    Scanner userConfirmation = new Scanner(System.in);
    // prompts user to start game
    System.out.println("Enter 1 to Start!");

    int userGameStart = userConfirmation.nextInt();
    // next part of game, will work on tomorrow
    if (userGameStart == 1) {
      System.out.println("Select your Animal:");
    }
    
    }
}
