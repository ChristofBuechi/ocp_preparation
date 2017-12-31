package PracticeTests.Chapter19.Question34;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class Song {
    public static void organize(Path folder, Path file) throws IOException {
        Path p = folder.resolve(file);
//        BasicFileAttributeView vw = Files.getFileAttributeView(p, BasicFileAttributes.class);  //does not compile
//        if( vw.readAttributes().creationTime().toMillis()<System.currentTimeMillis()) {
//            vw.setTimes(FileTime.from(System.currentTimeMillis()), null, null); //does not compile
//        }
    }

    public static void main(String[] audio) throws Exception {
        Song.organize(Paths.get("/", "pub"), new File("/songs").toPath());
    }
}
