import java.util.Scanner;

public class Happy2 {
    public static void main(String[] args) {
        

        Scanner in = new Scanner(System.in); 
        System.out.print("Кол-во чисил: "); 
        int n = in.nextInt();
        int[] our_numbers = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Введите вчисло немер " + i + ":");
            our_numbers[i] = in.nextInt();
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (our_numbers[i] > max) {
                max = our_numbers[i]; 
            }
        }

        System.out.println(max);

        int[] happynumbers = new int[max];
        for (int i = 1; i < max; i = i + 2) {
            happynumbers[i] = i;
        }
        
        System.out.println(happynumbers.length);

        
        int index = 1;
        int elem = 0;
        while (index < happynumbers.length - 1) {
            int counter = 0;
            elem = 0;
            while (elem < happynumbers.length - 1) {
                if (counter == happynumbers[index]) {
                    happynumbers[elem] = 0;
                    counter += 1;
                }
                if (happynumbers[elem] != 0) {
                    counter += 1;
                }
                elem += 1;
            }  
            index += 1;
            while (happynumbers[index] == 0){
                if (index == happynumbers.length - 1){
                    break;
                }
                index += 1;
            }
        }
        for (int i=0; i < happynumbers.length; i++){
            if (happynumbers[i] != 0){
                System.out.println(happynumbers[i]);
            }
        }
        in.close();
    }
}