import java.util.Random;

/**
 * A human character in creature war
 * 
 * @author Andrew Worthington
 * @version 10.14.15
 */
public class Elf extends Creature
{
    private Random rand = new Random();
    private final int HPModifier = 15;
    private final int STRModifier = 10;

    /**
     * Constructor for Elf, a type of creature
     */
    public Elf()
    {
        super();
        setHP(rand.nextInt(HPModifier)+minHP);
        setSTR(rand.nextInt(STRModifier)+minSTR);
    }
    
    public int damage(){
        int dmg = 0;
        dmg += rand.nextInt(getSTR())+1;
        System.out.println(dmg);
        dmg *=(((rand.nextInt(10)+1)/10)+1); 
        System.out.println(dmg);
        return dmg;
        
    }
}