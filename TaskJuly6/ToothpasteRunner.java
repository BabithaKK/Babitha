 class ToothpasteRunner {
    public static void main(String[] args) {
     
        Toothpaste toothpaste1 = new Toothpaste("Colgate", "Mint", 100, true, true, false, "Tube", 2.99);
        Toothpaste toothpaste2 = new Toothpaste("Sensodyne", "Fresh", 75, true, false, true, "Tube", 3.49);
        
        
        System.out.println("Toothpaste 1:");
        System.out.println("Brand: " + toothpaste1.brand);
        System.out.println("Flavor: " + toothpaste1.flavor);
        System.out.println("Volume: " + toothpaste1.volume);
        System.out.println("Contains Fluoride: " + toothpaste1.containsFluoride);
        System.out.println("Is Whitening: " + toothpaste1.isWhitening);
        System.out.println("Is Sensitive: " + toothpaste1.isSensitive);
        System.out.println("Packaging: " + toothpaste1.packaging);
        System.out.println("Price: $" + toothpaste1.price);
        System.out.println();
        
        System.out.println("Toothpaste 2:");
        System.out.println("Brand: " + toothpaste2.brand);
        System.out.println("Flavor: " + toothpaste2.flavor);
        System.out.println("Volume: " + toothpaste2.volume);
        System.out.println("Contains Fluoride: " + toothpaste2.containsFluoride);
        System.out.println("Is Whitening: " + toothpaste2.isWhitening);
        System.out.println("Is Sensitive: " + toothpaste2.isSensitive);
        System.out.println("Packaging: " + toothpaste2.packaging);
        System.out.println("Price: $" + toothpaste2.price);
        System.out.println();
        
    }
}