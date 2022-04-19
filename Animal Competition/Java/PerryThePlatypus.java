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

  public int canClimb(){
    return 95;
  }

  public int canFly(){
    return 75;
  }

  public int canSwim(){
    return 100;
  }

  public int canRun(){
    return 100;
  }
}
