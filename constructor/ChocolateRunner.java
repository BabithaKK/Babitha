class ChocolateRunner{
	public static void main(String[] args) 
    {
        System.out.println("running main of ChocolateRunner");
		
		 Chocolate ref=new Chocolate();
        System.out.println("Name: "+ref.price);
        System.out.println("quality: "+ref.quality);
        System.out.println("small: "+ref.small);
		
		Chocolate ref1=new Chocolate(45.00);
        System.out.println("Name: "+ref1.price);
        System.out.println("quality: "+ref1.quality );
        System.out.println("small: "+ref1.small);
        
		
		Chocolate ref2=new Chocolate(20,3);
        System.out.println("Name: "+ref2.price);
        System.out.println("quality: "+ref2.quality );
        System.out.println("small: "+ref2.small);
        
		
		Chocolate ref3=new Chocolate(20,3,true);
        System.out.println("Name: "+ref3.price);
        System.out.println("quality: "+ref3.quality );
        System.out.println("small: "+ref3.small);
	}   
}