 public class Snake extends Reptile implements ITraits {

  public int numberOfLegs() {
    return 0;
  }
  
  public String species() {
    return "Snake";
  }

  public int numberOfEyes() {
    return 2;
  }

  public boolean hasClaws() {
    return false;
  }

  public boolean hasTail() {
    return true;
  }


  public boolean isColdBlooded() {
    return true;
  }

  public boolean hasScales() {
    return true;
  }
  public int climbingAbilityRating(){
    return 50;
  }
  public int flyingAbilityRating(){
    return 0;
  }
  public int swimmingAbilityRating(){
    return 100;
  }
  public int runningAbilityRating(){
    return 20;
  }
}