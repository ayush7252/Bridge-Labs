import java.util.*;
public class Calculator{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the terminal calculator choose the options from below menu:");
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("1 :- Addition");
        System.out.println("2 :- Substract");
        System.out.println("3 :- Multiply");
        System.out.println("4 :- Divide");
        System.out.println("5 :- get reminder");
        
        int n = sc.nextInt();
        
        if(n==1){
            System.out.println(a+b);
        }
        else if(n==2){
            System.out.println(a-b);
        }
        else if(n==3){
            System.out.println(a*b);
        }
        else if(n==4){
            System.out.println(a/b);
        }
        else if(n==5){
            System.out.println(a%b);
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}
