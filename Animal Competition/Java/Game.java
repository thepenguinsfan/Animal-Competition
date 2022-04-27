import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;

class Game {
  void startGame(){

    int animal1Points = 0;
    
    int animal2Points = 0;
    
    this.show("Hello! Welcome to Walmart Pokemon!");
    
    this.show("In Walmart Pokemon, you or you and another person will pit two animals against eachother in a set of challenges to determine which is the better animal.");
    

      Scanner userConfirmation = new Scanner(System.in);
      
    // prompts user to start game
      this.show("Enter 1 to Start!");

      int userGameStart = userConfirmation.nextInt();
      
    // next part of game, currently working on
      if (userGameStart == 1) {
        this.show("Select the first Animal:(Enter the number corresponding to the animal you want.)");
        
     //generating animals
        var wolf = new Wolf();
        var cheetah = new Cheetah();
        var perryThePlatypus = new PerryThePlatypus();
        var bear = new Bear();
        var eagle = new Eagle();
        var monkey = new Monkey();
        var elephant = new Elephant();
        var camel = new Camel();
        var caracal = new Caracal();
        var fox = new Fox();
        // show list of animals
        var animals = new ArrayList<Animal>();
        animals.add(wolf);
        animals.add(cheetah);
        animals.add(perryThePlatypus);
        animals.add(bear);
        animals.add(eagle);
        animals.add(monkey);
        animals.add(elephant);
        animals.add(camel);
        animals.add(caracal);
        animals.add(fox);
        int n = animals.size(); // store the number of items in the array list
        for(int i = 0; i < n; i++) {
          var animal = animals.get(i); // retrieve the ith animal
          
        this.show(String.format("%d. %s", i, animal.species()));
        }
        // Let player 1 select animal
        Scanner animalSelection = new Scanner(System.in);

        int animal1 = animalSelection.nextInt();

        String animal1Species = animals.get(animal1).species();
        this.show(animal1Species);

    
        // Let player 1 configure animal(will add)

        // Let player 2 select animal
        System.out.println("Select the second Animal:");
        

        int animal2 = animalSelection.nextInt();

        String animal2Species = animals.get(animal2).species();
        this.show(animal2Species);
          

        
        // Let player 2 configure Animal(will add)

        // randomly select environment
        
        this.show("Selecting Environment...");
        var forest = new Forest();
        var desert = new Desert();
        var environments = new ArrayList<Environment>();
        environments.add(forest);
        environments.add(desert);

        int environmentNumber = (int)(Math.random() * 2);
        
                              
        this.show(environments.get(environmentNumber).environmentType());

        // gets animal traits ready to compare
        // animal 1 traits
        int animal1ClimbingAbility = (animals.get(animal1).climbingAbilityRating());
          
        int animal1FlyingAbility = (animals.get(animal1).flyingAbilityRating());
          
        int animal1SwimmingAbility = (animals.get(animal1).swimmingAbilityRating());
          
        int animal1RunningAbility = (animals.get(animal1).runningAbilityRating());

        int animal1BurrowingAbility = (animals.get(animal1).burrowingAbilityRating());

        int animal1AttackingAbility = (animals.get(animal1).attackingAbilityRating());

          // animal 2 traits
        int animal2ClimbingAbility = (animals.get(animal2).climbingAbilityRating());
          
        int animal2FlyingAbility = (animals.get(animal2).flyingAbilityRating());
          
        int animal2SwimmingAbility = (animals.get(animal2).swimmingAbilityRating());
          
        int animal2RunningAbility = (animals.get(animal2).runningAbilityRating());

        int animal2BurrowingAbility = (animals.get(animal2).burrowingAbilityRating());

        int animal2AttackingAbility = (animals.get(animal2).attackingAbilityRating());
        
        this.show("Selecting Situation..");
        // randomly select situation based off of envrionment
        if (environmentNumber == 1){
          
          String desertSituation0 = "The animals have to find water in the desert!";
          
          String desertSituation1 = "The animals have to find food in the desert!";

          
          
          var desertSituations = new ArrayList<String>();
          desertSituations.add(desertSituation0); // situation 0
          desertSituations.add(desertSituation1); // situation 1

          int desertSituationNumber = (int)(Math.random() * 2);
          this.show(desertSituations.get(desertSituationNumber));
          
        // compare traits based off of situation
        // i know its tedious and inefficient but there is not enough time to change eveerything 

          
          if (desertSituationNumber == 0){
            // compares burrowing ability for animals
            int compareBurrowing = this.attackingSuperiority(animal1BurrowingAbility, animal2BurrowingAbility);
            
            if (compareBurrowing > 0)
              animal1Points++;
            else if (compareBurrowing < 0)
              animal2Points++;
              
            else // they are equal
            {
              animal1Points++;
              animal2Points++;
            }
            
            // compares running ability for animals
            int compareRunning = this.runningSuperiority(animal1RunningAbility, animal2RunningAbility);
            if (compareRunning > 0)
              animal1Points++;
            else if (compareRunning < 0)
              animal2Points++;
            else{
              animal1Points++;
              animal2Points++;
            }
            
            // compares flying ability for animals
            int compareFlying = this.burrowingSuperiority(animal1BurrowingAbility, animal2BurrowingAbility);
            if (compareFlying > 0)
              animal1Points++;
            else if (compareFlying < 0)
              animal2Points++;
            else{
              animal1Points++;
              animal2Points++;
            }
            
            // tallies total points and determines a winner
            if (animal1Points>animal2Points){
              this.show("Animal 1 Wins!");
            } else if (animal1Points<animal2Points){
              this.show("Animal 2 Wins!");
            }


              
          else if (desertSituationNumber == 1){
            
            int compareAttacking = this.attackingSuperiority(animal1AttackingAbility, animal2AttackingAbility);
            
            if (compareAttacking > 0)
              animal1Points++;
            else if (compareAttacking < 0)
              animal2Points++;
            else // they are equal
            {
              animal1Points++;
              animal2Points++;
            }
            
            // compares running ability for animals
            int compareRunning1 = this.runningSuperiority(animal1RunningAbility, animal2RunningAbility);
            if (compareRunning1 > 0)
              animal1Points++;
            else if (compareRunning1 < 0)
              animal2Points++;
            else{
              animal1Points++;
              animal2Points++;
            }
            
            // compares burrowing ability for animals
            int compareFlying1 = this.burrowingSuperiority(animal1BurrowingAbility, animal2BurrowingAbility);
            if (compareFlying1 > 0)
              animal1Points++;
            else if (compareFlying1 < 0)
              animal2Points++;
            else{
              animal1Points++;
              animal2Points++;
            }
            
            // tallies total points and determines a winner
            if (animal1Points>animal2Points){
              this.show("Animal 1 Wins!");
            } else if (animal1Points<animal2Points){
              this.show("Animal 2 Wins!");
            }
          }
            
          }
          
          
          
          }
          else if (environmentNumber == 0){

          String forestSituation0 = "The animals have to find food in the forest!";

          String forestSituation1 = "The animals have to avoid a predator in the forest!";

          String forestSituation2 = "The animals have to surive a flash flood in the forest!";
            
          var forestSituations = new ArrayList<String>();
          forestSituations.add(forestSituation0); 
          forestSituations.add(forestSituation1);
          forestSituations.add(forestSituation2);
          int randomNum2 = (int)(Math.random() * 3);

          this.show(forestSituations.get(randomNum2));

          
        }

          
            
        

      
      
        
      

      
    }
    }




void show(String text){
  System.out.println(text);
}

// Determines if the first trait is superior to the second trait:
// 1 for yes, -1 for no, 0 for equality
// climbing ability comparison
int climbingSuperiority(int animal1ClimbingAbility, int animal2ClimbingAbility){
  if (animal1ClimbingAbility > animal2ClimbingAbility)
    return 1;
  else if (animal1ClimbingAbility < animal2ClimbingAbility)
    return -1;
  return 0;
}
// Flying Ability comparison
  int flyingSuperiority(int animal1FlyingAbility, int animal2FlyingAbility){
  if (animal1FlyingAbility > animal2FlyingAbility)
    return 1;
  else if (animal1FlyingAbility < animal2FlyingAbility)
    return -1;
  return 0;
}
// Swimming ability comparison
  int swimmingSuperiority(int animal1SwimmingAbility, int animal2SwimmingAbility){
  if (animal1SwimmingAbility > animal2SwimmingAbility)
    return 1;
  else if (animal1SwimmingAbility < animal2SwimmingAbility)
    return -1;
  return 0;
}
// Running ability comparison
  int runningSuperiority(int animal1RunningAbility, int animal2RunningAbility){
  if (animal1RunningAbility > animal2RunningAbility)
    return 1;
  else if (animal1RunningAbility < animal2RunningAbility)
    return -1;
  return 0;
}
  // burrowing ability comparison
  int burrowingSuperiority(int animal1BurrowingAbility, int animal2BurrowingAbility){
  if (animal1BurrowingAbility > animal2BurrowingAbility)
    return 1;
  else if (animal1BurrowingAbility < animal2BurrowingAbility)
    return -1;
  return 0;
}
// attacking ability comparison
  int attackingSuperiority(int animal1AttackingAbility, int animal2AttackingAbility){
  if (animal1AttackingAbility > animal2AttackingAbility)
    return 1;
  else if (animal1AttackingAbility < animal2AttackingAbility)
    return -1;
  return 0;
}
}