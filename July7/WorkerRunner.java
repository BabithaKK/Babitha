class WorkerRunner{
 public static void main (String [] args){
  System.out.println("Running main in Worker");
  System.out.println();
 
 
 System.out.println("calling 1st constructor from WorkerRunner...");
	Worker ref1 = new Worker("Ranjith" , "Management" , 45 ,60 ,5);
	ref1.printInstanceVariables();
			System.out.println(" ");

	
			
	    System.out.println("calling 2nd constructor from WorkerRunner...");
    Worker ref2 = new Worker("Rakshith" ,"Software Engineer",35 , 65 ,6);
    ref2.printInstanceVariables();
		System.out.println(" ");
 }
 
 
 }