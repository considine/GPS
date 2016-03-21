package nd.edu.mapresearch.Firebase;

import com.firebase.client.Firebase;

import org.joda.time.DateTime;

import nd.edu.mapresearch.Application;
import nd.edu.mapresearch.Utils;

/**
 * Created by johnpconsidine on 3/20/16.
 */
public class NewUser {
    public static void add(String username, String HashedPass, DateTime createdAt) {
        String date = createdAt.toString();
        User user = new User(HashedPass, createdAt);
        Firebase mFirebaseref = new Firebase(Application.FIREBASE_URL);
        Firebase userRef = mFirebaseref.child(Utils.USER_DATA).child(username);
        userRef.setValue(user);
    }

}
