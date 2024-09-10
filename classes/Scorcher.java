
package classes;

import java.io.IOException;
import javafx.scene.image.Image;
import rpg.Global;

public class Scorcher extends PlayerClass{
    
    public static int stacks = 0;
    
    public static String classText = "A wizard that specialiazes in the use of fire in order to destroy his enemies. A Scorcher slowly burns his opponents through his abilities by dealing bonus damage at the end of his turn.";
    
    public Scorcher(){
        
        name = "Scorcher";
        mainStat = "Intelligence";
        
        ability1 = "Bolt of Fire";
        ability2 = "Ignite Wounds";
        ability3 = "Melt The Brain";
        ability4 = "Burst";
        
        ability1ToolTip = "Basic attack. In addition you gain 1 stack of Burning Wound.";
        ability2ToolTip = "Passive: At the end of your targets turn your target recieve damage equal to the number of Burning Wound stacks x2.";
        ability3ToolTip = "Remove y Burning Wound stacks from your target and stun him for x turns. 3 stacks = 2 turns, 2 stacks = 1 turn. If your stacks are lower than two you gain 2 Burning Wound stacks.";
        ability4ToolTip = "Deal damage equal to the number of your Burning Wound stacks x5";
        
        ability2CD = -1;
        ability3CD = 2;
        
        ability2CDCounter = 0;
        ability3CDCounter = 2;
    }
    
    @Override
    public int ability1(){
        
        stacks++;
        System.out.println(stacks);
        return Global.player.basicDamage;
        
    }
    
    @Override
    public int ability2(){
        
        System.out.println(stacks * 2);
        return stacks * 2;
    }
    
    @Override
    public int ability3(){
        
        if(stacks >= 3){
            stacks -= 3;
            Global.player.target.stunned = true;
            Global.player.target.stunDuration = 2;
        }
        else if(stacks == 2){
            stacks -= 2;
            Global.player.target.stunned = true;
            Global.player.target.stunDuration = 1;
        }
        else{
            stacks += 2;
        }
        
        ability3CDCounter = 0;
        
        return 0;
    }
    
    @Override
    public int ability4(){
        
        int damage = stacks * 5;
        stacks = 0;
        return damage;
    }
    
    @Override
    public void endOfTurnPassives(){
     
        Global.player.target.enemyCurrentHealth -= ability2();
        
    }
    
    @Override
    public void endOfCombatPassives(){
        
        stacks = 0;
        
    }
    
    @Override
    public void loadImage() throws IOException{
        
        classImage = new Image("imgs\\playerImgs\\scorcher.jpg");
        
    }
    
}
