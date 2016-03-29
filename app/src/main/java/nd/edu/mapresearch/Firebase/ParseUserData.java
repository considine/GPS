package nd.edu.mapresearch.Firebase;

import com.parse.ParseClassName;
import com.parse.ParseObject;

import java.util.Date;

import nd.edu.mapresearch.Utils;

/**
 * Created by johnpconsidine on 3/21/16.
 */
@ParseClassName("UserData")
public class ParseUserData extends ParseObject{
    private String username;
    private String userid;
    private String objectId;
    private String passwordHash;
    private String createdAt;



    public String getUserid() {
        return getString(Utils.USER_DATA_USER_ID);
    }





    public String getPasswordHash() {
        return getString(Utils.USER_DATA_PASSWORD_HASH);
    }


    public String getTime() {
        Date date = getDate("createdAt");
        //Log.v("TransferParseToFirebase", date.toString());
        return ("3:21:2015");
    }






    public String getUsername() {
        return getString(Utils.USER_DATA_USERNAME);
    }


}
