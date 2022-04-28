public class Cheetah extends Animal{

  public int numberOfLegs() {
    return 4;
  }
  
  public String species() {
    return "Cheetah";
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
    return 0;
  }
  public int swimmingAbilityRating(){
    return 80 ;
  }

  public int runningAbilityRating(){
    return 99;
  }
   public int burrowingAbilityRating(){
    return 20;
  }
  public int attackingAbilityRating(){
    return 97;
  }
  public int smellingAbilityRating(){
    return 85;
  }
  public int visionAbilityRating(){
    return 80;
  }
}