package getdatafromURL.example3;

import java.io.IOException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements; 


public class getGoldDataFromMynet {

	private static String authorUrl =  "http://finans.mynet.com/altin/";
	private static ArrayList<Gold> list= new ArrayList<Gold>();
	public static void main(String[] args) { 
		Document doc;
		try {
			doc = Jsoup.connect(authorUrl).get();
			Elements tbody = doc.select("table.wfull > tbody.tbody-type-default") ;
			Elements tr = tbody.select("tr");
			for (Element trRow : tr) {
				Elements td = trRow.select("td");
//				list.add(new Gold(
//						trRow.select("td").get(0).text().trim(), 
//						Double.valueOf(trRow.select("td").get(2).text().replace(",", ".").trim()), 
//						Double.valueOf(trRow.select("td").get(3).text().replace(",", ".").trim()),
//						Double.valueOf(trRow.select("td").get(4).text().replace(",", ".").trim()),
//						trRow.select("td").get(6).text().trim()
//						));
				System.out.print ( trRow.select("td").get(0).text()+" --- ");
				System.out.print ("Alýþ "+trRow.select("td").get(3).text().replace(",", ".")+" --- ");
				System.out.println("Satýþ "+trRow.select("td").get(4).text().replace(",", ".")); 
			}

			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		//list.forEach(System.out::println);
		
	}

}
