package factory1;

/**
 * Class SeasonalLimitedTea implements interface MilkTea.
 * Presents a type of milk tea.
 */
public class SeasonalLimitedTea implements MilkTea {
  /**
   * Method prepare() is to prepare the type of milk tea the customer orders.
   */
  @Override
  public void prepare() {
    System.out.println("Prepare a Seasonal Limited Tea!");
  }

  /**
   * Method getPrice() is to get the price of milk tea the customer orders.
   * Based on number of cups.
   *
   * @param numCup int the number of cups.
   */
  @Override
  public int getPrice(int numCup) {
    return 15 * numCup;
  }
}
