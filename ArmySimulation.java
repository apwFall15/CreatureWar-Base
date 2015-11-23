import java.util.ArrayList;
import java.util.Random;

/**
 * A class to create 2 armies of random creatures and cause them to fight.
 */
public class ArmySimulation
{
    // instance variables - replace the example below with your own
    private ArrayList<Creature> firstArmy = new ArrayList<Creature>();
    private ArrayList<Creature> secondArmy = new ArrayList<Creature>();
    private Random rand = new Random();
    private final int armySize = 20;
    
    public ArmySimulation()
    {
        generateNewArmies();
    }

    /**
     * method to create two armies of creates that will fight
     */
    public void generateNewArmies()
    {
        firstArmy = new ArrayList<Creature>();
        secondArmy = new ArrayList<Creature>();
        System.out.println("Generating new armies ... ");
        while (firstArmy.size() < this.armySize || secondArmy.size() < this.armySize){
            System.out.print("Adding a "); 
            firstArmy.add(randomCreature());
            System.out.print(" to Army 1\n");
            System.out.print("Adding a "); 
            secondArmy.add(randomCreature());
            System.out.print(" to Army 2\n");
        }       
    }
    
    /**
     * overloaded method to create two armies of creates that will fight
     * @param armySize - number of creatures to create for each army
     */
    public void generateNewArmies(int armySize)
    {
        if(armySize <= 0){
            System.out.println("ERROR: Please specify an army size greater than 0!");
            return;
        }
        
        firstArmy = new ArrayList<Creature>();
        secondArmy = new ArrayList<Creature>();
        
        System.out.println("Generating new armies ... ");
        while (firstArmy.size() < this.armySize || secondArmy.size() < this.armySize){
            System.out.print("Adding a "); 
            firstArmy.add(randomCreature());
            System.out.print(" to Army 1\n");
            System.out.print("Adding a "); 
            secondArmy.add(randomCreature());
            System.out.print(" to Army 2\n");
        }        
    }

    /**
     * pick a random creature and return it
     */
    public Creature randomCreature(){
        Creature newCreature;
        switch (rand.nextInt(4)){
            case 0: newCreature = new Human();
                    break;
            case 1: newCreature = new Elf();
                    break;
            case 2: newCreature = new Balrog();
                    break;
            case 3: newCreature = new Cyberdemon();
                    break;
            default: newCreature = new Human();
                    break;
        }
        System.out.print(newCreature.getCreatureName());
        return newCreature;
    }
    
    /**
     * Cause the two armies to battle until one is destroyed.
     */
    public void RunSimulation(){
        if(firstArmy.size() <= 0 || secondArmy.size() <= 0){
            System.out.println("There aren't enough troops to fight! Create new armies!");
            return;
        }
        
        while(firstArmy.size() > 0 && secondArmy.size() > 0){
            int incomingDamage = firstArmy.get(firstArmy.size()-1).damage();
            String attackerType = firstArmy.get(firstArmy.size()-1).getCreatureName();
            String victimType = secondArmy.get(secondArmy.size()-1).getCreatureName();
            if(secondArmy.get(secondArmy.size()-1).takeDamage(incomingDamage)){
                System.out.println("Army 1's " + attackerType + " deals " + incomingDamage + 
                                   " damage to Army 2's " + victimType + " and kills it!");
                secondArmy.remove(secondArmy.size()-1);
            }else{
                System.out.println("Army 1's " + attackerType + " deals " + incomingDamage + 
                                   " damage to Army 2's " + victimType + ", leaving it with " + 
                                   secondArmy.get(secondArmy.size()-1).getHP() + " hp!");
            }
            //check to see if army 2 wasn't finished after that attack, if so, do nothing
            if(secondArmy.size()>0){
                incomingDamage = secondArmy.get(secondArmy.size()-1).damage();
                attackerType = secondArmy.get(secondArmy.size()-1).getCreatureName();
                victimType = firstArmy.get(firstArmy.size()-1).getCreatureName();
                if(firstArmy.get(firstArmy.size()-1).takeDamage(incomingDamage)){
                    System.out.println("Army 2's " + attackerType + " deals " + incomingDamage + 
                                       " damage to Army 1's " + victimType + " and kills it!");
                    firstArmy.remove(firstArmy.size()-1);
                }else{
                    System.out.println("Army 2's " + attackerType + " deals " + incomingDamage + 
                                       " damage to Army 1's " + victimType + ", leaving it with " + 
                                       secondArmy.get(secondArmy.size()-1).getHP() + " hp!");
                }
            }
        }
        String victoryString;
        victoryString = firstArmy.size() > 0 ? "Army 1 was victorious! There were " + firstArmy.size() + " creatures left alive in its ranks!" :
                             "Army 2 was victorious! There were " + secondArmy.size() + " creatures left alive in its ranks!";
        System.out.println(victoryString);
    }
}
