public class Main {
    public static void main(String[] args) {
        Vehicle carro = new Vehicle(5, 12.0, 30.0);
        Truck caminhao = new Truck(3, 80.0, 10.0, 25000.0);
        OffRoad jipe = new OffRoad(4, 20.0, 18.0, 11.5);
        
        System.out.println("Carro Comum -> " + carro);
        System.out.println("Caminhão -> " + caminhao);
        System.out.println("OffRoad -> " + jipe);
    }
}
