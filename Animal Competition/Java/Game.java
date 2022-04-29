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
        this.pause();
        this.show("Selecting Environment...");
        var forest = new Forest();
        var desert = new Desert();
        var environments = new ArrayList<Environment>();
        environments.add(forest);
        environments.add(desert);

        int environmentNumber = (int)(Math.random() * 2);
          
        this.pause();                      
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

        
        this.pause();
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
          this.pause();
          this.show(desertSituations.get(desertSituationNumber));
          this.pause();
          this.show("Begin!");
          
        // compare traits based off of situation
        // the winner in the desert is being printed twice

          // find water in desert
          if (desertSituationNumber == 0){

            // compare traits Vision Smelling Burrowing

            

            // compares vision ability for animals
            int visionPoints[] = this.getPoints(animal1VisionAbility, animal2VisionAbility);         
            animal1Points += visionPoints[0];
            animal2Points += visionPoints[1];
              
            // compare smelling ability
            int smellingPoints[] = this.getPoints(animal1SmellingAbility, animal2SmellingAbility);
            animal1Points += smellingPoints[0];
            animal2Points += smellingPoints[1];
            this.pause();
            
            if (animal1Points > animal2Points){
              this.show("The " + animal1Species + " senses that water is nearby!");
            } else if (animal1Points < animal2Points){
              this.show("The " + animal2Species + " senses that water is nearby!");
            }else{
              this.show("The animals have not found water yet...");
            }
            
            // compares burrowing ability for animals
            int burrowingPoints[] = this.getPoints(animal1BurrowingAbility, animal2BurrowingAbility);
            animal1Points += burrowingPoints[0];
            animal2Points += burrowingPoints[1];

            // declares winner based off of who has more points
            this.pause();
            if (animal1Points > animal2Points){
              this.show("The " + animal1Species + " has found water!");
              this.pause();
              this.show("The " + animal1Species + " wins!");
            } else if(animal1Points < animal2Points){
              this.show("The " + animal2Species + " has found water!");
              this.pause();
              this.show("The " + animal2Species + " wins!");
            }else{
              this.show("The " + animal1Species + " and " + animal2Species + " have both managed to find water!");
            }
            
            
          }
            // find food in desert
          else if (desertSituationNumber == 1){
            // compare traits Attacking Running Burrowing Vision Smelling
           
            // compare attacking
            int attackingPoints1[] = this.getPoints(animal1AttackingAbility, animal2AttackingAbility);
            animal1Points += attackingPoints1[0];
            animal2Points += attackingPoints1[1];

            
            // compare running
            int runningPoints1[] = this.getPoints(animal1RunningAbility, animal2RunningAbility);
            animal1Points += runningPoints1[0];
            animal2Points += runningPoints1[1];

            
            // compare burrowing
            int burrowingPoints1[] = this.getPoints(animal1BurrowingAbility, animal2BurrowingAbility);
            animal1Points += burrowingPoints1[0];
            animal2Points += burrowingPoints1[1]; 
            
            // show progress for finding food in the desert
            this.pause();
            if (animal1Points > animal2Points){
              this.show("The " + animal1Species + " senses that food is nearby!");
            } else if (animal1Points < animal2Points){
              this.show("The " + animal2Species + " senses that food is nearby!");
            }else{
              this.show("The animals have not found any food yet...");
            }
            
            // compare vision
            int visionPoints1[] = this.getPoints(animal1VisionAbility, animal2VisionAbility);
            animal1Points += visionPoints1[0];
            animal2Points += visionPoints1[1];

            
            // compare smelling
            int smellingPoints1[] = this.getPoints(animal1SmellingAbility, animal2SmellingAbility);
            animal1Points += smellingPoints1[0];
            animal2Points += smellingPoints1[1]; 
            
            // declares winner based off of who has more points
            this.pause();
            if (animal1Points > animal2Points){
              this.show("The " + animal1Species + " has found food!");
              this.pause();
              this.show("The " + animal1Species + " wins!");
            } else if(animal1Points < animal2Points){
              this.show("The " + animal2Species + " has found food!");
              this.pause();
              this.show("The " + animal2Species + " wins!");
            }else{
              this.show("The " + animal1Species + " and " + animal2Species + " have both found food in the desert!");
            }
          } 

            
            // find shelter in the desert
          else{
           
            // compare traits Burrowing Vision Flying
            // compare burrowing
             int burrowingPoints2[] = this.getPoints(animal1BurrowingAbility, animal2BurrowingAbility);
            animal1Points += burrowingPoints2[0];
            animal2Points += burrowingPoints2[1];

            
            // compare vision
            int visionPoints2[] = this.getPoints(animal1VisionAbility, animal2VisionAbility);
            animal1Points += visionPoints2[0];
            animal2Points += visionPoints2[1];
           
            // show progress for shelter in the desert
            this.pause();
            if (animal1Points > animal2Points){
              this.show("The " + animal1Species + " spots some shelter in the distance!");
            } else if (animal1Points < animal2Points){
              this.show("The " + animal2Species + " spots some shelter in the distance!");
            }else{
              this.show("The animals have not found shelter yet...");
            }
            
            //compare flying
            int flyingPoints2[] = this.getPoints(animal1FlyingAbility, animal2FlyingAbility);
            animal1Points += flyingPoints2[0];
            animal2Points += flyingPoints2[1];
          
          // declares winner based off of who has more points
          this.pause();
            if (animal1Points > animal2Points){
              this.show("The " + animal1Species + " has found shelter!");
              this.pause();
              this.show("The " + animal1Species + " wins!");
            } else if(animal1Points < animal2Points){
              this.show("The " + animal2Species + " has found shelter!");
              this.pause();
              this.show("The " + animal2Species + " wins!");
            }else{
              this.show("The " + animal1Species + " and " + animal2Species + " have both found shelter!");
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
          
          int forestSituationNumber = (int)(Math.random() * 3);

          this.show(forestSituations.get(forestSituationNumber));

          this.pause();
          this.show("Begin!");
          // Find food in forest
          if (forestSituationNumber == 0){
            // compare traits Attacking Vision Smelling Running Flying Climbing Swimming
            // compare attacking
            int attackingPoints3[] = this.getPoints(animal1AttackingAbility, animal2AttackingAbility);
            animal1Points += attackingPoints3[0];
            animal2Points += attackingPoints3[1];
            
            // compare vision
            int visionPoints3[] = this.getPoints(animal1VisionAbility, animal2VisionAbility);
            animal1Points += visionPoints3[0];
            animal2Points += visionPoints3[1];
            
            //compare smelling
            int smellingPoints3[] = this.getPoints(animal1SmellingAbility, animal2SmellingAbility);
            animal1Points += smellingPoints3[0];
            animal2Points += smellingPoints3[1];

            
            //compare running
            int runningPoints3[] = this.getPoints(animal1RunningAbility, animal2RunningAbility);
            animal1Points += runningPoints3[0];
            animal2Points += runningPoints3[1];

            
            //compare flying
            int flyingPoints3[] = this.getPoints(animal1FlyingAbility, animal2FlyingAbility);
            animal1Points += flyingPoints3[0];
            animal2Points += flyingPoints3[1];
            
            // update progress for food in forest
            this.pause();
            if (animal1Points > animal2Points){
              this.show("The " + animal1Species + " senses that prey is nearby!");
            } else if (animal1Points < animal2Points){
              this.show("The " + animal2Species + " senses that prey is nearby!");
            }else{
              this.show("The animals have not found any prey yet...");
            }
            
            //compare climbing
            int climbingPoints3[] = this.getPoints(animal1ClimbingAbility, animal2ClimbingAbility);
            animal1Points += climbingPoints3[0];
            animal2Points += climbingPoints3[1];

            
            //compare swimming
            int swimmingPoints3[] = this.getPoints(animal1SwimmingAbility, animal2SwimmingAbility);
            animal1Points += swimmingPoints3[0];
            animal2Points += swimmingPoints3[1];

            // declares winner based off of who has more points
            this.pause();
            if (animal1Points > animal2Points){
              this.show("The " + animal1Species + " has found prey!");
              this.pause();
              this.show("The " + animal1Species + " wins!");
            } else if(animal1Points < animal2Points){
              this.show("The " + animal2Species + " has found prey!");
              this.pause();
              this.show("The " + animal2Species + " wins!");
            }else{
              this.show("The " + animal1Species + " and " + animal2Species + " have both found their prey!");
            }


          }
          // avoid a predator in the forest
          else if (forestSituationNumber == 1){
            // compare traits Running Vision Climbing Burrowing Flying

            // compare running
            int runningPoints4[] = this.getPoints(animal1RunningAbility, animal2RunningAbility);
            animal1Points += runningPoints4[0];
            animal2Points += runningPoints4[1];
            
            //compare vision
            int visionPoints4[] = this.getPoints(animal1VisionAbility, animal2VisionAbility);
            animal1Points += visionPoints4[0];
            animal2Points += visionPoints4[1];
            
            //compare climbing
            int climbingPoints4[] = this.getPoints(animal1ClimbingAbility, animal2ClimbingAbility);
            animal1Points += climbingPoints4[0];
            animal2Points += climbingPoints4[1];
            
            // show progress for predator in forest
            this.pause();
            if (animal1Points > animal2Points){
              this.show("The predator has caught the trail of the " + animal2Species + "!");
            } else if (animal1Points < animal2Points){
              this.show("The predator has caught the trail of the " + animal1Species + "!");
            }else{
              this.show("The predator has not caught onto the animals yet...");
            }
            //compare burrowing
            int burrowingPoints4[] = this.getPoints(animal1BurrowingAbility, animal2BurrowingAbility);
            animal1Points += burrowingPoints4[0];
            animal2Points += burrowingPoints4[1];
            
            //compare flying
            int flyingPoints4[] = this.getPoints(animal1FlyingAbility, animal2FlyingAbility);
            animal1Points += flyingPoints4[0];
            animal2Points += flyingPoints4[1];


            // declares winner based off of who has more points(predator)
            this.pause();
            if (animal1Points > animal2Points){
              this.show("The " + animal2Species + " has been caught by the predator!");
              this.pause();
              this.show("The " + animal1Species + " wins!");
            } else if(animal1Points < animal2Points){
              this.show("The " + animal1Species + " has been caught by the predator!");
              this.pause();
              this.show("The " + animal2Species + " wins!");
            }else{
              this.show("The " + animal1Species + " and " + animal2Species + " have both avoided the predator!");
            }
          }
          // survive a flash flood in the forest
          else{
            // compare traits Swimming Climbing Flying
           
            
            // compare swimming
            int swimmingPoints5[] = this.getPoints(animal1SwimmingAbility, animal2SwimmingAbility);
            animal1Points += swimmingPoints5[0];
            animal2Points += swimmingPoints5[1];
            
            //compare climbing
            int climbingPoints5[] = this.getPoints(animal1ClimbingAbility, animal2ClimbingAbility);
            animal1Points += climbingPoints5[0];
            animal2Points += climbingPoints5[1];
            
            //compare flying
            int flyingPoints5[] = this.getPoints(animal1FlyingAbility, animal2FlyingAbility);
            animal1Points += flyingPoints5[0];
            animal2Points += flyingPoints5[1];

            // show progress for flood in forest
            this.pause();
            if (animal1Points > animal2Points){
              this.show("The " + animal2Species + " is caught off guard by the flood!");
            } else if (animal1Points < animal2Points){
              this.show("The " + animal1Species + " is caught off guard by the flood!");
            }else{
              this.show("The animals are both one step ahead of the flood... ");
            }
            
            //compare vision
            int visionPoints5[] = this.getPoints(animal1VisionAbility, animal2VisionAbility);
            animal1Points += visionPoints5[0];
            animal2Points += visionPoints5[1];
            
            // compare running
            int runningPoints5[] = this.getPoints(animal1RunningAbility, animal2RunningAbility);
            animal1Points += runningPoints5[0];
            animal2Points += runningPoints5[1];

            // declares winner based off of who has more points
            this.pause();
            if (animal1Points > animal2Points){
              this.show("The flood has swept away " + animal2Species + "!");
              this.pause();
              this.show("The " + animal1Species + " wins!");
            } else if(animal1Points < animal2Points){
              this.show("The flood has swept away " + animal1Species + "!");
              this.pause();
              this.show("The " + animal2Species + " wins!");
            } else{
              this.show("The " + animal1Species + " and " + animal2Species + " have both escaped the flood!");
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
// determines which animal gets a point when comparing traits
// if first trait > second trait, animal 1 is given a point and animal 2 is given nothing, shown by {1, 0}
// if second trait > first trait, animal 2 is given a point and animal 1 is given nothing, shown by {0, 1}
// if first trait = second trait, both animals are given a point, shown by {1, 1}
int[] getPoints(int animal1Ability, int animal2Ability) {
            int compare = this.traitSuperiority(animal1Ability, animal2Ability);
            
            if (compare > 0)
              return new int[]{1, 0};
            if (compare < 0)
              return new int[]{0 , 1};
            return new int[]{1, 1};
}
  // function to pause the program for 1 second
  void pause() {
    this.pause(1000);
  }

  void pause(int milliseconds) {
    try {
      Thread.sleep(milliseconds);
    } catch (Exception e) {
      this.show(e.toString());
    }
  }
}
