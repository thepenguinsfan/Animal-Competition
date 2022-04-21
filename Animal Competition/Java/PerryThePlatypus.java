public class PerryThePlaypus extends CoolAnimals implements ITraits{
    
  public int numberOfLegs() {
    return 4;
  }
  
  public string species() {
    return "Platypus";
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
  
  public boolean fightsCrime(){
    return true;
  }
// Animals abilities are rated on a scale from 0-100 where 0 is they can't do it and 100 being that they excell at it.
  public int climbingAbilityRating(){
    return 95;
  }
// Animals abilities are rated on a scale from 0-100 where 0 is they can't do it and 100 being that they excell at it.
  public int flyingAbilityRating(){
    return 75;
  }
// Animals abilities are rated on a scale from 0-100 where 0 is they can't do it and 100 being that they excell at it.
  public int swimmingAbilityRating(){
    return 100;
  }
// Animals abilities are rated on a scale from 0-100 where 0 is they can't do it and 100 being that they excell at it.
  public int runningAbilityRating(){
    return 100;
  }
}
