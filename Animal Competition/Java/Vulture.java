public class Vulture extends Animal{

public int numberOfLegs() {
    return 2;
  }
  
  public String species() {
    return "Vulture";
  }

  public int numberOfEyes() {
    return 2;
  }

  public boolean hasClaws() {
    return true;
  }

  public boolean hasTail() {
    return true;
  }
    
  public int climbingAbilityRating(){
    return 60;
  }
  public int flyingAbilityRating(){
    return 95;
  }
  public int swimmingAbilityRating(){
    return 10 ;
  }

  public int runningAbilityRating(){
    return 30;
  }
   public int burrowingAbilityRating(){
    return 10;
  }
  public int attackingAbilityRating(){
    return 88;
  }
  public int smellingAbilityRating(){
    return 25;
  }
  public int visionAbilityRating(){
    return 100;
  }
}