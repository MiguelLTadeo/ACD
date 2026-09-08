public class Truck extends Vehicle {
    private double cargoCap; 

    public Truck(int passengers, double fuelCap, double mpg, double cargoCap) {
        super(passengers, fuelCap, mpg); 
        this.cargoCap = cargoCap;
    }

    public double getCargoCap() {
        return cargoCap;
    }

    public void setCargoCap(double cargoCap) {
        if (cargoCap >= 0) {
            this.cargoCap = cargoCap;
        }
    }

    public String toString() {
        return super.toString() + ", Capacidade de Carga: " + cargoCap + " lbs";
    }
}