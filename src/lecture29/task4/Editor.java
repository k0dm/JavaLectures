package lecture29.task4;

import java.util.List;

public class Editor implements Observer {

    private final static int SIZE = 10;
    private int numOfNewspapers = 0;
    private final NewspaperCallback callback;

    public Editor(NewspaperCallback callback) {
        this.callback = callback;
    }

    @Override
    public void makeNewspaper(List<News> news) {
        System.out.println("====| Newspaper " + (numOfNewspapers + 1) + "|=====");
        for (News curNews : news) {
            System.out.println(curNews);
        }
        System.out.println("=".repeat(10));
        numOfNewspapers++;
        if (numOfNewspapers == SIZE)
            callback.stopGenerate();
    }
}
