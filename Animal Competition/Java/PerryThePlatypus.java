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
