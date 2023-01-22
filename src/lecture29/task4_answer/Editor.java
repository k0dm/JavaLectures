package lecture29.task4_answer;

import java.util.ArrayList;
import java.util.List;

public class Editor {
    private final static int ARTICLES_NUMBER_FOR_NEWSPAPERS = 4;
    private final List<Article> articles;
    private int newspaperCount;

    public Editor() {
        articles = new ArrayList<>();
    }

    public void handleArticle(Article article) {
        articles.add(article);
        if (articles.size() == ARTICLES_NUMBER_FOR_NEWSPAPERS) {
            System.out.println(new Newspaper(newspaperCount, articles));
            newspaperCount++;
            articles.clear();
        }

    }
}
