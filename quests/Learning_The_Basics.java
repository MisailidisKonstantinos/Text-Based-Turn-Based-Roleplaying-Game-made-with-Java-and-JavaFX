
package quests;

public class Learning_The_Basics extends Quest{
    
    public Learning_The_Basics(){
        
        name = "Learning The Basics";
        awardedXP = 20;
        awardedGold = 10;
        
        requirements = 6;
        type = "Killing";
        enemyName = "Trainee";
        progressionType = "Quest";
        
        activated = false;
        finished = false;
        
        questText = "So you are one of the new recruits? I'm obliged to say that I consider you an extremely promising"
                + " addition to our troops. To continue with your training I need to see you spar against some of your"
                + " fellow recruits. Once you defeat 6 of them come speak with me again to assign your next task."
                + " Please keep those duel friendly, there is no need to have our recruits getting injured... again...";
        
    }
    
}
