
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
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class ItemListScreenController implements Initializable{

    private Stage stage;
    private Scene scene;
    private Parent root;
    
    @FXML
    private ListView<String> itemList;
    @FXML
    private Button back;
    @FXML
    private Button equip;
    
    int selectedItem = 1;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        for(int i = 0; i < Global.player.bag.size(); i++){
            itemList.getItems().add(Global.player.bag.get(i).itemName);
            System.out.println(itemList.getItems().get(i));
        }
        
    }
    
    public void equip(){
        
        if(Global.player.equipment.get(Global.player.bag.get(selectedItem).itemSlot) != null){
            Global.player.equipment.get(Global.player.bag.get(selectedItem).itemSlot).onUnequip();
        }
        
        Global.player.equipment.set(Global.player.bag.get(selectedItem).itemSlot, Global.player.bag.get(selectedItem));

        Global.player.bag.get(selectedItem).onEquip();
        Global.player.bag.remove(selectedItem);
        
        itemList.getItems().clear();
        
        for(int i = 0; i < Global.player.bag.size(); i++){            
            itemList.getItems().add(Global.player.bag.get(i).itemName);
        }
    }
    
    @FXML
    void getItemIndex(MouseEvent event) {

        selectedItem = itemList.getSelectionModel().getSelectedIndex();
        System.out.println(selectedItem);
    }
    
    @FXML
    private void back(ActionEvent event) throws Exception{
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("itemManagementScreen.fxml"));
        Parent root = loader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();        
        scene = new Scene(root);
        stage.setTitle("Something");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();        
    }
}
