class PotRunner {
    public static void main(String[] args) {
        Pot pot1 = new Pot("Stainless Steel", "Round", 5, "Silver", 2.5, true, true, 10.0);
        Pot pot2 = new Pot("Copper", "Square", 3, "Red", 1.8, false, false, 8.5);

        System.out.println("Pot 1:");
        System.out.println("Material: " + pot1.material);
        System.out.println("Shape: " + pot1.shape);
        System.out.println("Capacity: " + pot1.capacity + " quarts");
        System.out.println("Color: " + pot1.color);
        System.out.println("Weight: " + pot1.weight + " kg");
        System.out.println("Has Handles: " + pot1.hasHandles);
        System.out.println("Non-Stick: " + pot1.nonStick);
        System.out.println("Height: " + pot1.height + " cm");

        System.out.println();

        System.out.println("Pot 2:");
        System.out.println("Material: " + pot2.material);
        System.out.println("Shape: " + pot2.shape);
        System.out.println("Capacity: " + pot2.capacity + " quarts");
        System.out.println("Color: " + pot2.color);
        System.out.println("Weight: " + pot2.weight + " kg");
        System.out.println("Has Handles: " + pot2.hasHandles);
        System.out.println("Non-Stick: " + pot2.nonStick);
        System.out.println("Height: " + pot2.height + " cm");
    }
}