package lecture25;

import org.jetbrains.annotations.Nullable;

public interface DataSource<T> {
    @Nullable
    T getData();

}
