
package classes;

import java.io.IOException;
import javafx.scene.image.Image;
import rpg.Global;

public class Berserker extends PlayerClass{
    
    public static int berserkerCounter = 0;
    public static int berserkerStacks = 0;
    public static int unkillableCounter = 0;
    
    public static boolean unkillable = false;
    
    public static String classText = "A Berserker is always feared by his opponents. He loves to be a part of glorious battles and continuously get stronger while fighting.";
    
    public Berserker(){
        
        name = "Berserker";
        mainStat = "Might";
        
        ability1 = "Bash";
        ability2 = "Rage";
        ability3 = "Frenzy";
        ability4 = "Unkillable";
        
        ability1ToolTip = "Basic attack.";
        ability2ToolTip = "Passive: At the end of your turn gain a stack of Rage. Each stack increases the damage of your abilities by 2%.";
        ability3ToolTip = "Deal damage. In addition you are healed equal to your number of Rage stacks x2.";
        ability4ToolTip = "Passive: If your Health is reduced to 0, it instead is changed to 1 for 2 turns. Usable once per combat.";
        
        ability2CD = -1;
        ability3CD = 2;
        ability4CD = -1;
        
        ability2CDCounter = 0;
        ability3CDCounter = 2;
        ability4CDCounter = 0;
    }
    
    @Override
    public int ability1(){
        
        return (Global.player.basicDamage + Global.player.basicDamage * berserkerStacks * 10 / 100);
        
    }
    
    @Override
    public int ability2(){
        
        berserkerStacks += 1;
        
        return 0;
    }
    
    @Override
    public int ability3(){
        
        Global.player.currentHealth += 2 * berserkerStacks;
        
        if(Global.player.currentHealth > Global.player.startingHealth){
            Global.player.currentHealth = Global.player.startingHealth;
        }
        
        ability3CDCounter = 0;
        
        return Global.player.basicDamage + Global.player.basicDamage * berserkerStacks * 10 / 100;
    }
    
    @Override
    public int ability4(){
        
        unkillable = true;
        
        return 0;
    }
    
    @Override
    public void endOfTurnPassives(){
        
        ability2();
        System.out.println(Berserker.berserkerStacks);
        
    }
    
    @Override
    public void endOfCombatPassives(){
        
        berserkerStacks = 0;
        
    }
    
    @Override
    public void loadImage() throws IOException{
        
        classImage = new Image("imgs\\playerImgs\\berserker.jpg");
        
    }
    
}
