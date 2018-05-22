package pl.kurcaba.Decorator;

public class EsrSystem extends CarDecorator{

    public EsrSystem(Car carToBeDecorated) {
        super(carToBeDecorated);
    }

    @Override
    public void printSystems() {
        super.printSystems();
        System.out.println(" + ESR");
    }
}
