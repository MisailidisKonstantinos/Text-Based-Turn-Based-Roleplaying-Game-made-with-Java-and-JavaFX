
package classes;

import java.io.IOException;
import javafx.scene.image.Image;
import rpg.Global;

public class Brawler extends PlayerClass{
    
    public static int brawlerCounter = 0;
    
    public static String classText = "The fists of a Brawler are as, if not more, dangerous than the sharpest sword. His experience in hand to hand combat turned him into an unstoppable killing machine.";

    public Brawler(){
        
        name = "Brawler";
        mainStat = "Might";
        
        ability1 = "Punch";
        ability2 = "Uppercut";
        ability3 = "Knock Out";
        ability4 = "Willbreaker";
        
        ability1ToolTip = "Basic attack.";
        ability2ToolTip = "Deal damage. In addition your Hit Chance is increased by 20% for 1 turn.";
        ability3ToolTip = "Deal damage. In addition your target is stunned for 1 turn.";
        ability4ToolTip = "Deal damage. If the target is stunned this deals 150% damage instead (300% on critical hits).";
        
        ability2CD = 2;
        ability3CD = 4;
        ability4CD = 2;
        
        ability2CDCounter = 2;
        ability3CDCounter = 4;
        ability4CDCounter = 2;
    }
    
    @Override
    public int ability1(){
        
        resetHitChance();
        
        return Global.player.basicDamage;
        
    }
    
    @Override
    public int ability2(){
        
        Global.player.extraHitChance += 20;
        brawlerCounter = 1;
        ability2CDCounter = 0;
        return Global.player.basicDamage;
        
    }
    
    @Override
    public int ability3(){
        
        Global.player.target.stunned = true;
        Global.player.target.stunDuration = 2;
        
        resetHitChance();
        ability3CDCounter = 0;
        
        return Global.player.basicDamage;
    }
    
    @Override
    public int ability4(){
        
        int damage = Global.player.basicDamage;
        
        if(Global.player.target.stunned == true){
            damage += Global.player.basicDamage * 50/100;
        }
        
        resetHitChance();
        ability4CDCounter = 0;
        
        return damage;
    }
    
    public static void resetHitChance(){
        if(brawlerCounter == 1){
            brawlerCounter = 0;
            Global.player.extraHitChance -= 20;
        }
    }
    
    @Override
    public void loadImage() throws IOException{
        
        classImage = new Image("imgs\\playerImgs\\brawler.jpg");
        
    }
}
