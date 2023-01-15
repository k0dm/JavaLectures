package lecture25;

import static lecture25.Main.print;

public class Repository<T> implements DataSource<T> {

    private final DataSource<T> cloudDataSource;
    private final MutableDataSource<T> cashedDataSource;

    public Repository(DataSource<T> cloudDataSource,
                      MutableDataSource<T> cashedDataSource) {
        this.cloudDataSource = cloudDataSource;
        this.cashedDataSource = cashedDataSource;
    }

    @Override
    public T getData() {
        T result = cashedDataSource.getData();
        if (result == null) {
            print("no data in cache");
            result = cloudDataSource.getData();
            cashedDataSource.saveData(result);
        }
        else {
            print("getting from cache");
        }
        return result;
    }
}
