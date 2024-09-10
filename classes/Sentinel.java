
package classes;

import java.io.IOException;
import javafx.scene.image.Image;
import rpg.Global;

public class Sentinel extends PlayerClass{
    
    public static int extraDamage = 0;
    public static int defense = 0;
    public static int usedDefenseGuardUp = 0;
    
    public static int usedDefenseDevastatingBlow = 0;
    
    public static boolean guardUp = false;
    public static int guardUpCounter = 0;
    
    public static String classText = "The Sentinel a warrior that is able to combine heavy gear alongside with speed. He is both swift and durable while in the meantime he uses his armor against his opponents.";
    
    public Sentinel(){
        
        name = "Sentinel";
        mainStat = "Speed";
        
        ability1 = "Slash";
        ability2 = "Toughen Up";
        ability3 = "Guard Up";
        ability4 = "Devastating Blow";
        
        ability1ToolTip = "Basic attack. In addition you gain 10 Defense (Max 100).";
        ability2ToolTip = "Passive: Your abilities gain extra damage based on your Armor.";
        ability3ToolTip = "Consume all your Defense to gain Armor equal to the consumed Defense /2.";
        ability4ToolTip = "Consume all your Defense to deal damage equal to the Comsumed Defense, plus your basic damage, plus your Armor.";
        
        ability2CD = -1;
        ability4CD = 3;
        
        ability2CDCounter = 0;
        ability4CDCounter = 3;
    }
    
    @Override
    public int ability1(){
        
        defense += 10;
        return Global.player.basicDamage + extraDamage;
        
    }
    
    @Override
    public int ability2(){
        
        extraDamage = Global.player.armor / 5;
        System.out.println(extraDamage);
        
        return 0;
    }
    
    @Override
    public int ability3(){
        
        guardUp = true;
        Global.player.armor += defense / 2;
        usedDefenseGuardUp = defense;
        defense = 0;
        
        return 0;
    }
    
    @Override
    public int ability4(){
        
        usedDefenseDevastatingBlow = defense;
        defense = 0;
        
        ability4CDCounter = 0;
        
        return Global.player.basicDamage + usedDefenseDevastatingBlow + Global.player.armor;
    }
    
    @Override
    public void buffingPassives(){
        
        ability2();
        
    }
    
    @Override
    public void endOfTurnPassives(){
        
        if(guardUp == true){
            if(guardUpCounter < 3){
                guardUpCounter ++;
            }
            else{
                Global.player.armor -= usedDefenseGuardUp / 2;
                guardUp = false;
            }
        }  
    }
    
    @Override
    public void loadImage() throws IOException{
        
        classImage = new Image("imgs\\playerImgs\\sentinel.png");
        
    }
    
}
