package sample.Perks;


import sample.Perks.LevelPerks.*;
import sample.Stats;

import java.util.*;

public class Perks {
    private Map<String,Integer> perksFlags;

    public Perks(){
        perksFlags = new HashMap<>();
        perksFlags.put("Action Boy", 0);
        perksFlags.put("Adrenaline Rush", 0);
        perksFlags.put("Better Criticals", 0);
        perksFlags.put("Better HtH Criticals", 0);
        perksFlags.put("Blessed Are the Weak", 0);
        perksFlags.put("Bonus HtH Attacks", 0);
        perksFlags.put("Bonus HtH Damage", 0);
        perksFlags.put("Bonus Move", 0);
        perksFlags.put("Bonus Ranged Damage", 0);
        perksFlags.put("Bonus Rate of Fire", 0);
        perksFlags.put("Dodger", 0);
        perksFlags.put("Dodger+", 0);
        perksFlags.put("Earlier Sequence", 0);
        perksFlags.put("Even More Criticals", 0);
        perksFlags.put("Even Tougher", 0);
        perksFlags.put("Gain Agility", 0);
        perksFlags.put("Gain Charisma", 0);
        perksFlags.put("Gain Endurance", 0);
        perksFlags.put("Gain Intelligence", 0);
        perksFlags.put("Gain Luck", 0);
        perksFlags.put("Gain Perception", 0);
        perksFlags.put("Gain Strength", 0);
        perksFlags.put("Ghost", 0);
        perksFlags.put("Heave Ho", 0);
        perksFlags.put("Hit the Gaps", 0);
        perksFlags.put("HtH Evade", 0);
        perksFlags.put("HtH Evade+", 0);
        perksFlags.put("In Your Face!", 0);
        perksFlags.put("Iron Grip", 0);
        perksFlags.put("Lifegiver", 0);
        perksFlags.put("Lifewire", 0);
        perksFlags.put("Living Anatomy", 0);
        perksFlags.put("Man of Steel", 0);
        perksFlags.put("Medic", 0);
        perksFlags.put("More Critical", 0);
        perksFlags.put("More HtH Criticals", 0);
        perksFlags.put("More Ranged Damage", 0);
        perksFlags.put("Pyromaniac", 0);
        perksFlags.put("Quick Pockets", 0);
        perksFlags.put("Quick Recovery", 0);
        perksFlags.put("Right Between the Eyes", 0);
        perksFlags.put("Sharpshooter", 0);
        perksFlags.put("Silent Death", 0);
        perksFlags.put("Silent Running", 0);
        perksFlags.put("Stonewall", 0);
        perksFlags.put("Toughness", 0);
        perksFlags.put("Tree Trunk Thighs", 0);
        perksFlags.put("Weapon Handling", 0);
        perksFlags.put("Spray and Pray", 0);
        perksFlags.put("Way of the Fruit", 0);
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
            case "Action Boy":
                perkInterface = new ActionBoy();
                break;
            case "Adrenaline Rush":
                perkInterface = new AdrenalineRush();
                break;
            case "Better Criticals":
                perkInterface = new BetterCriticals();
                break;
            case "Better HtH Criticals":
                perkInterface = new BetterHthCriticals();
                break;
            case "Blessed Are the Weak":
                perkInterface = new BlessedAreTheWeak();
                break;
            case "Bonus HtH Attacks":
                perkInterface = new BonusHthAttacks();
                break;
            case "Bonus HtH Damage":
                perkInterface = new BonusHthDamage();
                break;
            case "Bonus Move":
                perkInterface = new BonusMove();
                break;
            case "Bonus Ranged Damage":
                perkInterface = new BonusRangedDamage();
                break;
            case "Bonus Rate of Fire":
                perkInterface = new BonusRateOfFire();
                break;
            case "Dodger":
                perkInterface = new Dodger();
                break;
            case "Dodger+":
                perkInterface = new DodgerPlus();
                break;
            case "Earlier Sequence":
                perkInterface = new EarlierSequence();
                break;
            case "Even More Criticals":
                perkInterface = new EvenMoreCriticals();
                break;
            case "Even Tougher":
                perkInterface = new EvenTougher();
                break;
            case "Gain Agility":
                perkInterface = new GainAgility();
                break;
            case "Gain Charisma":
                perkInterface = new GainCharisma()  ;
                break;
            case "Gain Endurance":
                perkInterface = new GainEndurance();
                break;
            case "Gain Intelligence":
                perkInterface = new GainIntelligence();
                break;
            case "Gain Luck":
                perkInterface = new GainLuck();
                break;
            case "Gain Perception":
                perkInterface = new GainPerception();
                break;
            case "Gain Strength":
                perkInterface = new GainStrength();
                break;
            case "Ghost":
                perkInterface = new Ghost();
                break;
            case "Heave Ho":
                perkInterface = new HeaveHo();
                break;
            case "Hit the Gaps":
                perkInterface = new HitTheGaps();
                break;
            case "HtH Evade":
                perkInterface = new HthEvade();
                break;
            case "HtH Evade+":
                perkInterface = new HthEvadePlus();
                break;
            case "In Your Face!":
                perkInterface = new InYourFace();
                break;
            case "Iron Grip":
                perkInterface = new IronGrip();
                break;
            case "Lifegiver":
                perkInterface = new Lifegiver();
                break;
            case "Lifewire":
                perkInterface = new Lifewire();
                break;
            case "Living Anatomy":
                perkInterface = new LivingAnatomy();
                break;
            case "Man of Steel":
                perkInterface = new ManOfSteel();
                break;
            case "Medic":
                perkInterface = new Medic();
                break;
            case "More Critical":
                perkInterface = new MoreCritical();
                break;
            case "More HtH Criticals":
                perkInterface = new MoreHthCriticals();
                break;
            case "More Ranged Damage":
                perkInterface = new MoreRangedDamage();
                break;
            case "Pyromaniac":
                perkInterface = new Pyromaniac();
                break;
            case "Quick Pockets":
                perkInterface = new QuickPockets();
                break;
            case "Quick Recovery":
                perkInterface = new QuickRecovery();
                break;
            case "Right Between the Eyes":
                perkInterface = new RightBetweenTheEyes();
                break;
            case "Sharpshooter":
                perkInterface = new Sharpshooter();
                break;
            case "Silent Death":
                perkInterface = new SilentDeath();
                break;
            case "Silent Running":
                perkInterface = new SilentRunning();
                break;
            case "Stonewall":
                perkInterface = new Stonewall();
                break;
            case "Toughness":
                perkInterface = new Toughness();
                break;
            case "Tree Trunk Thighs":
                perkInterface = new TreeTrunkThighs();
                break;
            case "Weapon Handling":
                perkInterface = new WeaponHandling();
                break;
            case "Spray and Pray":
                perkInterface = new SprayAndPray();
                break;
            case "Way of the Fruit":
                perkInterface = new WayOfTheFruit();
                break;
        }

        return perkInterface;
    }

    public List<String> getAvailablePerks(Stats stats){
        if(!stats.isAvailablePerk()){
            return null;
        }

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
