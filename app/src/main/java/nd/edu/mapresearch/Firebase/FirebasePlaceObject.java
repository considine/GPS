package nd.edu.mapresearch.Firebase;

/**
 * Created by johnpconsidine on 3/21/16.
 */
public class FirebasePlaceObject {
    public FirebasePlaceObject () {}
    public FBLocation location;
    String notes;
    String icon;
    String groups;
    String username;
    int minutes;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getGroups() {
        return groups;
    }

    public void setGroups(String groups) {
        this.groups = groups;
    }

    public FBLocation getLocation() {
        return location;
    }

    public void setLocation(FBLocation location) {
        this.location = location;
    }

    public FirebasePlaceObject( FBLocation location, String notes, String icon, String groups, String username, int minutes) {
        this.location = location;
        this.notes = notes;
        this.icon = icon;
        this.groups = groups;
        this.minutes = minutes;
        this.username = username;
    }


}
