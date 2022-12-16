package creational.signletonDesignPattern.signleton1;

public class Signleton {

	private static Signleton signleton = new Signleton();

	private Signleton() {

	}

	public static Signleton getSignleton() {
		return signleton;
	}
}
