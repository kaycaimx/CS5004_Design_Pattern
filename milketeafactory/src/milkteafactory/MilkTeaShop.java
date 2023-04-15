package milkteafactory;

/**
 * This abstract class represents an abstract Milk Tea Shop which can take order and make a MilkTea
 object based on tea base type and cup size. The MilkTeaShop class depends on the MilkTea abstract
 class and delegates instantiation of concrete classes to its subclasses. Subclasses of MilkTeaShop
 represents different genres of milk teas: such as boba tea, cream cap tea, fruit tea, etc.
 */
public abstract class MilkTeaShop {

  /**
   * The factory method for creating one MilkTea object. This is an abstract method so that
   subclasses will decide which concrete MilkTea class to instantiate.
   * @param type tea base of the MilkTea
   * @return a MilkTea product (whose genres will be )
   */
  abstract MilkTea makeTea(String type);

  /**
   * Takes an order of a MilkTea.
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
