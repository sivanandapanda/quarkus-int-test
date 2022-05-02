package com.example

import io.quarkus.test.junit.QuarkusIntegrationTest
import io.quarkus.test.junit.TestProfile
import io.restassured.RestAssured
import org.hamcrest.CoreMatchers.`is`
import org.junit.jupiter.api.Test

@QuarkusIntegrationTest
@TestProfile(IntegrationTestProfile::class)
class NativeGreetingResourceIT {

    @Test
    fun testHelloEndpoint() {
        RestAssured.given()
            .`when`().get("/hello")
            .then()
            .statusCode(200)
            .body(`is`("Hello RESTEasy"))

    }

}