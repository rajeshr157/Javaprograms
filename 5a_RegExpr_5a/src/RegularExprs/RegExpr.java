package RegularExprs;

import java.util.regex.*;

public class RegExpr {

    public static void main(String[] args) {
        // regex
        // pattern embeded within .* finds only first occurance
        // "(pattern)" finds all occurences and counts.

        // pattern.matches

        // regexr.com

        String text = "This is Kiran from sankir Technologies";
        String pattern1 = ".*sankir.*";
        String pattern2 = ".*sankiR.*";

        // directly apply pattern on text
        boolean isMatch = Pattern.matches(pattern1, text);
        System.out.println("1.Pattern Matches ex: \nText is :" + text + "\nDoes the text contains pattern 'sankir'?  \nAnswer is : " + isMatch);

        isMatch = Pattern.matches(pattern2, text);
        System.out.println("Does the text contains pattern 'sankiR'? \nAnswer is : " + isMatch);


        //    Pattern Split
        // Build the Pattern first and then apply on text
        String textspl = "MynameisKiran. @It@is@My@Website and at my hosting site. It is viewed @from_mY_office.";
        String pattern4 = "@";

        System.out.println("\n3.Pattern Split ex: \nText is : " + textspl);
        System.out.println("Pattern used to split is : " + pattern4);

        Pattern patternspl = Pattern.compile(pattern4);
        String[] myStrings = patternspl.split(textspl);
        for (String s : myStrings) {
            System.out.println(s);
        }
        System.out.println("Number of split strings: " + myStrings.length);


        //pattern build using Pattern class compile utility and
        // match using matcher class matches method
        String textcm = "This is Kiran from sankir.com.";
        String pattern3 = ".*saNKiR.*";

        // when compile method is used, it returns Matcher Object
        // matcher methods returns Matcher Object
        // Matcher Object has attributes and data/result needs to be found in that

        // Build pattern and apply on text using matcher
        Pattern patterncm = Pattern.compile(pattern3, Pattern.CASE_INSENSITIVE); // build pattern using compile utility
        Matcher matchercm = patterncm.matcher(textcm); //  use macther method - returns macther object
        boolean isMatched = matchercm.matches(); // use matches method - returns boolean
        System.out.println("\n2.Pattern Compile and Match ex: \nText is : " + textcm);
        System.out.println("Does the text contains pattern 'saNKir' - case insensitive ? \nAnswer is : " + isMatched);



        // pattern find; start and end
        // Build patterna dn apply thru matcher
        String textfind = "CCC DD XXPP BT KKK TXXXX YY";    //String textfind = "CCC BB PP BB KKK BBBB YY";
        String pattern5 = "XX";

        System.out.println("\n4.Pattern Find and Start & End ex: \nText is : " + textfind);
        System.out.println("Pattern to find is : " + pattern5);

        Pattern patternfind = Pattern.compile(pattern5, Pattern.CASE_INSENSITIVE);
        Matcher matcherfind = patternfind.matcher(textfind);

        while (matcherfind.find()) {
            System.out.println("Pattern Start - End found at: " + matcherfind.start() + " - " + matcherfind.end());
        }
    }
}
