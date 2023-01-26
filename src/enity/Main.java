package enity;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.parser.ParseException;

import utils.*;
public class Main {
	public static void main(String[] args) throws IOException, ParseException {
		ReadFileCultural rfc = new ReadFileCultural();
		ArrayList<CulturalFestival> cf ;
		cf = rfc.getCuturalList();
		ReadFileEvents rfe = new ReadFileEvents();
		ArrayList<HistoricEvents> he ;
		he = rfe.getHistoricEvent();
		ReadFileSites rfs = new ReadFileSites();
		ArrayList<HistoricalSites> hs;
		hs = rfs.getHistoricSites();
		ReadFilePersonage rfp = new ReadFilePersonage();
		ArrayList<Personage> ps ;
		ps = rfp.getPersonageList();
		ReadFilePeriod rfpe = new ReadFilePeriod();
		ArrayList<Period> pr ;
		pr = rfpe.getPeriodLists();
		for (Period period : pr) {
			System.out.println(period);
		}
	}
}
