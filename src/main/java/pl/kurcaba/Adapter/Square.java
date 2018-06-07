package pl.kurcaba.Adapter;

/**
 * Class which we want to adapt
 */
public class Square
{
    private int sideLenght = 0;

    public Square(int sideLenght)
    {
        this.sideLenght = sideLenght;
    }

    /**
     *
     * @return side length
     */
    public int getsideLenght()
    {
        return sideLenght;
    }

}
