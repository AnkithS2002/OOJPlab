import java.util.Scanner;
import java.lang.*;
class Book{
    String name;
    String author;
    int price;
    int num_pages;
    
    Book(String name, String author, int price, int num_pages){
        this.name = name;
        this.author = author;
        this.price = price;
        this.num_pages = num_pages;
    }
    
    void setName(String name){
        this.name = name;
    }
    void setAuthor(String author){
        this.author = author;
    }
    void setPrice(int price){
        this.price = price;
    }
    void setNumPages(int num_pages){
        this.num_pages = num_pages;
    }
    
    void getData(){
        System.out.println("The details of Book are:");
        System.out.printf("Book name: %s\n", name);
        System.out.printf("Author: %s\n", author);
        System.out.printf("Price: %d\n", price);
        System.out.printf("Number of pages: %d\n", num_pages);
    }
    public String toString(){
        System.out.println("Book\tAuthor\tPrice\tNo. of pages");
        String displayout = "";
        displayout += name;
        displayout += "\t";
        displayout += author;
        displayout += "\t";
        displayout += price;
        displayout += "\t";
        displayout += num_pages;
        return displayout;
    }
}

public class BookMain
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int n;
	    String name, author;
	    int price, pages;
	    System.out.println("Enter the number of books: ");
	    n = in.nextInt();
	    in.nextLine();
	    
	    Book[] Barray = new Book[n];
	    
		for(int i = 0; i<n; i++){
		    System.out.printf("Enter the name of the Book%d: ",i);
		    name = in.nextLine();
		    System.out.printf("Enter the Author of the Book%d: ",i);
		    author = in.nextLine();
		    System.out.printf("Enter the price of the Book%d: ",i);
		    price = in.nextInt();
		    System.out.printf("Enter the No. of pages of the Book%d: ",i);
		    pages = in.nextInt();
		    in.nextLine();
		    Barray[i] = new Book(name, author, price, pages);
		    
		}
		
		for (int i =0 ;i< n ; i++ ) 
		    System.out.println(Barray[i]);
		
	/*
	    for(int i =0; i<n; i++){
	        Barray[i].getData();
	        System.out.println();
	*/
	    
	    
	}
}
