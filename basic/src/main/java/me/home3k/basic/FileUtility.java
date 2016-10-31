package me.home3k.basic;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 * @author home3k
 */
public class FileUtility {

    public static void main(String[] args) throws IOException {
        Files.list(new File(".").toPath()).filter(x->x.getFileName().toString().startsWith(".")).forEach(System.out::println);
    }

}
