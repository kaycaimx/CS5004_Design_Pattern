package factory1;

/**
 * Class CreateFactory is to choose which factory to use based on milk tea type and sugar option.
 */
public class CreateFactory {

  /**
   * Abstract class AbstractShop method is to decide which factory to use based on customer choice.
   */
  public static AbstractShop createFactory(String factory) {
    if (factory == null) {
      return null;
    }

    if (factory.equalsIgnoreCase("MilkTea")) {
      return new MilkTeaFactory();
    }

    if (factory.equalsIgnoreCase("Sugar")) {
      return new SugarFactory();
    }

    return null;
  }
}
