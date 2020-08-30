package getdatafromURL.example1;

import java.io.IOException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class getExchangeDataFromLink {
	private static String authorUrl =  "http://bigpara.hurriyet.com.tr/doviz/";
	private static ArrayList<Currency> list= new ArrayList<Currency>();
	public static void main(String[] args) {

		Document doc;
		try {
			doc = Jsoup.connect(authorUrl).get();
			
			
			Elements a = doc.select("div.dovizBar > a.dbItem") ;
			
			// fill in list
			for (Element element : a) {
				list.add(new Currency(element.attr("href").split("/")[2], 0.0, 0.0));
			}

			int j=0;
			Elements span = a.select("span.box"); 
			for (Element element : span) {
				//System.out.println(element.text().split(" ")[1].trim());
				// System.out.println(element.attr("class").trim() +" "+element.text());
				if(element.attr("class").trim().equals("box bFirst")) {
					list.get(j).setBuyying(Double.valueOf(element.text().split(" ")[1].trim().replace(",", ".")));
				} 
				if(element.attr("class").trim().equals("box")) {
					list.get(j).setSelling(Double.valueOf(element.text().split(" ")[1].trim().replace(",", ".")));
					j++;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		list.forEach(System.out::println);
	}

}
