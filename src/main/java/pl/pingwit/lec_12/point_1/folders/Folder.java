package pl.pingwit.lec_12.point_1.folders;

/**
 * @author Pavel Radkevich
 * @since 7.03.23
 */
public class Folder {

    private final String name;
    private Folder innerFolder;

    public Folder(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Folder getInnerFolder() {
        return innerFolder;
    }

    public void setInnerFolder(Folder innerFolder) {
        this.innerFolder = innerFolder;
    }
}
