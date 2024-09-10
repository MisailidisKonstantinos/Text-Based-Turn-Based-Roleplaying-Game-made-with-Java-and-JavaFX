
package classes;

import java.io.IOException;
import javafx.scene.image.Image;
import rpg.Global;

public class Necromancer extends PlayerClass{
     
    public static int souls = 0;
    
    public static String classText = "The Necromancer is a dark wizard that uses the souls of his victims to increase his magical power. With every kill the Necromancer claims the soul of his deceased opponent.";
    
    public Necromancer(){
        
        name = "Necromancer";
        mainStat = "Intelligence";
        
        ability1 = "Suffer";
        ability2 = "Essense of Death";
        ability3 = "Siphon Soul";
        ability4 = "Reaper of Souls";
        
        ability1ToolTip = "Basic attack.";
        ability2ToolTip = "Passive: After you win a combat gain 1 Soul stack. At 4 Soul stacks you gain 1 Intelligence. Level difference with your target must be less than 3 if your level is greater than your targets.";
        ability3ToolTip = "Deal damage. In addition you are healed for the amount of damage you dealt. If this ability kills your target gain 1 Soul stack.";
        ability4ToolTip = "Deal damage equal to the number of Soul stack enchanced by your Intelligence.";
        
        ability2CD = -1;
        ability3CD = 2;
        ability4CD = 5;
        
        ability2CDCounter = 0;
        ability3CDCounter = 2;
        ability4CDCounter = 5;
    }
    
    @Override
    public int ability1(){
        
        return Global.player.basicDamage;
        
    }
    
    @Override
    public int ability2(){
        if(Global.player.level - Global.player.target.enemyLevel < 2){
            souls ++;
            System.out.println(souls);
        }
               
        if(souls % 4 == 0){
            Global.player.intelligence ++;
        }
        
        return 0;
    }
    
    @Override
    public int ability3(){
        
        Global.player.currentHealth += Global.player.basicDamage;
        
        if(Global.player.basicDamage >= Global.player.target.enemyCurrentHealth){
            souls ++;
        }
        
        ability3CDCounter = 0;
        
        return Global.player.basicDamage;
    }
    
    @Override
    public int ability4(){
        
        ability4CDCounter = 0;
        
        return souls * Global.player.intelligence;
    }
    
    @Override
    public void loadImage() throws IOException{
        
        classImage = new Image("imgs\\playerImgs\\necromancer.jpeg");
        
    }
}
