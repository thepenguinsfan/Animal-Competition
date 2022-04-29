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
        var vulture = new Vulture();
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
        animals.add(vulture);
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
        this.show("Select the second Animal:");
        

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

        int animal1SmellingAbility = (animals.get(animal1).smellingAbilityRating());

        int animal1VisionAbility = (animals.get(animal1).visionAbilityRating());

          // animal 2 traits
        int animal2ClimbingAbility = (animals.get(animal2).climbingAbilityRating());
          
        int animal2FlyingAbility = (animals.get(animal2).flyingAbilityRating());
          
        int animal2SwimmingAbility = (animals.get(animal2).swimmingAbilityRating());
          
        int animal2RunningAbility = (animals.get(animal2).runningAbilityRating());

        int animal2BurrowingAbility = (animals.get(animal2).burrowingAbilityRating());

        int animal2AttackingAbility = (animals.get(animal2).attackingAbilityRating());
        
        int animal2SmellingAbility = (animals.get(animal2).smellingAbilityRating());
        
        int animal2VisionAbility = (animals.get(animal2).visionAbilityRating());

        
        
        this.show("Selecting Situation..");
        // randomly select situation based off of envrionment
        if (environmentNumber == 1){
          
          String desertSituation0 = "The animals have to find water in the desert!";
          
          String desertSituation1 = "The animals have to find food in the desert!";

          String desertSituation2 = "The animals have to find shelter in the desert!";

          
          
          var desertSituations = new ArrayList<String>();
          desertSituations.add(desertSituation0); // desert situation 0
          desertSituations.add(desertSituation1);// desert situation 1
          desertSituations.add(desertSituation2); // desert situation 2

          int desertSituationNumber = (int)(Math.random() * 2);
          this.show(desertSituations.get(desertSituationNumber));
          
        // compare traits based off of situation
        // i know its tedious and inefficient but there is not enough time to change everything 

          // find water in desert
          if (desertSituationNumber == 0){

            // compare traits Vision Smelling Burrowing

            

            // compares vision ability for animals
            int compareVision0 = this.traitSuperiority(animal1VisionAbility, animal2VisionAbility);
            
            if (compareVision0 > 0)
              animal1Points++;
            else if (compareVision0 < 0)
              animal2Points++;
              
            else // they are equal
            {
              animal1Points++;
              animal2Points++;
            } 

            // compare smelling ability
            int compareSmelling0 = this.traitSuperiority(animal1SmellingAbility, animal2SmellingAbility);
            
            if (compareSmelling0 > 0)
              animal1Points++;
            else if (compareSmelling0 < 0)
              animal2Points++;
              
            else // they are equal
            {
              animal1Points++;
              animal2Points++;
            } 
            
            // compares burrowing ability for animals
            int compareBurrowing0 = this.traitSuperiority(animal1BurrowingAbility, animal2BurrowingAbility);
            
            if (compareBurrowing0 > 0)
              animal1Points++;
            else if (compareBurrowing0 < 0)
              animal2Points++;
              
            else // they are equal
            {
              animal1Points++;
              animal2Points++;
            } 

            // declares winner based off of who has more points
            if (animal1Points > animal2Points){
              this.show("The " + animal1Species + " wins!");
            } else if(animal1Points < animal2Points){
              this.show("The " + animal2Species + " wins!");
            }
            
            
          }
            // find food in desert
          else if (desertSituationNumber == 1){
            // compare traits Attacking Running Burrowing Vision Smelling
           
            // compare attacking
            int compareAttacking1 = this.traitSuperiority(animal1AttackingAbility, animal2AttackingAbility);
            
            if (compareAttacking1 > 0)
              animal1Points++;
            else if (compareAttacking1 < 0)
              animal2Points++;
              
            else // they are equal
            {
              animal1Points++;
              animal2Points++;
            } 

            
            // compare running
            int compareRunning1 = this.traitSuperiority(animal1RunningAbility, animal2RunningAbility);
            
            if (compareRunning1  > 0)
              animal1Points++;
            else if (compareRunning1 < 0)
              animal2Points++;
              
            else // they are equal
            {
              animal1Points++;
              animal2Points++;
            } 

            
            // compare burrowing
            int compareBurrowing1 = this.traitSuperiority(animal1BurrowingAbility, animal2BurrowingAbility);
            
            if (compareBurrowing1 > 0)
              animal1Points++;
            else if (compareBurrowing1 < 0)
              animal2Points++;
              
            else // they are equal
            {
              animal1Points++;
              animal2Points++;
            } 

            
            // compare vision
            int compareVision1 = this.traitSuperiority(animal1VisionAbility, animal2VisionAbility);
            
            if (compareVision1 > 0)
              animal1Points++;
            else if (compareVision1 < 0)
              animal2Points++;
              
            else // they are equal
            {
              animal1Points++;
              animal2Points++;
            } 

            
            // compare smelling
            int compareSmelling1 = this.traitSuperiority(animal1SmellingAbility, animal2SmellingAbility);
            
            if (compareSmelling1 > 0)
              animal1Points++;
            else if (compareSmelling1 < 0)
              animal2Points++;
              
            else // they are equal
            {
              animal1Points++;
              animal2Points++;
            } 
            // declares winner based off of who has more points
             if (animal1Points > animal2Points){
              this.show("The " + animal1Species + " wins!");
            } else if(animal1Points < animal2Points){
              this.show("The " + animal2Species + " wins!");
            }
          } 

            
            // find shelter in the desert
          else{
           
            // compare traits Burrowing Vision Flying
            // compare burrowing
             int compareBurrowing2 = this.traitSuperiority(animal1BurrowingAbility, animal2BurrowingAbility);
            
            if (compareBurrowing2 > 0)
              animal1Points++;
            else if (compareBurrowing2 < 0)
              animal2Points++;
              
            else // they are equal
            {
              animal1Points++;
              animal2Points++;
            } 
            
        
            // compare vision
             int compareVision2 = this.traitSuperiority(animal1VisionAbility, animal2VisionAbility);
            
            if (compareVision2 > 0)
              animal1Points++;
            else if (compareVision2 < 0)
              animal2Points++;
              
            else // they are equal
            {
              animal1Points++;
              animal2Points++;
            } 
            
            // compare flying
             int compareFlying2 = this.traitSuperiority(animal1FlyingAbility, animal2FlyingAbility);
            
            if (compareFlying2 > 0)
              animal1Points++;
            else if (compareVision2 < 0)
              animal2Points++;
              
            else // they are equal
            {
              animal1Points++;
              animal2Points++;
            } 

          }
          // declares winner based off of who has more points
            if (animal1Points > animal2Points){
              this.show("The " + animal1Species + " wins!");
            } else if(animal1Points < animal2Points){
              this.show("The " + animal2Species + " wins!");
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
          
          int forestSituationNumber = (int)(Math.random() * 3);

          this.show(forestSituations.get(forestSituationNumber));
          // Find food in forest
          if (forestSituationNumber == 0){
            // compare traits Attacking Vision Smelling Running Flying Climbing Swimming


          }
          // avoid a predator in the forest
          else if (forestSituationNumber == 1){
            // compare traits Running Vision Climbing Burrowing Flying

          }
          // survive a flash flood in the forest
          else{
            // compare traits Swimming Climbing Flying

          }
        }

        }
            
        

      
 
    
      

      
    }
    }




void show(String text){
  System.out.println(text);
}

// Determines if the first trait is superior to the second trait:
// 1 for yes, -1 for no, 0 for equality
// climbing ability comparison
int traitSuperiority(int animal1Ability, int animal2Ability){
  if (animal1Ability > animal2Ability)
    return 1;
  else if (animal1Ability < animal2Ability)
    return -1;
  return 0;

  }


