package in.androidmart.controllingphone.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by niraj.markandey on 18/11/17.
 */

public class User {
    @SerializedName("firebaseId")
    private String firebaseId;

    @SerializedName("email")
    private String email;

    @SerializedName("gcmToken")
    private String gcmToken;

    public User(String firebaseId, String email, String gcmToken) {
        this.firebaseId = firebaseId;
        this.email = email;
        this.gcmToken = gcmToken;
    }

    public String getFirebaseId() {
        return firebaseId;
    }

    public void setFirebaseId(String firebaseId) {
        this.firebaseId = firebaseId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGcmToken() {
        return gcmToken;
    }

    public void setGcmToken(String gcmToken) {
        this.gcmToken = gcmToken;
    }

    @Override
    public String toString() {
        return "User = { email:"+email+",gcmToken:"+gcmToken+",firebaseId:"+firebaseId+"}";
    }
}
