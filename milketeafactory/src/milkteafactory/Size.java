package milkteafactory;

/**
 * This enum represents the cup size of a MilkTea.
 */
public enum Size {
  S {
    @Override public String toString() {
      return "Small";
    }
  }, M {
    @Override public String toString() {
      return "Medium";
    }
  }, L {
    @Override public String toString() {
      return "Large";
    }
  }
}
