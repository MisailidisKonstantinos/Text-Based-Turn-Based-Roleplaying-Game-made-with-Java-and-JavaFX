
package subzones;

import enemies.Bandit_Cutthroat_Level_5;
import enemies.Bandit_Cutthroat_Level_6;
import enemies.Bandit_Smuggler_Level_6;
import enemies.Bandit_Smuggler_Level_7;
import quests.Smuggling_The_Smugglers;
import quests.The_Bandit_Problem;

public class The_Abandoned_Road extends Subzones{
    
    public The_Abandoned_Road(){
        
        name = "The Abandoned Road";
        
        enemies.add(new Bandit_Cutthroat_Level_5());
        enemies.add(new Bandit_Cutthroat_Level_6());
        enemies.add(new Bandit_Smuggler_Level_6());
        enemies.add(new Bandit_Smuggler_Level_7());
        
        quests.add(new The_Bandit_Problem());
        quests.add(new Smuggling_The_Smugglers());
    }
}
