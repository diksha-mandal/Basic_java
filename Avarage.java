import java.util.Scanner;  
public class Avarage {
    public static void main(String [] args){
        int x,y,z;
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter the first number: ");  
        x = sc.nextInt();  
        System.out.print("Enter the second number: ");  
        y = sc.nextInt();  
        System.out.print("Enter the third number: ");
        z = sc.nextInt();
        int sum=x+y+z;
        System.out.println("Avarage of three number: "+sum/3);
    }
}
