package creational.builderDesignPattern;

public class ImmobilienMakler {

	public static void main(String[] args) {

//		Haus haus1 = HausBuilder.startBuild() // created new HausBuilder
//			
//				.setStadt("Neuss")
//				.setStadtTeil("Süd-Stadt")
//				.setStrasse("Goethe Str.")
//				.setBuildYear(1975)
//				.setZimmerZahl(3)
//				.setHasKinderPark(true)
//				.setHasAutoPark(true)
//				
//				.build();
//		
//			printHaus(haus1);
		
		Haus hausPflichtFields = HausBuilder.startBuild("Neuss", "Süd-Stadt","Goethe Str.",
				1995,3) // created new HausBuilder
								
				.setHasKinderPark(true)
				.setHasAutoPark(true)
				
				.build();

			printHaus(hausPflichtFields);

	}
	

	private static void printHaus(Haus haus) {
		System.out.println("Haus added: \n" + haus );
	}

}
