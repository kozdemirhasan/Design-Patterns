package creational.signletonDesignPattern.signleton1;

public class App {
	
	public static void main(String[] args) {
		
		Signleton signleton = Signleton.getSignleton();
		Signleton signleton2 = Signleton.getSignleton();
		
		System.out.println(signleton);
		System.out.println(signleton2);
		
		
	}
}
