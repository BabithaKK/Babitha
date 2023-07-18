class PlateRunner {
    public static void main(String[] args) {
        Plate plate1 = new Plate("Ceramic", "Round", 10, "White", 0.5, true, true, false);
        Plate plate2 = new Plate("Melamine", "Square", 8, "Blue", 0.3, false, true, true);

        System.out.println("Plate 1:");
        System.out.println("Material: " + plate1.material);
        System.out.println("Shape: " + plate1.shape);
        System.out.println("Diameter: " + plate1.diameter + " inches");
        System.out.println("Color: " + plate1.color);
        System.out.println("Weight: " + plate1.weight + " kg");
        System.out.println("Microwave Safe: " + plate1.isMicrowaveSafe);
        System.out.println("Dishwasher Safe: " + plate1.isDishwasherSafe);
        System.out.println("Break Resistant: " + plate1.isBreakResistant);

        System.out.println();

        System.out.println("Plate 2:");
        System.out.println("Material: " + plate2.material);
        System.out.println("Shape: " + plate2.shape);
        System.out.println("Diameter: " + plate2.diameter + " inches");
        System.out.println("Color: " + plate2.color);
        System.out.println("Weight: " + plate2.weight + " kg");
        System.out.println("Microwave Safe: " + plate2.isMicrowaveSafe);
        System.out.println("Dishwasher Safe: " + plate2.isDishwasherSafe);
        System.out.println("Break Resistant: " + plate2.isBreakResistant);
    }
}