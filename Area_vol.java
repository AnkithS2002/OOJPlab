import java.util.Scanner;
import java.lang.Math;
class Area_vol{
	public static void main(String args[]){
		int choice;
		double area, vol;
		double h, r;
		Scanner in = new Scanner(System.in);
		System.out.println("Choose 1:Cylinder\t2.Cone\t3.Sphere");
		choice = in.nextInt();
		switch(choice){
		
		case 1: 
			System.out.println("Enter the height of the cylinder: ");
			h = in.nextDouble();
			System.out.println("Enter the radius of the cylinder: ");
			r = in.nextDouble();
			area = 2*3.14*r*(h + r);
			vol = 3.14*r*r*h;
			System.out.println("Volume: "+vol);
			System.out.println("Area: "+area);
			break;
		case 2:
			System.out.println("Enter the height of the cone: ");
			h = in.nextDouble();
			System.out.println("Enter the radius of the cone: ");
			r = in.nextDouble();
			area = 3.14*r*(r + Math.sqrt(h*h+r*r));
			vol = 3.14*r*r*h/3.0;
			System.out.println("Volume: "+vol);
			System.out.println("Area: "+area);
			break;
		case 3:
			System.out.println("Enter the radius of the Sphere: ");
			r = in.nextDouble();
			area = 4*3.14*r*r;
			vol = (4.0/3.0)*3.14*r*r*r;
			System.out.println("Volume: "+vol);
			System.out.println("Area: "+area);
			break;
		default:
			System.out.println("Please enter a valid input");
			break;
		}	
		in.close();
	}

}