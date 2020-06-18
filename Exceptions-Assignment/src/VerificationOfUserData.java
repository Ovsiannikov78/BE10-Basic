import Exceptions.InappropriateAgeException;
import Exceptions.InappropriateIbanLengthException;
import Exceptions.IncorrectIbanCountryCodeException;

import java.util.Arrays;
import java.util.Collection;


public class VerificationOfUserData {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Ivan", 23, new BankAccount("DE12123412341234"));
        Customer customer2 = new Customer("Anna", 16, new BankAccount("DE23456745674567"));
        Customer customer3 = new Customer("John", 33, new BankAccount("IT12123412"));
        Customer customer4 = new Customer("Inga", 15, new BankAccount("AU324532453245"));

        Collection<Customer> listOfCustomers = Arrays.asList(customer1, customer2, customer3, customer4);
        verificationOfUserData(listOfCustomers);
    }

    /*
       Дан список пользователей с банковскими счетами.
       Написать программу, которая проверяет правильность пользовательских данных по следующим трем правилам:
       1. Клиент должен быть не моложе 17 лет
       2. Банковский IBAN должен быть длиной 16
       3. Первые два символа IBAN должны быть “DE”
       Программа должна выводить все ошибки. То есть, например,
       если у пользователя есть банковский счет длины 10 и начинающийся на “IT”, то должно печататься два сообщения об ошибке.
       Подсказка: определить три исключения Exception и бросать их при проверке списка в цикле.
   */
    public static void verificationOfUserData(Collection<Customer> listOfCustomers) {
        for (Customer customer : listOfCustomers) {
            checkCustomer(customer);
        }
    }

    public static void checkCustomer(Customer customer) {
        System.out.println(customer + "\n");
        int counterOfExceptions = 0;
        try {
            InappropriateAge(customer);
        } catch (InappropriateAgeException e) {
            counterOfExceptions++;
            System.out.println(counterOfExceptions + ". " + e);
        }
        try {
            InappropriateIbanLength(customer);
        } catch (InappropriateIbanLengthException e) {
            counterOfExceptions++;
            System.out.println(counterOfExceptions + ". " + e);
        }
        try {
            IncorrectIbanCountryCode(customer);
        } catch (IncorrectIbanCountryCodeException e) {
            counterOfExceptions++;
            System.out.println(counterOfExceptions + ". " + e);
        } finally {
            if (counterOfExceptions == 0) {
                System.out.println("Customer data is OK.");
            }
        }
        System.out.println("\n==================================\n");
    }

/*
    public static void verificationOfUserData(Collection<Customer> listOfCustomers) {
        for (Customer customer : listOfCustomers) {
            System.out.println(customer + "\n");
            int counterOfExceptions = 0;
            try {
                InappropriateAge(customer);                  //  Можно было бы в один метод объединить, но думаю для
            } catch (InappropriateAgeException e) {          //  для дальнейшего тестирования не очень хорошая идея.
                counterOfExceptions++;
                System.out.println(counterOfExceptions + ". " + e);
            }
            try {
                InappropriateIbanLength(customer);
            } catch (InappropriateIbanLengthException e) {
                counterOfExceptions++;
                System.out.println(counterOfExceptions + ". " + e);
            }
            try {
                IncorrectIbanCountryCode(customer);
            } catch (IncorrectIbanCountryCodeException e) {
                counterOfExceptions++;
                System.out.println(counterOfExceptions + ". " + e);
            } finally {
                if (counterOfExceptions == 0) {
                    System.out.println("Customer data is OK.");
                }
            }
            System.out.println("\n==================================\n");
        }
    }  */

    private static void InappropriateAge(Customer customer) throws InappropriateAgeException {
        if (customer.getAge() < 17) {
            throw new InappropriateAgeException("Inappropriate age !");
        }
    }

    private static void InappropriateIbanLength(Customer customer) throws InappropriateIbanLengthException {
        if (customer.getAccount().getIBAN().length() < 16) {
            throw new InappropriateIbanLengthException("Invalid IBAN! Must be 16 characters.");
        }
    }

    private static void IncorrectIbanCountryCode(Customer customer) throws IncorrectIbanCountryCodeException {
        if (!customer.getAccount().getIBAN().startsWith("DE")) {
            throw new IncorrectIbanCountryCodeException("Incorrect Country Code of the IBAN ! First two letters must be 'DE'.");
        }
    }
}

