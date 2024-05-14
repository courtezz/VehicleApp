public abstract class Vehicle {

     protected static String color;
    protected int numberOfPassengers;
    protected int cargoCapacity;
    protected static int fuelCapacity;

    public Vehicle(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity) {
        Vehicle.color = color;
        this.numberOfPassengers = numberOfPassengers;
        this.cargoCapacity = cargoCapacity;
        Vehicle.fuelCapacity = fuelCapacity;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        Vehicle.color = color;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        Vehicle.fuelCapacity = fuelCapacity;
    }
}


















