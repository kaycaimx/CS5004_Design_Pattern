package factory1;

/**
 * Class ZeroSugar implements interface Sugar.
 * Presents the sugar option customers chooses for the milk tea.
 */
public class ZeroSugar implements Sugar {
  /**
   * Method choose() is for the customer to choose sugar type.
   */
  @Override
  public void choose() {
    System.out.println("Zero sugar for this order!");
  }

}
