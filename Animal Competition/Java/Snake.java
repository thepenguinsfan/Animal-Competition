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

  public int canClimb(){
    return 50;
  }

  public int canFly(){
    return 0;
  }

  public int canSwim(){
    return 100;
  }

  public int canRun(){
    return 20;
  }
}