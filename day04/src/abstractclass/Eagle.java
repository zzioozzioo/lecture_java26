package abstractclass;

public class Eagle extends Animal {
	
	public Eagle(String meal) {
//		super(meal);
		this.meal = meal;
	}

	@Override
	public void move() {
		System.out.println("날아다닌다.");

	}

}
