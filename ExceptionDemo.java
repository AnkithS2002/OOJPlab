package CollegeLabs;
import java.util.Scanner;

class FatherAgeException extends Exception{
	public String toString() {
		return("Father's age is less than 0");
	}
}

class SonAgeException extends Exception{
	int a;
	public SonAgeException(int a) {
		this.a = a;
	}
	public String toString() {
		if(a<0) return("Son's age is less than 0");
		else return("Son's age is more than or equal to father's age");
	}
}

class Father{
	public int ageF;
	Scanner scanner = new Scanner(System.in);
	Father(){
		System.out.println("Enter Father's age: ");
		ageF = scanner.nextInt();
	}
	void fatherEx() throws FatherAgeException{
		if(ageF < 0) throw new FatherAgeException();
	}
	
}

class Son extends Father{
	public int ageS;
	Son(){
		System.out.println("Enter Son's age: ");
		ageS = scanner.nextInt();
	}
	void sonEx() throws SonAgeException{
		if(ageS < 0 || ageS >= ageF) throw new SonAgeException(ageS);
	}
}

public class ExceptionDemo {

	public static void main(String[] args) {
		Son s = new Son();
		try {
			s.fatherEx();
		}
		catch(FatherAgeException e1) {
			System.out.println(e1);
		}
		try {
			s.sonEx();
		}
		catch(SonAgeException e2) {
			System.out.println(e2);
		}
	}

}
