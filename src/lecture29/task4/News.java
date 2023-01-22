package lecture29.task4;

public class News {


    private final String title;
    private final String description;


    public News(String title, String description) {
        this.title = title;
        this.description = description;
    }

    @Override
    public String toString() {
        return title + "\n" + description + "\n" + "-".repeat(10);
    }
}
