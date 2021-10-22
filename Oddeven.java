import java.util.Scanner;
class Oddeven{
    public static void main(String[] args) {
        int a;
	System.out.println("This program tells if a number is odd or even!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        a = scanner.nextInt();
	
        if(a%2 == 0) System.out.println(a+" is Even");
	else System.out.println(a+" is Odd");

    }
}