package JavaIOAssignment1.Task_1;

import java.io.*;

/*
Есть текстовый файл, где каждая строка - целое число:
1
2
5
45
54
Написать функцию, которая принимает имя файла, возвращает сумму чисел из файла.
Подсказка: FileReader, BufferedReader плюс stream API.

 */
class SumOfNumbersFromTheFile {
    public static void main(String[] args) throws IOException {
        File file = new File("JavaIOAssignment1.Task_1.txt");

        System.out.println(getSumOfNumbersFromTheFile(file));

    }

    public static Integer getSumOfNumbersFromTheFile(File file) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        return br.lines().mapToInt(Integer::parseInt).sum();

    }
}