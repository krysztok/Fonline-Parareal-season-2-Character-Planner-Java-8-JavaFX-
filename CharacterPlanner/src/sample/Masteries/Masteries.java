package sample.Masteries;
import sample.Perks.Perk;
import sample.Stats;

import java.util.*;

public class Masteries {
    private Map<String,Integer> masteriesFlags;
    private boolean masteryTaken;

    public Masteries(){
        masteryTaken = false;

        masteriesFlags = new HashMap<>();
        masteriesFlags.put("Tank", 0);
        masteriesFlags.put("Rambo", 0);
        masteriesFlags.put("Sweet Science", 0);
        masteriesFlags.put("Mutant", 0);
    }

    public void setMasteriesFlags(String trait, int flag){
        masteriesFlags.put(trait, flag);
    }

    public Map<String, Integer> getMasteriesFlags() {
        return masteriesFlags;
    }

    public int getMasteryFlag(String mastery){
        return masteriesFlags.get(mastery);
    }

    public Perk getMasteryInterface(String name){
        Perk masteryInterface = null;

        switch(name) {
            case "Tank":
                masteryInterface = new Tank();
                break;
            case "Rambo":
                masteryInterface = new Rambo();
                break;
            case "Sweet Science":
                masteryInterface = new SweetScience();
                break;
            case "Mutant":
                masteryInterface = new Mutant();
                break;
        }
        return masteryInterface;
    }

    public List<String> getAvailableMasteries(Stats stats){

        List<String> availableMasteries = new ArrayList<>();
        masteriesFlags.forEach((k, v) -> {
            if (getMasteryInterface(k).checkRequirements(stats)) {
                availableMasteries.add(k);
            }
        });

        Collections.sort(availableMasteries);
        return availableMasteries;
    }

    public boolean isMasteryTaken() {
        return masteryTaken;
    }

    public void setMasteryTaken(boolean masteryTaken) {
        this.masteryTaken = masteryTaken;
    }
}
