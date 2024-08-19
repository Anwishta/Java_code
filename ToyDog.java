public class ToyDog {
	int legs = 4;
	int eyes = 2;
	int ears = 2;
	int nose = 1;
	int tail = 1;
	String color;
	ToyDog(String color) {
		this.color = color;
	}
	void test() {
		System.out.println("The dog has "+ legs+" legs "+eyes+" eyes "+ears+" ears "+nose+" nose "+tail+" tails");
		System.out.println("The dog is barking");
		System.out.println("The dog is running");
		System.out.println("The dog is "+color+" in color");
	}
	public static void main(String[] args) {
		ToyDog objDog = new ToyDog("Brown");
		objDog.test();

	}

}