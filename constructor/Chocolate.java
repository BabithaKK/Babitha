class Chocolate{
	double price;
	int quality;
	boolean small;
	
	Chocolate()
	{
		System.out.println("Running with no-args");
	}
	
	Chocolate(double price)
	{
		System.out.println("Running Chocolate with double");
		this.price=price;
	}
	
	Chocolate(double price,int quality)
	{
		System.out.println("Running Chocolate with double and int ");
		this.price=price;
		this.quality=quality;
	}
	
	Chocolate(double price,int quality,boolean small)
	{
		System.out.println("Running Chocolate with double, int and boolean");
		this.price=price;
		this.quality=quality;
		this.small=small;
	}
}