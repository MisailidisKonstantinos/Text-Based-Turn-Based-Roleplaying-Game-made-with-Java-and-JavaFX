
package quests;

import items.Item;
import java.util.ArrayList;
import rpg.Global;

public class Quest {
    
    public String name;
    public int awardedXP;
    public int awardedGold;
    
//    public ArrayList<Item> awardedItems = new ArrayList();  for future use
    Item awardedItem;
    
    public int requirements;
    public String type;
    public String enemyName;
    public String progressionType;
    
    public boolean activated;
    public boolean finished;
    
    public String questText;
    
    
    public void onCompletion(){
              
        Global.player.exp += awardedXP;
        Global.player.playerGold += awardedGold;
        
        if(awardedItem != null){
            
            Global.player.bag.add(awardedItem);

        }
            
        Global.player.quest = null;
            
        if(progressionType.equals("Quest")){
                
                progressQuestline();
                
            }
            else if(progressionType.equals("Subzone")){
                
                progressSubzone();
                
            }
            else if(progressionType.equals("Zone")){
                
                progressZone();
                
            }
            
            System.out.println("Quest Completed");
    }
    
    
    
    public void progressQuestline(){
        Global.player.currentQuest++;
        Global.player.questCounter = 0;
    }
    
    public void progressSubzone(){
        
        Global.player.currentQuest = 0;
        Global.player.questCounter = 0;
        Global.player.currentSubZone++;
            
    }
    
    public void progressZone(){
        
        Global.player.currentQuest = 0;
        Global.player.questCounter = 0;
        Global.player.currentSubZone = 0;
        Global.player.currentZone++;
        
    }
}
