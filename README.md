# CS5004_Design_Pattern
Design pattern presentation for CS5004 Spring 2023 - Factory 1

### How Factory Pattern Works?
The factory method is a creational design pattern that provides an interface or abstract class for creating an object. And it allows its sub-classes to decide which class to instantiate.

In this pattern, a creator class provides an abstract method that returns an object of a specific type. The concrete subclasses of the creator class implement this method to create objects of different types. The client code interacts with the creator class, rather than directly interacts with the concrete subclasses. This pattern allows for greater flexibility in object creation and promotes loose coupling.

### When To Use Factory Pattern?
Assume we are opening a bank which offers our customers different types of credit cards. We provide three types of credit cards such as Silver, Gold, and Platinum cards. Each of them has a different credit limit. For example, the credit limit of a Silver card is 10,000 CAD, the credit limit of a Gold card is 25,000 CAD, and the credit limit of a Platinum card is 50,000 CAD. The type of credit card a customer will receive depends on his/her annual income.

In this scenario, it is good to apply the factory method design pattern.

### Code Description
 - **How the code works?**
![Code_description](https://github.com/kaycaimx/CS5004_Design_Pattern/blob/main/images/Code%20_description_diagram.png)
    Factory Method Pattern encapsulates object creation by letting subclasses decide what objects to create. [Citation] In our code, MilkTeaShop is the abstract creator and it produces one product MilkTea, which is an abstract type, therefore, the abstract creator only depends on an abstract product rather than concrete classes.
    
    MilkTeaShop defines an abstract factory method makeTea() so that each of its subclasses (i.e., the concrete creators) must implement this method. In this way, the subclasses of MilkTeaShop is responsible for instantiating various concrete MilkTea objects, which enables the client to make different genres of milk tea meanwhile decouples the client code in the MilkTeaShop superclass from the object creation code in the subclass.
    
    Factory Method Pattern also makes code more flexible and extensiblee. For example, if the client wants to add a new genre Fruit Milk Tea in the future (please see the red highlighted part in the diagram above). The client can easily establish a new concrete creator and concrete product classes each inheriting their respective parent classes, without the need to touch any existing code, which follows the SOLID principles that “open for extension, closed for modification”.
    
- **How to run the code?**
    1.First, the user needs an instance of a MilkTeaShop. Assuming Iris wants to order a medium size BobaOolongTea, Iris needs to instantiate a BobaTeaShop.
    2.Once the concrete creator is instantiated, Iris can call the orderTea() method by the BobaTeaShop and pass in her favorite tea base (“Oolong” in String) and cup size (Size.M in enum). 
    3.The orderTea() method will call the factory method makeTea(). Since BobaTeaShop is defined to create all boba milk tea products, it will create a BobaOolongTea and return this product to the orderTea() method.
    4.The orderTea() method does not and needs not to know which concrete product is created and returned, as long as it is a MilkTea, the orderTea() method will upgrade the size to M and calculate the corresponding price for Iris.
    5.Finally, Iris gets the tea she wants and if represented by a String it would be: A Medium cup of Boba Oolong Tea ($7.75).
