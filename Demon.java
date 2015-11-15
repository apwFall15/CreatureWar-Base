import java.util.Random;

/**
 * A classification of creature with high health and strength and a chance to do extra damage on each attack
 * 
 * @author Andrew Worthington
 * @version 10.14.15
 */
public class Demon extends Creature
{
    private Random rand = new Random();
    private final int HPModifier = 30;
    private final int STRModifier = 18;
    private final int CRITDamage = 50;
    private final double CRITChance = .05;
    private int numAttacks = 1;

    /**
     * Constructor for Demon, a type of creature
     */
    public Demon()
    {
        super();
        setHP(rand.nextInt(HPModifier)+minHP);
        setSTR(rand.nextInt(STRModifier)+minSTR);
    }
    
    public int critRoll(){
        int dmg = 0;
        if(rand.nextDouble() <= CRITChance)
            dmg = CRITDamage;
        return dmg;
    }
    
    public int doAttack(){
        int dmg = 0;
        dmg += rand.nextInt(getSTR())+1;
        dmg += critRoll();
        System.out.println("The creature attacks for " + dmg + " damage!");
        return dmg;
    }
    
    /**
     * the creature's attack phase
     */
    public int damage(){
        int dmg = 0;
        int attacks = 0;
        while(attacks < this.numAttacks){
            dmg += doAttack();
            attacks++;
        }
        return dmg;
        
    }
    
    public void setNumAttacks(int numAttacks){
        this.numAttacks = numAttacks;
    }
    
}
