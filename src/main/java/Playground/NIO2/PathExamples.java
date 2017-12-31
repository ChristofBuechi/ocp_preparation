package Playground.NIO2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.*;
import java.nio.file.attribute.FileTime;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class PathExamples {

    public static void main(String... args) throws URISyntaxException, IOException {
        Path testfile  = Paths.get("/home/christof/testfile");
        boolean exists = Files.exists(testfile);
        System.out.println(exists);
        if (!exists) {
            Files.createFile(testfile);
        } else {
            System.out.println("already exists");
        }

        StandardOpenOption option;
        long size = Files.lines(testfile).count();
        if (size >= 2) {
            option = StandardOpenOption.TRUNCATE_EXISTING;
        } else {
            option = StandardOpenOption.APPEND;
        }


        try (BufferedWriter writer = Files.newBufferedWriter(testfile, option)) {
            writer.write("Thats the content of the testfile");
            writer.newLine();
        }

        FileTime lastModified = Files.getLastModifiedTime(testfile);
        System.out.println(lastModified.toMillis());

        try (BufferedReader reader = Files.newBufferedReader(testfile)){
            String currentLine = null;
            while ((currentLine = reader.readLine()) != null) {
                System.out.println(currentLine);
            }
        }

        //List other files in the same directory
        Path dir = testfile.getParent();
        if (Files.isDirectory(dir)) {

        Stream<Path> stream = Files.list(dir);
        stream.map(path -> path.getFileName().toString())
              .sorted()
                .forEach(System.out::println);
        }
    }
}
