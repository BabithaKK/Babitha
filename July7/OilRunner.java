class OilRunner{
 public static void main (String [] args){
  System.out.println("Running main in Oil");
  System.out.println();
 
 
 System.out.println("calling 1st constructor from OilRunner...");
	Oil ref1 = new Oil("Castrol" ,10 , 450,"Disel","Brezza");
	ref1.printInstanceVariable();
			System.out.println(" ");

	
			
	    System.out.println("calling 2nd constructor from OilRunner...");
    Oil ref2 = new Oil("Fortuner" ,12, 650,"Petrol", "Fortuner");
    ref2.printInstanceVariable();
		System.out.println(" ");
 }
 
 
 }