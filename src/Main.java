
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("BMW M8");
        car.setRangi("Black");
        car.setNarxi(220000);
        car.setAutomatic(true);
        car.print();

        Uchburchak uchburchak = new Uchburchak();
        uchburchak.setSideA(5);
        uchburchak.setSideB(6);
        uchburchak.setSideC(6.5);
        System.out.println(uchburchak.toString());
        System.out.print("Perimetr: ");
        System.out.print(uchburchak.perimetr());
        System.out.println();


        Point point = new Point(1.0, 2.0, 3.0);
        System.out.println(point);

        point.setX(9.5);
        point.setY(10.5);
        point.setZ(11.5);
        System.out.println(point);




    }
}