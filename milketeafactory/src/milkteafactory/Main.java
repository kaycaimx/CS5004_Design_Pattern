package milkteafactory;

/**
 * Test driver.
 */
public class Main {

  /**
   * To test that the factory method works correctly.
   * @param args program code
   */
  public static void main(String[] args) {
    MilkTeaShop milkCapShop = new MilkCapTeaShop();
    MilkTeaShop bobaShop = new BobaTeaShop();
    MilkTeaShop fruitShop = new FruitTeaShop();

    MilkTea irisOrder = bobaShop.orderTea("Oolong", Size.M);

    MilkTea simonaOrder = fruitShop.orderTea("earl grey", Size.S);

    MilkTea kayOrder = milkCapShop.orderTea("taro", Size.L);

    System.out.println("Iris ordered: " + irisOrder.toString());
    System.out.println("Simona ordered: " + simonaOrder.toString());
    System.out.println("Kay ordered: " + kayOrder.toString());
  }
}
