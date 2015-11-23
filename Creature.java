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
   private String creatureName;
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
   
   public void setCreatureName(String name){
       this.creatureName = name;
   }
   
   public String getCreatureName(){
       return this.creatureName;
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
   
   /**
    * calculate damage taken by the creature and determine if death occurrs
    */
   public boolean takeDamage(int dmg){
       boolean creatureDies = false;
       this.hp -= dmg;
       if (this.hp <= 0)
            creatureDies = true;       
       return creatureDies;
    }
}
