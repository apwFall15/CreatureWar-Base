import java.util.Random;

/**
 * A human character in creature war
 * 
 * @author Andrew Worthington
 * @version 10.14.15
 */
public class Human extends Creature
{
    private Random rand = new Random();
    private final int HPModifier = 26;
    private final int STRModifier = 14;

    /**
     * Constructor for Human, a type of creature
     */
    public Human()
    {
        super();
        setHP(rand.nextInt(HPModifier)+minHP);
        setSTR(rand.nextInt(STRModifier)+minSTR);
        this.setCreatureName("Human");
    }


}
