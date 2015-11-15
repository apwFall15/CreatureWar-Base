import java.util.Random;

/**
 * The main class of a character in creature war
 * 
 * @author Andrew Worthington
 * @version 10.14.15
 */
public class Creature
{
   private int hp;
   private int strength;
   public static final int minHP = 5;
   public static final int minSTR = 5;
   private Random rand = new Random();
   
   public Creature(){
       this.hp = 10;
       this.strength = 10;
   }
    
   public int damage(){
       return rand.nextInt(this.strength)+1;
    }
    
   public int getHP(){
       return this.hp;
   }
   
   public void setHP(int hp){
       this.hp = hp;
   }
   
   public void setSTR(int str){
       this.strength = str;
   }
   
   public int getSTR(){
       return this.strength;
   }
}
