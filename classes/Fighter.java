
package classes;

import java.io.IOException;
import javafx.scene.image.Image;
import rpg.Global;

public class Fighter extends PlayerClass {
    
    public static int fighterCounter = 0;
    
    public static String classText = "The Fighter is a class that always strike his oppoent with precicion. His blows aim the enemy's vital parts in order to cause critical damage.";
    
    public Fighter(){
        
        name = "Fighter";
        mainStat = "Might";
        
        ability1 = "Strike";
        ability2 = "Break Defenses";
        ability3 = "Critical Blow";
        ability4 = "Find Weakness";
        
        ability1ToolTip = "Basic Attack.";
        ability2ToolTip = "Deal damage. In addition your target's Armor is reduced by 20% for 2 turns.";
        ability3ToolTip = "Deal damage. Critical hits with this ability cause 300% damage instead of 200%.";
        ability4ToolTip = "Passive: Your Critical Chance is increased by 20%.";
        
        ability2CD = 2;
        ability3CD = 2;
        ability4CD = -1;
        
        ability2CDCounter = 2;
        ability3CDCounter = 2;
        ability4CDCounter = 0;
        
        ability2ManaCost = 30;
        ability3ManaCost = 40;
        
    }
    
    @Override
    public int ability1(){
        
        
        return Global.player.basicDamage;
        
    }
    
    @Override
    public int ability2(){
        
        Global.player.target.enemyArmor -= Global.player.target.enemyArmor * 20 / 100;
        
        ability2CDCounter = 0;
        return Global.player.basicDamage + 5;
        
    }
    
    @Override
    public int ability3(){
        
        ability3CDCounter = 0;
        return Global.player.basicDamage + 10;
        
    }
    
    @Override
    public int ability4(){
                
        if(Global.player.level == 2 && fighterCounter == 0){
            Global.player.criticalHitChance += 20;
            fighterCounter++;
        }
        
        return 0;
    }
    
    
    @Override
    public void endOfCombatPassives(){
        
        ability4();
        
    }
    
    @Override
    public void loadImage() throws IOException{
        
        classImage = new Image("imgs\\playerImgs\\fighter.jpg");
        
    }
}
