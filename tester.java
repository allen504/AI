import jdk.internal.org.objectweb.asm.tree.analysis.Analyzer;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class tester {

    public static void main(String args[])throws IOException{
        // Checks the current price of 1 share of Tesla Motors
        System.out.println(AnalysisTool.getTeslaStockPrice());
        System.out.println(AnalysisTool.getTeslaOpenPrice());

    }

}
