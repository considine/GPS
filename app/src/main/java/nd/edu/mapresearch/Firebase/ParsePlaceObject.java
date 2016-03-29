package nd.edu.mapresearch.Firebase;

import android.location.Location;

import com.parse.ParseClassName;
import com.parse.ParseGeoPoint;
import com.parse.ParseObject;

import nd.edu.mapresearch.Utils;

/**
 * Created by johnpconsidine on 3/21/16.
 */
@ParseClassName(Utils.PLACE_OBJECT)
public class ParsePlaceObject extends ParseObject{
    private String objectId;
    private Location location;
    private String createdAt;
    private String icon;
    private String notes;
    private Boolean expired;
    private String group;
    private int minutes;


    public FBLocation getLocation() {
        ParseGeoPoint geoPoint = getParseGeoPoint(Utils.PLACE_OBJECT_LOCATION);

        double Lat = geoPoint.getLatitude();
        double Lon = geoPoint.getLongitude();

        return new FBLocation(Lat, Lon);



    }



    public String getIcon() {
        return getString(Utils.PLACE_OBJECT_ICON);
    }

    public String getNotes() {
        return getString(Utils.PLACE_OBJECT_NOTES);
    }

    public Boolean getExpired() {
        return getBoolean(Utils.PLACE_OBJECT_EXPIRED);
    }

    public String getGroup() {
        return getString(Utils.PLACE_OBJECT_GROUP);
    }

    public int getMinutes() {
        return getInt(Utils.PLACE_OBJECT_MINUTES);
    }
    public String getUsername() { return getString(Utils.USER_DATA_USERNAME);}
}
