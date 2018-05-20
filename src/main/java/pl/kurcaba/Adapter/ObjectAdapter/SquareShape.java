package pl.kurcaba.Adapter.ObjectAdapter;


import pl.kurcaba.Adapter.RectangleShape;
import pl.kurcaba.Adapter.Square;

public class SquareShape implements RectangleShape
{
    private Square square = null;

    public SquareShape(Square square) {
        this.square = square;
    }

    public int getWidth() {
        return square.getsideLenght();
    }

    public int getHeight() {
        return square.getsideLenght();
    }
}