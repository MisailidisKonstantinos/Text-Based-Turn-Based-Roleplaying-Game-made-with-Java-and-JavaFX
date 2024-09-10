
package subzones;

import enemies.Wolf_Den_Mother;
import enemies.Wolf_Level_3;
import enemies.Wolf_Level_4;
import quests.Gathering_Trophies;
import quests.The_Mother_Of_Wolves;
import quests.Thinning_The_Pack;

public class Wolf_Den extends Subzones{
    
    public Wolf_Den(){
        
        name = "Wolf Den";
        
        enemies.add(new Wolf_Level_3());
        enemies.add(new Wolf_Level_4());
        enemies.add(new Wolf_Den_Mother());
        
        quests.add(new Thinning_The_Pack());
        quests.add(new Gathering_Trophies());
        quests.add(new The_Mother_Of_Wolves());
        
    }
}
