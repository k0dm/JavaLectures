package lecture29.task4;



import java.util.ArrayList;
import java.util.List;

public class NewsFactory implements Observable {
    private final List<News> news;
    private List<Observer> observers;
    private final static int SIZE = 4;

    public NewsFactory() {
        this.news = new ArrayList<>();
        this.observers = new ArrayList<>();
    }

    public void addNews(News news){
        this.news.add(news);
        if(this.news.size() == SIZE){
            notifyObservers();
            this.news.clear();
        }
    }
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remoteObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.makeNewspaper(news);
        }
    }
}
