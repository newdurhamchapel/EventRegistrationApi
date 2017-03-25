package newduram_api_start;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import org.apache.log4j.Logger;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;


public class newduram_api {

	
	public static void main(String[] args) {
		
		/* String test = getoutput("Henry");
		
		System.out.println(test);
		System.out.println(getoutput("Tom"));
		System.out.println(getoutput("Jerry"));
		System.out.println(getSum(1,2)); */
		
		String user = "ab1fc474b17b5c167f70758e7b4b5ee1917a119e4ca49f66571578f0ccf1eb47";
		String token = "7a36cd7c3bb11343c4282d2c601b7003f455881b8c866e1f09b135a30967e3db";
		String Planningurl = "https://api.planningcenteronline.com/people/v2/people";
		
		String encodedauth = Base64.getEncoder().encodeToString((user+":"+ token).getBytes(StandardCharsets.UTF_8));  
		
		try {
			URL url = new URL(Planningurl);
			HttpURLConnection connection = null;
			try {
				connection = (HttpURLConnection) url.openConnection();
				connection.setRequestMethod("GET");
				connection.setDoOutput(true);
				connection.setRequestProperty("Authorization", "Basic "+encodedauth);
				connection.connect();
		
				InputStream stream = connection.getInputStream();
				
				 BufferedReader rd = new BufferedReader(new InputStreamReader(stream));
				    StringBuilder response = new StringBuilder(); // or StringBuffer if Java version 5+
				    String line;
				    while ((line = rd.readLine()) != null) {
				      response.append(line);
				      response.append('\r');
				    }
				    rd.close();
				
				 stream.close();
				 
				 
				System.out.print(response);
				 
				 
				ObjectMapper object = new ObjectMapper();
				
				JsonNode jsonObject = object.readTree(response.toString());
				
				System.out.println(jsonObject.get("data"));
				 

				 
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				connection.disconnect();
			}
			
			

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
	} // Main Loop
	
	
	
	public static String getforminfo(String FirstName,String LastName,String EmailAddress,Boolean Contact) {
	
	String output = "";
		
	return output;
	}
	
	
	
	
	
	
	
	

} // Class newdurham_api

//This is a great program
