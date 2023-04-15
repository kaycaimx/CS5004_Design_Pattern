package factory1;

/**
 * Class AdditionalSugar implements interface Sugar.
 * Presents the sugar option customers chooses for the milk tea.
 */
public class AdditionalSugar implements Sugar{
  /**
   * Method choose() is for the customer to choose sugar type.
   */
  @Override
  public void choose() {
    System.out.println("Additional sugar for this order!");
  }

}
