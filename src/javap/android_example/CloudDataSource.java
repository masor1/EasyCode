package javap.android_example;

import com.sun.istack.internal.Nullable;

public class CloudDataSource implements DataSource<MyData> {

    @Nullable
    @Override
    public MyData getData() {
        return new MyData(1, "description_1");
    }
}
