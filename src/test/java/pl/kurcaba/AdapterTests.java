package pl.kurcaba;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.kurcaba.Adapter.ClassAdapter.SquareAdapter;
import pl.kurcaba.Adapter.ObjectAdapter.SquareShape;
import pl.kurcaba.Adapter.RectangleShape;
import pl.kurcaba.Adapter.Square;


public class AdapterTests {


    Square firstSquare = new Square(5);
    Square secondSquare = new Square(7);



    @Test
    public void classAdapterTests()
    {
        RectangleShape squareAdapter = new SquareAdapter(firstSquare.getsideLenght());

        Assertions.assertEquals(5,squareAdapter.getHeight(),"Class Adapter get Height test failed");
        Assertions.assertEquals(5,squareAdapter.getWidth(), "Class Adapter get Width test failed");

        squareAdapter = new SquareAdapter(secondSquare.getsideLenght());

        Assertions.assertEquals(7,squareAdapter.getHeight(),"Class Adapter get Height test failed");
        Assertions.assertEquals(7,squareAdapter.getWidth(), "Class Adapter get Width test failed");

    }

    @Test
    public void objectAdapterTests()
    {
        RectangleShape squareShape = new SquareShape(firstSquare);

        Assertions.assertEquals(5,squareShape.getHeight(),"Class Adapter get Height test failed");
        Assertions.assertEquals(5,squareShape.getWidth(), "Class Adapter get Width test failed");

        squareShape = new SquareShape(secondSquare);

        Assertions.assertEquals(7,squareShape.getHeight(),"Class Adapter get Height test failed");
        Assertions.assertEquals(7,squareShape.getWidth(), "Class Adapter get Width test failed");

    }
}
