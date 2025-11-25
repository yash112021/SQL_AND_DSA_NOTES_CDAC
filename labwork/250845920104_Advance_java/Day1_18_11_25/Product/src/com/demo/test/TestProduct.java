package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Product;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;

public class TestProduct {

	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		int choice =0;
		
		ProductService pservice = new ProductServiceImpl();
		
		do {
			
			System.out.println("1.Add new product\n2.delete product\n3.modify product");
			System.out.println("4.find by Id \n5.display all \n6.display in sorted order\n7.exit");
			System.out.println("Enter your choice");
			choice = sc.nextInt();
			
			switch(choice){
			case 1 ->{
				boolean status = pservice.addProduct();
				
				if(status) {
					System.out.println("Product is added successfully");
				}else {
					System.out.println("product not added");
				}
			}
			
			case 2-> {
				System.out.println("Enter id");
				int pid = sc.nextInt();
				
				boolean status = pservice.deleteById(pid);
				
				if(status) {
					System.out.println("Id deleted successfully");
				}
				else {
					System.out.println("Id not deleted");
				}
			}
			// modifying the product 
			case 3->{
				// taking the input id,product name, price
				System.out.println("Enter the Product Id-->");
				int a=sc.nextInt();
				System.out.println("Enter the Product description-->");
				String pname=sc.next();
				System.out.println("Enter the product price -->");
				double price=sc.nextDouble();
				
				// it will return us the status
				boolean status = pservice.modifyById(a,pname,price);
				if(!status) {
					System.out.println("Not updated Succesfully-->");
				}else {
					System.out.println("Updated Succesfully-->");
				}
				
			}
			case 4->{
				// find  By Id-->
				System.out.println("Enter the Id-->");
				int id=sc.nextInt();
				// it will return the us the object
				Product p=pservice.findbyId(id);
				// if p is not null
				if(p==null) {
					System.out.println("Prouduct doesnt exits -->");
				}else {
					System.out.println(p);
				}
			}
			
			// display  All -->
			case 5->{
				// now require the arraylist
				List<Product> plst = pservice.displayAllProduct();
				plst.forEach(System.out::println);
				
			}
			

			//	display in sorted order
			case 6 ->{

				System.out.println("now tell me which parameters you want to sort (PRODID, DESCRIP, PRICE) Enter that parameter");
				String s = sc.next();
				
				List <Product> plist1 = pservice.displayInSorted(s);
				plist1.forEach(System.out::println);
				
			}
			case 7->{
				System.out.println("Thankyou for Vising-->");
			}
				
		
			
			}
		}while(choice!=7);
	}
}
