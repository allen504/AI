import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import java.io.IOException;

public class tester {
    public static void main(String args[])throws IOException{
        String b = "";
        //Make a doc to retrieve an element from
        Document doc = Jsoup.connect("https://en.wikipedia.org/wiki/Stock").get();
        // retrieve an element
        Elements title = doc.select("h1");
        // get string value from the element
        b = title.text();
        System.out.println(b);


    }

}
