public class Person {
    private String name;
    private String surname;
    private double weight;
    private String gender;

    public Person(String name, String surname, double weight, String gender) {
        this.name = name;
        this.surname = surname;
        this.weight = weight;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getWeight() {
        return weight;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", weight=" + weight +
                ", gender='" + gender + '\'' +
                '}';
    }
}
