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
    public static void main(String[] args) throws FileNotFoundException {
        File from = new File("/Users/sergiiovsiannikov/Desktop/tel_ran_10/Java_Main/BE10-Basic/temp/original.txt.pages.zip");
        File to = new File("/Users/sergiiovsiannikov/Desktop/tel_ran_10/Java_Main/BE10-Basic/temp2/copedFile.txt.zip");

        File from1 = new File("/Users/sergiiovsiannikov/Desktop/tel_ran_10/Java_Main/BE10-Basic/temp/original.txt.pages-1.zip");
        File to1 = new File("/Users/sergiiovsiannikov/Desktop/tel_ran_10/Java_Main/BE10-Basic/temp2/copedFile.txt-1.zip");

        copyFileToAnotherDirectory1(from, to);
        copyFileToAnotherDirectory2(from1, to1);
        System.out.println("============= speedOfMethodExecution ===========");
        checkSpeedOfMethod(from, to);


    }

    public static void copyFileToAnotherDirectory1(File from, File to) {
        try {
            Files.copy(from.toPath(), to.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void copyFileToAnotherDirectory2(File from1, File to1) throws FileNotFoundException {
        InputStream is = new FileInputStream(from1);
        OutputStream os = new FileOutputStream(to1);
        try {
            byte[] buffer = new byte[(int) from1.length()];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void checkSpeedOfMethod(File from, File to) {

        long startTime = System.currentTimeMillis();
        copyFileToAnotherDirectory1(from, to);
        long endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime - startTime) + "ms");
    }

}
