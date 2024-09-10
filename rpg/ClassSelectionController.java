
package rpg;

import classes.Alchemist;
import classes.Assassin;
import classes.Berserker;
import classes.Brawler;
import classes.Scorcher;
import classes.Fighter;
import classes.Hunter;
import classes.Necromancer;
import classes.Sentinel;
import java.net.URL;
import java.util.Collections;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class ClassSelectionController implements Initializable {
    
    private Stage stage;
    private Scene scene;
    private Parent root;
    
    public String selectedClass;

    @FXML
    private Button fighter;
    @FXML
    private Button brawler;
    @FXML
    private Button scorcher;
    @FXML
    private Button necromancer;
    @FXML
    private Button assassin;
    @FXML
    private Button hunter;
    @FXML
    private Button berserker;
    @FXML
    private Button alchemist;
    @FXML
    private Button sentinel;
    @FXML
    private Button select;
    @FXML
    private TextArea classTextArea;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void createFighter(ActionEvent event) throws Exception{
        
        selectedClass = "Fighter";
        classTextArea.setText(Fighter.classText);
        
    }

    @FXML
    private void createBrawler(ActionEvent event) throws Exception{
        
        selectedClass = "Brawler";
        classTextArea.setText(Brawler.classText);
            
    }
    
    @FXML
    private void createBerserker(ActionEvent event) throws Exception{
        
        selectedClass = "Berserker";
        classTextArea.setText(Berserker.classText);
            
    }

    @FXML
    private void createScorcher(ActionEvent event) throws Exception{
        
        selectedClass = "Scorcher";
        classTextArea.setText(Scorcher.classText);
            
    }

    @FXML
    private void createNecromancer(ActionEvent event) throws Exception{
        
        selectedClass = "Necromancer";
        classTextArea.setText(Necromancer.classText);
            
    }
    
    @FXML
    private void createAlchemist(ActionEvent event) throws Exception{
        
        selectedClass = "Alchemist";
        classTextArea.setText(Alchemist.classText);
        
    }

    @FXML
    private void createAssassin(ActionEvent event) throws Exception{
        
        selectedClass = "Assassin";
        classTextArea.setText(Assassin.classText);
           
    }

    @FXML
    private void createHunter(ActionEvent event) throws Exception{
        
        selectedClass = "Hunter";
        classTextArea.setText(Hunter.classText);          
    
    }
    
    @FXML
    private void createSentinel(ActionEvent event) throws Exception{
        
        selectedClass = "Sentinel";
        classTextArea.setText(Sentinel.classText);
        
    }
    
    @FXML
    private void selectClass(ActionEvent event) throws Exception{
        
        if(!selectedClass.isEmpty()){
            
            for(int i = 0 ; i < 4; i++){
                Player.passives.add("Active");
            }
            switch(selectedClass){
                case "Fighter":
                    Global.player.playerClass = new Fighter();
                    
                    Player.passives.set(3, "Passive");
                    break;
                case "Brawler":
                    Global.player.playerClass = new Brawler();                                       
                    break;
                case "Berserker":
                    Global.player.playerClass = new Berserker();
                    
                    Player.passives.set(1, "Passive");
                    Player.passives.set(3, "Passive");
                    break;
                case "Scorcher":
                    Global.player.playerClass = new Scorcher();
                    
                    Player.passives.set(1, "Passive");
                    break;
                case "Necromancer":
                    Global.player.playerClass = new Necromancer();
                    
                    Player.passives.set(1, "Passive");
                    break;
                case "Assassin":
                    Global.player.playerClass = new Assassin();
                    
                    Player.passives.set(1, "Passive");
                    break;
                case "Hunter":
                    Global.player.playerClass = new Hunter();
                    break;
                case "Alchemist":
                    Global.player.playerClass = new Alchemist();
                    break;
                case "Sentinel":
                    Global.player.playerClass = new Sentinel();
                    
                    Player.passives.set(1, "Passive");
                    break;
           } 
                      
           Player.abilities.add(Global.player.playerClass.ability1);
           Player.abilities.add(Global.player.playerClass.ability2);
           Player.abilities.add(Global.player.playerClass.ability3);
           Player.abilities.add(Global.player.playerClass.ability4);
           
           Collections.addAll(Global.player.levelRequirements, 100, 150, 200, 250, 300, 350, 400, 450, 500, 550, 600, 650, 700, 750, 800, 850, 900, 950, 1000);    
           
           Global.player.playerClass.loadImage();
           changeScene(event);
        }
        
        
    }
    
    public void changeScene(ActionEvent event) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("typeName.fxml"));
        Parent root = loader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();        
        scene = new Scene(root);
        stage.setTitle("Something");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }
    
}
