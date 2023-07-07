class StoveRunner {
    public static void main(String[] args) {
        Stove stove1 = new Stove("Brand1", "Model1", 4, "Black", true, false, true, 399.99);
        Stove stove2 = new Stove("Brand2", "Model2", 6, "White", false, true, false, 299.99);
    
        System.out.println("Stove 1:");
        System.out.println("Brand: " + stove1.brand);
        System.out.println("Model: " + stove1.model);
        System.out.println("Number of Burners: " + stove1.numberOfBurners);
        System.out.println("Color: " + stove1.color);
        System.out.println("Has Oven: " + stove1.hasOven);
        System.out.println("Has Grill: " + stove1.hasGrill);
        System.out.println("Is Electric: " + stove1.isElectric);
        System.out.println("Price: $" + stove1.price);
       
        System.out.println("Stove 2:");
        System.out.println("Brand: " + stove2.brand);
        System.out.println("Model: " + stove2.model);
        System.out.println("Number of Burners: " + stove2.numberOfBurners);
        System.out.println("Color: " + stove2.color);
        System.out.println("Has Oven: " + stove2.hasOven);
        System.out.println("Has Grill: " + stove2.hasGrill);
        System.out.println("Is Electric: " + stove2.isElectric);
        System.out.println("Price: $" + stove2.price);
    }
}