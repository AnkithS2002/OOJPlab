// Program to demonstrate Stack
import java.util.Scanner;
class Stack{
    int max = 5;
    int[] st = new int[max];
    int top = -1;
    
    int isFull(){
        if(top == max-1) return 1;
        else return 0;
    }
    int isEmpty(){
        if(top == -1) return 1;
        else return 0;
    }
    void push(int val){
        if(top == max - 1)
            System.out.println("Stack Overflow!");
        else
            st[++top] = val;
    }
    int pop(){
        if (top == -1){
            System.out.println("Stack empty!");
            return (-1);
        }
        else 
            return(st[top--]);
    }
    void display(){
        if (top == -1)
            System.out.println("Stack empty!");
        else{
            for (int i=top;i>=0;i--){
                System.out.println(st[i]);
            } 
        }
    }
    int peek(){
        if(top == -1){
            System.out.println("Stack empty!");
            return(-1);
        }
        else return st[top];
    }
}


public class Stackmain{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice, val;
        Stack st1 = new Stack();
        
        do{
            System.out.println("1.PUSH  2.POP  3.PEEK  4.DISPLAY  5.EXIT");
            choice = in.nextInt();
            switch(choice){
                case 1: if(st1.isFull() == 1){
                            System.out.println("Stack is Full!");
                            break;
                        }
                        System.out.printf("Enter the element to push into the stack: ");
                        val = in.nextInt();
                        st1.push(val);
                        break;
                case 2: val = st1.pop();
                        if(val != -1)
                            System.out.printf("The value popped out of the stack: %d\n", val);
                        break;
                case 3: val = st1.peek();
                        if(val != -1)
                            System.out.printf("The value on top of the stack is: %d\n", val);
                        break;
                case 4: st1.display();
                        break;
                case 5: System.out.println("**PROGRAM ENDED**");
                        break;
                default: System.out.println("Please enter a valid input!");
                         break;
            }
        }while(choice != 5);
        in.close();
    }
}