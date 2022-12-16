package creational.factoryDesignPattern.abstractFactory;

public class S8Factory implements HandyFactory {

	@Override
	public Handy getHandy(String model, String batterie, int breite, int groesse) {
		return new S8(model, batterie, breite, groesse);
	}

}
