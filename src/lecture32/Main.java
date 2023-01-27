package lecture32;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Logger logger = new Logger("log.txt");
        List<Thread> threads = new ArrayList<>();

        System.out.println("starting main thread " + new Date());

        for (int i = 0; i < 20; i++) {
            int number = i;
            threads.add(new Thread() {
                @Override
                public synchronized void start() {
                    logger.addLog("Header " + number, "body " + number);
                }
            });
        }

        for (Thread thread : threads) {
            thread.start();
        }
        Timer timer = new Timer();

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                logger.print();
                timer.cancel();
            }
        };

        timer.schedule(task,2000);



        System.out.println("finished main thread " + new Date());

    }
}
