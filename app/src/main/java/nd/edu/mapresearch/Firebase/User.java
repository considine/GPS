package nd.edu.mapresearch.Firebase;

/**
 * Created by johnpconsidine on 3/20/16.
 */
public class User {
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    private String username;
    private String userid;
    private String objectId;
    private String password;
    private String createdAt;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @SuppressWarnings("unused")
    public User() {}

    public User(String password, String createdAt, String userid) {
        this.userid = userid;
        this.createdAt = createdAt;
        this.password = password;
    }




}


