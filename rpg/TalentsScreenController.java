
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
import javafx.scene.control.Tooltip;
import javafx.stage.Stage;

public class TalentsScreenController implements Initializable {

    private Stage stage;
    private Scene scene;
    private Parent root;
    
    public static int currentTier = 1;
    
    public static int tier1 = 0;
    public static int tier2 = 0;
    public static int tier3 = 0;
    public static int tier4 = 0;
    
    @FXML
    private Label availableTalents;

    @FXML
    private Button back;

    @FXML
    private Button cardio;

    @FXML
    private Tooltip cardioToolTip;

    @FXML
    private Button evasiveMoves;

    @FXML
    private Tooltip evasiveMovesToolTip;

    @FXML
    private Button findYourMark;

    @FXML
    private Tooltip findYourMarkToolTip;

    @FXML
    private Button hardenArmor;

    @FXML
    private Tooltip hardenArmorToolTip;

    @FXML
    private Button noNeedForWater;

    @FXML
    private Tooltip noNeedForWaterToolTip;

    @FXML
    private Button precision;

    @FXML
    private Tooltip precisionToolTip;

    @FXML
    private Button study;

    @FXML
    private Tooltip studyToolTip;

    @FXML
    private Button tooToughToDie;

    @FXML
    private Tooltip tooToughToDieToolTip;

    @FXML
    private Button workout;

    @FXML
    private Tooltip workoutToolTip;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
               
        tierSetUp();
        
    }
    
    public void tierSetUp(){
        
        availableTalents.setText("Available Talent Points : " + Global.player.availableTalents);
        
        disableButtons();
        
        if(currentTier == 1){
            precision.setDisable(false);
            findYourMark.setDisable(false);
            evasiveMoves.setDisable(false);
        }
        else if(currentTier == 2){
            workout.setDisable(false);
            study.setDisable(false);
            cardio.setDisable(false);
        }
        else if(currentTier == 3){
            hardenArmor.setDisable(false);
        }
        else if(currentTier == 4){
            tooToughToDie.setDisable(false);
            noNeedForWater.setDisable(false);
        }
    }
    
    public void disableButtons(){
        
        precision.setDisable(true);
        findYourMark.setDisable(true);
        evasiveMoves.setDisable(true);
        workout.setDisable(true);
        study.setDisable(true);
        cardio.setDisable(true);
        hardenArmor.setDisable(true);
        tooToughToDie.setDisable(true);
        noNeedForWater.setDisable(true);
    }
    
    public void upgradeTier(int tier){
        
        if(tier == 5){
            currentTier++;
        }
    }
    
    public void precision(){
        
        if(Global.player.availableTalents > 0){
            
            Global.player.criticalHitChance += 2;
            
            Global.player.availableTalents --;
            tier1 ++;
            
            upgradeTier(tier1);
            
            tierSetUp();
        }
    }
    
       
    public void findYourMark(){
        
        if(Global.player.availableTalents > 0){
            
            Global.player.extraHitChance += 2;
            
            Global.player.availableTalents --;
            tier1 ++;
            
            upgradeTier(tier1);
            
            tierSetUp();
        }
    }
    
    public void evasiveMoves(){
        
        if(Global.player.availableTalents > 0){
            
            Global.player.dodgeChance += 2;
            
            Global.player.availableTalents --;
            tier1 ++;
            
            upgradeTier(tier1);
            
            tierSetUp();
        }
    }
    
    public void workout(){
        
        if(Global.player.availableTalents > 0){
            
            Global.player.might += 2;
            
            Global.player.availableTalents --;
            tier2 ++;
            
            upgradeTier(tier2);
            
            tierSetUp();
        }
    }
    
    public void study(){
        
        if(Global.player.availableTalents > 0){
            
            Global.player.intelligence += 2;
            
            Global.player.availableTalents --;
            tier2 ++;
            
            upgradeTier(tier2);
            
            tierSetUp();
        }
    }
    
    public void cardio(){
        
        if(Global.player.availableTalents > 0){
            
            Global.player.speed += 2;
            
            Global.player.availableTalents --;
            tier2 ++;
            
            upgradeTier(tier2);
            
            tierSetUp();
        }
    }
    
    public void hardenArmor(){
        
        if(Global.player.availableTalents > 0){
            
            Global.player.armor += 4;
            
            Global.player.availableTalents --;
            tier3 ++;
            
            upgradeTier(tier3);
            
            tierSetUp();
        }
    }
    
    public void tooToughToDie(){
        
        if(Global.player.availableTalents > 0){
            
            Global.player.startingHealth += 10;
            
            Global.player.availableTalents --;
            tier4 ++;
            
            upgradeTier(tier4);
            
            tierSetUp();
        }
    }
    
    public void noNeedForWater(){
        
        if(Global.player.availableTalents > 0){
            
            Global.player.startingMana += 10;
            
            Global.player.availableTalents --;
            tier4 ++;
            
            upgradeTier(tier4);
            
            tierSetUp();
        }
    }
    
    @FXML
    private void back(ActionEvent event) throws Exception{
        
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
