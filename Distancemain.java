import java.util.Scanner;
class Distance{
    private int inches;
    private int feet;
    void setInches(int inches){
        this.inches = inches;
    }
    void setFeet(int feet){
        this.feet = feet;
    }
    static void compare(int f1, int i1, int f2, int i2){
        if(f1 > f2)
            System.out.println("Distance 1 is greater than Distance 2");
        
        else if(f1 < f2)
            System.out.println("Distance 2 is greater than Distance 1");    
        else{
            if(i1 > i2)
                System.out.println("Distance 1 is greater than Distance 2");
            else if(i1 < i2)
                System.out.println("Distance 2 is greater than Distance 1");
            else
                System.out.println("Both the distances are same!");
        }
    }
}
public class Distancemain{
    public static void main (String[] args) {
        int f1,i1,f2,i2, choice;
        Scanner in = new Scanner(System.in);
        Distance d1 = new Distance();
        Distance d2 = new Distance();
        do{
        System.out.println("Press 1.To add Distance  2.to Exit");
        choice = in.nextInt();
        switch(choice){
            case 1: {
                System.out.printf("Enter the Distance1 in (feet, inches): ");
                f1 = in.nextInt();
                i1 = in.nextInt();
                d1.setFeet(f1);
                d1.setInches(i1);
                System.out.printf("Enter the Distance2 in (feet, inches): ");
                f2 = in.nextInt();
                i2 = in.nextInt();
                d2.setFeet(f2);
                d2.setInches(i2);
                Distance.compare(f1,i1,f2,i2);
                break;
            }
            case 2: System.out.println("***PROGRAM ENDED***");
                    break;
            default: System.out.println("Please enter a valid input!");
                     break;
        }
        }while(choice != 2);
    }
}