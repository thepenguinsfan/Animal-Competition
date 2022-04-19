public class Snake extends Reptile implements Itraits {

  public int numberOfLegs() {
    return 0;
  }
  
  public string species() {
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
    return false;
  }
}