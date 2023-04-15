package milkteafactory;

/**
 * This class represents a concrete MilkTeaShop class that only makes cheese cap milk tea.
 */
public class CreamCapTeaShop extends MilkTeaShop {

  @Override
  public MilkTea makeTea(String type) {
    if ("Oolong".equalsIgnoreCase(type)) {
      return new CreamCapOolong();
    } else if ("Earl Grey".equalsIgnoreCase(type)) {
      return new CreamCapEarlGrey();
    } else if ("Taro".equalsIgnoreCase(type)) {
      return new CreamCapTaro();
    } else {
      return null;
    }
  }
}
