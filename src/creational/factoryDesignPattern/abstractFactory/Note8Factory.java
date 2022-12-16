package creational.factoryDesignPattern.abstractFactory;

public class Note8Factory implements HandyFactory {

	@Override
	public Handy getHandy(String model, String batterie, int breite, int groesse) {
		return new Note8(model, batterie, breite, groesse);
	}

}
