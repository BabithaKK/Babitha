class FireExtinguisher
{
String type;
String color;
int capacity;
int pressure;
int price;

  FireExtinguisher(String type,String color,int capacity,int pressure,int price)
  {
  
   this.type = type;
   this.color =color ;
   this.capacity = capacity;
   this.pressure = pressure;
   this.price = price;
  
  }
 void info(){
 System.out.println();
   System.out.println("type= " + type);
   System.out.println("color= " + color);
   System.out.println("capacity= " + capacity);
   System.out.println("pressure= " + pressure);
   System.out.println("price= " + price);

}

	
	}
	
