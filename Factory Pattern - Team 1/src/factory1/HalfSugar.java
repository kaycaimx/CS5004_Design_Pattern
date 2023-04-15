package factory1;

/**
 * Class HalfSugar implements interface Sugar.
 * Presents the sugar option customers chooses for the milk tea.
 */
public class HalfSugar implements Sugar {
  /**
   * Method choose() is for the customer to choose sugar type.
   */
  @Override
  public void choose() {
    System.out.println("Half sugar for this order!");
  }

}
