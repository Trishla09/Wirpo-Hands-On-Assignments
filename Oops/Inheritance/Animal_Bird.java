package Inheritance;
class Animal{
	void eat() {
		System.out.println("I am from Animal's eat method");
	}
	void sleep() {
		System.out.println("I am from Animal's sleep method");
	}
	
}
class Bird extends Animal{
	void eat() {
		System.out.println("I am from Bird's eat method");
	}
	void sleep() {
		System.out.println("I am from Bird's sleep method");
	}
	void fly() {
		System.out.println("I am from  Bird's fly method");
	}
}

public class Animal_Bird {

	public static void main(String[] args) {
		Animal a=new Animal();
		Bird b=new Bird();
		a.eat();
		a.sleep();
		b.eat();
		b.sleep();
		b.fly();
		

	}

}
