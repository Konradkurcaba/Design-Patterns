package pl.kurcaba.Factory;

public class CandiesFactory {

    public static Candy createCandy(String candyName)
    {
        switch (candyName)
        {
            case "Caramel":
                return new CaramelCandy();

            case "Chocolate":
                return new ChocolateCandy();
            case "Fruit":
                return new FruitCandy();

                default:return null;

        }


    }


}
