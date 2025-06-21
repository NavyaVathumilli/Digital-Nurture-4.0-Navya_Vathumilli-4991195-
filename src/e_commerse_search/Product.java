package e_commerse_search;

import java.util.*;

public class Product {
	int id;
	String name;
	String category;
	public Product(int id,String name,String category)
	{
		this.id=id;
		this.name=name;
		this.category=category;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", category=" + category + "]";
	}
	public static void addProduct(List<Product> li,int id,String name,String category)
	{
		li.add(new Product(id,name,category));
	}
	public static void searchProductById(List<Product> li,int id)
	{
		int flag=0;
		for(int i=0;i<li.size();i++)
		{
			if(li.get(i).id==id)
			{
				System.out.println(li.get(i));
				flag++;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("Product not found");
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Product> li=new ArrayList<>();
		System.out.println("Enter number of products to be added");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the id , name , category");
			 int id=sc.nextInt();
			String name=sc.next();
			String category=sc.next();
			addProduct(li,id,name,category);
		}
		System.out.println(n+" Products are added");
		for(int i=0;i<n;i++)
		{
			System.out.println(li.get(i));
		}
		System.out.println("Enter product id to be searched");
		int sid=sc.nextInt();
		searchProductById(li,sid);
       sc.close();
	}

}
