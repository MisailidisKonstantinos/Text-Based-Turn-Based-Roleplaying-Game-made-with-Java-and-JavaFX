
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
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import zones.Primus_Mons;
import zones.The_Eastern_Plains;
import zones.Villages_Of_Gorm;
import zones.Virid_Arbor;

public class TypeNameController implements Initializable {

    private Stage stage;
    private Scene scene;
    private Parent root;
    
    @FXML
    private TextField name;
    @FXML
    private Button submit;

    @Override
    public void initialize(URL url, ResourceBundle rb) {        
        
        Global.zones.add(new The_Eastern_Plains());
        Global.zones.add(new Virid_Arbor());
        Global.zones.add(new Primus_Mons());
        Global.zones.add(new Villages_Of_Gorm());
        
        Global.primaryStatsList.add("Might");
        Global.primaryStatsList.add("Intelligence");
        Global.primaryStatsList.add("Speed");
        
        Global.statsList.add("Health");
        Global.statsList.add("Mana");
        Global.statsList.add("Armor");
        Global.statsList.add("Critical Chance");
        Global.statsList.add("Dodge Chance");                
        Global.statsList.add("Hit Chance");
        
        for(int i = 0; i < 8; i++){
            Global.player.equipment.add(null);
        }
        
    }    

    @FXML
    private void saveName(ActionEvent event) throws Exception{
        if(!name.getText().isEmpty()){
            Global.player.name = name.getText();
            
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
    
}
