package factoryDesignPattern.abstractFactory;

public class Note8 implements Handy {

	private String model;
	private String batterie;
	private int breite;
	private int groesse;

	public Note8(String model, String batterie, int breite, int groesse) {
		this.model = model;
		this.batterie = batterie;
		this.breite = breite;
		this.groesse = groesse;
	}

	@Override
	public String getModel() {		
		return model;
	}

	@Override
	public String getBatterie() {		
		return batterie;
	}

	@Override
	public int getBreite() {		
		return breite;
	}

	@Override
	public int getGroesse() {		
		return groesse;
	}

	@Override
	public String toString() {
		return "Note8 => model=" + model + ", batterie=" + batterie + ", breite=" + breite + ", groesse=" + groesse ;
	}
	
	

}
