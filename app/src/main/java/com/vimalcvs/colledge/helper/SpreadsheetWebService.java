package com.vimalcvs.colledge.helper;


import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface SpreadsheetWebService {

    @POST("1FAIpQLScEAJGp8eqx_Ngk_r62lZMfQohdUlkaCVIzIRbYweu3yYwd_w/formResponse")
    @FormUrlEncoded
    Call<Void> feedbackSend(
            @Field("entry.74677493") String feedback,
            @Field("entry.1821245577") String name,
            @Field("entry.414154651") String email
    );

}