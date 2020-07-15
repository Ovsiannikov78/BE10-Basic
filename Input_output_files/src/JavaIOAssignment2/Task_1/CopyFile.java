package JavaIOAssignment2.Task_1;

import java.io.*;
import java.nio.file.Files;

public class CopyFile {

    /*
           Написать функцию
           public void copyFile(String from, String to){}
           которая принимает файл и цель и копирует файл.
           Например, copyFile(“c:\\temp\\bigfile.zip”, “c:\\temp2”)
           должна скопировать ​bigfile.zip​в папку t​emp2.​

           Возможны 3 реализации: вычитывание файла побайтово,
                                  вычитывание блоками в буфер заданного размера
                                  или вычитывание того, что доступно для вычитывания с использованием функции available().

         */
    public static void main(String[] args) {
        File from = new File("/Users/sergiiovsiannikov/Desktop/tel_ran_10/Java_Main/BE10-Basic/temp/original.txt.pages.zip");
        File to = new File("/Users/sergiiovsiannikov/Desktop/tel_ran_10/Java_Main/BE10-Basic/temp2/copedFile.txt.zip");
        copyFileToAnotherDirectory(from, to);

    }

    public static void copyFileToAnotherDirectory(File from, File to) {
        try {
            Files.copy(from.toPath(), to.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
