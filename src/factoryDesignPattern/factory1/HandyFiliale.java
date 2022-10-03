package factoryDesignPattern.factory1;

public class HandyFiliale {

	public static void main(String[] args) {

		Handy s8 = HandyFactory.getHandy("s8", "2000mah", 4, 7);
		Handy s81 = HandyFactory.getHandy("s8", "2500mah", 4, 8);
		Handy s82 = HandyFactory.getHandy("s8", "1900mah", 3, 7);
		
		Handy note8 = HandyFactory.getHandy("note8", "5000mah", 6, 9);
		Handy note81 = HandyFactory.getHandy("note8", "6000mah", 8, 12);
		
		
		
		System.out.println("Eigenschaften für S8:");		
		System.out.println(s8);
		System.out.println(s81);
		System.out.println(s82);
		
		
		System.out.println("\nEigenschaften für Note8:");		
		System.out.println(note8);
		System.out.println(note81);
		


		
	}

}
