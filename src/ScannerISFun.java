/**Display ScannerISFun file
 * Author Tsegab Gebregziabher
 * License: GMU Licens
 * Crated on 08/05/17
 * Version 1.1
 */
import java.util.Scanner;
public class ScannerISFun{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println(" Enter your name");
        String name = keyboard.next();
        System.out.println ("Enter your password");
        int password = keyboard.nextInt();
        System.out.println ("Hello Mr." + name + ". Your password is " + password + ", WellCome to CSC200.");

    }
}



