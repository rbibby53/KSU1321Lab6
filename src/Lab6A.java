import java.util.Scanner;
import static java.lang.System.*;

public class Lab6A {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);
        String cook = " ";

        while (!"cookie".equals(cook)){
                out.print("Gimme a cookie: ");
                cook = input.nextLine().toLowerCase();
        }
    }
}