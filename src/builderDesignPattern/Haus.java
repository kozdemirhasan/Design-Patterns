package builderDesignPattern;

public class Haus {

	private String stadt;
	private String stadtTeil;
	private String strasse;

	private int buildYear;
	private int balkonZahl;
	private int zimmerZahl;
	private int badZahl;
	private int toiletteZahl;

	private boolean isDublex;
	private boolean isDinge;
	private boolean hasAutoPark;
	private boolean hasKinderPark;
	private boolean hasKlima;
	private boolean hasPool;

	
//	Constructors
	
	public Haus() {

	}

	public Haus(String stadt, String stadtTeil, String strasse, int buildYear, int balkonZahl, int zimmerZahl,
			int badZahl, int toiletteZahl, boolean isDublex, boolean isDinge, boolean hasAutoPark,
			boolean hasKinderPark, boolean hasKlima, boolean hasPool) {

		this.stadt = stadt;
		this.stadtTeil = stadtTeil;
		this.strasse = strasse;
		this.buildYear = buildYear;
		this.balkonZahl = balkonZahl;
		this.zimmerZahl = zimmerZahl;
		this.badZahl = badZahl;
		this.toiletteZahl = toiletteZahl;
		this.isDublex = isDublex;
		this.isDinge = isDinge;
		this.hasAutoPark = hasAutoPark;
		this.hasKinderPark = hasKinderPark;
		this.hasKlima = hasKlima;
		this.hasPool = hasPool;
	}
	
	

//	Getter and Setter

	public String getStadt() {
		return stadt;
	}

	public void setStadt(String stadt) {
		this.stadt = stadt;
	}

	public String getStadtTeil() {
		return stadtTeil;
	}

	public void setStadtTeil(String stadtTeil) {
		this.stadtTeil = stadtTeil;
	}

	public String getStrasse() {
		return strasse;
	}

	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}

	public int getBuildYear() {
		return buildYear;
	}

	public void setBuildYear(int buildYear) {
		this.buildYear = buildYear;
	}

	public int getBalkonZahl() {
		return balkonZahl;
	}

	public void setBalkonZahl(int balkonZahl) {
		this.balkonZahl = balkonZahl;
	}

	public int getZimmerZAal() {
		return zimmerZahl;
	}

	public void setZimmerZahl(int zimmerZahl) {
		this.zimmerZahl = zimmerZahl;
	}

	public int getBadZahl() {
		return badZahl;
	}

	public void setBadZahl(int badZahl) {
		this.badZahl = badZahl;
	}

	public int getToiletteZahl() {
		return toiletteZahl;
	}

	public void setToiletteZahl(int toiletteZahl) {
		this.toiletteZahl = toiletteZahl;
	}

	public boolean isDublex() {
		return isDublex;
	}

	public void setDublex(boolean isDublex) {
		this.isDublex = isDublex;
	}

	public boolean isDinge() {
		return isDinge;
	}

	public void setDinge(boolean isDinge) {
		this.isDinge = isDinge;
	}

	public boolean isHasOutoPark() {
		return hasAutoPark;
	}

	public void setHasAutoPark(boolean hasAutoPark) {
		this.hasAutoPark = hasAutoPark;
	}

	public boolean isHasKinderPark() {
		return hasKinderPark;
	}

	public void setHasKinderPark(boolean hasKinderPark) {
		this.hasKinderPark = hasKinderPark;
	}

	public boolean isHasKlima() {
		return hasKlima;
	}

	public void setHasKlima(boolean hasKlima) {
		this.hasKlima = hasKlima;
	}

	public boolean isHasPool() {
		return hasPool;
	}

	public void setHasPool(boolean hasPool) {
		this.hasPool = hasPool;
	}
	
	
	@Override
	public String toString() {
		return " stadt=" + stadt 
				+ ",\n stadtTeil=" 
				+ stadtTeil 
				+ ",\n strasse=" 
				+ strasse 
				+ ",\n buildYear=" 
				+ buildYear
				+ ",\n balkonZahl=" 
				+ balkonZahl 
				+ ",\n zimmerZahl=" 
				+ zimmerZahl 
				+ ",\n badZahl=" 
				+ badZahl
				+ ",\n toiletteZahl=" 
				+ toiletteZahl 
				+ ",\n isDublex=" 
				+ isDublex 
				+ ",\n isDinge=" 
				+ isDinge
				+ ",\n hasAutoPark=" 
				+ hasAutoPark 
				+ ",\n hasKinderPark=" 
				+ hasKinderPark 
				+ ",\n hasKlima=" 
				+ hasKlima
				+ ",\n hasPool=" 
				+ hasPool ;
		
	}

}
