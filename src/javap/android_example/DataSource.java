package javap.android_example;

import com.sun.istack.internal.Nullable;

public interface DataSource<T> {
    @Nullable
    T getData();
}
