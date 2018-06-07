package pl.kurcaba.Decorator;

/**
 * This is decorator
 */
public class CarDecorator implements Car {

    private Car carToBeDecorated;

    public CarDecorator(Car carToBeDecorated) {
        this.carToBeDecorated = carToBeDecorated;
    }

    @Override
    public void printSystems() {

        carToBeDecorated.printSystems();

    }
}
