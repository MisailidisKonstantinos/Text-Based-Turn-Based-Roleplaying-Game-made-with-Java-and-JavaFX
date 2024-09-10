
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
import javafx.stage.Stage;
import zones.Zones;

public class ZoneController implements Initializable {
    
    private Stage stage;
    private Scene scene;
    private Parent root;
    
    @FXML
    private Button subzoneBtn1;
    @FXML
    private Button subzoneBtn2;
    @FXML
    private Button subzoneBtn3;
    @FXML
    private Button subzoneBtn4;
    @FXML
    private Button back;
    @FXML
    public Label zoneName;
    
    

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        zoneName.setText(Global.zones.get(Global.player.currentZone).name);
        
        subzoneBtn1.setText(Global.zones.get(Global.player.currentZone).subzones.get(0).name);
        subzoneBtn2.setText(Global.zones.get(Global.player.currentZone).subzones.get(1).name);
        subzoneBtn3.setText(Global.zones.get(Global.player.currentZone).subzones.get(2).name);
        subzoneBtn4.setText(Global.zones.get(Global.player.currentZone).subzones.get(3).name);
        
        if(Global.player.currentSubZone < 1){
            subzoneBtn2.setDisable(true);
        }
        if(Global.player.currentSubZone < 2){
            subzoneBtn3.setDisable(true);
        }
        if(Global.player.currentSubZone < 3){
            subzoneBtn4.setDisable(true);
        }
        

    }
    
    @FXML
    public void switchToSubzone1(ActionEvent event) throws Exception{
        
        Zones.currentSubzone = 0;
        changeScene(event);
        
    }
    
    @FXML
    public void switchToSubzone2(ActionEvent event) throws Exception{
        
        Zones.currentSubzone = 1;
        changeScene(event);
    }
    
    @FXML
    public void switchToSubzone3(ActionEvent event) throws Exception{
        
        Zones.currentSubzone = 2;
        changeScene(event);
    }
    
    @FXML
    public void switchToSubzone4(ActionEvent event) throws Exception{
        
        Zones.currentSubzone = 3;
        changeScene(event);
    }
    
    public void changeScene(ActionEvent event) throws Exception{
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("subzone.fxml"));
        Parent root = loader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();        
        scene = new Scene(root);
        stage.setTitle("Something");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
        
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
