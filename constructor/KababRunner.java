public class KababRunner{
    public static void main(String[] args) 
    {
        System.out.println("running main of KebabRunner");
		
		Kabab ref=new Kabab("Tandoori kabab");
        System.out.println("Name: "+ref.name);
        System.out.println("Price: "+ref.price );
        System.out.println("Hotel Name: "+ref.hotelName);
        System.out.println("Number of pieces: "+ref.noOfPieces);
        System.out.println("Take away: "+ref.takeAway);
		
		
        Kabab ref1=new Kebab("Tandoori kabab");
        System.out.println("Name: "+ref1.name);
        System.out.println("Price: "+ref1.price );
        System.out.println("Hotel Name: "+ref1.hotelName);
        System.out.println("Number of pieces: "+ref1.noOfPieces);
        System.out.println("Take away: "+ref1.takeAway);


        Kabab ref2=new Kabab("Tandoori kabab",200);
        System.out.println("Name: "+ref2.name);
        System.out.println("Price: "+ref2.price );
        System.out.println("Hotel Name: "+ref2.hotelName);
        System.out.println("Number of pieces: "+ref2.noOfPieces);
        System.out.println("Take away: "+ref2.takeAway);


        Kabab ref3=new Kabab("Tandoori kabab",200,"Rajadarshan");
        System.out.println("Name: "+ref3.name);
        System.out.println("Price: "+ref3.price );
        System.out.println("Hotel Name: "+ref3.hotelName);
        System.out.println("Number of pieces: "+ref3.noOfPieces);
        System.out.println("Take away: "+ref3.takeAway);

        Kabab ref4=new Kabab("Tandoori kabab",200,"Rajadarshan",4);
        System.out.println("Name: "+ref4.name);
        System.out.println("Price: "+ref4.price );
        System.out.println("Hotel Name: "+ref4.hotelName);
        System.out.println("Number of pieces: "+ref4.noOfPieces);
        System.out.println("Take away: "+ref4.takeAway);

        Kabab ref5=new Kabab("Tandoori kabab",200,"Rajadarshan",4,true);
        System.out.println("Name: "+ref5.name);
        System.out.println("Price: "+ref5.price );
        System.out.println("Hotel Name: "+ref5.hotelName);
        System.out.println("Number of pieces: "+ref5.noOfPieces);
        System.out.println("Take away: "+ref5.takeAway);
    }

}	