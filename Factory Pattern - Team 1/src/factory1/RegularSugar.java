package factory1;

/**
 * Class RegularSugar implements interface Sugar.
 * Presents the sugar option customers chooses for the milk tea.
 */
public class RegularSugar implements Sugar {
  /**
   * Method choose() is for the customer to choose sugar type.
   */
  @Override
  public void choose() {
    System.out.println("Regular sugar for this order!");
  }

}
