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
    private final int HPModifier = 16;
    private final int STRModifier = 11;
    private final double DBLATKChance = .1;

    /**
     * Constructor for Elf, a type of creature
     */
    public Elf()
    {
        super();
        setHP(rand.nextInt(HPModifier)+minHP);
        setSTR(rand.nextInt(STRModifier)+minSTR);
        this.setCreatureName("Elf");
    }
    
    public int doAttack(){
        return rand.nextInt(getSTR())+1;
    }
    
    public int damage(){
        int dmg = 0;
        dmg += doAttack();
        if(rand.nextDouble() <= DBLATKChance)
            dmg *= 2;
        return dmg;
        
    }
}
