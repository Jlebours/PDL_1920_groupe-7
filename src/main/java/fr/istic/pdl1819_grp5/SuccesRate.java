package fr.istic.pdl1819_grp5;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class SuccesRate {
    private static boolean rateOfSuccessAux(File fileHTML, File fileWiki) throws IOException {
       // if (!(FileUtils.contentEquals(fileHTML, fileWiki))) {
        String htmlContent = FileUtils.readFileToString(fileHTML);
        String wikitextContent = FileUtils.readFileToString(fileWiki);
        htmlContent = htmlContent.replaceAll("\\s", "");
        wikitextContent = wikitextContent.replaceAll("\\s", "");
        htmlContent = htmlContent.replaceAll(",", "");
        wikitextContent = wikitextContent.replaceAll(",","");
        if(!(htmlContent.equals(wikitextContent))) {
            return false;
        } else {
            return true;
        }
    }

    private static int rateOfSuccess () throws IOException {
        int successCount = 0;
        File fileHtml = new File("output\\html");
        File fileWiki = new File("output\\wikitext");
        File[] filesHtml = fileHtml.listFiles();
        System.out.println(filesHtml.length);
        File[] filesWikitext = fileWiki.listFiles();
        System.out.println(filesWikitext.length);
        for(int i=0; i<filesHtml.length; i++){
            //System.out.println("je suis i = " + i);
            for(int j=0; j<filesWikitext.length; j++) {
                //System.out.println("je suis j = " + j);
                if(rateOfSuccessAux(filesHtml[i],filesWikitext[j])) {
                    successCount++;
                    System.out.println(successCount);
                }
            }
        }
        return successCount;
    }


    public static void main(String[] args) throws IOException {
        System.out.println(rateOfSuccess());

    }
}
