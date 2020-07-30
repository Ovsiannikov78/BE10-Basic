

package JavaIOAssignment1.Task_4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import java.util.Arrays;

import java.util.List;


public class SaveCustomersListToTheFile {
    /*
    Ну и обратная задачка: есть список Customers:
    firstName, lastName, age - сохранить его в csv файл, похожий на то, что в
        */
    public static void main(String[] args) throws IOException {
        File csvFile = new File("csv2.txt");
        File csvFile1 = new File("csv3.txt");
        List<Customer> customerList = Arrays.asList(
                new Customer("Vasya", "Petechkin", 15),
                new Customer("Petya", "Vasechkin", 18),
                new Customer("Jack", "Gibson", 25));

        writeCustomersToTheCsvFile_1(customerList, csvFile);
        writeCustomersToTheCsvFile_2(customerList, csvFile1);
    }

    public static File writeCustomersToTheCsvFile_1(List<Customer> customerList, File csvFile) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(csvFile));
        customerList.stream().map(Customer::toString)
                .forEach(s -> {
                    try {
                        bw.write(s + System.lineSeparator());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
        bw.close();
        return csvFile;
    }

    public static void writeCustomersToTheCsvFile_2(List<Customer> customerList, File csvFile1) {
        try (BufferedWriter bw1 = new BufferedWriter(new FileWriter(csvFile1))) {
            for (Customer customer : customerList) {
                bw1.write(Customer.customerForTheCsvFile(customer));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
      }
    }



