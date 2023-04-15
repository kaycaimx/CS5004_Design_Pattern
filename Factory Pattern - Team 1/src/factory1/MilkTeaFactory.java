package factory1;

/**
 * Class MilkTeaFactory.
 * Is a factory for MilkTea.
 */
public class MilkTeaFactory extends AbstractShop {

  public static String bubble = "BubbleTea";
  public static String fruit = "FruitTea";
  public static String yogurt = "YogurtTea";
  public static String seasonal = "SeasonalLimitedTea";

  /**
   * Method createMilkTea(String milkTeaType) is to create the milk tea as customer orders.
   *
   * @param milkTeaType String the milk tea type ordered.
   * @return MilkTea object of interface MilkTea.
   */
  @Override
  public MilkTea createMilkTea(String milkTeaType) {
    if (milkTeaType == null) {
      return null;
    }

    if (milkTeaType.equalsIgnoreCase(MilkTeaFactory.bubble)) {
      return new BubbleTea();
    } else if (milkTeaType.equalsIgnoreCase(MilkTeaFactory.fruit)) {
      return new FruitTea();
    } else if (milkTeaType.equalsIgnoreCase(MilkTeaFactory.yogurt)) {
      return new YogurtTea();
    } else if (milkTeaType.equalsIgnoreCase(MilkTeaFactory.seasonal)) {
      return new SeasonalLimitedTea();
    }

    return null;
  }

  /**
   * Method getSugar(String sugarOption) is to get the sugar type as customer orders.
   *
   * @param sugarOption String the sugar type ordered.
   * @return null.
   */
  @Override
  public Sugar getSugar(String sugarOption) {
    return null;
  }
}
