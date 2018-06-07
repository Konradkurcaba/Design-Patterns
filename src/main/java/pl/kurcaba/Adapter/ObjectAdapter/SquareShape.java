package pl.kurcaba.Adapter.ObjectAdapter;


import pl.kurcaba.Adapter.RectangleShape;
import pl.kurcaba.Adapter.Square;

/**
 *This is object adapter for Square class
 */
public class SquareShape implements RectangleShape
{
    private Square square = null;

    public SquareShape(Square square) {
        this.square = square;
    }

    /**
     * @return square width
     */
    public int getWidth() {
        return square.getsideLenght();
    }

    /**
     *
     * @return square height
     */
    public int getHeight() {
        return square.getsideLenght();
    }
}