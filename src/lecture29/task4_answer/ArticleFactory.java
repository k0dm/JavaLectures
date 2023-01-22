package lecture29.task4_answer;


import lecture29.task4_answer.Article;
import lecture29.task4_answer.ArticleCallback;

import java.util.Timer;
import java.util.TimerTask;

public class ArticleFactory {
    private final ArticleCallback articleCallback;
    private final Timer timer;
    private int count;

    public ArticleFactory(ArticleCallback articleCallback) {
        this.articleCallback = articleCallback;
        timer = new Timer();
    }


    public void startGeneration() {

        final TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                articleCallback.provideArticle(new Article(count,
                        "Article header " + count, "Article body " + count));
                if (++count == 40) {
                    timer.cancel();
                }
            }
        };
//        timer.schedule(timerTask, 0, ((int) (Math.random() * 10) + 1) * 1000);
        timer.schedule(timerTask, 0, 100);
    }


}
