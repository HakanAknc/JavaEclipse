package Odevler;

import java.util.Timer;
import java.util.TimerTask;
    
public class Zamanlayıcı {
    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int seconds = 5;
    
            @Override
            public void run() {
                System.out.println("Kalan Zaman:" + seconds--);
                if (seconds < 0) {
                    seconds = 5;
                }
            }
        };
        timer.schedule(task, 0, 1000); 
    }
}