public class Uchburchak {
    private double sideA;
    private double sideB;
    private double sideC;
    public Uchburchak(){
    }

    public Uchburchak(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public double area(){
        return 0.5*sideA*sideB;
    }

    public double area(int a, int b){
        return (a*b)/2;
    }
    public double area(double a, double b){
        return (a*b)/2;
    }
    public double area(float a, float b){
        return (a*b)/2;
    }
    public double area(long a, long b){
        return (a*b)/2;
    }
    public  double perimetr(){
        return sideA+sideB+sideC;
    }

    public double perimetr(int a, int b, int c){
        return a+b+c;
    }
    public  double perimetr(double a, double b, double c){
        return a+b+c;
    }
    public double perimetr(float a, float b, float c){
        return a+b+c;
    }

    public String toString(){
        return "Uchburchak {sideA=" + sideA + ", sideB=" + sideB + ", sideC=" + sideC + "}";
    }


}
