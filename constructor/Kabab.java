class Kabab{
    String name;
    double price;
    String hotelName;
    int noOfPieces;
    boolean takeAway;
	
	
	Kabab()
    {
        System.out.println("running Kabab const with no-arg ");
    }
	
    Kabab(String name)
    {
        System.out.println("running Kabab const with String ");
        this.name=name;
    }
	
     Kabab(String name,double price)
    {
        System.out.println("running Kabab const with String and double ");
        this.name=name;
        this.price=price;
    }
	
     Kabab(String name,double price,String hotelName)
    {
        System.out.println("running Kabab const with String,double and String ");
        this.name=name;
        this.price=price;
        this.hotelName=hotelName;
    }
	
     Kabab(String name,double price,String hotelName,int noOfPieces)
    {
        System.out.println("running Kabab const with String,double,String and int ");
        this.name=name;
        this.price=price;
        this.hotelName=hotelName;
        this.noOfPieces=noOfPieces;
    }
	
     Kabab(String name,double price,String hotelName,int noOfPieces,boolean takeAway)
    {
        System.out.println("running Kabab const with String,double,String,int and boolean ");
        this.name=name;
        this.price=price;
        this.hotelName=hotelName;
        this.noOfPieces=noOfPieces;
        this.takeAway=takeAway;
    }
}