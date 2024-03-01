

class Animal {

  public void eat() {
    System.out.println("Animal is eating.");
  }
}

class Dog extends Animal {

  @Override
  public void eat() {
    System.out.println("Dog is barking and eating.");
  }
}

public class inheritance {

  public static void main(String[] args) {
    Animal animal = new Dog();
    animal.eat(); // Output: Dog is barking and eating.
  }
}