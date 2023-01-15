package lecture25;

public class GeoRepository extends Repository<GeoData>{

    public GeoRepository(DataSource<GeoData> cloudDataSource,
                         MutableDataSource<GeoData> cashedDataSource) {
        super(cloudDataSource, cashedDataSource);
    }
}
