package milkteafactory;

/**
 * This class represents a concrete MilkTeaShop class that only makes boba milk tea.
 */
public class BobaTeaShop extends MilkTeaShop {

  @Override
  public MilkTea makeTea(String type) {
    if ("Oolong".equalsIgnoreCase(type)) {
      return new BobaOolong();
    } else if ("Earl Grey".equalsIgnoreCase(type)) {
      return new BobaEarlGrey();
    } else if ("Taro".equalsIgnoreCase(type)) {
      return new BobaTaro();
    } else {
      return null;
    }
  }
}
