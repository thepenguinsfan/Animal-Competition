import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

class Game {
  void startGame(){
    String greeting = "Hello! Welcome to Walmart Pokemon!";

    System.out.println(greeting);

    System.out.println("In Walmart Pokemon, you or you and another person will pit two animals against eachother in a set of challenges to determine which is the better animal.");
    

      Scanner userConfirmation = new Scanner(System.in);
      
    // prompts user to start game
      System.out.println("Enter 1 to Start!");

      int userGameStart = userConfirmation.nextInt();
      
    // next part of game, currently working on
      if (userGameStart == 1) {
        System.out.println("Select the first Animal:(Enter the number corresponding to the animal you want.)");
        
     //generating animals
        var wolf = new Wolf();
        var cheetah = new Cheetah();
        var snake = new Snake();
        var perryThePlatypus = new PerryThePlatypus();
        // show list of animals
        var animals = new ArrayList<Animal>();
        animals.add(wolf);
        animals.add(snake);
        animals.add(cheetah);
        animals.add(perryThePlatypus);
        int n = animals.size(); // store the number of items in the array list
        for(int i = 0; i < n; i++) {
          var animal = animals.get(i); // retrieve the ith animal
          
        System.out.println(String.format("%d. %s", i, animal.species()));
        }
        // Let player 1 select animal
        Scanner animal1Selection = new Scanner(System.in);

        int animal1 = animal1Selection.nextInt();

        System.out.println(animals.get(animal1).species());

    
        // Let player 1 configure animal(will add)

        // Let player 2 select animal
        System.out.println("Select the second Animal:");
        
        Scanner animal2Selection = new Scanner(System.in);

        int animal2 = animal2Selection.nextInt();

        System.out.println(animals.get(animal2).species());

        
        // Let player 2 configure Animal(will add)

        // randomly select environment
        System.out.println("Selecting Environment...");
        var forest = new Forest();
        var desert = new Desert();
        var environments = new ArrayList<Environment>();
        environments.add(forest);
        environments.add(desert);

        int randomNum = (int)(Math.random() * 2);

        
        System.out.println(environments.get(randomNum).environmentType());

        System.out.println("Selecting Situation..");
        // randomly select situation based off of envrionment
        if (randomNum == 1){
          String desertSituation1 = "The animals have to find water in the desert!";
          String desertSituation2 = "The animals have to find food in the desert!";
          
          var desertSituations = new ArrayList<String>();
          desertSituations.add(desertSituation1);
          desertSituations.add(desertSituation2);

          int randomNum1 = (int)(Math.random() * 2);

          System.out.println(desertSituations.get(randomNum1));
          }
        else if (randomNum == 0){

          String forestSituation1 = "The animals have to find food in the forest!";

          String forestSituation2 = "The animals have to avoid a predator in the forest!";
          var forestSituations = new ArrayList<String>();
          forestSituations.add(forestSituation1); 
          forestSituations.add(forestSituation2);

          int randomNum2 = (int)(Math.random() * 2);

          System.out.println(forestSituations.get(randomNum2));
            
        }

          
            
        

      
      // print the overall matchup(animal1 vs animal2, environment, situation)
      //System.out.println("It's " + animals.get(animal1).species() + " vs " + animals.get(animal2).species() + "!");
        
      // compare animal traits according to environment and situation


        
    }
    }
    
    
      
}