package pl.kurcaba.Adapter.ClassAdapter;

import pl.kurcaba.Adapter.RectangleShape;
import pl.kurcaba.Adapter.Square;

/**
 * This is class adapter for Square class
 */
public class SquareAdapter extends Square implements RectangleShape {

    public SquareAdapter(int sideLength) {
        super(sideLength);
    }

    /**
     * @return square Width
     */
    public int getWidth() {
        return getsideLenght();
    }

    /**
     * @return square height
     */
    public int getHeight() {
        return getsideLenght();
    }
}
