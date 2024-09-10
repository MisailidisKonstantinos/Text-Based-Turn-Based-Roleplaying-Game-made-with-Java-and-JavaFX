
package rpg;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ItemManagementScreenController {

    private Stage stage;
    private Scene scene;
    private Parent root;
    
    @FXML
    private Button back;

    @FXML
    private Button inventory;

    @FXML
    private Button itemUpgrades;
    
    @FXML
    private Button shop;

    @FXML
    void back(ActionEvent event) throws Exception{

        FXMLLoader loader = new FXMLLoader(getClass().getResource("mainGameScreen.fxml"));
        Parent root = loader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();        
        scene = new Scene(root);
        stage.setTitle("Something");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();    
    }

    @FXML
    void showInventory(ActionEvent event) throws Exception{

        FXMLLoader loader = new FXMLLoader(getClass().getResource("itemListScreen.fxml"));
        Parent root = loader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();        
        scene = new Scene(root);
        stage.setTitle("Something");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();   
    }

    @FXML
    void upgrades(ActionEvent event) throws Exception{

        FXMLLoader loader = new FXMLLoader(getClass().getResource("itemUpgradeScreen.fxml"));
        Parent root = loader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();        
        scene = new Scene(root);
        stage.setTitle("Something");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show(); 
    }
    
    @FXML
    void shop(ActionEvent event) throws Exception{

        FXMLLoader loader = new FXMLLoader(getClass().getResource("itemShopScreen.fxml"));
        Parent root = loader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();        
        scene = new Scene(root);
        stage.setTitle("Something");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show(); 
    }

}
