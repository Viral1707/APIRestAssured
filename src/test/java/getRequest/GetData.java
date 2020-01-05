package getRequest;

import org.apache.http.util.Asserts;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetData {

	@Test
	public void testResonseCode()
	{
		Response resp =	RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
		String data = resp.asString();
		int status = resp.getStatusCode();
		System.out.println("Status Code is" + status);
		System.out.println("Data is" + data);
		Assert.assertEquals(status, 200);
	}
	
}