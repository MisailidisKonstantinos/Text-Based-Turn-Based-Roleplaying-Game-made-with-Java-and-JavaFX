
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
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class CharacterSheetController implements Initializable {

    private Stage stage;
    private Scene scene;
    private Parent root;
    
    @FXML
    private Label name;
    @FXML
    private Label sheet;
    @FXML
    private Label stats;
    @FXML
    private Button back;
    
    @FXML
    private ImageView playerImg;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        name.setText(Global.player.name);
        
        sheet.setText("Level :\n");
        stats.setText(Global.player.level + "\n");

        for(int i = 0; i < Global.primaryStatsList.size(); i++){
            sheet.setText(sheet.getText() + Global.primaryStatsList.get(i) + " :\n");
            
        }
        
        
        
        for(int i = 0; i < Global.statsList.size(); i++){
            sheet.setText(sheet.getText() + Global.statsList.get(i) + " :\n");
            
        }
        
        sheet.setText(sheet.getText() + "Experience :\n");
        sheet.setText(sheet.getText() + "Gold :\n");
        
        stats.setText(stats.getText() + Global.player.might + "\n");
        stats.setText(stats.getText() + Global.player.intelligence + "\n");
        stats.setText(stats.getText() + Global.player.speed + "\n");
        
        stats.setText(stats.getText() + Global.player.startingHealth + "\n");
        stats.setText(stats.getText() + Global.player.startingMana + "\n");
        stats.setText(stats.getText() + Global.player.armor + "\n");
        stats.setText(stats.getText() + Global.player.criticalHitChance + "\n");
        stats.setText(stats.getText() + Global.player.dodgeChance + "\n");
        stats.setText(stats.getText() + Global.player.extraHitChance + "\n");
        
        stats.setText(stats.getText() + Global.player.exp + "/" + Global.player.levelRequirements.get(Global.player.level - 1) + "\n");
        stats.setText(stats.getText() + Global.player.playerGold);
        
        playerImg.setImage(Global.player.playerClass.classImage);
    }
    
    public void back(ActionEvent event) throws Exception{
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("mainGameScreen.fxml"));
        Parent root = loader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();        
        scene = new Scene(root);
        stage.setTitle("Something");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
        
    }
    
}
