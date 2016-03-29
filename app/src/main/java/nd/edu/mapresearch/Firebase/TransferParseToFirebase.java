package nd.edu.mapresearch.Firebase;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.parse.FindCallback;
import com.parse.ParseException;
import com.parse.ParseQuery;

import java.util.List;

import nd.edu.mapresearch.R;
import nd.edu.mapresearch.Utils;

public class TransferParseToFirebase extends Activity {

    public static final String TAG = TransferParseToFirebase.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer_parse_to_firebase);
        ParseQuery<ParseUserData> query = new ParseQuery<ParseUserData>("UserData");
        query.findInBackground(new FindCallback<ParseUserData>() {
            @Override
            public void done(List<ParseUserData> list, ParseException e) {
                if (e==null) {
                    //success
                    for (ParseUserData data : list) {
                        String username = data.getUsername();
                        String hashedpassword = data.getPasswordHash();
                        String date = data.getCreatedAt().toString();
                        String userId = data.getObjectId();
                        NewUser.add(username, hashedpassword, date, userId);

                    }
                }
                else {
                    //failure
                    Log.e(TAG, "error gettign query: " + e.getMessage());
                }
            }
        });

        ParseQuery<ParsePlaceObject> query1 = new ParseQuery<ParsePlaceObject>(Utils.PLACE_OBJECT);
        query1.findInBackground(new FindCallback<ParsePlaceObject>() {
            @Override
            public void done(List<ParsePlaceObject> list, ParseException e) {
                if (e==null) {
                    for (ParsePlaceObject object : list) {
                        String objectId = object.getObjectId();
                        String notes = object.getNotes();
                        String icon = object.getIcon();
                        String group = object.getGroup();
                        FBLocation locations = object.getLocation();
                        NewObject.add(objectId, locations, notes, icon, group, object.getUsername(), object.getMinutes());


                    }
                }
                else {
                    Log.e(TAG, "Error getting placeobjects: " + e.getMessage());
                }
            }
        });
    }

}
