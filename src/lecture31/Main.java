package lecture31;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.*;

public class Main {
    private static String URL = "https://samplelib.com/lib/preview/mp4/sample-5s.mp4";

    public static void main(String[] args) {
        Timer timer = new Timer();

        System.out.println("starting at " + new Date());

        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            int number = i;
            threads.add( new Thread(() -> new DownloadFile(URL, "video" +number +".mp4").download(2)));
        }
        threads.forEach(Thread::start);

        new DownloadFile(URL, "video.mp4").download(3);

        System.out.println("finishing at " + new Date());


    }


}
