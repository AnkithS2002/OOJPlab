import java.util.Scanner;
import java.lang.Math;

class Marks{

public static void main(String args[]){
	Scanner in = new Scanner(System.in);	
	int cie, see, total;
	char grade;
	System.out.println("Enter the CIE marks(out of 50): ");
	cie = in.nextInt();
	System.out.println("Enter the SEE marks(out of 100): ");
	see = in.nextInt();
	
	total = cie + (int)Math.ceil(see/2.0);
	
	if(total >=90) System.out.println("Grade: S");
	else if(total >=80) System.out.println("Grade: A");
	else if(total >=70) System.out.println("Grade: B");
	else if(total >=60) System.out.println("Grade: C");
	else if(total >=50) System.out.println("Grade: D");
	else if(total >=40) System.out.println("Grade: E");
	else System.out.println("FAIL");

		
	
	in.close();
	

}
}