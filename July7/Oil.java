class Oil
{
String brand;
	int cost;
	double quantity;
	String oilName;
	String vehicleName;
	Oil(String brand,int cost,double quantity,String oilName,String vehicleName)
	{
		this.brand=brand;
		this.cost=cost;
		this.quantity=quantity;
		this.oilName=oilName;
		this.vehicleName=vehicleName;
	}
	void printInstanceVariable()
	{
		System.out.println("brand="+brand);
		System.out.println("cost="+cost);
		System.out.println("quantity="+quantity);
		System.out.println("oilName="+oilName);
		System.out.println("vehicleName="+vehicleName);
	}
}