package getdatafromURL.example3;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class getGoldParameters {
	private static String authorUrl = "https://altin.doviz.com/";

	public static void main(String[] args) {

		Document doc;
		Elements data,col; 
		try {
			doc = Jsoup.connect(authorUrl+"gram-altin").get();
			data = doc.select("div.data");
			col = data.select("div.col");
			//System.out.println(col.size()+" "+data.size());
			System.out.print("gram-altin : ");
			for (Element element : col) {
				String label = element.select("span.label").text();
				String value = element.select("span.value").text();
				System.out.print(label + " " + value+" ");
			}
			
			System.out.println();
			doc = Jsoup.connect(authorUrl+"ceyrek-altin").get();
			data = doc.select("div.data");
			col = data.select("div.col");
			//System.out.println(col.size()+" "+data.size());
			System.out.print("ceyrek-altin : ");
			for (Element element : col) {
				String label = element.select("span.label").text();
				String value = element.select("span.value").text();
				System.out.print(label + " " + value+" ");
			}
 
		} catch (Exception e) {
			
		}
	}

}
