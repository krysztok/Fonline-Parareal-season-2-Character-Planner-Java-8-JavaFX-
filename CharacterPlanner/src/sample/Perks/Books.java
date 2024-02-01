package sample.Perks;

import sample.Perks.MiscBooks.*;
import sample.Stats;

import java.util.*;

public class Books {
    private Map<String,Integer> perksFlags;

    public Books(){
        perksFlags = new HashMap<>();
        perksFlags.put("10x Barter Books", 0);
        perksFlags.put("10x Big Gun Books", 0);
        perksFlags.put("10x Close Combat Books", 0);
        perksFlags.put("10x Doctor Books", 0);
        perksFlags.put("10x Energy Weapons Books", 0);
        perksFlags.put("10x First Aid Books", 0);
        perksFlags.put("10x Lockpick Books", 0);
        perksFlags.put("10x Outdoorsman Books", 0);
        perksFlags.put("10x Repair Books", 0);
        perksFlags.put("10x Science Books", 0);
        perksFlags.put("10x Small Guns Books", 0);
        perksFlags.put("10x Throwing Books", 0);
        perksFlags.put("10x Traps Books", 0);
        perksFlags.put("10x Sneak Books", 0);
        perksFlags.put("10x Steal Books", 0);
        perksFlags.put("10x Speech Books", 0);
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
            case "10x Barter Books":
                perkInterface = new BarterBooks();
                break;
            case "10x Big Gun Books":
                perkInterface = new BigGunsBooks();
                break;
            case "10x Close Combat Books":
                perkInterface = new CloseCombatBooks();
                break;
            case "10x Doctor Books":
                perkInterface = new DoctorBooks();
                break;
            case "10x Energy Weapons Books":
                perkInterface = new EnergyWeaponsBooks();
                break;
            case "10x First Aid Books":
                perkInterface = new FirstAidBooks();
                break;
            case "10x Lockpick Books":
                perkInterface = new LockpickBooks();
                break;
            case "10x Outdoorsman Books":
                perkInterface = new OutdoorsmanBooks();
                break;
            case "10x Repair Books":
                perkInterface = new RepairBooks();
                break;
            case "10x Science Books":
                perkInterface = new ScienceBooks();
                break;
            case "10x Small Guns Books":
                perkInterface = new SmallGunsBooks();
                break;
            case "10x Throwing Books":
                perkInterface = new ThrowingBooks();
                break;
            case "10x Traps Books":
                perkInterface = new TrapsBook();
                break;
            case "10x Sneak Books":
                perkInterface = new SneakBooks();
                break;
            case "10x Steal Books":
                perkInterface = new StealBooks();
                break;
            case "10x Speech Books":
                perkInterface = new SpeechBooks();
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
