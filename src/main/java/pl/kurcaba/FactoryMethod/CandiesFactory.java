package pl.kurcaba.FactoryMethod;

public class CandiesFactory {

    public static Candy createCandy(String candyName)
    {
        switch (candyName)
        {
            case "Caramel":
                return new CaramelCandy();

            case "Chocolate":
                return new ChocolateCandy();

                default:return null;

        }


    }


}
