class Worker
{
String name;
String jobTitle;
int age;
int weight;
int height;

 Worker(String name,String jobTitle ,int age,int weight,int height)
  {
  
   this.name = name;
   this.jobTitle =jobTitle ;
   this.age = age;
   this.weight = weight;
   this.height = height;
  
  }
 void printInstanceVariables(){
 System.out.println();
   System.out.println("name= " + name);
   System.out.println("jobTitle= " + jobTitle);
   System.out.println("age= " + age);
   System.out.println("weight= " + weight);
   System.out.println("height= " + height);
 
 
 }
}