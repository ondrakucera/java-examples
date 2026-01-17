package ondra;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
class GreetingResourceTest {

	@Test
	void testHelloEndpoint() {
		// @formatter:off
		given()
			.when().get("/hello")
			.then()
				.statusCode(200)
				.body(is("Hello from Quarkus REST"));
		// @formatter:on
	}

	@Test
	void testHelloJsonEndpoint() {
		// @formatter:off
		given()
			.when().get("/hello/json")
			.then()
				.statusCode(200)
				.contentType("application/json")
				.body("message", is("Hello from Quarkus REST"));
		// @formatter:on
	}

}
