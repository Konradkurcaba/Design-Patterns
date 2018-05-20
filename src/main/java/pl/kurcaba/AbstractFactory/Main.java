package pl.kurcaba.AbstractFactory;

public class Main {

    public static void main(String... args)
    {
        String path = "C:*files";
        createWindowsPath(path);
        createLinuxPath(path);


    }

    private static void createWindowsPath(String path)
    {
        FilePathFactory filePathFactory = new WindowsFactory();
        FilePath pathToFile = filePathFactory.createFilePath(path);
        pathToFile.printFilePath();
    }
    private static void createLinuxPath(String path)
    {
        FilePathFactory filePathFactory = new LinuxFactory();
        FilePath pathToFile = filePathFactory.createFilePath(path);
        pathToFile.printFilePath();
    }


}
