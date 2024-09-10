
package classes;

import javafx.scene.image.Image;

public class PlayerClass {
    
    public String name;
    public String mainStat;
    
    public String ability1;
    public String ability2;
    public String ability3;
    public String ability4;
    
    public String ability1ToolTip;
    public String ability2ToolTip;
    public String ability3ToolTip;
    public String ability4ToolTip;
    
    public int ability1CD;
    public int ability2CD;
    public int ability3CD;
    public int ability4CD;
    
    public int ability1CDCounter;
    public int ability2CDCounter;
    public int ability3CDCounter;
    public int ability4CDCounter;
    
    public int ability1ManaCost;
    public int ability2ManaCost;
    public int ability3ManaCost;
    public int ability4ManaCost;
    
    public Image classImage;
    
    public static String classText;
    
    public int ability1(){
        return 0;
    }
    
    public int ability2(){
        return 0;
    }
    
    public int ability3(){
        return 0;
    }
    
    public int ability4(){
        return 0;
    }
    
    public void buffingPassives(){
        
    }
    
    public void endOfTurnPassives(){
        
    }
    
    public void endOfCombatPassives(){
        
    }
    
    public void loadImage() throws Exception{
        
    }
}
