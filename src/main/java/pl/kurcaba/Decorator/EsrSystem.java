package pl.kurcaba.Decorator;

/**
 * class represent EsrSystem in cars
 */
public class EsrSystem extends CarDecorator{

    public EsrSystem(Car carToBeDecorated) {
        super(carToBeDecorated);
    }

    @Override
    public void printSystems() {
        super.printSystems();
        System.out.print(" + ESR");
    }
}
