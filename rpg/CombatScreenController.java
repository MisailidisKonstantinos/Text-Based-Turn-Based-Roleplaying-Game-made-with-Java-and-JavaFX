
package rpg;

import classes.Berserker;
import combat.CombatMechanics;
import java.net.URL;
import java.util.Random;
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
import javafx.scene.control.TextArea;
import javafx.scene.control.Tooltip;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import zones.Zones;

public class CombatScreenController implements Initializable{
    
    private Stage stage;
    private Scene scene;
    private Parent root;
    
    int enemyHealth;
    int playerHealth;
    
    int damageDealt;
    
    int enemyDamageDealt;
    
    int turn = 1;
    
    int criticalFactor = 2;
    
    //-------------PASSIVE COUNTERS----------//
    public int fighterCounter = 0;
    //---------------------------------------//
    
    CombatMechanics combatMechanics = new CombatMechanics();
    
    @FXML
    private Button ability1;
    @FXML
    private Button ability2;
    @FXML
    private Button ability3;
    @FXML
    private Button ability4;
    @FXML
    private Button returnBtn;
    @FXML
    private Label results;
    @FXML
    private Label playerName;
    @FXML
    private Label playerHP;
    @FXML
    private Label enemyName;
    @FXML
    private Label enemyHP;
    @FXML
    private TextArea damageInfo;
        
    @FXML
    private Tooltip btn1ToolTip;

    @FXML
    private Tooltip btn2ToolTip;

    @FXML
    private Tooltip btn3ToolTip;

    @FXML
    private Tooltip btn4ToolTip;
    
    @FXML
    private ImageView playerImg;
    
    @FXML
    private ImageView enemyImg;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        ability1.setText(Global.player.abilities.get(0));
        ability2.setText(Global.player.abilities.get(1));
        ability3.setText(Global.player.abilities.get(2));
        ability4.setText(Global.player.abilities.get(3));
        
        if(Global.player.passives.get(0).equals("Passive")){
            ability1.setDisable(true);
        }
        
        if(Global.player.passives.get(1).equals("Passive")){
            ability2.setDisable(true);
        }
        
        if(Global.player.passives.get(2).equals("Passive")){
            ability3.setDisable(true);
        }
        
        if(Global.player.passives.get(3).equals("Passive")){
            ability4.setDisable(true);
        }
        
//        if(Global.player.level < 4){
//            ability2.setDisable(true);
//        }
//        
//        if(Global.player.level < 9){
//            ability3.setDisable(true);
//        }
//        
//        if(Global.player.level < 16){
//            ability4.setDisable(true);
//        }
        

        btn1ToolTip.setText(Global.player.playerClass.ability1ToolTip);
        btn2ToolTip.setText(Global.player.playerClass.ability2ToolTip);
        btn3ToolTip.setText(Global.player.playerClass.ability3ToolTip);
        btn4ToolTip.setText(Global.player.playerClass.ability4ToolTip);
        
        generateEnemy();
        
        enemyDamageDealt = Global.player.target.enemyBasicHitDamage;
        
        Global.player.target.enemyCurrentHealth = Global.player.target.enemyStartingHealth;
        Global.player.currentHealth = Global.player.startingHealth;
        Global.player.currentMana = Global.player.startingMana;
        
        playerName.setText(Global.player.name);
        playerHP.setText(Integer.toString(Global.player.currentHealth) + " " + Integer.toString(Global.player.currentMana));
        enemyName.setText(Global.player.target.enemyName);
        enemyHP.setText(Integer.toString(Global.player.target.enemyCurrentHealth));

        playerImg.setImage(Global.player.playerClass.classImage);
        
        try{
            Global.player.target.loadImage();
        }
        catch(Exception e){
            
        }
        enemyImg.setImage(Global.player.target.enemyImage);
    }
    
    //-------------------Player abilities-------------------//
    @FXML
    private void firstAbility(ActionEvent event) throws Exception{
        
        if(Global.player.currentMana >= Global.player.playerClass.ability1ManaCost){
            
            Global.player.currentMana -= Global.player.playerClass.ability1ManaCost;
            
            damageInfo.clear();
            if(combatMechanics.successfulHit(Global.player.extraHitChance, Global.player.target.enemyDodgeChance)){

                damageDealt = Global.player.playerClass.ability1();
    //            
            }else{
                damageInfo.appendText("Your attack was dodged!");
            }

            playerCalculations(damageDealt);

            turn++;

            enemyTurn();

            endOfCombat();
        }
               
    }
    
    @FXML
    private void secondAbility(ActionEvent event) throws Exception{
        
        if(Global.player.currentMana >= Global.player.playerClass.ability2ManaCost){
            
            Global.player.currentMana -= Global.player.playerClass.ability2ManaCost;
            
            damageInfo.clear();
            if(combatMechanics.successfulHit(Global.player.extraHitChance, Global.player.target.enemyDodgeChance)){

                damageDealt = Global.player.playerClass.ability2();
    //            
            }else{
                damageInfo.appendText("Your attack was dodged!");
            }

            playerCalculations(damageDealt);

            turn++;

            enemyTurn();

            endOfCombat();
        }
       
    }
    
    @FXML
    private void thirdAbility(ActionEvent event) throws Exception{
        
        if(Global.player.currentMana >= Global.player.playerClass.ability3ManaCost){
            
            Global.player.currentMana -= Global.player.playerClass.ability3ManaCost;
            
            damageInfo.clear();
            if(combatMechanics.successfulHit(Global.player.extraHitChance, Global.player.target.enemyDodgeChance)){

                damageDealt = Global.player.playerClass.ability3();

            }else{
                damageInfo.appendText("Your attack was dodged!");
            }

            playerCalculations(damageDealt);

            turn++;

            enemyTurn();

            endOfCombat();
        }
                
    }
    
    @FXML
    private void fourthAbility(ActionEvent event) throws Exception{
        
        if(Global.player.currentMana >= Global.player.playerClass.ability4ManaCost){
            
            Global.player.currentMana -= Global.player.playerClass.ability4ManaCost;
            
            damageInfo.clear();
            if(combatMechanics.successfulHit(Global.player.extraHitChance, Global.player.target.enemyDodgeChance)){

                damageDealt = Global.player.playerClass.ability4();

            }else{
                damageInfo.appendText("Your attack was dodged!");
            }

            playerCalculations(damageDealt);

            turn++;

            enemyTurn();

            endOfCombat();
        }
                
    }
    
    //----------------------------------------//
    //-----------Combat ending----------------//
    
    public void returnToSubzone(ActionEvent event) throws Exception{
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("subzone.fxml"));
        Parent root = loader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();        
        scene = new Scene(root);
        stage.setTitle("Something");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
        
    }
    
    //-------------------------------------------//
    //-------------Enemy generation--------------//
    
    public void generateEnemy(){
        
        int size = Global.zones.get(Global.player.currentZone).subzones.get(Zones.currentSubzone).enemies.size();
        
        Random r = new Random();
        
        int targetNumber = r.nextInt(0, size);
        
        Global.player.target = Global.zones.get(Global.player.currentZone).subzones.get(Zones.currentSubzone).enemies.get(targetNumber);
    }
    
    //------------------------------------------//
    //------Critical and dodge calculations-----//
    
    public void playerCalculations(int damageDealt){
                
        
        if(combatMechanics.criticalHit(Global.player.criticalHitChance)){
            damageDealt *= criticalFactor;

            damageInfo.appendText("Your attack critically striked the opponent for: ");
        }
        else{
            damageInfo.appendText("Your attack striked the opponent for: ");
        }

        Global.player.target.enemyCurrentHealth -= damageDealt;

        damageInfo.appendText(Integer.toString(damageDealt) + " damage!");

        Global.player.playerClass.endOfTurnPassives();
        Global.player.playerClass.buffingPassives();
        
        if(Global.player.target.enemyCurrentHealth >= 0){
            enemyHP.setText(Integer.toString(Global.player.target.enemyCurrentHealth));
        }
        else{
            enemyHP.setText("0");
                        
        }
        
        calculateCD();
        
    }
    
    public void enemyCalculations(int damageDealt){
        
        damageInfo.appendText("\n");
        if(combatMechanics.successfulHit(Global.player.target.enemyHitChance, Global.player.dodgeChance)){
            if(combatMechanics.criticalHit(Global.player.target.enemyCriticalHitChance)){
                damageDealt *= 2;
                
                damageInfo.appendText("Your opponent's attack critically striked you for: ");
            }
            else{
                damageInfo.appendText("Your opponent's attack striked you for: ");
            }
            
            Global.player.currentHealth -= damageDealt;
            
            if(Global.player.playerClass.name.equals("Berserker")){
                if(Global.player.currentHealth <= 0 && Berserker.berserkerCounter == 0){
                    Global.player.playerClass.ability4();
                    Berserker.berserkerCounter = 1;
                }
                
                if(Berserker.unkillable == true){
                    if(Berserker.unkillableCounter < 2){
                        if(Global.player.currentHealth <= 0){
                            Global.player.currentHealth = 1;
                            Berserker.unkillableCounter ++;
                        }
                        else{
                            Berserker.unkillable = false;
                        }
                    }
                }
            }
            
            damageInfo.appendText(Integer.toString(damageDealt) + " damage!");
            
            if(Global.player.currentHealth >= 0){
                playerHP.setText(Integer.toString(Global.player.currentHealth) + " " + Integer.toString(Global.player.currentMana));
            }
            else{
                playerHP.setText("0");
            }
            
        }else{
         
            if(Global.player.playerClass.name.equals("Assassin")){
                Global.player.target.enemyCurrentHealth -= Global.player.playerClass.ability2();
            }
            damageInfo.setText("You dodged your opponent's attack!");
        }
        
    }
    
    //----------------------------------------//
    //-------------Combat results-------------//
    
    public boolean results(int playerHealth, int enemyHealth){
        
        if(enemyHealth <= 0){
            results.setText("Victory!!!");
            
            if(Global.player.playerClass.name.equals("Necromancer")){
                Global.player.playerClass.ability2();
            }
            
            Global.player.target.onDefeat();
            
            if(Global.player.quest != null){
                QuestHandler questHandler = new QuestHandler(Global.player.quest);
            }
            
            levelUp();
            System.out.println(Global.player.exp);
            Global.player.playerClass.endOfCombatPassives();
            return true;
        }
        
        if(playerHealth <= 0){
            results.setText("Defeat...");
            Global.player.playerClass.endOfCombatPassives();
            return true;
        }
        
        return false;
    }
    
    public void endOfCombat(){
        
        if(results(Global.player.currentHealth, Global.player.target.enemyCurrentHealth)){
            
            ability1.setDisable(true);
            ability2.setDisable(true);
            ability3.setDisable(true);
            ability4.setDisable(true);
            
            returnBtn.setVisible(true);
            results.setVisible(true);
            
        }

    }
    
    //---------------------------------//
    //-------------Enemy turn----------//
    
    public void enemyTurn(){
        
        if(Global.player.target.enemyCurrentHealth > 0){
            if(turn == 2){
                if(Global.player.target.stunned == false){
                    enemyCalculations(enemyDamageDealt);
                }
                else{                    
                    Global.player.target.stunnedCounter ++;
                    if(Global.player.target.stunnedCounter == Global.player.target.stunDuration){
                        Global.player.target.stunnedCounter = 0;
                        Global.player.target.stunned = false;
                        Global.player.target.stunDuration = -1;
                    }
                }
                
                damageDealt = 0;
                turn = 1;
            
            }
        }       
    }

    //-----------LEVEL UP------------------//
    
    public static void levelUp(){
        
        if(Global.player.exp >= Global.player.levelRequirements.get(Global.player.level - 1)){
            
            Global.player.exp -= Global.player.levelRequirements.get(Global.player.level - 1);
            Global.player.level++;
            Global.player.startingHealth += 10;
            Global.player.armor += 5;
            Global.player.basicDamage += 2;
        
        if(Global.player.level%4 == 0){            
            Global.player.criticalHitChance += 1;
            Global.player.dodgeChance += 1;
            Global.player.extraHitChance += 1;
        }
        
        if(Global.player.level%2 == 0){
            Global.player.availableTalents ++;
        }
            System.out.println("LEVEL UP!");
        }
                       
    }
    
    public void calculateCD(){
        
        if(Global.player.playerClass.ability2CDCounter < Global.player.playerClass.ability2CD){
            ability2.setDisable(true);
            Global.player.playerClass.ability2CDCounter++;
        }
        else if(Global.player.playerClass.ability2CDCounter == Global.player.playerClass.ability2CD){
            ability2.setDisable(false);
        }
        
        if(Global.player.playerClass.ability3CDCounter < Global.player.playerClass.ability3CD){
            ability3.setDisable(true);
            Global.player.playerClass.ability3CDCounter++;
        }
        else if(Global.player.playerClass.ability3CDCounter == Global.player.playerClass.ability3CD){
            ability3.setDisable(false);
        }
        
        if(Global.player.playerClass.ability4CDCounter < Global.player.playerClass.ability4CD){
            ability4.setDisable(true);
            Global.player.playerClass.ability4CDCounter++;
        }
        else if(Global.player.playerClass.ability4CDCounter == Global.player.playerClass.ability4CD){
            ability4.setDisable(false);
        }
    }
    
}
