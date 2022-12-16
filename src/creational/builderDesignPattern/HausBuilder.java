package creational.builderDesignPattern;

public class HausBuilder {
	
	private String stadt;
	private String stadtTeil;
	private String strasse;
	
	private int buildYear;
	private int zimmerZahl;	
	private int balkonZahl;
	private int badZahl;
	private int toiletteZahl;
	
	private boolean isDublex;
	private boolean isDinge;
	private boolean hasAutoPark;
	private boolean hasKinderPark;
	private boolean hasKlima;
	private boolean hasPool;
	
//	public static HausBuilder startBuild() {
//		return new HausBuilder();
//	}
	
//	Pflicht Fields
	public static HausBuilder startBuild(String stadt, String statTeil,
			String strasse, int buildYear, int zimmerZahl) {
	
		HausBuilder hausBuilder = new HausBuilder();
		hausBuilder.stadt = stadt;
		hausBuilder.stadtTeil = statTeil;
		hausBuilder.strasse = strasse;
		hausBuilder.buildYear = buildYear;
		hausBuilder.zimmerZahl = zimmerZahl;
		
		return hausBuilder;
	
	}

	public Haus build() {
		
		Haus haus = new Haus();
		
		haus.setStadt(stadt);
		haus.setStadtTeil(stadtTeil);
		haus.setStrasse(strasse);
		
		haus.setBuildYear(buildYear);
		haus.setBalkonZahl(balkonZahl);
		haus.setZimmerZahl(zimmerZahl);
		haus.setBadZahl(badZahl);
		haus.setToiletteZahl(toiletteZahl);
		
		haus.setDublex(isDublex);
		haus.setDinge(isDinge);
		haus.setHasAutoPark(hasAutoPark);
		haus.setHasKinderPark(hasKinderPark);
		haus.setHasKlima(hasKlima);
		haus.setHasPool(hasPool);
		
		return haus;		
		
	}
		
	
	
//	setter methoden
//	public HausBuilder setStadt(String stadt) {
//		this.stadt = stadt;
//		return this;
//	}
//
//	public HausBuilder setStadtTeil(String stadtTeil) {
//		this.stadtTeil = stadtTeil;
//		return this;
//	}
//
//	public HausBuilder setStrasse(String strasse) {
//		this.strasse = strasse;
//		return this;
//	}
//
//	public HausBuilder setBuildYear(int buildYear) {
//		this.buildYear = buildYear;
//		return this;
//	}
//	
//	public HausBuilder setZimmerZahl(int zimmerZahl) {
//	this.zimmerZahl = zimmerZahl;
//	return this;
//}

	public HausBuilder setBalkonZahl(int balkonZahl) {
		this.balkonZahl = balkonZahl;
		return this;
	}



	public HausBuilder setBadZahl(int badZahl) {
		this.badZahl = badZahl;
		return this;
	}

	public HausBuilder setToiletteZahl(int toiletteZahl) {
		this.toiletteZahl = toiletteZahl;
		return this;
	}

	public HausBuilder setDublex(boolean isDublex) {
		this.isDublex = isDublex;
		return this;
	}

	public HausBuilder setDinge(boolean isDinge) {
		this.isDinge = isDinge;
		return this;
	}

	public HausBuilder setHasAutoPark(boolean hasAutoPark) {
		this.hasAutoPark = hasAutoPark;
		return this;
	}

	public HausBuilder setHasKinderPark(boolean hasKinderPark) {
		this.hasKinderPark = hasKinderPark;
		return this;
	}

	public HausBuilder setHasKlima(boolean hasKlima) {
		this.hasKlima = hasKlima;
		return this;
	}

	public HausBuilder setHasPool(boolean hasPool) {
		this.hasPool = hasPool;
		return this;
	}
	
	
	
	
}
