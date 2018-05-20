package pl.kurcaba.AbstractFactory;

public class WindowsFilePath implements FilePath{

    String path;

    public WindowsFilePath(String path) {
        this.path = path;
    }

    public void printFilePath() {
        System.out.println("Path to file in Windows: "+path);
    }
}