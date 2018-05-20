package pl.kurcaba.Adapter;

import pl.kurcaba.Adapter.ClassAdapter.SquareAdapter;
import pl.kurcaba.Adapter.ObjectAdapter.SquareShape;

public class Main {

    public static void main(String... args) {

        adaptClass();
        adaptObject();
    }

    public static void adaptClass()
    {
        RectangleShape square = new SquareAdapter(5);
        System.out.println("Height: " + square.getHeight()+" Width: " + square.getWidth());

    }
    public static void adaptObject()
    {
        Square square = new Square(10);
        RectangleShape squareShape = new SquareShape(square);
        System.out.println("Height: " + squareShape.getHeight()+" Width: " + squareShape.getWidth());
    }
}
