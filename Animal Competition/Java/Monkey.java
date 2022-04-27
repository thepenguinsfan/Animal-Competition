public class Monkey extends Animal{
  
public int numberOfLegs() {
    return 4;
  }
  
  public String species() {
    return "Monkey";
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
    return 100;
  }
  public int flyingAbilityRating(){
    return 0;
  }
  public int swimmingAbilityRating(){
    return 70;
  }
  public int runningAbilityRating(){
    return 65;
  }
   public int burrowingAbilityRating(){
    return 30;
  }
  public int attackingAbilityRating(){
    return 80;
  }
  
}