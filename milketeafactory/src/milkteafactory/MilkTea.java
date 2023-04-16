package milkteafactory;

/**
 * This abstract class represents an abstract Milk Tea product. A MilkTea has a name, a price and
 a size (enum).
 */
public abstract class MilkTea {
  protected String name;
  protected double price;
  protected Size size;

  /**
   * Upgrades the cup size of a MilkTea and the price accordingly.
   * @param size the size to be upgraded to, default size for all MilkTea is small
   */
  public void upgrade(Size size) {
    if (size == Size.M) {
      this.size = Size.M;
      this.price += 1.5;
    } else if (size == Size.L) {
      this.size = Size.L;
      this.price += 2;
    }
  }

  @Override
  public String toString() {
    return String.format("A %s cup of %s ($%.2f)", this.size, this.name, this.price);
  }
}
