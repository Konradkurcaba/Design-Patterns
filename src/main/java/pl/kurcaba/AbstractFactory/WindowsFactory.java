package pl.kurcaba.AbstractFactory;

/**
 *This is windows file path factory
 */
public class WindowsFactory implements FilePathFactory {

    public FilePath createFilePath(String path) {
        path = path.replace('*','\\');
        return new WindowsFilePath(path);
    }
}
