package factory1;

/**
 * This interface MilkTea provides different kinds and prices of milk teas.
 */
public interface MilkTea {

  /**
   * Method prepare() is to prepare the type of milk tea the customer orders.
   */
  void prepare();

  /**
   * Method getPrice() is to get the price of milk tea the customer orders.
   * Based on number of cups.
   *
   * @param numCup int the number of cups.
   */
  int getPrice(int numCup);
}
