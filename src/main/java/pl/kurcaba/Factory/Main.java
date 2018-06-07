package pl.kurcaba.Factory;

public class Main {

    public static void main(String... args) {





        Candy candy = CandiesFactory.createCandy("Chocolate");
        candy.printName();

        candy = CandiesFactory.createCandy("Caramel");
        candy.printName();
    }



}
