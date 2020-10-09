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
        for(int i=0; i<filesHtml.length; i++){
            for(int j=0; j<filesWikitext.length; j++) {

                if(rateOfSuccessAux(filesHtml[i],filesWikitext[j])) {
                    successCount++;
                }
            }
        }
        return successCount;
    }


    public static void main(String[] args) throws IOException {
        System.out.println(rateOfSuccess());

    }
}
