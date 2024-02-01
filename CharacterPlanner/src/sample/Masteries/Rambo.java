package sample.Masteries;

import sample.Perks.Perk;
import sample.Stats;

public class Rambo implements Perk {
    @Override
    public void onPick(Stats stats) {
        stats.getMasteries().setMasteriesFlags(getName(), 1);
        stats.getMasteries().setMasteryTaken(true);
    }

    @Override
    public boolean checkRequirements(Stats stats) {
        if(stats.getMasteries().isMasteryTaken()){
            return false;
        }

        if(stats.getLevel() < 30){
            return false;
        }

        return true;
    }

    @Override
    public String getName() {
        return "Rambo";
    }
}
