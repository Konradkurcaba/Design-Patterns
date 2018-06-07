package pl.kurcaba;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.kurcaba.AbstractFactory.FilePath;
import pl.kurcaba.AbstractFactory.FilePathFactory;
import pl.kurcaba.AbstractFactory.LinuxFactory;
import pl.kurcaba.AbstractFactory.WindowsFactory;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class AbstractFactoryTests {


    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private String expectedOutput;
    private final String pathToConvert = "C*folder1*folder2";

    FilePath filePath = null;
    FilePathFactory factory = null;


    @BeforeEach
    public void setOutputBefore(){
        System.setOut(new PrintStream(outputStream));
    }


    @Test
    public void windowsFactoryTest()
    {
        factory = new WindowsFactory();
        filePath = factory.createFilePath(pathToConvert);
        filePath.printFilePath();
        expectedOutput = "Path to file in Windows: C\\folder1\\folder2";
        Assertions.assertEquals(expectedOutput,outputStream.toString(),"Windows path test failed");
    }
    @Test
    public void linuxFactoryTest()
    {
        factory = new LinuxFactory();
        filePath = factory.createFilePath(pathToConvert);
        filePath.printFilePath();
        expectedOutput = "Path to file in Linux: C/folder1/folder2";
        Assertions.assertEquals(expectedOutput,outputStream.toString(),"Linux path test failed");
    }


}
