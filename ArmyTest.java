import java.util.ArrayList;

/**
 * A Test Class to verify creatures have the required attributes
 * 
 * @author Andrew Worthington
 * @version 10.14.15
 */
public class ArmyTest
{

    /**
     * Constructor for objects of class ArmyTest
     */
    public ArmyTest()
    {

    }

    /**
     * A test of the human class
     * @param numTests - number of humans to create
     * @param showStats - allows method to print out tested stats
     */
    public boolean testHuman(int numTests, boolean showStats)
    {
        if(numTests <= 0){
            System.out.println("No tests performed, bad parameters");
            return false;
        }
        boolean testPassed = true;
        ArrayList<Human> testArmy = new ArrayList<Human>();
        while(testArmy.size() < numTests){
            testArmy.add(new Human());
        }
        
        hpcheck:
        for(int count = 0; count < numTests; count++){
            Human testCase = testArmy.get(count);
            if(showStats)
                System.out.println("Human #" + (count+1) + " hp: " + testCase.getHP());
            if(testCase.getHP() < 5 || testCase.getHP() >30){
                testPassed = false;
                System.out.println("Found a human with HP out of range");
                break hpcheck;
            }
        } 
        
        strcheck:
        for(int count = 0; count < numTests; count++){
            Human testCase = testArmy.get(count);
            if(showStats)
                System.out.println("Human #" + (count+1) + " str: " + testCase.getSTR());
            if(testCase.getSTR() < 5 || testCase.getSTR() > 18){
                testPassed = false;
                System.out.println("Found a human with STR out of range");
                break strcheck;
            }
        }
        
        return testPassed;
    }
    
    /**
     * A test of the elf class, will check HP and STR, if showstats active, will run a combat
     * simulation to demonstrate the frequencey of its special attack characteristic
     * @param numTests - number of humans to create
     * @param showStats - allows method to print out tested stats
     */
    
    public boolean testElf(int numTests, boolean showStats)
    {
        if(numTests <= 0){
            System.out.println("No tests performed, bad parameters");
            return false;
        }
        boolean testPassed = true;
        ArrayList<Elf> testArmy = new ArrayList<Elf>();
        while(testArmy.size() < numTests){
            testArmy.add(new Elf());
        }
        
        hpcheck:
        for(int count = 0; count < numTests; count++){
            Elf testCase = testArmy.get(count);
            if(showStats)
                System.out.println("Elf #" + (count+1) + " hp: " + testCase.getHP());
            if(testCase.getHP() < 5 || testCase.getHP() >20){
                testPassed = false;
                System.out.println("Found a elf with HP out of range");
                break hpcheck;
            }
        } 
        
        strcheck:
        for(int count = 0; count < numTests; count++){
            Elf testCase = testArmy.get(count);
            if(showStats)
                System.out.println("Elf #" + (count+1) + " str: " + testCase.getSTR());
            if(testCase.getSTR() < 5 || testCase.getSTR() > 15){
                testPassed = false;
                System.out.println("Found a elf with STR out of range");
                break strcheck;
            }
        }
        
        if(showStats){
           System.out.println("Performing attack simulation:");
           int count = 0;
           while (count < numTests){
               System.out.println("An elf performs an attack and does "
               + testArmy.get(count).damage() + " damage!");
               count++;
            }
        }
        return testPassed;
    }
    
    /**
     * A test of the Balrog class, will check HP and STR, if showstats active, will run a combat
     * simulation to demonstrate the frequencey of its special attack characteristic
     * @param numTests - number of humans to create
     * @param showStats - allows method to print out tested stats
     */
     public boolean testBalrog(int numTests, boolean showStats)
    {
        if(numTests <= 0){
            System.out.println("No tests performed, bad parameters");
            return false;
        }
        boolean testPassed = true;
        ArrayList<Balrog> testArmy = new ArrayList<Balrog>();
        while(testArmy.size() < numTests){
            testArmy.add(new Balrog());
        }
        
        hpcheck:
        for(int count = 0; count < numTests; count++){
            Balrog testCase = testArmy.get(count);
            if(showStats)
                System.out.println("Balrog #" + (count+1) + " hp: " + testCase.getHP());
            if(testCase.getHP() < 5 || testCase.getHP() >35){
                testPassed = false;
                System.out.println("Found a Balrog with HP out of range");
                break hpcheck;
            }
        } 
        
        strcheck:
        for(int count = 0; count < numTests; count++){
            Balrog testCase = testArmy.get(count);
            if(showStats)
                System.out.println("Balrog #" + (count+1) + " str: " + testCase.getSTR());
            if(testCase.getSTR() < 5 || testCase.getSTR() > 15){
                testPassed = false;
                System.out.println("Found a Balrog with STR out of range");
                break strcheck;
            }
        }
        
        if(showStats){
           System.out.println("Performing attack simulation:");
           int count = 0;
           while (count < numTests){
               System.out.println("An Balrog performs an attack and does "
               + testArmy.get(count).damage() + " damage!");
               count++;
            }
        }
        return testPassed;
    }
}
