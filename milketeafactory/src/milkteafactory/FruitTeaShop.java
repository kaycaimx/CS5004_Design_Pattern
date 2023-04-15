package milkteafactory;

/**
 * This class represents a concrete MilkTeaShop class that only makes fruit milk tea.
 */
public class FruitTeaShop extends MilkTeaShop {

  @Override
  public MilkTea makeTea(String type) {
    if ("Oolong".equalsIgnoreCase(type)) {
      return new FruitOolong();
    } else if ("Earl Grey".equalsIgnoreCase(type)) {
      return new FruitEarlGrey();
    } else {
      return null;
    }
  }
}
