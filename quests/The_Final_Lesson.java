
package quests;

import items.weapons.Training_Sword;

public class The_Final_Lesson extends Quest{
    
    public The_Final_Lesson(){
        
        name = "The Final Lesson";
        awardedXP = 25;
        awardedGold = 15;
        
        awardedItem = new Training_Sword();
        
        requirements = 1;
        type = "Killing";
        enemyName = "Argon the Trainer";
        progressionType = "Subzone";
        
        activated = false;
        finished = false;
        
        questText = "What a display of strength and intelligence that was. Good job my friend. But now is the time for"
                + " the last and toughest part of your training. I am considered to be one of our most ferocious fighters."
                + " I want you to have a little sparring session with me. If you manage to defeat me I will allow you to"
                + " begin your own journey outside the walls of our camp with a couple of my friends as your followers, Istarlion the Wizard and Heirmstein. Please don't mention anything about his height... But don't be hasty. You can"
                + " stay here as much as you like. It's better to leave the camp when you are ready and strong rather than"
                + " dying in the forest.";
        
    }
    
}
