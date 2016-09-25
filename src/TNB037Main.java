/* Kris De Cooman
TNB037 - Main class - Displaying rgular + military time.
*/

import java.util.Scanner;

public class TNB037Main {

    static Scanner myInput = new Scanner(System.in);
    
    public static void main(String args []) {
        
        
        System.out.print("Enter the hours :");
        int h = myInput.nextInt();
        
        System.out.print("Enter the minutes :");
        int m = myInput.nextInt();
        
        System.out.print("Enter the seconds :");
        int s = myInput.nextInt();
        
        TNB037Sub objTime = new TNB037Sub();
        objTime.displayMilitary(h,m,s);
        objTime.displayRegular(h,m,s);
    }
    
}
