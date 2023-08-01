package com.restful.booker.testbase;

import io.restassured.RestAssured;
import org.junit.BeforeClass;


public class TestBase {

    @BeforeClass
    public static void inIt() {
        RestAssured.baseURI = "https://gorest.co.in";
        RestAssured.port = 3030;
        RestAssured.basePath = "/public/v2/users?page=1&per_page=20";
    }
}
