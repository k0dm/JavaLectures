package lecture31;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Date;
import java.util.Scanner;

public class DownloadFile {
    private final String url;
    private final String fileName;

    public DownloadFile(String url, String fileName) {
        this.url = url;
        this.fileName = fileName;
    }


    public void download(int attempts) {
        System.out.println("Starting downloading file (" + fileName + ")" + new Date());
        try (BufferedInputStream in = new BufferedInputStream(new URL(url).openStream());
             FileOutputStream fileOutputStream = new FileOutputStream(fileName)) {
            byte dataBuffer[] = new byte[1024];
            int bytesRead;
            while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
                fileOutputStream.write(dataBuffer, 0, bytesRead);
            }
            System.out.println("Finished downloading file (" + fileName + ")" + new Date());

        } catch (IOException e) {
            if (attempts > 1) {
                download(--attempts);
            } else {
                System.out.println("downloading failed");
            }
        }

    }
}
