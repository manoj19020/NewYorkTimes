package com.universetelecom.mvvm_users.retrofit;

/**
 * Created by Ashish.Tamrakar on 2/1/2018.
 */

public class ApiUtils {
     public static final String BASE_URL = "https://apidrt.idev.fedex.com:8443/"; //L3 // FCL
    //public static final String BASE_URL_L6 = "https://apitest.fedex.com/"; //L6
    public static final String BASE_URL_EMEA = "https://knight.emea.fedex.com:8443/";
    public static final String GOOGLE_AUTO_COMPLETE = "https://maps.googleapis.com/";

//    public static RetrofitInterface getSOService() {
//        return RetrofitClient.getClient(BASE_URL).create(RetrofitInterface.class);
//    }
//
//    public static RetrofitInterface getSOServiceEMEA() {
//        return RetrofitClient.getClientEMEA(BASE_URL_EMEA).create(RetrofitInterface.class);
//    }
//
//    public static RetrofitInterface getGooglePlacesAPIService(){
//        return RetrofitClient.getClientGoogleSearch(GOOGLE_AUTO_COMPLETE).create(RetrofitInterface.class);
//    }
}
