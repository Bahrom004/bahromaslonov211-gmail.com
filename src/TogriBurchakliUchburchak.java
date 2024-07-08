public class TogriBurchakliUchburchak {
    private double tomonA;
    private double tomonB;
    private double tomonC;

    public TogriBurchakliUchburchak(double tomonA, double tomonB, double tomonC) {
        this.tomonA = tomonA;
        this.tomonB = tomonB;
        this.tomonC = tomonC;
    }

    public double getTomonA() {
        return tomonA;
    }

    public double getTomonB() {
        return tomonB;
    }

    public double getTomonC() {
        return tomonC;
    }

    @Override
    public String toString() {
        return "TogriBurchakliUchburchak{" +
                "tomonA=" + tomonA +
                ", tomonB=" + tomonB +
                ", tomonC=" + tomonC +
                '}';
    }
}
