package milkteafactory;

/**
 * This class represents a concrete MilkTeaShop class that only makes milk cap milk tea.
 */
public class MilkCapTeaShop extends MilkTeaShop {

  @Override
  public MilkTea makeTea(String type) {
    if ("Oolong".equalsIgnoreCase(type)) {
      return new MilkCapOolong();
    } else if ("Earl Grey".equalsIgnoreCase(type)) {
      return new MilkCapEarlGrey();
    } else if ("Taro".equalsIgnoreCase(type)) {
      return new MilkCapTaro();
    } else {
      return null;
    }
  }
}
