
package rpg;

import items.Item;
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
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class ItemUpgradeScreenController implements Initializable{

    private Stage stage;
    private Scene scene;
    private Parent root;
    
    @FXML
    private Label cost;
    
    @FXML
    private Button back;

    @FXML
    private ListView<Item> itemList;

    @FXML
    private Button upgrade;

    
    int selectedItem = 1;
    int itemSlot;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        for(int i = 0; i < Global.player.equipment.size(); i++){
            if(Global.player.equipment.get(i) != null){
                itemList.getItems().add(Global.player.equipment.get(i));
            }
            
        }
        
    }

    @FXML
    void back(ActionEvent event) throws Exception{

        FXMLLoader loader = new FXMLLoader(getClass().getResource("itemManagementScreen.fxml"));
        Parent root = loader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();        
        scene = new Scene(root);
        stage.setTitle("Something");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();  
    }

    @FXML
    void getItemIndex(MouseEvent event) {
        
        selectedItem = itemList.getSelectionModel().getSelectedIndex();
        itemSlot = itemList.getItems().get(selectedItem).itemSlot;
        cost.setText("You have: " + Global.player.playerGold + "/" + Global.player.equipment.get(itemSlot).upgradeCost + " gold!");
        System.out.println(selectedItem);
    }

    @FXML
    void upgrade(ActionEvent event) {

        
        if(Global.player.equipment.get(itemSlot).itemLevel < 5 && Global.player.playerGold >= Global.player.equipment.get(itemSlot).upgradeCost){
            
            Global.player.equipment.get(itemSlot).onUnequip();
            Global.player.playerGold -= Global.player.equipment.get(itemSlot).upgradeCost;
            Global.player.equipment.get(itemSlot).itemLevel ++;
            Global.player.equipment.get(itemSlot).upgradeCost += 50 * (Global.player.equipment.get(itemSlot).itemLevel - 1);
            Global.player.equipment.get(itemSlot).onEquip();
            
            cost.setText("You have: " + Global.player.playerGold + "/" + Global.player.equipment.get(itemSlot).upgradeCost + " gold!");
            
        }
    }

}
