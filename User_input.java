import java.util.Scanner;

class User_input{
    public static void main(String[] args) {
        int a;
        float b;
        String c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        a = scanner.nextInt();
        System.out.println("Enter a float: ");
        b = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("Enter a string: ");
        c = scanner.nextLine();
        System.out.println("The Entered values are:");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        System.out.println("c: "+c);

    }
}