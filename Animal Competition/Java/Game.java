import java.util.Scanner;
import java.util.ArrayList;

class Game {
  void startGame(){
    String greeting = "Hello! Welcome to (insert name here)!";

    System.out.println(greeting);

    Scanner playerNumber = new Scanner(System.in);

    System.out.println("Press 1 for singleplayer. Press 2 for two players.");
    
    int numberOfPlayers = playerNumber.nextInt();
      // if one player is playing
    if (numberOfPlayers == 1) {
      System.out.println("Welcome!");
      
      // makes a new scanner to scan for user input
      Scanner userNameInput = new Scanner(System.in);
      
    // prompts user for username
      System.out.println("Please enter your Username:");

      String userName = userNameInput.nextLine();
    // welcome user with their desired username
      System.out.println("Welcome " + userName + "!");

      // if 2 players are playing
    } else if (numberOfPlayers == 2){
      
      System.out.println("Welcome!");
      
      System.out.println("Player 1 please enter a username:");
      
      Scanner user1NameInput = new Scanner(System.in);
      
      String user1Name = user1NameInput.nextLine();
      
      System.out.println("Player 2 please enter a username:");
      
      Scanner user2NameInput = new Scanner(System.in);
      
      String user2Name = user2NameInput.nextLine();

      System.out.println("Welcome " + user1Name + " and " + user2Name +"!");
        }

      Scanner userConfirmation = new Scanner(System.in);
      
    // prompts user to start game
      System.out.println("Enter 1 to Start!");

      int userGameStart = userConfirmation.nextInt();
      
    // next part of game, will work on 
      if (userGameStart == 1) {
        System.out.println("Select your Animal:");
        
     //generating animals
        var wolf = new Wolf();
        var cheetah = new Cheetah();
        var snake = new Snake();
        var perryThePlatypus = new PerryThePlatypus();
        
        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(wolf);
        animals.add(snake);
        animals.add(cheetah);
        animals.add(perryThePlatypus);
        System.out.println("0. Wolf");
        System.out.println("1. Snake");
        System.out.println("2. Cheetah");
        System.out.println("3. Perry The Platypus");
    }
    }
    
    
      
}