import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;

public class AnalysisTool {

    public static double getTeslaStockPrice() throws IOException{
        String a = "";
        //Make a doc to retrieve an element from
        Document doc = Jsoup.connect("https://finance.yahoo.com/quote/TSLA/").get();
        // retrieve an element
        Elements title = doc.select("span[class=Trsdu(0.3s) Fw(b) Fz(36px) Mb(-4px) D(ib)]");
        // get string value from the element
        a = title.text();
        double b = Double.parseDouble(a);
        return b;
    }

    public static double getTeslaOpenPrice() throws IOException{
        String c = "";
        //Make a doc to retrieve an element from
        Document doc = Jsoup.connect("https://finance.yahoo.com/quote/TSLA/").get();
        // retrieve an element
        Elements title = doc.select("td[class=Ta(end) Fw(600) Lh(14px)].span[class=Trsdu(0.3s)]");
        // get string value from the element
        c = title.text();
        double d = Double.parseDouble(c);
        return d;
    }

}
