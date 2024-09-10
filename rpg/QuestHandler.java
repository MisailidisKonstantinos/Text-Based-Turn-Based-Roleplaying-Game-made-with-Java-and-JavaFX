
package rpg;

import quests.Quest;

public class QuestHandler {
    
    Quest quest;
    
    public QuestHandler(Quest playerQuest){
        
        quest = playerQuest;
               
        killingQuest(quest.enemyName, quest.requirements, quest);
        
    }
    
    
    public void killingQuest(String enemyName, int requirements, Quest quest){
        
        if(Global.player.target.enemyName.equals(enemyName)){
            Global.player.questCounter++;
        }
        
        if(Global.player.questCounter == requirements){

            quest.onCompletion();
                       
        }
    }
    
    //notes!!!!
    //Θα εχω περισσοτερα counters στον player για quest που θελουν περισσοτερα απο ενα mob
       
}
