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
    MilkTeaShop creamCapShop = new CreamCapTeaShop();
    MilkTeaShop bobaShop = new BobaTeaShop();
    MilkTeaShop fruitShop = new FruitTeaShop();

    MilkTea irisOrder = bobaShop.orderTea("Oolong", Size.M);

    MilkTea simonaOrder = fruitShop.orderTea("earl grey", Size.S);

    MilkTea kayOrder = creamCapShop.orderTea("taro", Size.L);

    System.out.println("Iris ordered: " + irisOrder.toString());
    //print-out: Iris ordered: A Medium cup of Boba Bubble Oolong Tea ($7.75)
    System.out.println("Simona ordered: " + simonaOrder.toString());
    //print-out: Simona ordered: A Small cup of Fresh Fruit Earl Grey Tea ($6.50)
    System.out.println("Kay ordered: " + kayOrder.toString());
    //print-out: Kay ordered: A Large cup of Fluffy Cream Cap Taro Tea ($9.00)
  }
}
