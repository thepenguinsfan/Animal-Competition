public class Cheetah extends Animal implements ITraits {

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
    return 100;
  }
}