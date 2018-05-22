package pl.kurcaba.Decorator;

public class SimpleCar implements Car {


    private String carName;


    public SimpleCar(String name) {
        this.carName = name;
    }

    @Override
    public void printSystems() {
        System.out.print(carName);
    }
}

