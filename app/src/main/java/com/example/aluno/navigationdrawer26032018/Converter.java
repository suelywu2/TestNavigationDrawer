package com.example.aluno.navigationdrawer26032018;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.List;

/**
 * Created by Aluno on 12/04/2018.
 */

public class Converter {

    private Document doc;
    private String content;

    public Converter() {
        try {

            this.doc = Jsoup.connect("http://www.tudogostoso.com.br/").get();
            List list = doc.select("div");
            this.content = "";
            for (Object o : list) {
                content += (String) o;
            }

        } catch (IOException e) {

        }


    }

    public String get() {
        return content;
    }



}
