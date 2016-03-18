/*
 * A Bird class to make birds for the database.
 * 
 */

/**
 *
 * @author axido
 */
public class Bird {
    private String name;
    private String latin;
    private int observations;
    
    public Bird(String name, String latin) {
        this.name = name;
        this.latin = latin;
        this.observations = 0;
    }
    
    private void addLatin(String latin) {
        this.latin = latin;
    }
    
    public String name() {
        return this.name;
    }
    
    public String latin() {
        return this.latin;
    }
    
    public int getObservations() {
        return this.observations;
    }
    
    public void observe() {
        this.observations++;
    }
    
}
