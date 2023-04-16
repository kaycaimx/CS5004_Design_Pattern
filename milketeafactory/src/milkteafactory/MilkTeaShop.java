package milkteafactory;

/**
 * This abstract class represents an abstract MilkTeaShop which can take order and make a MilkTea
 object based on tea base type and cup size. The MilkTeaShop class depends on the MilkTea abstract
 class and delegates instantiation of concrete classes to its subclasses. Subclasses of MilkTeaShop
 represents different genres of milk teas: such as boba tea, cream cap tea, fruit tea, etc.
 */
public abstract class MilkTeaShop {

  /**
   * The factory method for creating one MilkTea object. This is an abstract method so that
   subclasses of MilkTeaShop will decide which concrete MilkTea object to instantiate.
   * @param type tea base of the MilkTea
   * @return a MilkTea product (whose genre will be decided by the subclass of MilkTeaShop)
   */
  abstract MilkTea makeTea(String type);

  /**
   * Takes an order of a MilkTea from the client, prepare the product and return it to the client.
   * @param type tea base of the MilkTea
   * @param size cup size of the MilkTea
   * @return a MilkTea object
   */
  public MilkTea orderTea(String type, Size size) {
    MilkTea milkTea = makeTea(type);
    milkTea.upgrade(size);
    return milkTea;
  }
}
