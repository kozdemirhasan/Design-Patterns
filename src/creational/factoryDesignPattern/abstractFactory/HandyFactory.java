package creational.factoryDesignPattern.abstractFactory;

public interface HandyFactory {

	Handy getHandy(String model, String batterie, int breite, int groesse);
	
}
