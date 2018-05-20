package pl.kurcaba.Adapter.ClassAdapter;

import pl.kurcaba.Adapter.RectangleShape;
import pl.kurcaba.Adapter.Square;

public class SquareAdapter extends Square implements RectangleShape {

    public SquareAdapter(int sideLength) {
        super(sideLength);
    }

    public int getWidth() {
        return getsideLenght();
    }

    public int getHeight() {
        return getsideLenght();
    }
}
