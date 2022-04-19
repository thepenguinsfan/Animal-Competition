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

  public int canClimb(){
    return 60;
  }

  public int canFly(){
    return 0;
  }

  public int canSwim(){
    return 80 ;
  }

  public int canRun(){
    return 100;
  }
}