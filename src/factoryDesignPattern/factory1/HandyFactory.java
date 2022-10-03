package factoryDesignPattern.factory1;

public class HandyFactory {

	public static Handy getHandy(String model, String batterie, int breite, int groesse) {

		Handy handy;

		if ("s8".equalsIgnoreCase(model)) {
			handy = new S8(model, batterie, breite, groesse);
		} else if ("Note8".equalsIgnoreCase(model)) {
			handy = new Note8(model, batterie, breite, groesse);
		} else {
			throw new RuntimeException("Ungültiges model!!!");
		}

		return handy;
	}

}
