class OwnerRunner{
	public static void main(String[] args){
						System.out.println(" ");
		System.out.println("Running main in OwnerRunner...");
		System.out.println(" ");
		
		System.out.println("calling 1st constructor from OwnerRunner...");
	Owner ref1 = new Owner("Sudeep" , "Diploma", 22 , 2000 , 35);
	ref1.printInstanceVariables();
			System.out.println(" ");

	
			
	    System.out.println("calling 2nd constructor from OwnerRunner...");
    Owner ref2 = new Owner("Darshan" , "Engineering", 28 ,3000 , 40);
	ref2.printInstanceVariables();
		System.out.println(" ");
	
	
	    System.out.println("calling 3rd constructor from OwnerRunner...");
    Owner ref3 = new Owner("Yash" ,"Medical", 30 , 4000 , 45);
	ref3.printInstanceVariables();
			System.out.println(" ");

	}
}