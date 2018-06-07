package pl.kurcaba.AbstractFactory;

public class WindowsFactory implements FilePathFactory {

    public FilePath createFilePath(String path) {
        path = path.replace('*','\\');
        return new WindowsFilePath(path);
    }
}
