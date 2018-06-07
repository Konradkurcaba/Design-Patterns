package pl.kurcaba.AbstractFactory;

/**
 * This class represent file path for windows systems
 */
public class WindowsFilePath implements FilePath{

    String path;

    public WindowsFilePath(String path) {
        this.path = path;
    }

    public void printFilePath() {
        System.out.print("Path to file in Windows: "+path);
    }
}
