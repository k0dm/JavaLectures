package lecture31.task3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        File file = new File("video.mp4");
        try {
            FileInputStream inputStream = new FileInputStream("video.mp4");
            FileOutputStream fileOutputStream = new FileOutputStream("cpy1_video.mp4");

            byte[] dataBuffer = new byte[1024];
            int bytesRead;
//           fileOutputStream.write(inputStream.readAllBytes());
            while ( (bytesRead = inputStream.read(dataBuffer,0,1024)) != -1){
                fileOutputStream.write(dataBuffer,0,bytesRead);
            }

            inputStream.close();
            fileOutputStream.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
