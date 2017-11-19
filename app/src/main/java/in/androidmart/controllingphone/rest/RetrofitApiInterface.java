package in.androidmart.controllingphone.rest;

import in.androidmart.controllingphone.model.User;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by niraj.markandey on 18/11/17.
 */

public interface RetrofitApiInterface {
    @POST("users/createUser")
    Call<User> createUser(@Body User user);

    @GET("users/")
    Call<User> getUser();

}
