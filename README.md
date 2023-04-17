# Factory Method Pattern Report
(By Factory Method Pattern Team 1)

Team: Iris (Bijin) Zhang, Kay (Mengxian) Cai, Simona (Youjing) Shen

CS 5004 Object-Oriented Design, Spring 2023

Instructor: Dr. Lino Coria


## How Factory Pattern Works?
The factory method is a creational design pattern that provides an interface or abstract class for creating an object. And it allows its sub-classes to decide which class to instantiate.

In this pattern, a creator class provides an abstract method that returns an object of a specific type. The concrete subclasses of the creator class implement this method to create objects of different types. The client code interacts with the creator class, rather than directly interacts with the concrete subclasses. This pattern allows for greater flexibility in object creation and promotes loose coupling.

## When To Use Factory Pattern?
When our program needs to instantiate lots of concrete classes at run time and we foresee the possibility that our code may be extended with new concrete classes in the future, meanwhile the client code is independent of how concrete objects are created, the factory pattern will be a good match for this kind of scenario.

Assume we are opening a bank which offers our customers different types of credit cards. We provide three types of credit cards such as Silver, Gold, and Platinum cards. Each of them has a different credit limit. For example, the credit limit of a Silver card is 10,000 CAD, the credit limit of a Gold card is 25,000 CAD, and the credit limit of a Platinum card is 50,000 CAD. The type of credit card a customer will receive depends on his/her annual income[^1].

In this scenario, it is good to apply the factory method design pattern.
![Facotry_pattern_example](https://github.com/kaycaimx/CS5004_Design_Pattern/blob/main/images/Factory_pattern.png)


## Code Description
  - **How the code works?**
![Code_description](https://github.com/kaycaimx/CS5004_Design_Pattern/blob/main/images/Code%20_description_diagram.png)
    Factory Method Pattern encapsulates object creation by letting subclasses decide what objects to create[^2]. In our code, MilkTeaShop is the abstract creator and it produces one product MilkTea, which is an abstract type, therefore, the abstract creator only depends on an abstract product rather than concrete classes.
    
    MilkTeaShop defines an abstract factory method makeTea() so that each of its subclasses (i.e., the concrete creators) must implement this method. In this way, the subclasses of MilkTeaShop are responsible for instantiating various concrete MilkTea objects, which enables the client to make different genres of milk tea meanwhile decouples the client code in the MilkTeaShop superclass from the object creation code in the subclass.
    
    Factory Method Pattern also makes code more flexible and extensible. For example, if the client wants to add a new genre Fruit Milk Tea in the future (please see the red highlighted part in the diagram above). The client can easily establish a new concrete creator and concrete product classes each inheriting their respective parent classes, without the need to touch any existing code, which follows the SOLID principles that “open for extension, closed for modification”.
    
  - **How to run the code?**
    1. First, the user needs an instance of a MilkTeaShop. Assuming Iris wants to order a medium-size BobaOolongTea, Iris needs to instantiate a BobaTeaShop.
    2. Once the concrete creator is instantiated, Iris can call the orderTea() method by the BobaTeaShop and pass in her favorite tea base (“Oolong” in String) and cup size (Size.M in enum). 
    3. The orderTea() method will call the factory method makeTea(). Since BobaTeaShop is defined to create all boba milk tea products, it will create a BobaOolongTea and return this product to the orderTea() method.
    4. The orderTea() method does not and needs not to know which concrete product is created and returned, as long as it is a MilkTea, the orderTea() method will upgrade the size to M and calculate the corresponding price for Iris.
    5. Finally, Iris gets the tea she wants and if represented by a String it would be: A Medium cup of Boba Oolong Tea ($7.75).


## UML
![UML](https://github.com/kaycaimx/CS5004_Design_Pattern/blob/main/images/UML.jpg)

#### References
[^1]: Arshad Suraj, “Overview Of Factory Method Design Pattern”, Medium, May 23, 2021, https://medium.com/geekculture/overview-of-factory-method-design-pattern-d3a6fe908ea4
[^2]: Freeman, E., & Robson, E. (2021). Head first design patterns : building extensible and maintainable object-oriented software (2nd edition). O’Reilly (https://learning.oreilly.com/library/view/head-first-design/9781492077992/).

