package reader.criteria;
 
public class Not implements Criterion {
 
    private Criterion crit;
     
    public Not(Criterion c) {
        this.crit = c;
    }
     
    @Override
    public boolean complies(String line) {
        return !something.complies(line);
    }
     
}
