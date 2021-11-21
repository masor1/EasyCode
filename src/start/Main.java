package start;

import android_example.*;

public class Main {

    public static void main(String[] args) {
        DataSource repository = new Repository(
                new CloudDataSource(),
                new CachedDataSource()
        );

        MyData data = (MyData) repository.getData();
        print(data.toString());
        data = (MyData) repository.getData();
        print(data.toString());
        data = (MyData) repository.getData();
        print(data.toString());
    }

    private static void print(String text) {
        System.out.println(text);
    }
}
