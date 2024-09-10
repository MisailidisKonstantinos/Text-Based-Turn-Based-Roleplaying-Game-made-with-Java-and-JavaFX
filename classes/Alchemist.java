
package classes;

import java.io.IOException;
import javafx.scene.image.Image;

public class Alchemist extends PlayerClass{
    
    public static String classText = "The Alchemist is a scientist which specializes in brewing potions. His abilities contain both healing through consuming potions of his making and damaging through the use of explosive potions and poisons.";
    public Alchemist(){
        
        name = "Alchemist";
        mainStat = "Intelligence";
        
        ability1 = "Explosive Potion";
        ability2 = "Healing Potion";
        ability3 = "Acidic Vial";
        ability4 = "Master Of Chemistry";
    }
    
    @Override
    public int ability1(){
        
        return 0;
        
    }
    
    @Override
    public int ability2(){
        
        return 0;
        
    }
    
    @Override
    public int ability3(){
        
        return 0;
        
    }
    
    @Override
    public int ability4(){
        
        return 0;
        
    }
    
    @Override
    public void loadImage() throws IOException{
        
        classImage = new Image("imgs\\playerImgs\\alchemist.jpeg");
        
    }
    
}
