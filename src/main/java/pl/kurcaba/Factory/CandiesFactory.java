package pl.kurcaba.Factory;

/**
 * This is Candies Factory
 */
public class CandiesFactory {

    /**
     *
     * @param candyName Name of candy which we want to create
     * @return new candy object
     */
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
