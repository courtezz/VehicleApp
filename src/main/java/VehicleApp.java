public class VehicleApp {
    public static void main(String[] args) {
        // Car
        Car sedan = new Car("Blue", 5, 4, 100);
        System.out.println("Car color: " + sedan.getColor());

        // Moped
        Moped slowRide = new Moped("Black", 2, 0, 50);
        System.out.println("Moped color: " + slowRide.getColor());
        System.out.println("Moped cargo capacity: " + slowRide.getCargoCapacity());
        System.out.println("Moped fuel capacity: " + slowRide.getFuelCapacity());

        // SemiTruck
        semiTruck truck = new semiTruck("White", 2, 10000, 500);
        System.out.println("Truck color: " + truck.getColor());
        System.out.println("Truck cargo capacity: " + truck.getCargoCapacity());
        System.out.println("Truck fuel capacity: " + truck.getFuelCapacity());

        // HoverCraft
        hoverCraft hoverCraft = new hoverCraft("Red", 8, 1000, 300);
        System.out.println("HoverCraft color: " + hoverCraft.getColor());
        System.out.println("HoverCraft cargo capacity: " + hoverCraft.getCargoCapacity());
        System.out.println("HoverCraft fuel capacity: " + hoverCraft.getFuelCapacity());


    }}







