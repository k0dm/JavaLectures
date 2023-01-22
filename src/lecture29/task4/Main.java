package lecture29.task4;

import java.util.Timer;

public class Main {
    public static void main(String[] args) {
        NewsGenerator generator = new NewsGenerator();
        NewspaperCallback callback = new NewspaperCallback(){
            @Override
            public void stopGenerate() {
                generator.stopGenerator();
            }
        };
        Editor editor = new Editor(callback);
        NewsFactory factory = new NewsFactory();
        factory.registerObserver(editor);

        generator.startGeneration(factory);
    }
}
