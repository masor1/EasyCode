package javap.android_example;

public class Repository implements DataSource {

    private final DataSource cloudDataSource;
    private final MutableDataSource cacheDataSource;

    public Repository(DataSource cloudDataSource, MutableDataSource cacheDataSource) {
        this.cloudDataSource = cloudDataSource;
        this.cacheDataSource = cacheDataSource;
    }

    @Override
    public MyData getData() {
        MyData result = (MyData) cacheDataSource.getData();
        if (result == null) {
            print("no data in cache");
            result = (MyData) cloudDataSource.getData();
            cacheDataSource.saveData(result);
        } else {
            print("getting from cache");
        }
        return result;
    }

    private void print(String text) {
        System.out.println(text);
    }
}
