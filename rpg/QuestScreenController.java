
package rpg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import quests.Quest;

public class QuestScreenController implements Initializable {

    private Stage stage;
    private Scene scene;
    private Parent root;
    
    Quest quest;
    
    @FXML
    private Button back;
    @FXML
    private Button accept;
    @FXML
    private Label xp;
    @FXML
    private Label progression;
    @FXML
    private Label questName;
    @FXML
    private TextArea questText;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        if(Global.player.quest != null){
            quest = Global.player.quest;
            progression.setVisible(true);
            accept.setVisible(false);
        }
        else{
            quest = Global.zones.get(Global.player.currentZone).subzones.get(Global.player.currentSubZone).quests.get(Global.player.currentQuest);
            progression.setVisible(false);
            accept.setVisible(true);
        }
        
        
        questName.setText(quest.name);
        questText.setText(quest.questText);
        xp.setText(Integer.toString(quest.awardedXP));
        progression.setText(Integer.toString(Global.player.questCounter) + " / " + Integer.toString(quest.requirements));
        
        
    }
    
    public void back(ActionEvent event) throws Exception{
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("subzone.fxml"));
        Parent root = loader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();        
        scene = new Scene(root);
        stage.setTitle("Something");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
        
    }
    
    public void accept(ActionEvent event){
        
        Global.player.quest = quest;
        progression.setVisible(true);
        accept.setVisible(false);
        
    }
    
}
