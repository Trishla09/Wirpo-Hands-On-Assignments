package Polymorphism;
class Fruit {
    String name;
    String taste;
    int size;

    Fruit(String name, String taste, int size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    void eat() {
        System.out.println("Fruit: " + name + ", Taste: " + taste);
    }
}

class Apple extends Fruit {
    Apple() {
        super("Apple", "Sweet", 5);
    }

    void eat() {
        System.out.println("Apple tastes sweet and juicy.");
    }
}

class Orange extends Fruit {
    Orange() {
        super("Orange", "Citrus", 4);
    }

    void eat() {
        System.out.println("Orange tastes tangy and juicy.");
    }
}

public class FruitTest {
    public static void main(String[] args) {
        Fruit f1 = new Apple();
        Fruit f2 = new Orange();

        f1.eat();
        f2.eat();
    }
}

