class Car {

    // Variables
    String brand;
    String model;

    // Method
    public void start() {
        System.out.println("Car started");
    }

    // Main method
    public static void main(String[] args) {

        // Creating object
        Car c = new Car();

        // Assigning values
        c.brand = "Toyota";
        c.model = "Fortuner";

        // Calling method
        System.out.println("Brand: " + c.brand);
        System.out.println("Model: " + c.model);

        c.start();
    }
}