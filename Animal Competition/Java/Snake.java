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
// Animals abilities are rated on a scale from 0-100 where 0 is they can't do it and 100 being that they excell at it.
  public int climbingAbilityRating(){
    return 50;
  }
// Animals abilities are rated on a scale from 0-100 where 0 is they can't do it and 100 being that they excell at it.
  public int flyingAbilityRating(){
    return 0;
  }
// Animals abilities are rated on a scale from 0-100 where 0 is they can't do it and 100 being that they excell at it.
  public int swimmingAbilityRating(){
    return 100;
  }
// Animals abilities are rated on a scale from 0-100 where 0 is they can't do it and 100 being that they excell at it.
  public int runningAbilityRating(){
    return 20;
  }
}