import java.util.Arrays;
 
public class Main {
  
    public static void main(String[] args) {
        Person person = new Person("Rayan Slim", "Canadian", "01/01/1111", 5);
        person.setSeatNumber(10);
        System.out.println("Name: " + person.getName() + "\n" + "Nationality: " + person.getNationality() + "\n" + "Date of Birth: " + person.getDateOfBirth() + "\n" + "Seat number: " + person.getSeatNumber());

        if (person.applyPassport()) {
            System.out.println(("Congratulations " + person.getName() + "Your passport was approved"));
        } else {
            System.out.println("Sorry we cannot process your application.");
        }

        Person twin = new Person(person);
        twin.setName("Jad Slim");
        twin.setSeatNumber(3);

        System.out.println("Name: " + twin.getName() + "\n" + "Nationality: " + twin.getNationality() + "\n" + "Date of Birth: " + twin.getDateOfBirth() + "\n" + "Seat number: " + twin.getSeatNumber());

    }
  
  
}