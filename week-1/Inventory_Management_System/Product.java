package Inventory_Management_System;
import java.util.*;
public class Product {
	int id;
	String name;
	int quantity;
	int price;
	public Product(int id,String name,int quantity,int price){
		   this.id=id;
		   this.name=name;
		   this.quantity=quantity;
		   this.price=price;
	}
	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", quantity=" + quantity + ", price=" + price ;
	}
	public static void addProduct(List<Product> li,int id,String name , int quantity,int price)
	{
		li.add(new Product(id,name,quantity,price));
	}
	public static void updateProductById(List<Product> li,int id,String newname,int newq,int newp)
	{
		for(int i=0;i<li.size();i++)
		{
			if(li.get(i).id==id)
			{
				li.get(i).name=newname;
				li.get(i).price=newp;
				li.get(i).quantity=newq;
			}
		}
	}
    public static void deleteProduct(List<Product> li , int id)
    {
    	for(int i=0;i<li.size();i++)
    	{
    		if(li.get(i).id==id)
    		{
    			li.remove(i);
    		}
    	}
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	     int n=sc.nextInt();
	     List<Product> li=new ArrayList<>();
	     for(int i=0;i<n;i++)
	     {
	    	 int id=sc.nextInt();
	    	 String name=sc.next();
	    	int  quantity=sc.nextInt();
	    	int  price=sc.nextInt();
	    	 addProduct(li,id,name,quantity,price);
	     }
       for(int i=0;i<n;i++)
       {
    	   System.out.println(li.get(i));
       }
       System.out.println("enter the item id to be updated");
       int id1=sc.nextInt();
       System.out.print("Enter new name, quantity, and price: ");
       String newname = sc.next();
       int newq = sc.nextInt();
       int newp= sc.nextInt();
       updateProductById(li,id1,newname,newq,newp);
       for(int i=0;i<n;i++)
       {
    	   System.out.println(li.get(i));
       }
       System.out.println("Enter product id to be deleted");
       int id3=sc.nextInt();
       deleteProduct(li,id3);
       for(int i=0;i<li.size();i++)
       {
    	   System.out.println(li.get(i));
       }
       sc.close();
	}

}
