import java.util.Scanner;
import static java.lang.System.*;

public class Lab6B {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);

        out.print("Enter a number between -1000 and +1000: ");
        int num = input.nextInt();
        int max = num;
        int min = num;

        out.println("Min is " + min);
        out.println("Max is " + max);

        while (num != 0){
            out.print("Enter a number between -1000 and +1000: ");
            num = input.nextInt();
            if (num > max && num !=0){
                max = num;
            }if (num < min && num !=0){
                min = num;
            }
            out.println("Min is " + min);
            out.println("Max is " + max);


        }
    }
}