public class Wolf extends Animal implements Itraits {

  public int numberOfLegs() {
    return 4;
  }
  
  public string species() {
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

  public int canClimb(){
    return 20;
  }

  public int canFly(){
    return 0;
  }

  public int canSwim(){
    return 85;
  }

  public int canRun(){
    return 70;
  }
}