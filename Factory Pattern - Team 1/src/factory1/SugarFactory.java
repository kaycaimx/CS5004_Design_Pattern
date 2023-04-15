package factory1;

/**
 * Class SugarFactory.
 * Is a factory for Sugar.
 */
public class SugarFactory extends AbstractShop {

  public static String zero = "ZeroSugar";
  public static String half = "HalfSugar";
  public static String regular = "RegularSugar";
  public static String additional = "AdditionalSugar";

  /**
   * Method createMilkTea(String milkTeaType) is to create the milk tea as customer orders.
   *
   * @param milkTeaType String the milk tea type ordered.
   * @return Sugar object of interface Sugar.
   */
  @Override
  public MilkTea createMilkTea(String milkTeaType) {
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
    if (sugarOption == null) {
      return null;
    }

    if (sugarOption.equalsIgnoreCase(SugarFactory.zero)) {
      return new ZeroSugar();
    } else if (sugarOption.equalsIgnoreCase(SugarFactory.half)) {
      return new HalfSugar();
    } else if (sugarOption.equalsIgnoreCase(SugarFactory.regular)) {
      return new RegularSugar();
    } else if (sugarOption.equalsIgnoreCase(SugarFactory.additional)) {
      return new AdditionalSugar();
    }

    return null;
  }
}
