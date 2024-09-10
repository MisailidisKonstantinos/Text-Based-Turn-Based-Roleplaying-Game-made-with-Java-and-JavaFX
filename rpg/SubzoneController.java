
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
import javafx.stage.Stage;

public class SubzoneController implements Initializable {
    
    private Stage stage;
    private Scene scene;
    private Parent root;
    
    @FXML
    private Button fight;
    @FXML
    private Button questBtn;
    @FXML
    private Button back;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        int zone = Global.player.currentZone;
        int subZone = Global.player.currentSubZone;
        int quest = Global.player.currentQuest;
        
        //Global.player.quest = Global.zones.get(zone).subzones.get(subZone).quests.get(quest);
    }
    
    @FXML
    private void fight(ActionEvent event) throws Exception{
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("combatScreen.fxml"));
        Parent root = loader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();        
        scene = new Scene(root);
        stage.setTitle("Something");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();        
    }
    
    @FXML
    private void quest(ActionEvent event) throws Exception{
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("questScreen.fxml"));
        Parent root = loader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();        
        scene = new Scene(root);
        stage.setTitle("Something");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();        
    }
    
    @FXML
    private void back(ActionEvent event) throws Exception{
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("zone.fxml"));
        Parent root = loader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();        
        scene = new Scene(root);
        stage.setTitle("Something");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();        
    }
    
}
