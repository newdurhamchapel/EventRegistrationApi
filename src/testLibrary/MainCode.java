/**
 * 
 */
package testLibrary;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author KesterGuischard
 *
 */
public class MainCode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String user = "ab1fc474b17b5c167f70758e7b4b5ee1917a119e4ca49f66571578f0ccf1eb47", 
				password = "7a36cd7c3bb11343c4282d2c601b7003f455881b8c866e1f09b135a30967e3db";
		try {
			URL url = new URL("https://api.planningcenteronline.com/people/v2/people");
			
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
