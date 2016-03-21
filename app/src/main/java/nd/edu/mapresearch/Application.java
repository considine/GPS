package nd.edu.mapresearch;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

/**
 * Created by johnpconsidine on 3/20/16.
 */
public class Application extends android.app.Application {
    public static final String TAG = Application.class.getSimpleName();
    public static final String FIREBASE_URL = "https://popping-heat-2850.firebaseio.com/";
    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
        Firebase myFirebaseRef = new Firebase(FIREBASE_URL);
        myFirebaseRef.child("message").setValue("Do you have data? You'll love Firebase.");


        myFirebaseRef.child("message").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot snapshot) {
               //if there is any difference in firebase data
            }

            @Override
            public void onCancelled(FirebaseError error) {
            }
        });

    }
}
