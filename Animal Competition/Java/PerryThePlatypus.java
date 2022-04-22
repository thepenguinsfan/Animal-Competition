public class PerryThePlatypus extends CoolAnimals implements ITraits{
    
  public int numberOfLegs() {
    return 4;
  }
  
  public String species() {
    return "Perry the Platypus";
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
  public int climbingAbilityRating(){
    return 95;
  }
  public int flyingAbilityRating(){
    return 75;
  }
  public int swimmingAbilityRating(){
    return 100;
  }
  public int runningAbilityRating(){
    return 100;
  }
}
