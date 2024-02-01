package sample.Perks.MiscImplants;

import sample.Perks.Perk;
import sample.Stats;

public class SpecialLk implements Perk {
    @Override
    public void onPick(Stats stats) {
        stats.getImplants().setPerkFlag(getName(), 1);
        stats.changeSpecialWithImpsAndPerks("Luck", 1);
    }

    @Override
    public boolean checkRequirements(Stats stats) {
        if(stats.getImplants().getPerkFlag(getName()) > 0){
            return false;
        }

        if(stats.getLevel() < 30){
            return false;
        }

        if(stats.getSpecialWithImpsAndPerks("Luck") > 9){
            return false;
        }

        return true;
    }

    @Override
    public String getName() {
        return "SPECIAL +1 LK";
    }
}
