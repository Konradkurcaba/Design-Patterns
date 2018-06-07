package pl.kurcaba;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pl.kurcaba.Factory.CandiesFactory;
import pl.kurcaba.Factory.Candy;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class FactoryMethodTests {


    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private String expectedOutput;
    private Candy candy = null;

    @BeforeEach
    public void setOutputBefore(){
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    public void CaramelCandyTest()
    {
        expectedOutput = "Caramel Candy";
        candy = CandiesFactory.createCandy("Caramel");
        candy.printName();
        Assertions.assertEquals(expectedOutput,outputStream.toString(),"Factory method test - caramel candy failed");
    }

    @Test
    public void ChocolateCandyTest()
    {
        expectedOutput = "Chocolate Candy";
        candy = CandiesFactory.createCandy("Chocolate");
        candy.printName();
        Assertions.assertEquals(expectedOutput,outputStream.toString(),"Factory method test - Chocolate candy failed ");
    }

    @Test void FruitCandyTest()
    {
        expectedOutput = "Fruit Candy";
        candy = CandiesFactory.createCandy("Fruit");
        candy.printName();
        Assertions.assertEquals(expectedOutput,outputStream.toString(),"Factory method test - Fruit candy failed");
    }







}
