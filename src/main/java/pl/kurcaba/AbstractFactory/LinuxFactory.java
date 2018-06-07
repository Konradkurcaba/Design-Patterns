package pl.kurcaba.AbstractFactory;

/**
 *This is linux file path factory
 */
public class LinuxFactory implements FilePathFactory{

    /**
     *
     * @param path string, with file path, separated by *
     * @return File path for linux systems
     */
    public FilePath createFilePath(String path) {
        path = path.replace('*','/');
        return new LinuxFilePath(path);
    }
}
