package pl.kurcaba.AbstractFactory;

public class LinuxFactory implements FilePathFactory{

    public FilePath createFilePath(String path) {
        path = path.replace('*','/');
        return new LinuxFilePath(path);
    }
}
