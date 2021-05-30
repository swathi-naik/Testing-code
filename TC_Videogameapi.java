package videogameapi;


import org.json.JSONObject;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;
import io.restassured.response.Response;
import junit.framework.Assert;

import static io.restassured.RestAssured.*;

public class TC_Videogameapi {
	
@Test(priority=1)
public void test_getallvideogames() {
given()
  
.when()
     .get("http://localhost:8080/app/videogames")
.then()
      .statusCode(200);
}

@Test(priority=2)
public void add_newvideogame() {                                              
	 JSONObject data1=new JSONObject();
	    data1.put("id","64");
		data1.put("name","Doom");
		data1.put("releaseDate","1993-02-18T00:00:00+05:30");
		data1.put("reviewScore","81");
		data1.put("category","Shooter");
		data1.put("rating","Mature");
		Response id = given()
                .contentType("application/json")
                .body(data1.toString())

        .when()
                .post("http://localhost:8080/app/videogames")
        .then()
                .statusCode(200)
                .log().body()
                .extract().response();

String jsonString=id.asString();
Assert.assertEquals(jsonString.contains("Record Added Successfully"),true);

}
@Test(priority=3)
public void test_getspecificidvideogame() {
given()
  
.when()
     .get("http://localhost:8080/app/videogames/64")
.then()
      .statusCode(200)
      .log().body()
      .body("videoGame.id",equalTo("64"),
            "videoGame.name",equalTo("Doom")
            );
}	
	
@Test(priority=4)
public void test_updatevideogame() {
	JSONObject data1=new JSONObject();
    data1.put("id","64");
	data1.put("name","Doommi");
	data1.put("releaseDate","1993-06-18T00:00:00+05:30");
	data1.put("reviewScore","83");
	data1.put("category","Shooters");
	data1.put("rating","Matures");
given()
.contentType("application/json")
.body(data1.toString())
.when()
     .put("http://localhost:8080/app/videogames/64")
.then()
      .statusCode(200)
      .log().body()
      .body("videoGame.id",equalTo("64"),
            "videoGame.name",equalTo("Doommi")
            );
}	

@Test(priority=5)
public void test_deletespecificidvideogame() {
	Response res=
given()
  
.when()
     .delete("http://localhost:8080/app/videogames/64")
.then()
      .statusCode(200)
      .log().body()
      .extract().response();
	
      String  jsonstring=res.asString();
	Assert.assertEquals(jsonstring.contains("Record Deleted Successfully"),true);
}	










}