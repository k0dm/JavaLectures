package lecture29.task4_answer;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        ArticleCallback callback = editor::handleArticle;
        ArticleFactory factory = new ArticleFactory(callback);
        factory.startGeneration();
    }
}
