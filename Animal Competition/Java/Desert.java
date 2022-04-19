public class Desert extends Environment {

  public boolean hasTrees(){
    return false;
  }

  public boolean hasWater(){
    return true;
  }

  public boolean hasGrass(){
    return false;
  }

  public boolean hasSand(){
    return true;
  }

  public boolean hasPlants(){
    return false;
  }

  public boolean hasOtherAnimals(){
    return true;
  }

  public boolean hasFood(){
    return true;
  }

  public int temperatureInCelsius(){
    return 40;
  }
  
}