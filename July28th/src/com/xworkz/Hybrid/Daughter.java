package com.xworkz.Hybrid;

	public class Daughter extends Father    
	{    
	public void showD()    
	{    
	System.out.println("She is daughter.");    
	}    
	public static void main(String args[])    
	{    
	   
	Son obj = new Son();  
	obj.showS();  
	obj.showF(); 
	obj.showS();  
	Daughter obj2 = new Daughter();  
	obj2.showD();    
	obj2.showF();    
	obj2.showS();  
	}
	private void showS() {
		
		
	}    
	}  

