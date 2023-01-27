package lecture32;

import java.io.*;
import java.util.*;

public class Logger {
    private final List<String> list;
    private final String fileName;
    private final static int NUMBERS_OF_LINES_IN_A_FILE = 100;

    public Logger(String fileName) {
        this.list = new ArrayList<>();
        this.fileName = fileName;
    }

    public void addLog(String header, String body) {
        String log = "-----\n" + new Date() + "\nLog with header " + header + "\nLog with body " + body + "\n";
        list.add(log);

        try {
            File file = new File(fileName);
            if (!file.exists()) {
                file.createNewFile();
            }

            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            int numOfLines = 0;
            String line;
            String result = log;

            while ((line = reader.readLine()) != null) {
                if (numOfLines++ >= NUMBERS_OF_LINES_IN_A_FILE) {
                    break;
                }
                result += line + "\n";
            }

            reader.close();

            file.delete();
            file.createNewFile();
            FileWriter writer = new FileWriter(fileName);
            writer.write(result);


            writer.close();
            System.out.println("the number of lines in the file ->" + numOfLines);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void print() {
        for (String string : list) {
            System.out.println(string);
        }
    }

    public void writeLog(List<String> logs) {

    }


}
