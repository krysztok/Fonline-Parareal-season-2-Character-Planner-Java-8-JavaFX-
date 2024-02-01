package sample.Perks.MiscImplants;

import sample.Perks.Perk;
import sample.Stats;

public class RightHand implements Perk {
    @Override
    public void onPick(Stats stats) {
        stats.getImplants().setPerkFlag(getName(), 1);
    }

    @Override
    public boolean checkRequirements(Stats stats) {
        if(stats.getImplants().getPerkFlag("Left Hand") > 0 || stats.getImplants().getPerkFlag("Right Hand") > 0){
            return false;
        }

        if(stats.getLevel() < 30){
            return false;
        }

        return true;
    }

    @Override
    public String getName() {
        return "Right Hand";
    }
}
