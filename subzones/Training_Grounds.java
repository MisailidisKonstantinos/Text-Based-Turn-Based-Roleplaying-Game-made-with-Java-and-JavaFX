
package subzones;

import enemies.Argon_The_Trainer;
import enemies.Trainee_Level_1;
import enemies.Trainee_Level_2;
import quests.Learning_The_Basics;
import quests.The_Final_Lesson;

public class Training_Grounds extends Subzones{
    
    public Training_Grounds(){
        
        name = "Training Grounds";
        
        enemies.add(new Trainee_Level_1());
        enemies.add(new Trainee_Level_2());
        enemies.add(new Argon_The_Trainer());
        
        quests.add(new Learning_The_Basics());
        quests.add(new The_Final_Lesson());
    }
    
}
