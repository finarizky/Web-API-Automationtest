package com.finarizky.page.api;

import com.finarizky.base.BaseAPITest;
import io.restassured.response.Response;

public class GetPage extends BaseAPITest {

    public Response getAllData(){

       BaseAPITest.setup();
        return request.get("/user?limit=10");
    }

    public Response getSpecificData(String id) {
        BaseAPITest.setup();
        return request.get("/user/" + id);
    }

    public Response getSpecificWrongData(String wrongId) {
        BaseAPITest.setup();
        return request.get("/user/" + wrongId);
    }
}
