
public class Main {
    public static void main(String[] args) {

        Car car = new Car("black", "BMW M8", 220000, true);
        System.out.println(car.toString());

        System.out.println();

        TogriBurchakliUchburchak togriBurchakliUchburchak = new TogriBurchakliUchburchak(3, 4, 5);
        System.out.println(togriBurchakliUchburchak.toString());

        System.out.println();

        Person person = new Person("Bahrom","Aslanov", 73, "Male");
        System.out.println(person.toString());



    }
}