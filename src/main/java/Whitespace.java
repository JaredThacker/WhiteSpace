import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Whitespace {

    public static void main(String[] args) throws IOException {
        Whitespace wspc = new Whitespace();

        // for each file "testdata{1,2,3}.txt
        // read in all the text and
        // send it to countBoth


        wspc.countBoth("a b c d e"); // should print 4, 5

    }

    private void countBoth(String testdata) {

        Pattern p = Pattern.compile("\\s");
        Matcher m = p.matcher(testdata);
        long whiteSpaceCount = m.results().count();

        Pattern p2 = Pattern.compile("\\S");
        Matcher m2 = p2.matcher(testdata);
        long nonWhiteSpace = m2.results().count();

        // count the number of whitespace chars and non-whitespace chars.
        // need to use a FOR loop.
        // print the results simply on a line #whitespaces, #ofnonwhitespacechars for each file.

        System.out.printf("%d, %d\n",whiteSpaceCount, nonWhiteSpace );
    }


    // what you CANNOT do is use `Character.isWhitespace()`
    // you have to "write your own" by checking the char against what you think is whitespace
    // you should also USE a FOR loop to step thru each char in the String.
//    private void cannotDoThis(String input) {
//        long wspc = input.chars()
//                .mapToObj(a -> (char) a)
//                .filter(c -> Character.isWhitespace(c)).count();
//        long nwpsc = input.chars()
//                .mapToObj(a -> (char) a)
//                .filter(c -> !Character.isWhitespace(new Character(c))).count();
//
//        System.out.printf("%d, %d\n", wspc, nwpsc);
//    }
}
