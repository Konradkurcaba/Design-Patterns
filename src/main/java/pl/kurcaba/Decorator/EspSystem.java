package pl.kurcaba.Decorator;

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
