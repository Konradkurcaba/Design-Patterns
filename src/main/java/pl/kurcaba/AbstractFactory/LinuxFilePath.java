package pl.kurcaba.AbstractFactory;
/**
 *This class represent linux file path
 */
public class LinuxFilePath implements FilePath {

    String path;

    public LinuxFilePath(String path) {
        this.path = path;
    }

    public void printFilePath() {
        System.out.print("Path to file in Linux: " + path);
    }
}
