package threads;
import static threads.ThreadColor.ANSI_RED;
/**
 * MyRunnable
 */
public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println(ANSI_RED + "Hello from my runnable implementation");
    }
}
