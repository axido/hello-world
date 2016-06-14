package reader.criteria;

public class AtLeastOne implements Criterion {
 
    private Criterion[] crit;
     
    public AtLeastOne(Criterion... crit) {
        this.crit = crit;
    }
     
    @Override 
    public boolean complies(String line) {
        for (Criterion criterion : crit) {
            if (criterion.complies(line)) {
                return true;
            }
        }
 
        return false;
    }
     
}
