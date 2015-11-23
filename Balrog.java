import java.util.Random;

/**
 * A Demon class creature which always attacks twice
 * 
 * @author Andrew Worthington
 * @version 10.14.15
 */
public class Balrog extends Demon
{
        
    /**
     * Constructor for objects of class Balrog, which has the properties of a Demon 
     * but attacks twice
     */
    public Balrog()
    {
        super();
        this.setCreatureName("Balrog");
        setNumAttacks(2);
    }

}
