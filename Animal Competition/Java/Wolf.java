public class Wolf extends Animal{

  public int numberOfLegs() {
    return 4;
  }
  
  public String species() {
    return "Wolf";
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
    return 20;
  }
  public int flyingAbilityRating(){
    return 0;
  }
  public int swimmingAbilityRating(){
    return 85;
  }
  public int runningAbilityRating(){
    return 82;
  }
  public int burrowingAbilityRating(){
    return 70;
  }
  public int attackingAbilityRating(){
    return 90;
  }
  
}