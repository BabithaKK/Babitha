class WorkerRunner{
 public static void main (String [] args){
  System.out.println("Running main in Worker");
  System.out.println();
 
 
 System.out.println("calling 1st constructor from WorkerRunner...");
	WorkerRunner ref1 = new WorkerRunner("Ranjith" , "Management" , 45 ,60 ,5);
	ref1.info();
			System.out.println(" ");

	
			
	    System.out.println("calling 2nd constructor from WorkerRunner...");
    WorkerRunner ref2 = new WorkerRunner("Rakshith" ,"Software Engineer",35 , 65 ,6);
    ref2.info();
		System.out.println(" ");
 }
 
 
 }