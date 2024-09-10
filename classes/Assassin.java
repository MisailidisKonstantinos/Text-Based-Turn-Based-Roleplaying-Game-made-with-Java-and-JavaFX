
package classes;

import java.io.IOException;
import javafx.scene.image.Image;
import rpg.Global;

public class Assassin extends PlayerClass{
    
    public static int smokeBombCounter = 2;
    public static boolean smokeBomb = false;
    
    public static int throughTheShadowsFactor = 1;
    public static int throughTheShadowsCounter = 2;
    
    public static String classText = "An Assassin is always fast and agile. His quick movements make him hard to hit while being able to strike his opponents even quicker.";

    public Assassin(){
        
        name = "Assassin";
        mainStat = "Agility";
        
        ability1 = "Stab";
        ability2 = "Quick Combo";
        ability3 = "Smoke Bomb";
        ability4 = "Through the Shadows";
        
        ability1ToolTip = "Basic attack";
        ability2ToolTip = "Passive: When you dodge your targets attack you Stab your opponent. This ability cannot be dodged.";
        ability3ToolTip = "Increase your Dodge Chance by 20% for 2 turns.";
        ability4ToolTip = "For your next 3 turns your Stab cannot be dodged, it ignores your target's armor and deals double damage.";
        
        ability2CD = -1;
        ability3CD = 3;
        ability4CD = 5;
        
        ability2CDCounter = 0;
        ability3CDCounter = 3;
        ability4CDCounter = 5;
    }
    
    @Override
    public int ability1(){
        
        return Global.player.basicDamage * throughTheShadowsFactor;
        
    }
    
    @Override
    public int ability2(){
        
        return Global.player.basicDamage * throughTheShadowsFactor;
        
    }
    
    @Override
    public int ability3(){
        
        smokeBomb = true;
        smokeBombCounter = 0;
        Global.player.dodgeChance += 20;
        
        ability3CDCounter = 0;
        
        return 0;
    }
    
    @Override
    public int ability4(){
        
        throughTheShadowsFactor = 2;
        throughTheShadowsCounter = 0;
        
        ability4CDCounter = 0;
        
        return 0;
    }
    
    
    @Override
    public void endOfTurnPassives(){
        if(smokeBomb == true){
            if(smokeBombCounter < 2){
                smokeBombCounter ++;
            }
            else{
                Global.player.dodgeChance -= 20;
                smokeBomb = false;
            }
            System.out.println(Global.player.dodgeChance);
        }

        if(throughTheShadowsCounter < 2){
            throughTheShadowsCounter ++;
        }
        else{
            throughTheShadowsFactor = 1;
        }            
    }
    
    @Override
    public void loadImage() throws IOException{
        
        classImage = new Image("imgs\\playerImgs\\assassin.jpeg");
        
    }
}
