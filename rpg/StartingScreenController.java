
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

public class StartingScreenController implements Initializable {
    
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private Button newGame;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    

    @FXML
    private void startNewGame(ActionEvent event) throws Exception {
        
        Parent root = FXMLLoader.load(getClass().getResource("classSelection.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();        
        scene = new Scene(root);
        stage.setTitle("Select a class");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
        
    }
    
}
