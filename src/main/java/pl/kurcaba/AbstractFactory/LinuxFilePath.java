package pl.kurcaba.AbstractFactory;

public class LinuxFilePath implements FilePath {

    String path;

    public LinuxFilePath(String path) {
        this.path = path;
    }

    public void printFilePath() {
        System.out.println("Path to file in Linux: " + path);
    }
}