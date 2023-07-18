class Pot{
     String material;
     String shape;
     int capacity;
     String color;
     double weight;
     boolean hasHandles;
     boolean nonStick;
     double height;

    
 Pot(String material , String shape, int capacity, String color, double weight, boolean hasHandels,boolean nonStick, double height  ) {
	 System.out.println(" Running instance of pot with all args.... ");
        this.material = material;
        this.shape = shape;
        this.capacity= capacity;
        this.color = color;
        this.weight = weight;
        this.hasHandles=  hasHandles;
        this.nonStick= nonStick;
        this.height = height;
    }
}