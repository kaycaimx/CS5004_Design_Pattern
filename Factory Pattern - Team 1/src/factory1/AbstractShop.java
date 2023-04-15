package factory1;

/**
 * Abstract class AbstractShop.
 * Method createMilkTea(String milkTeaType) is to be implemented by MilkTeaFactory.
 * Method getSugar(String sugarOption) is to be implemented by SugarFactory.
 */
public abstract class AbstractShop {
  /**
   * Method createMilkTea(String milkTeaType) is to create the milk tea as customer orders.
   *
   * @param milkTeaType String the milk tea type ordered.
   * @return null.
   */
  public abstract MilkTea createMilkTea(String milkTeaType);

  /**
   * Method getSugar(String sugarOption) is to get the sugar type as customer orders.
   *
   * @param sugarOption String the sugar type ordered.
   * @return null.
   */
  public abstract Sugar getSugar(String sugarOption);
}
