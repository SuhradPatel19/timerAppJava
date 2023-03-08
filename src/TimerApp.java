import java.util.concurrent.TimeUnit;

public class TimerApp {
    //timer
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        TimerApp inputSeconds = new TimerApp();
        inputSeconds.countdownTimer(65);

    }

    private void countdownTimer(int inputSeconds) {
        int remainingSeconds = inputSeconds;
        System.out.println("Starting Countdown ");
        while (remainingSeconds > 0) {
            int minutes = remainingSeconds / 60;
            int seconds = remainingSeconds % 60;

            String secondsStr;

            if (seconds < 10) {
                secondsStr = "0" + seconds;

            } else {
                secondsStr = seconds + "";
            }

            System.out.println(minutes + " : " + secondsStr);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                //throw new RuntimeException(e);
            }
            remainingSeconds -= 1;

        }
    }

}