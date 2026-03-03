import java.util.Scanner;

public class mane{  
    public static void main(String[] args) { 
        Scanner in = new Scanner(System.in); 
        System.out.print("Input a pasword: "); 
        int num = in.nextInt(); 
        System.out.printf("Your number: %d \n", num); 
        in.close(); 
    }
} 