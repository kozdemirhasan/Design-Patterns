package factoryDesignPattern.abstractFactory;

public class HandyFiliale {

	public static void main(String[] args) {
	
		S8Factory s8Factory = new S8Factory();		
		Handy s8 = s8Factory.getHandy("s8","2800",5,8);
						
		Note8Factory note8Factory = new Note8Factory();		
		Handy note8 = note8Factory.getHandy("note8A", "4850",10,12);
		Handy note8Plus = note8Factory.getHandy("note8Plus", "3600",8,13);


		System.out.println("======== S8 =========");
		System.out.println(s8);
		
		System.out.println("======= Note 8 =======");
		System.out.println(note8);
		System.out.println(note8Plus);
	}

}
