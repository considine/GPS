package nd.edu.mapresearch.Firebase;

/**
 * Created by johnpconsidine on 3/21/16.
 */
public class FBLocation {

    public FBLocation() {}
    public FBLocation(double lat, double lon) {
        this.latitude = lat;
        this.longitude = lon;
    }

    public Double getLat() {
        return latitude;
    }

    public void setLat(Double lat) {
        latitude = lat;
    }

    private Double latitude;
    private Double longitude;

    public Double getLon() {
        return longitude;
    }

    public void setLon(Double lon) {
        this.longitude = lon;
    }
}
