package ondra;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.Objects;

@Path("/hello")
public class GreetingResource {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String hello() {
		return "Hello from Quarkus REST";
	}

	@GET
	@Path("/json")
	@Produces(MediaType.APPLICATION_JSON)
	public GreetingDto helloJson() {
		return new GreetingDto("Hello from Quarkus REST");
	}

	public static class GreetingDto {

		private final String message;

		public GreetingDto(String message) {
			this.message = message;
		}

		public String getMessage() {
			return message;
		}

		@Override
		public boolean equals(Object o) {
			if (o == null || getClass() != o.getClass())
				return false;
			GreetingDto that = (GreetingDto) o;
			return Objects.equals(message, that.message);
		}

		@Override
		public int hashCode() {
			return Objects.hashCode(message);
		}

		@Override
		public String toString() {
			return "GreetingDto{" + "message='" + message + '\'' + '}';
		}

	}

}
