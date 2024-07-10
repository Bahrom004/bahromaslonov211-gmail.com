public class Car {
    private String rangi;
    private String model;
    private double narxi;
    private boolean isAutomatic;

    public Car() {
    }

    public Car(String rangi, String model, double narxi, boolean isAutomatic) {
        this.rangi = rangi;
        this.model = model;
        this.narxi = narxi;
        this.isAutomatic = isAutomatic;
    }

    public String getRangi() {
        return rangi;
    }

    public void setRangi(String rangi) {
        this.rangi = rangi;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getNarxi() {
        return narxi;
    }

    public void setNarxi(double narxi) {
        this.narxi = narxi;
    }

    public boolean isAutomatic() {
        return isAutomatic;
    }

    public void setAutomatic(boolean automatic) {
        isAutomatic = automatic;
    }

    public void print(){
        System.out.println("Car={model: "+model+";"+" rangi: "+rangi+";"+" narxi: "+narxi+";"+"isAutomatic: "+isAutomatic+" }");
    }

//    @java.lang.Override
//    public java.lang.String toString() {
//        return "Car{" +
//                "rangi=" + rangi +
//                ", model=" + model +
//                ", narxi=" + narxi +
//                ", isAutomatic=" + isAutomatic +
//                '}';
//    }
}
