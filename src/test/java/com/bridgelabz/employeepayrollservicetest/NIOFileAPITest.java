package com.bridgelabz.employeepayrollservicetest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.IntStream;

public class NIOFileAPITest {
    private static String HOME = System.getProperty("user.dir");
    private static String PLAY_WITH_NIO = "TempPlayGround";

    @Test
    public void givenPathWhenCheckedThenConfirm() throws IOException {
        System.out.println(HOME);
        //Check File Exist
        Path homePath = Paths.get(HOME);
        Assertions.assertTrue(Files.exists(homePath));

        //Delete File and Check File Not Exist
        Path playpath = Paths.get(HOME + "/" + PLAY_WITH_NIO);
        if (Files.exists(playpath)) Files.delete(playpath);
        Assertions.assertTrue(Files.notExists(playpath));

        //Create Directory
        Files.createDirectories(playpath);
        Assertions.assertTrue(Files.exists(playpath));

        //Create File
        IntStream.range(1, 10).forEach(cntr -> {
            Path tempFile = Paths.get(playpath + "/temp" + cntr);
            Assertions.assertTrue(Files.notExists(tempFile));
            try {
                Files.createFile(tempFile);
            } catch (IOException e) {
            }
            Assertions.assertTrue(Files.exists(tempFile));
        });

        // List Files, Directories as well as Files with Extension
        Files.list(playpath).filter(Files::isRegularFile).forEach(System.out::println);
        Files.newDirectoryStream(playpath).forEach(System.out::println);
        Files.newDirectoryStream(playpath, path -> path.toFile().isFile() && path.toString().startsWith("temp")).forEach(System.out::println);
    }
}
