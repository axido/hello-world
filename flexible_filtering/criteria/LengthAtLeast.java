package reader.criteria;

public class LengthAtLeast implements Criterion{
     
    int minLength;
     
    public LengthAtLeast(int length) {
        this.minLength = length;
    }
 
    @Override
    public boolean complies(String line) {
        return line.length() >= minLength;
    }
     
}
