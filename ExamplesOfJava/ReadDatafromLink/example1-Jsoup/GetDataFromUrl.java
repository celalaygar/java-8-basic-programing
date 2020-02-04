package getdatafromURL.example1;
 
import java.util.ArrayList;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GetDataFromUrl {
	private static String authorUrl = "https://www.mackolik.com/puan-durumu/t%C3%BCrkiye-s%C3%BCper-lig/482ofyysbdbeoxauk19yg7tdt";
    final static ArrayList<Team> teams = new ArrayList<>();
	public static void main(String[] args) {

		try {
			Document doc = Jsoup.connect(authorUrl).get();
			System.out.println(doc.title());
			Elements div = doc.select("div.p0c-competition-tables__table-wrapper");
			Elements table = doc.select("table[class=p0c-competition-tables__table p0c-competition-tables__table--total");
			Elements tbody = table.select("tbody");
			Elements tr = tbody.select("tr");
			
			for (Element trRow : tr) {
				Elements td = trRow.select("td");
				teams.add(new Team(
						Integer.valueOf(td.get(0).text().split(" ")[0]),	//position
						td.get(2).text(), 					//name
						Integer.valueOf(td.get(3).text()),	//totalMatch
						Integer.valueOf(td.get(5).text()),	//won
						Integer.valueOf(td.get(6).text()),	//drawn
						Integer.valueOf(td.get(7).text()), 	//lost
						Integer.valueOf(td.get(8).text()), 	//goalsFor
						Integer.valueOf(td.get(9).text()), 	//goalsAgainst
						Integer.valueOf(td.get(10).text()),	//goalsDifference
						Integer.valueOf(td.get(11).text())	//points
						));
			}
			
			
		} catch (Exception e) {

			e.printStackTrace();
		}
		for (Team team : teams) {
			System.out.println(team);
		}

		
//		output :
//		Türkiye Süper Lig 2019/2020, Ýddaa, Puan Durumu, Fikstür & Maç Sonuçlarý | Mackolik.com
//		Team [position=1, name=Sivasspor SÝV, totalMatch=20, won=12, drawn=5, Lost=3, goalsFor=39, goalsAgainst=23, goalsDifference=16, points=41]
//		Team [position=2, name=Baþakþehir ÝBA, totalMatch=20, won=11, drawn=6, Lost=3, goalsFor=39, goalsAgainst=21, goalsDifference=18, points=39]
//		Team [position=3, name=Trabzonspor TS, totalMatch=19, won=11, drawn=5, Lost=3, goalsFor=43, goalsAgainst=20, goalsDifference=23, points=38]
//		Team [position=4, name=Alanyaspor ALA, totalMatch=20, won=11, drawn=5, Lost=4, goalsFor=40, goalsAgainst=19, goalsDifference=21, points=38]
//		Team [position=5, name=Fenerbahçe FB, totalMatch=20, won=11, drawn=4, Lost=5, goalsFor=39, goalsAgainst=23, goalsDifference=16, points=37]
//		Team [position=6, name=Galatasaray GS, totalMatch=20, won=10, drawn=6, Lost=4, goalsFor=32, goalsAgainst=17, goalsDifference=15, points=36]
//		Team [position=7, name=Beþiktaþ BJK, totalMatch=20, won=10, drawn=3, Lost=7, goalsFor=31, goalsAgainst=27, goalsDifference=4, points=33]
//		Team [position=8, name=Göztepe GÖZ, totalMatch=20, won=8, drawn=6, Lost=6, goalsFor=25, goalsAgainst=22, goalsDifference=3, points=30]
//		Team [position=9, name=Gaziantep FK GAZ, totalMatch=20, won=7, drawn=6, Lost=7, goalsFor=31, goalsAgainst=32, goalsDifference=-1, points=27]
//		Team [position=10, name=Yeni Malatya YMA, totalMatch=19, won=6, drawn=6, Lost=7, goalsFor=34, goalsAgainst=28, goalsDifference=6, points=24]
//		Team [position=11, name=Ç. Rizespor RIZ, totalMatch=20, won=7, drawn=3, Lost=10, goalsFor=21, goalsAgainst=30, goalsDifference=-9, points=24]
//		Team [position=12, name=Denizlispor DEN, totalMatch=20, won=6, drawn=5, Lost=9, goalsFor=21, goalsAgainst=29, goalsDifference=-8, points=23]
//		Team [position=13, name=Gençlerbirliði GNÇ, totalMatch=20, won=5, drawn=6, Lost=9, goalsFor=30, goalsAgainst=37, goalsDifference=-7, points=21]
//		Team [position=14, name=Konyaspor KON, totalMatch=20, won=4, drawn=7, Lost=9, goalsFor=16, goalsAgainst=27, goalsDifference=-11, points=19]
//		Team [position=15, name=Antalyaspor ANT, totalMatch=20, won=4, drawn=6, Lost=10, goalsFor=18, goalsAgainst=36, goalsDifference=-18, points=18]
//		Team [position=16, name=Kasýmpaþa KAS, totalMatch=20, won=4, drawn=4, Lost=12, goalsFor=28, goalsAgainst=43, goalsDifference=-15, points=16]
//		Team [position=17, name=MKE Ankaragücü ANK, totalMatch=20, won=2, drawn=8, Lost=10, goalsFor=17, goalsAgainst=37, goalsDifference=-20, points=14]
//		Team [position=18, name=Kayserispor KAY, totalMatch=20, won=2, drawn=5, Lost=13, goalsFor=19, goalsAgainst=52, goalsDifference=-33, points=11]

	}

}
