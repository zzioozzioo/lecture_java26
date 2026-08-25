package inheritance;

class Animal {
	String eye = "눈";
	String mouth = "주둥이";
	
	void eat() {
		System.out.println("먹이를 먹는다.");
	}
	
	void sleep() {
		System.out.println("잠을 잔다.");
	}

	void move() {
		System.out.println("움직인다.");
		
	}
}

class Eagle extends Animal {
	String wing = "날개";
	
	void move() {
		System.out.println("날아다닌다.");
	}
}

class Tiger extends Animal {
	String leg = "앞다리";
	
	void move() {
		System.out.println("달린다.");
	}
}

class Goldfish extends Animal {
	String fin = "지느러미";
	
	void move() {
		System.out.println("헤엄친다.");
	}
}

class Pig extends Animal {
	String pig = "돼지";
	
	void move() {
		System.out.println("구르다.");
	}
}

public class Example01 {

	public static void main(String[] args) {
		System.out.println(">>>> 독수리");
		Eagle e = new Eagle();
		printDayLife(e);
		System.out.println();
		
		System.out.println(">>>> 호랑이");
		Tiger t = new Tiger();
		printDayLife(t);
		System.out.println();
		
		System.out.println(">>>> 금붕어");
		Goldfish g = new Goldfish();
		printDayLife(g);
		System.out.println();
		
		System.out.println(">>>> 돼지");
		Pig p = new Pig();
		printDayLife(p);
	}
	
	static void printDayLife(Animal a) {
		a.eat();
		a.move();
		a.sleep();
	}

}
