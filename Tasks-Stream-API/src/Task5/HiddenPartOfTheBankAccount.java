/*
package Task5;

import java.util.Collections;
import java.util.List;

public class HiddenPartOfTheBankAccount {
   public static void main(String[] args) {

   }

         5. Написать функцию, которая для списка счетов, возвращает список IBANNs,
          где в каждом IBAN символы после 3-го и до конца заменены звездочками.
    public static List<String> encodedBankAccount(List<String> listOfIBANs){
     return listOfIBANs.stream().filter(s -> s.length() > 3).replace(s.substring(3,s.length()-1),"*").collect(Collections.toList);


    }
}
*/

