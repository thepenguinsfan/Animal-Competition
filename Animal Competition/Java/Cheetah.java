public class Cheetah extends Animal implements Itraits {

  public int numberOfLegs() {
    return 4;
  }
  
  public string species() {
    return "Wildcat";
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

  public boolean canClimb(){
    return true;
  }

  public boolean canFly(){
    return false;
  }

  public boolean canSwim(){
    return true;
  }

  public boolean canRun(){
    return true;
  }
}