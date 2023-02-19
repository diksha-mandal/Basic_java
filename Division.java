import java.util.Scanner;  
public class Division {
    public static void main(String [] args){
        int x, y;  
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter the first number: ");  
        x = sc.nextInt();  
        System.out.print("Enter the second number: ");  
        y = sc.nextInt();  
        System.out.println(x + " / "+ y +" = " + (x / y)); 
    }
}
