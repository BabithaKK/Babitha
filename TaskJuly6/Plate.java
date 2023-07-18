 class Plate {
    String material;
    String shape;
    int diameter;
    String color;
    double weight;
    boolean isMicrowaveSafe;
    boolean isDishwasherSafe;
    boolean isBreakResistant;
    
 Plate(String material, String shape, int diameter, String color, double weight,
                 boolean isMicrowaveSafe, boolean isDishwasherSafe, boolean isBreakResistant) {
        this.material = material;
        this.shape = shape;
        this.diameter = diameter;
        this.color = color;
        this.weight = weight;
        this.isMicrowaveSafe = isMicrowaveSafe;
        this.isDishwasherSafe = isDishwasherSafe;
        this.isBreakResistant = isBreakResistant;
    }
}