package javap.android_example;

import com.sun.istack.internal.NotNull;

public interface MutableDataSource<T> extends DataSource<T> {
    void saveData(@NotNull T data);
}
