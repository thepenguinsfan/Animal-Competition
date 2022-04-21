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
// Animals abilities are rated on a scale from 0-100 where 0 is they can't do it and 100 being that they excell at it.
  public int climbingAbilityRating(){
    return 60;
  }
// Animals abilities are rated on a scale from 0-100 where 0 is they can't do it and 100 being that they excell at it.
  public int flyingAbilityRating(){
    return 0;
  }
// Animals abilities are rated on a scale from 0-100 where 0 is they can't do it and 100 being that they excell at it.
  public int swimmingAbilityRating(){
    return 80 ;
  }
// Animals abilities are rated on a scale from 0-100 where 0 is they can't do it and 100 being that they excell at it.
  public int runningAbilityRating(){
    return 100;
  }
}