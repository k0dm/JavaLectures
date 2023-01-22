package lecture29.task4;

import java.util.TimerTask;

public class CreateNews extends TimerTask {
    private final NewsFactory newsFactory;
    private static int i = 1;

    public CreateNews(NewsFactory newsFactory) {
        this.newsFactory = newsFactory;
    }

    @Override
    public void run() {
        News news = new News("Title "+i, "This is news number " + i);
        newsFactory.addNews(news);
        i++;
    }
}
