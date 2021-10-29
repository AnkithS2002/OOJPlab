import java.util.Scanner;

class Pattern{

public static void main(String args[]){
	Scanner in = new Scanner(System.in);	
	int n, i, j;
	System.out.println("Enter the number n: ");
	n = in.nextInt();
	int num = 1;
	for(i = 1; i <= n; i++){
		for(j = 1; j < i+1; j++){
			System.out.printf("%d\t", num);
			num++;
		}
		System.out.println();
		
	}
	in.close();
	

}
}