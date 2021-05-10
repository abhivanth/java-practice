package com.abhivanth.practice;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WebScrapper {
    public static void main(String[] args) throws IOException {
        WebScrapper scrapper = new WebScrapper();
        scrapper.parseHtml();

    }

    private void parseHtml() throws IOException {
//        System.setProperty("https.protocols", "TLSv1,TLSv1.1,TLSv1.2");
        Document doc = Jsoup.connect("https://www.amazon.de/s?i=electronics&bbn=3581963031&rh=n%3A3581963031%2Cn%3A562066%2Cn%3A%21569604%2Cn%3A761254&language=en&pf_rd_i=3581963031&pf_rd_m=A3JWKAKR8XB7XF&pf_rd_p=b0c8a132-f66d-4470-ad03-a7b409705f2e&pf_rd_r=70BZ2FJZG8957YSFAGPG&pf_rd_s=merchandised-search-1&pf_rd_t=101&rw_html_to_wsrp=1&ref=s9_acss_bw_cg_DEAWTNEW_md3_w").get();
        Map<String,String> productList = new HashMap<>();
        String Title;
        String Price = null;

        for (Element block: doc.select(".sg-col-12-of-16.sg-col.sg-col-16-of-20.sg-col-0-of-12.s-asin.s-result-item:nth-of-type(n)")) {

            Elements product = block.select(".a-text-normal.a-color-base.a-size-medium");
            Title = product.text();

//            Title  = (product.toString().substring(product.toString().lastIndexOf(">", product.toString().lastIndexOf(" "))));
            if(productList.containsKey(Title)){
                Title = Title + "*new*";
            }

            Elements productPrice = block.select(".a-color-base");
            productPrice = productPrice.select("[class = a-color-base]span:contains(€)");
            Price = productPrice.text();
            productList.put(Title,Price);
//            if ((productPrice.toString().matches(".*€.*"))) {
////                Price = (productPrice.toString().substring(productPrice.toString().lastIndexOf(">", productPrice.toString().lastIndexOf("<"))));
////                productList.put(Title,Price);
//            }

        }
        int count = 1;
        for (Map.Entry<String, String> entry : productList.entrySet()) {
            System.out.println(entry.getKey()+"     "+entry.getValue());
            System.out.println(count);
            count++;

        }



    }
}
