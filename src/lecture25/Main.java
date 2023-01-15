package lecture25;

public class Main {

    public static void main(String[] args) {
        DataSource<MyData> repository = new Repository(
                new MyDataCloudDataSource(),
                new CashedDataSource()
        );

        MyData data = repository.getData();
        print(data.toString());
        data = repository.getData();
        print(data.toString());


    }
    public  static void print(Object text) {
        System.out.println(text);
    }
}
