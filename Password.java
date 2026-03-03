import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        String password = "secret1";

        Scanner in = new Scanner(System.in); 
        System.out.print("Input password: "); 
        String yourpassword = in.nextLine();
        in.close();

        if (yourpassword.equals(password)) {
            System.out.println("The password is correct. Access is granted.");
        } else {
            System.out.println("The password is not correct. Access denied.");
        }

    }
}
