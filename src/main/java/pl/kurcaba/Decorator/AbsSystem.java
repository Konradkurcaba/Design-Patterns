package pl.kurcaba.Decorator;

/**
 * class represent ABS system in cars
 */
public class AbsSystem extends CarDecorator {

    public AbsSystem(Car carToBeDecorated) {
        super(carToBeDecorated);
    }

    @Override
    public void printSystems() {
        super.printSystems();
        System.out.print(" + ABS");
    }
}
