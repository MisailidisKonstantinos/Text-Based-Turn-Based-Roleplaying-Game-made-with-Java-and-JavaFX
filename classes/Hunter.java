
package classes;

import java.io.IOException;
import javafx.scene.image.Image;
import rpg.Global;

public class Hunter extends PlayerClass{
    
    public static String classText = "As a master of guns the Gunslinger fires his pistol towards his opponents and almost always he succeeds. He is calm and steady, but also quite out of control while damaged.";
    
    public Hunter(){
        
        name = "Hunter";
        mainStat = "Agility";
        
        ability1 = "Shoot";
        ability2 = "Headshot";
        ability3 = "Warning Shot";
        ability4 = "Desperate Barrage";
        
        ability1ToolTip = "Basic attack.";
        ability2ToolTip = "Deal damage. This ability has 50% increased chance to Critically hit.";
        ability3ToolTip = "Your target's attack deal 50% less damage on his next turn.";
        ability4ToolTip = "Deal damage to your target based on your missing health.";
        
        ability2CD = 2;
        ability3CD = 3;
        ability4CD = 4;
        
        ability2CDCounter = 2;
        ability3CDCounter = 3;
        ability4CDCounter = 4;
    }
    
    public static int PistolShot(){
        
        return Global.player.basicDamage;
        
    }
    
    public void Headshot(){
        
        ability2CDCounter = 0;
        
    }
    
    public void WarningShot(){
        
        ability3CDCounter = 0;
        
    }
    
    public void DesperateBarrage(){
        
        ability4CDCounter = 0;
        
    }
    
    @Override
    public void loadImage() throws IOException{
        
        classImage = new Image("imgs\\playerImgs\\hunter.jpeg");
        
    }
}
