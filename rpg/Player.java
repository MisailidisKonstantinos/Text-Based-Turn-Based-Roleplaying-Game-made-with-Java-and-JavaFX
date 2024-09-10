
package rpg;

import classes.PlayerClass;
import enemies.Enemy;
import items.Item;
import java.util.ArrayList;
import quests.Quest;

public class Player {
    
    public String name;
    public PlayerClass playerClass;
    
    public Enemy target;
    
    public int startingHealth = 100;
    public int currentHealth;
    public int startingMana = 100;
    public int currentMana;
    
    public int might = 10;
    public int intelligence = 10;
    public int speed = 10;
    public int armor = 10;
    
    public int basicDamage = 10; //set to 5 again
    
    public int criticalHitChance = 10;
    public int dodgeChance = 10;
    public int extraHitChance = 0;
    
    public int level = 1;
    public int exp = 0;
    
    public int currentZone = 0;
    public int currentSubZone = 0;
    public int currentQuest = 0;
    
    public int questCounter = 0;
    
    public int availableTalents = 0;
    
    public Quest quest;
    
    public static ArrayList<String> abilities = new ArrayList();
    public static ArrayList<String> passives = new ArrayList();
    public static ArrayList<Integer> levelRequirements = new ArrayList();
    
    public static ArrayList<Item> equipment = new ArrayList<Item>(8);
    public static ArrayList<Item> bag = new ArrayList<Item>();
    
    public int playerGold = 80;
    
    public boolean stunned = false;
    public int stunnedCounter = 0;
    public int stunDuration = -1;
    
    //Class counter!!!!
    public int scorcherCounter = 0;
    public int fighterCounter = 0;
    public int necromancerCounter = 0;
    
    
//    Might
//    Intelligence
//    Speed
//        
//    Health
//    Mana
//    Armor
//    Critical Chance
//    Dodge Chance               
//    Hit Chance
}
