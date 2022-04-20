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
// Animals abilities are rated on a scale from 0-100 where 0 is they can't do it and 100 being that they excell at it.
  public int canClimb(){
    return 20;
  }
// Animals abilities are rated on a scale from 0-100 where 0 is they can't do it and 100 being that they excell at it.
  public int canFly(){
    return 0;
  }
// Animals abilities are rated on a scale from 0-100 where 0 is they can't do it and 100 being that they excell at it.
  public int canSwim(){
    return 85;
  }
// Animals abilities are rated on a scale from 0-100 where 0 is they can't do it and 100 being that they excell at it.
  public int canRun(){
    return 70;
  }
}