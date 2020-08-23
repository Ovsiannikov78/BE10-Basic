import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;


public class Converter {
    public static void main(String[] args) throws IOException {

        Person p1 = new Person();
        p1.setFirstName("Vladimir");
        p1.setLastName("Marin");
        p1.setAge(25);
        p1.setAddressList(Arrays.asList(
                new Address("Potsdamerstr", 96, "Berlin", 10827, "Germany"),
                new Address("Hauptstr", 32, "Berlin", 10317, "Germany")));

        fromJsonToJavaObject();
        fromJavaObjectToJson(p1);


    }
    public static void fromJsonToJavaObject() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Person person = mapper.readValue(new File("data.json"), Person.class);
        System.out.println(person);
    }

    public static void fromJavaObjectToJson(Person p1) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File("out.json"), p1);
    }
}
