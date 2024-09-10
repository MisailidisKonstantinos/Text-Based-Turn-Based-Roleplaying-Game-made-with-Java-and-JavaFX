
package subzones;

import enemies.Bandit_Beastmaster_Level_8;
import enemies.Bandit_Beastmaster_Level_9;
import enemies.Duncan_The_Warlord;
import enemies.Tamed_Wolf_Level_7;
import enemies.Tamed_Wolf_Level_8;
import quests.Slay_The_Masters;
import quests.Tamed_But_Still_Wild;
import quests.The_Bandit_Leader;

public class The_Treeline extends Subzones{
    
    public The_Treeline(){
        
        name = "The Treeline";
        
        enemies.add(new Tamed_Wolf_Level_7());
        enemies.add(new Tamed_Wolf_Level_8());
        enemies.add(new Bandit_Beastmaster_Level_8());
        enemies.add(new Bandit_Beastmaster_Level_9());
        enemies.add(new Duncan_The_Warlord());
        
        quests.add(new Tamed_But_Still_Wild());
        quests.add(new Slay_The_Masters());
        quests.add(new The_Bandit_Leader());
    }
    
}
