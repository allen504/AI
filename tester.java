import jdk.internal.org.objectweb.asm.tree.analysis.Analyzer;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class tester {

    public static void main(String args[])throws IOException{
        //Calling the getTeslaStockPrice method from the AnalysisTool class
        System.out.println(AnalysisTool.getTeslaStockPrice());
        //Calling the getTeslaOpenPrice method from the AnalysisTool class(nonfunctional)
        System.out.println(AnalysisTool.getTeslaOpenPrice());

    }

}
