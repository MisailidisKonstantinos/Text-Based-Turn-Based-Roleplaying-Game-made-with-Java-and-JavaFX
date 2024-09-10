
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

public class MainGameScreenController implements Initializable {

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private Button zone;
    @FXML
    private Button sheet;
    @FXML
    private Button talents;
    @FXML
    private Button itemManagement;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        zone.setText(Global.zones.get(Global.player.currentZone).name);
        
    }
    
    @FXML
    public void switchToZone(ActionEvent event) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("zone.fxml"));
        System.out.println(Global.player.name);
        System.out.println(Global.player.playerClass.name);
        Parent root = loader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();        
        scene = new Scene(root);
        stage.setTitle("Something");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }
    
    public void setZone(){
        
    }
    
    @FXML
    public void showSheet(ActionEvent event) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("characterSheetScreen.fxml"));
        System.out.println(Global.player.name);
        System.out.println(Global.player.playerClass.name);
        Parent root = loader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();        
        scene = new Scene(root);
        stage.setTitle("Something");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    public void talents(ActionEvent event) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("talentsScreen.fxml"));
        System.out.println(Global.player.name);
        System.out.println(Global.player.playerClass.name);
        Parent root = loader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();        
        scene = new Scene(root);
        stage.setTitle("Something");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    public void itemManagement(ActionEvent event) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("itemManagementScreen.fxml"));
        System.out.println(Global.player.name);
        System.out.println(Global.player.playerClass.name);
        Parent root = loader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();        
        scene = new Scene(root);
        stage.setTitle("Something");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }
}
