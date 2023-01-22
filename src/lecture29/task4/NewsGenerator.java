package lecture29.task4;

import lecture28.Observable;
import lecture28.Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

public class NewsGenerator {
    private final Timer timer;

    public NewsGenerator() {
        this.timer = new Timer();
    }

    public void startGeneration(NewsFactory factory) {
        CreateNews taskCreateNews = new CreateNews(factory);
        timer.schedule(taskCreateNews, 0, ((int) (Math.random() * 10) + 1) * 1000);
//        timer.schedule(taskCreateNews, 0, 100);
    }

    public void stopGenerator(){
        timer.cancel();
    }
}
