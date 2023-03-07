package pl.pingwit.lec_12.point_1.folders;

/**
 * @author Pavel Radkevich
 * @since 7.03.23
 */
public class FolderMain {
    public static void main(String[] args) {
        // "e://folder-1/folder-2/folder-3/folder-4/folder-xx"

        Folder folder4 = new Folder("folder-4");
        Folder folder3 = new Folder("folder-3");
        folder3.setInnerFolder(folder4);

        Folder folder2 = new Folder("folder-2");
        folder2.setInnerFolder(folder3);

        Folder folder1 = new Folder("folder-1");
        folder1.setInnerFolder(folder2);

        String path = assemblePath("e:/", folder1);
        System.out.println(path);
    }

    private static String assemblePath(String path, Folder folder) {
        if (folder.getInnerFolder() == null) {
            return path + "/" + folder.getName();
        } else {
            return path + "/" + assemblePath(folder.getName(), folder.getInnerFolder());
        }
    }
}
