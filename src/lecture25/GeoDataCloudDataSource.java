package lecture25;

import org.jetbrains.annotations.Nullable;

public class GeoDataCloudDataSource implements DataSource<GeoData>{
    @Override
    public @Nullable GeoData getData() {
        return new GeoData(1,145.3, 34.7);
    }
}
