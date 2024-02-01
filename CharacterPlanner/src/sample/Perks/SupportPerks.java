package sample.Perks;


import sample.Perks.Support.*;
import sample.Stats;

import java.util.*;

public class SupportPerks {
    private Map<String,Integer> perksFlags;

    public SupportPerks(){
        perksFlags = new HashMap<>();
        perksFlags.put("Boneyard Guard +10% sg", 0);
        perksFlags.put("Boneyard Guard +10% bg", 0);
        perksFlags.put("Boneyard Guard +10% ew", 0);
        perksFlags.put("Boneyard Guard +10% throwing", 0);
        perksFlags.put("Boneyard Guard +10% melee", 0);
        perksFlags.put("Cautious Nature", 0);
        perksFlags.put("Dead Man Walking", 0);
        perksFlags.put("Demolition Expert", 0);
        perksFlags.put("Dismantler", 0);
        perksFlags.put("Educated", 0);
        perksFlags.put("Explorer", 0);
        perksFlags.put("Faster Healing", 0);
        perksFlags.put("Gecko Skinning", 0);
        perksFlags.put("Harmless", 0);
        perksFlags.put("Light Step", 0);
        perksFlags.put("Magnetic Personality", 0);
        perksFlags.put("Master Thief", 0);
        perksFlags.put("Mr. Fixit", 0);
        perksFlags.put("Negotiator", 0);
        perksFlags.put("Pack Rat", 0);
        perksFlags.put("Pathfinder", 0);
        perksFlags.put("Pickpocket", 0);
        perksFlags.put("Rad Resistance", 0);
        perksFlags.put("Ranger", 0);
        perksFlags.put("Scout", 0);
        perksFlags.put("Sex Appeal", 0);
        perksFlags.put("Snakeater", 0);
        perksFlags.put("Speaker", 0);
        perksFlags.put("Stealth Girl", 0);
        perksFlags.put("Strong Back", 0);
        perksFlags.put("Swift Learner", 0);
        perksFlags.put("Thief", 0);
        perksFlags.put("Treasure Hunter", 0);
        perksFlags.put("Surviving in the wild +10 HP", 0);
        perksFlags.put("The art of the hunt +3 CC", 0);
        perksFlags.put("Basic Field Medicine +20 HR", 0);
        perksFlags.put("Straight Shooter", 0);
        perksFlags.put("The Good Doctor +1 CH", 0);
        perksFlags.put("Lumberjack", 0);
        perksFlags.put("Smitty's Meal +5 HP", 0);
        perksFlags.put("Locksmith", 0);
    }

    public void setPerkFlag(String perk, int flag){
        perksFlags.put(perk, flag);
    }

    public Map<String, Integer> getPerksFlags() {
        return perksFlags;
    }

    public int getPerkFlag(String perk){
        return perksFlags.get(perk);
    }

    public Perk getPerkInterface(String perkName){
        Perk perkInterface = null;

        switch(perkName) {
            case "Boneyard Guard +10% sg":
                perkInterface = new BoneyardGuardSg();
                break;
            case "Boneyard Guard +10% bg":
                perkInterface = new BoneyardGuardBg();
                break;
            case "Boneyard Guard +10% ew":
                perkInterface = new BoneyardGuardEw();
                break;
            case "Boneyard Guard +10% throwing":
                perkInterface = new BoneyardGuardThrowing();
                break;
            case "Boneyard Guard +10% melee":
                perkInterface = new BoneyardGuardMelee();
                break;
            case "Cautious Nature":
                perkInterface = new CautiousNature();
                break;
            case "Dead Man Walking":
                perkInterface = new DeadManWalking();
                break;
            case "Demolition Expert":
                perkInterface = new DemolitionExpert();
                break;
            case "Dismantler":
                perkInterface = new Dismantler();
                break;
            case "Educated":
                perkInterface = new Educated();
                break;
            case "Explorer":
                perkInterface = new Explorer();
                break;
            case "Faster Healing":
                perkInterface = new FasterHealing();
                break;
            case "Gecko Skinning":
                perkInterface = new GeckoSkinning();
                break;
            case "Harmless":
                perkInterface = new Harmless();
                break;
            case "Light Step":
                perkInterface = new LightStep();
                break;
            case "Magnetic Personality":
                perkInterface = new MagneticPersonality();
                break;
            case "Master Thief":
                perkInterface = new MasterThief();
                break;
            case "Mr. Fixit":
                perkInterface = new MrFixit();
                break;
            case "Negotiator":
                perkInterface = new Negotiator();
                break;
            case "Pack Rat":
                perkInterface = new PackRat();
                break;
            case "Pathfinder":
                perkInterface = new Pathfinder();
                break;
            case "Pickpocket":
                perkInterface = new Pickpocket();
                break;
            case "Rad Resistance":
                perkInterface = new RadResistance();
                break;
            case "Ranger":
                perkInterface = new Ranger();
                break;
            case "Scout":
                perkInterface = new Scout();
                break;
            case "Sex Appeal":
                perkInterface = new SexAppeal();
                break;
            case "Snakeater":
                perkInterface = new Snakeater();
                break;
            case "Speaker":
                perkInterface = new Speaker();
                break;
            case "Stealth Girl":
                perkInterface = new StealthGirl();
                break;
            case "Strong Back":
                perkInterface = new StrongBack();
                break;
            case "Swift Learner":
                perkInterface = new SwiftLearner();
                break;
            case "Thief":
                perkInterface = new Thief();
                break;
            case "Treasure Hunter":
                perkInterface = new TreasureHunter();
                break;
            case "Surviving in the wild +10 HP":
                perkInterface = new WonderlandHp();
                break;
            case "The art of the hunt +3 CC":
                perkInterface = new WonderlandCC();
                break;
            case "Basic Field Medicine +20 HR":
                perkInterface = new WonderlandHr();
                break;
            case "Straight Shooter":
                perkInterface = new StraightShooter();
                break;
            case "The Good Doctor +1 CH":
                perkInterface = new TheGoodDoctor();
                break;
            case "Lumberjack":
                perkInterface = new Lumberjack();
                break;
            case "Smitty's Meal +5 HP":
                perkInterface = new SmittysMeal();
                break;
            case "Locksmith":
                perkInterface = new Locksmith();
                break;
        }

        return perkInterface;
    }

    public List<String> getAvailablePerks(Stats stats){

        List<String> availablePerks = new ArrayList<>();
        perksFlags.forEach((k, v) -> {
            if (getPerkInterface(k).checkRequirements(stats)) {
                availablePerks.add(k);
            }
        });

        Collections.sort(availablePerks);
        return availablePerks;
    }

}
