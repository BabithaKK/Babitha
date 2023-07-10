class Owner
{
String name;
String qualification;
int age;
double investment;
int weight;

  Owner(String name ,String qualification,int age,double investment,int weight)
  {
  
   this.name = name;
   this.qualification =qualification ;
   this.age = age;
   this.investment = investment;
   this.weight = weight;
  
  }
 void printInstanceVariables(){
 System.out.println();
   System.out.println("=name " + name);
   System.out.println("qualification= " + qualification);
   System.out.println("age= " + age);
   System.out.println("investment= " + investment);
   System.out.println("weight= " + weight);
 
 
	}
}