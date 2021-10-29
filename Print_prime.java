import java.util.Scanner;
import java.lang.*;
class Print_prime{

public static void main(String args[]){
	Scanner in = new Scanner(System.in);	
	int n1, n2;
	String prime_nos = " ";
	System.out.println("Enter the starting number: ");
	n1 = in.nextInt();
	System.out.println("Enter the ending number: ");
	n2 = in.nextInt();
	
	for(int i = n1; i<n2; i++){
		int counter = 0;
		for(int j = i-1; j > 1; j--){
			if(i%j == 0) counter++; 
		}	
		if(counter == 0) prime_nos = prime_nos + i + " "; 
	}
	System.out.printf("Enter the Prime numbers between %d and %d are: %s\n", n1, n2, prime_nos);
	in.close();
	

}
}