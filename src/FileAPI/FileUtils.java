package FileAPI;

import java.io.File;

public class FileUtils {
    public static boolean deleteFile(File contentToDelete) {
        File[] allContents = contentToDelete.listFiles();
        if (allContents != null) {
            for (File file : allContents) {
                deleteFile(file);
            }
        }
        return contentToDelete.delete();
    }
}
