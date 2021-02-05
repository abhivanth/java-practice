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
        Document doc = Jsoup.connect("https://amzn.to/3pU4Hfq").get();
        Map<String,String> productList = new HashMap<>();
        String Title;
        String Price = null;

        for (Element block: doc.select(".sg-col-12-of-16.sg-col.sg-col-16-of-20.sg-col-0-of-12.s-asin.s-result-item:nth-of-type(n)")) {

            Elements product = block.select(".a-text-normal.a-color-base.a-size-medium");
            Title  = (product.toString().substring(product.toString().lastIndexOf(">", product.toString().lastIndexOf(" "))));
            if(productList.containsKey(Title)){
                Title = Title + "*new*";
            }

            Elements productPrice = block.select(".a-color-base");
            productPrice = productPrice.select("[class = a-color-base]span:contains(€)");
            if ((productPrice.toString().matches(".*€[\\d]{1,}.*"))) {
                
                Price = (productPrice.toString().substring(productPrice.toString().lastIndexOf(">", productPrice.toString().lastIndexOf("<"))));
                productList.put(Title,Price);

            }

        }
        int count = 1;
        for (Map.Entry<String, String> entry : productList.entrySet()) {
            System.out.println(entry.getKey()+"     "+entry.getValue());
            System.out.println(count);
            count++;

        }



    }
}
