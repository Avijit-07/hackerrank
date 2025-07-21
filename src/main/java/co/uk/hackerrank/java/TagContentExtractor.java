package co.uk.hackerrank.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {

    public static void main(String[] args) {
        String s = "<h1>Nayeem loves counseling</h1>";
        tagExtractor(s);
    }

    private static void tagExtractor(String line){

        boolean matchFound = false;

        Pattern r = Pattern.compile("<(.+)>([^<]+)</\\1>");
        Matcher matcher = r.matcher(line);

        while(matcher.find()){
            System.out.println(matcher.group(2));
            matchFound = true;
        }

        if(!matchFound){
            System.out.println("None");
        }

    }
}
