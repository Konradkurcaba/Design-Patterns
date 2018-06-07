package pl.kurcaba;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.kurcaba.Decorator.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class DecoratorTests {


    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private String expectedOutput;

    private CarDecorator skodaWithEsr = new EsrSystem(new SimpleCar("Skoda"));
    private CarDecorator bmwWithAbsAndEsr = new EsrSystem(new AbsSystem(new SimpleCar("BMW")));
    private CarDecorator citroenWithAbsAndEsrAndEsp = new EspSystem(new EsrSystem(new AbsSystem( new SimpleCar("Citroen"))));
    private CarDecorator fiatWithAbs = new AbsSystem(new SimpleCar("Fiat"));


    @BeforeEach
    public void setOutputBefore(){
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    public void skodaWithEsrTest()
    {
        skodaWithEsr.printSystems();
        expectedOutput = "Skoda + ESR";
        Assertions.assertEquals(expectedOutput,outputStream.toString(),"Decorator Skoda with ESR test failed");

    }

    @Test
    public void bmwWithAbsAndEsrTest()
    {
        bmwWithAbsAndEsr.printSystems();
        expectedOutput = "BMW + ABS + ESR";
        Assertions.assertEquals(expectedOutput,outputStream.toString(),"Decorator BMW with ABS and ESR test failed");
    }

    @Test
    public void citroenWithAbsAndEsrAndEsp()
    {
        citroenWithAbsAndEsrAndEsp.printSystems();
        expectedOutput = "Citroen + ABS + ESR + ESP";
        Assertions.assertEquals(expectedOutput,outputStream.toString(),"Decorator Citroen with ABS and ESR and ESP test failed");
    }

    @Test
    public void fiatWithAbsTest()
    {
        fiatWithAbs.printSystems();
        expectedOutput = "Fiat + ABS";
        Assertions.assertEquals(expectedOutput,outputStream.toString(),"Decorator Fiat with ABS test failed");
    }

}
