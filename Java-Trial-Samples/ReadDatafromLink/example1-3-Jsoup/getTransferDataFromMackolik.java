package getdatafromURL.example4;

import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class getTransferDataFromMackolik {

	private static String authorUrl =  "http://arsiv.mackolik.com/Transferler";
	private static ArrayList<Player> list= new ArrayList<Player>();
	public static void main(String[] args) {

		Document doc;
		try {
			doc = Jsoup.connect(authorUrl).get();
			Elements tr = doc.select("table.list-table > tbody > tr") ;
			System.out.println(tr.size());
			for (Element trRow : tr) {
				if(trRow.attr("class").trim().equals("table-header"))
					continue;
				if(trRow.attr("class").trim().equals("alt1") || trRow.attr("class").trim().equals("alt2")) {
					
					list.add(new Player(
							trRow.select("td").get(0).text().trim(), 
							trRow.select("td").get(1).text().trim(), 
							trRow.select("td").get(2).text().trim(), 
							trRow.select("td").get(3).text().trim(), 
							trRow.select("td").get(4).text().trim(), 
							trRow.select("td").get(5).text().trim()));
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		list.forEach(System.out::println);
	}

}
