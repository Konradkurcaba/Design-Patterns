package pl.kurcaba.Decorator;

/**
 * class represent ESP system in cars
 */
public class EspSystem extends CarDecorator {

    public EspSystem(Car carToBeDecorated)
    {
        super(carToBeDecorated);
    }

    @Override
    public void printSystems() {
        super.printSystems();
        System.out.print(" + ESP");
    }
}
