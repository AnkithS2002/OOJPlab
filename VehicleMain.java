import java.util.Scanner;
import java.lang.String;

class Vehicle{
    String reg_no;
    int price;
    static int count = 0;
    
    Vehicle(){
        count++;
    }
    
    void setregno(String reg_no){
        this.reg_no = reg_no;
    }
    void setprice(int price){
        this.price = price;
    }
    String getregno(){
        return reg_no;
    }
    int getprice(){
        return price;
    }
    static int getVehiclecount(){
        return count;
    }
    static void highPrice(Vehicle v[], int n){
        String high = "";
        int h = 0;
        for (int i =0; i<n ; i++ ){
            if (v[i].price>h){
                h = v[i].price;
                high = v[i].reg_no;
            } 
        } 
        
        System.out.println("The registration number of vehicle with Highest price is: "+high);
    }
}


public class VehicleMain{
    public static void main(String[] args) {
        int n, pr;
        String reg;
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter the number of Vehicles: ");
        n = in.nextInt();
        in.nextLine();
        Vehicle vehi[] = new Vehicle[n];
        for (int i=0;i<n ;i++){
            System.out.printf("Enter the Registration number of the Vehicle[%d]: ",i);
            reg = in.nextLine();
            System.out.println("Enter the price of the vehicle: ");
            pr = in.nextInt();
            in.nextLine();
            vehi[i] = new Vehicle();
            vehi[i].setprice(pr);
            vehi[i].setregno(reg);
        } 
        Vehicle.highPrice(vehi, n);
    }
}
