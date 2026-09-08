public class OffRoad extends Vehicle {
    private double groundClearance; 

    public OffRoad(int passengers, double fuelCap, double mpg, double groundClearance) {
        super(passengers, fuelCap, mpg); 
        this.groundClearance = groundClearance;
    }

    public double getGroundClearance() {
        return groundClearance;
    }

    public void setGroundClearance(double groundClearance) {
        if (groundClearance >= 0) {
            this.groundClearance = groundClearance;
        }
    }

    public String toString() {
        return super.toString() + ", Altura do Solo: " + groundClearance + " polegadas";
    }
}