package lecture29.task4_answer;

import java.util.List;

public class Newspaper {
    private final int id;
    private final List<Article> articles;

    public Newspaper(int id, List<Article> articles) {
        this.id = id;
        this.articles = articles;
    }

    @Override
    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("Newspaper number ").append(id).append(":\n");
        for (Article article : articles) {
            description.append(article);
            description.append("\n");
        }
        return description.toString();
    }
}
