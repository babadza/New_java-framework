import io.restassured.internal.common.assertion.Assertion;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class SmokeAPITest {
@Test
void sinpleTest(){
    String body="""
        {
        "id": 0,
        "username": "string",
        "firstName": "string",
        "lastName": "string", 
        "email": "string", 
        "password": "string", 
        "phone": "string", 
        "userStatus": 0 
            }""";

   Response response=given().header("accept", "application/json")
            .header("Content-Type", "application/json")
            .baseUri("https://petstore.swagger.io/v2/")
            .when()
            .body(body)
            .post("user")
            .andReturn();
   int ActualCode=response.getStatusCode();

    Assertions.assertEquals(200
            ,ActualCode);

 //   given().header("accept", "application/json")
 //           .header("Content-Type", "application/json")
 //           .baseUri("https://petstore.swagger.io/v2/")
 //           .when()
 //           .body(body)
 //           .post("user")
  //          .then()
  //          .statusCode(200)  // Проверка статуса
  //          .body("code", equalTo(200))  // Проверка значения поля "code"
  //          .body("type", equalTo("unknown"));  // Проверка значения поля "type"


}
}
