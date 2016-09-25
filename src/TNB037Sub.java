/* Kris De Cooman
TNB037Sub - displaying military + regular time.
*/
public class TNB037Sub {
    private int hours , minutes, seconds;
    public void displayMilitary(int hour, int minute, int second) {
        
        hours = (hour>0 && hour<24) ? hour : 0;
        minutes = (minute>0 && minute<60) ? minute : 0;
        seconds = (second>0 && second <60) ? second : 0;
        
        
        System.out.println(String.format("Military time is: %02d:%02d:%02d", hours, minutes, seconds));
        
    }
    
    public void displayRegular(int hour, int minute, int second) {
        
        hours = (hour>0 && hour<24) ? hour : 0;
        minutes = (minute>0 && minute<60) ? minute : 0;
        seconds = (second>0 && second <60) ? second : 0;
        
        System.out.println(String.format("Regular time is: %d:%02d:%02d %s", hours%12, minutes, seconds, hours>12 ? "PM":"AM"));
        
    }
    
}
