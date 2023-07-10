 class FireExtinguisherRunner{
 public static void main (String [] args){
  System.out.println("Running main in FireExtinguisher");
  System.out.println();
 
 
 System.out.println("calling 1st constructor from FireExtinguisherRunner...");
	FireExtinguisher ref1 = new FireExtinguisher("Water Spray" , "Red" ,4 , 55 , 10);
	ref1.info();
			System.out.println(" ");

	
			
	    System.out.println("calling 2nd constructor from FireExtinguisherRunner...");
    FireExtinguisher ref2 = new FireExtinguisher("Foam Spray" , "Black", 3 , 54 ,20);
    ref2.info();
		System.out.println(" ");

	    System.out.println("calling 3rd constructor from FireExtinguisherRunner...");
    FireExtinguisher ref3 = new FireExtinguisher("Wet Chemical" ,"White" , 2 , 53 ,30 );
	ref3.info();
			System.out.println(" ");

	}
}