package reader;
 
import reader.criteria.*;
import reader.criteria.Criterion;
import reader.criteria.ContainsWord;

/**
 * @author axido
 * Filters lines of the book according to given criteria. They can also be combined.
 */
 
public class Main {
 
    public static void main(String[] args) {
    String address = "http://www.gutenberg.org/cache/epub/2554/pg2554.txt";
    GutenbergReader book = new GutenbergReader(address);
 
    Criterion criterion =new AtLeastOne(
                    new ContainsWord("beer"),
                    new ContainsWord("milk"),
                    new ContainsWord("oil")
                );
 
    for (String line : book.linesWhichComplyWith(criterion)) {
        System.out.println(line);
    }
 
    }
}
