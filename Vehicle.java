public class Vehicle {
    private int passengers;
    private double fuelCap;
    private double mpg; 

    //costrutor
    public Vehicle(int passengers, double fuelCap, double mpg) {
        this.passengers = passengers;
        this.fuelCap = fuelCap;
        this.mpg = mpg;
    }

    //passageiros
    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        if (passengers >= 0) { 
            this.passengers = passengers;
        }
    }

    //combustível
    public double getFuelCap() {
        return fuelCap;
    }

    public void setFuelCap(double fuelCap) {
        if (fuelCap >= 0) {
            this.fuelCap = fuelCap;
        }
    }

    //milhas por galão
    public double getMpg() {
        return mpg;
    }

    public void setMpg(double mpg) {
        if (mpg >= 0) {
            this.mpg = mpg;
        }
    }

    public String toString() {
        return "Passageiros: " + passengers + 
            ", Capacidade do Tanque: " + fuelCap + " galões" + 
            ", Consumo: " + mpg + " mpg";
    }
}