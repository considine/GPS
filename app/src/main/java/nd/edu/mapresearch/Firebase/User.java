package nd.edu.mapresearch.Firebase;

import org.joda.time.DateTime;

/**
 * Created by johnpconsidine on 3/20/16.
 */
public class User {

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public DateTime getDate() {
        return date;
    }

    public void setDate(DateTime date) {
        this.date = date;
    }

    private String password;
    private DateTime date;
    public User() {}

    public User(String password, DateTime date) {
        this.date = date;
        this.password = password;
    }




}


