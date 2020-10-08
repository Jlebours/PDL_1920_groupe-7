package fr.istic.pdl1819_grp5;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class TestMain {
    private static boolean wikiTextCompareToHtml2() throws IOException {
        File repertoireHtml = new File("output\\html");
        File repertoireWikitext = new File("output\\wikitext");
        File[] filesHtml = repertoireHtml.listFiles();
        File[] filesWikitext = repertoireWikitext.listFiles();


        if(filesHtml.length != filesWikitext.length){
            //return false;
        }

        for(int i=0; i<filesHtml.length ; i++){

            /*
            String htmlContent = FileUtils.readFileToString(filesHtml[i]);
            String wikitextContent = FileUtils.readFileToString(filesWikitext[i]);
            htmlContent = htmlContent.replaceAll("\\s", "");
            wikitextContent = wikitextContent.replaceAll("\\s", "");
            htmlContent = htmlContent.replaceAll(",", "");
            wikitextContent = wikitextContent.replaceAll(",","");
            if(!(htmlContent.equals(wikitextContent))) {
                System.out.println("Je ne suis pas égal avec les String");
                return false;
            }
            else {
                System.out.println("Je suis égal avec les String");
            }

             */
            if(!(FileUtils.contentEquals(filesHtml[i],filesWikitext[i]))){
                System.out.println("Je ne suis pas égal avec les files");
                return false;
            }
            else {
                System.out.println("Je suis égal avec les files");

                //test push
                //test push2
                //test push 3 ???
            }

        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        System.out.println(wikiTextCompareToHtml2());
    }
}
