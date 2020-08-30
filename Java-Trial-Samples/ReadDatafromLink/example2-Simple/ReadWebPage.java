package getdatafromURL.example2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class ReadWebPage {

	public static void main(String[] args) {
      URL oracle;
		try {
			oracle = new URL("http://www.koeri.boun.edu.tr/scripts/lst1.asp");
			//oracle = new URL("http://www.oracle.com/");
			URLConnection yc = oracle.openConnection();
			BufferedReader in = new BufferedReader(new InputStreamReader(
                              yc.getInputStream()));
			
			
			String inputLine;
	        while ((inputLine = in.readLine()) != null) 
	            System.out.println(inputLine);
	        in.close();
		} catch (MalformedURLException e) { 
			e.printStackTrace();
		} catch (IOException e) { 
			e.printStackTrace();
		}
	}

}
