package FileAPI;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.IntStream;

public class FileAPITest {
    public static String HOME = System.getProperty("user.home");
    private static String FILE = "TempPlayGround";

    public static void main(String[] args) throws IOException {
        Path homePath = Paths.get(HOME);
        Path playPath = Paths.get(HOME + "/" + FILE);
        if (Files.exists(playPath)) {
            boolean result = FileUtils.deleteFile(playPath.toFile());
            System.out.println(result + " File Does not exist");
        }
        Files.createDirectory(playPath);
        IntStream.range(1,10).forEach(cnt->{
            Path tempFile = Paths.get(playPath+"/temp"+cnt);
            if (Files.notExists(tempFile)){
                try {
                    Files.createFile(tempFile);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        Files.list(playPath).filter(Files::isRegularFile).forEach(System.out::println);
    Path dir = Paths.get(HOME+"/"+FILE);
    Files.list(dir).filter(Files::isRegularFile).forEach(System.out::println);
    new Java8WatchService(dir).processEvents();
    }
}
