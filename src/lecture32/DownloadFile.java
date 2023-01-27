package lecture32;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DownloadFile extends Thread {

    private static String URL = "https://samplelib.com/lib/preview/mp4/sample-5s.mp4";

    private final String url;
    private final String fileName;
    private final int id;

    public DownloadFile(String url, String fileName, int id) {
        this.url = url;
        this.fileName = fileName;
        this.id = id;
    }



    @Override
    public void run() {
        System.out.println(new Date() + "starting " + id);
        try (BufferedInputStream in = new BufferedInputStream(new URL(url).openStream());
             FileOutputStream fileOutputStream = new FileOutputStream(fileName)) {
            byte dataBuffer[] = new byte[1024];
            int bytesRead;
            while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
                fileOutputStream.write(dataBuffer, 0, bytesRead);
            }
            System.out.println(new Date() + "finished " + id);

        } catch (IOException e) {
            System.out.println(new Date() + "failed " + id);
        }
    }



    public static void main(String[] args) {
        System.out.println("starting main thread " + new Date());
        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            int number = i;
            threads.add( new DownloadFile(URL,i + "video.mp4", i));
        }
        threads.forEach(Thread::start);
        System.out.println("finished main thread " + new Date());

    }
}
