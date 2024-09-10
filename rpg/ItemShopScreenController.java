
package rpg;

import items.Item;
import items.belt.Trainees_Belt;
import items.boots.Trainees_Boots;
import items.chest.Trainees_Chestplate;
import items.gloves.Trainees_Gloves;
import items.helmets.Trainees_Helmet;
import items.helmets.Wolf_Leather_Helmet;
import items.leggings.Trainees_Leggings;
import items.shoulderpads.Trainees_Shoulderpads;
import items.weapons.Training_Sword;
import items.wristbands.Trainees_Wristbands;
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

public class ItemShopScreenController implements Initializable{

    private Stage stage;
    private Scene scene;
    private Parent root;
    
    @FXML
    private Label cost;
    
    @FXML
    private Button back;

    @FXML
    private Button buy;

    @FXML
    private ListView<Item> itemList;
    
    public int selectedItem;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        itemList.getItems().add(new Training_Sword());
        itemList.getItems().add(new Trainees_Belt());
        itemList.getItems().add(new Trainees_Boots());
        itemList.getItems().add(new Trainees_Chestplate());
        itemList.getItems().add(new Trainees_Gloves());
        itemList.getItems().add(new Trainees_Helmet());
        itemList.getItems().add(new Trainees_Leggings());
        itemList.getItems().add(new Trainees_Shoulderpads());
        itemList.getItems().add(new Trainees_Wristbands());
        itemList.getItems().add(new Wolf_Leather_Helmet());
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
    void buy(ActionEvent event) {

        if(Global.player.playerGold >= itemList.getItems().get(selectedItem).itemCost && !itemList.getItems().isEmpty()){
            
            Global.player.bag.add(itemList.getItems().get(selectedItem));
            Global.player.playerGold -= itemList.getItems().get(selectedItem).itemCost;
            cost.setText("You have: " + Global.player.playerGold + "/" + itemList.getItems().get(selectedItem).itemCost + " gold!");
            itemList.getItems().remove(selectedItem);
            
        }
    }

    @FXML
    void getItemIndex(MouseEvent event) {
        
        selectedItem = itemList.getSelectionModel().getSelectedIndex();       
        cost.setText("You have: " + Global.player.playerGold + "/" + itemList.getItems().get(selectedItem).itemCost + " gold!");
        System.out.println(selectedItem);

    }


}
