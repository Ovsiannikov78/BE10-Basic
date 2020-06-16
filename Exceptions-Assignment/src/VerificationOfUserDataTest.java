import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;

public class VerificationOfUserDataTest {
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
    Customer customer1 = new Customer("Ivan",23,new BankAccount("DE12123412341234"));
    Customer customer2 = new Customer("Anna",16,new BankAccount("DE23456745674567"));
    Customer customer3 = new Customer("John",33,new BankAccount("IT12123412"));
    Customer customer4 = new Customer("Inga",28,new BankAccount("DE32453245324532"));

    Collection<Customer> listOfCustomers = Arrays.asList(customer1,customer2,customer3,customer4);

    @Test
    public void testInappropriateAgeOfUserException(){


    }

}
