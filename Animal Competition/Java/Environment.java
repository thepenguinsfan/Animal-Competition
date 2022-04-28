  public abstract class Environment {

  public abstract String environmentType();
// The factors in the environments are given a rating from 0-100. 0 being the factor is not present in the given environment, and 100 being the factor is present everywhere in the environment
  public abstract int percentageOfTrees();

  public abstract int percentageOfWater();

  public abstract int percentageOfGrass();

  public abstract int percentageOfSand();

  public abstract int percentageOfPlants();

  public abstract int otherAnimalsPercentage();

  public abstract int percentageOfFood();

  public abstract int temperatureInCelsius();
  
}