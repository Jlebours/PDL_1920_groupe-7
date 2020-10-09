package fr.istic.pdl1819_grp5;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class TestMain {
    private static boolean rateOfSuccessAux(File fileHTML, File fileWiki) throws IOException {
        if (!(FileUtils.contentEquals(fileHTML, fileWiki))) {
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
        File[] filesWikitext = fileWiki.listFiles();

        return successCount;
    }
        //for(int i=0; i<filesHtml.length ; i++){

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
            }

        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        System.out.println(wikiTextCompareToHtml2());
    }
}
