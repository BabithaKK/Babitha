class SofaRunner{
    public static void main(String[] args) {
		System.out.println("Running main...");
        Sofa sofa1 = new Sofa("Brand1", "Blue", "Leather", 3, 799.99, true, 25.5, 80.0);
        Sofa sofa2 = new Sofa("Brand2", "Gray", "Fabric", 2, 599.99, false, 30.0, 70.0);
        Sofa sofa3 = new Sofa("Brand3", "Black", "Faux Leather", 4, 899.99, true, 35.0, 90.0);
        
        System.out.println("Sofa 1:");
        System.out.println("Brand: " + sofa1.brand);
        System.out.println("Color: " + sofa1.color);
        System.out.println("Material: " + sofa1.material);
        System.out.println("Seats: " + sofa1.seats);
        System.out.println("Price: $" + sofa1.price);
        System.out.println("Recliner: " + sofa1.recliner);
        System.out.println("Weight: " + sofa1.weight + " kg");
        System.out.println("Length: " + sofa1.length + " cm");
        System.out.println();
        
        System.out.println("Sofa 2:");
        System.out.println("Brand: " + sofa2.brand);
        System.out.println("Color: " + sofa2.color);
        System.out.println("Material: " + sofa2.material);
        System.out.println("Seats: " + sofa2.seats);
        System.out.println("Price: $" + sofa2.price);
        System.out.println("Recliner: " + sofa2.recliner);
        System.out.println("Weight: " + sofa2.weight + " kg");
        System.out.println("Length: " + sofa2.length + " cm");
        System.out.println();
        
        System.out.println("Sofa 3:");
        System.out.println("Brand: " + sofa3.brand);
        System.out.println("Color: " + sofa3.color);
        System.out.println("Material: " + sofa3.material);
        System.out.println("Seats: " + sofa3.seats);
        System.out.println("Price: $" + sofa3.price);
        System.out.println("Recliner: " + sofa3.recliner);
        System.out.println("Weight: " + sofa3.weight + " kg");
        System.out.println("Length: " + sofa3.length + " cm");
        System.out.println();
    }
}




