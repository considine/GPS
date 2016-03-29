package nd.edu.mapresearch.Firebase;

/**
 * Created by johnpconsidine on 3/20/16.
 */
public class NewUser {
    public static void add(String username, String HashedPass, String createdAt, String userID) {
        User user = new User(HashedPass, createdAt, userID);
//        Firebase mFirebaseref = new Firebase(Application.FIREBASE_URL);
//        Firebase userRef = mFirebaseref.child(Utils.USER_DATA).child(username);
//        userRef.setValue(user);
    }

}
