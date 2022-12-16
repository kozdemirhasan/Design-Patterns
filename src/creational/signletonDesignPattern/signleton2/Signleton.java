package creational.signletonDesignPattern.signleton2;

public class Signleton {
	
	private static Signleton signleton;
	static int counter;
	
	private Signleton() {
		System.out.println("Signleton object created");
	}
	
	public static Signleton getSignleton() {
		
		if(signleton ==null) {
			synchronized (Signleton.class) {
				if(signleton ==null) {
					signleton = new Signleton();
				}
			}
		}
		counter++;
		System.out.println(counter);
		
		return signleton;
	}

}
