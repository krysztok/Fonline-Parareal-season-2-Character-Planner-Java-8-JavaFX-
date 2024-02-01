package sample.Perks.LevelPerks;

import sample.Perks.Perk;
import sample.Stats;

public class TreeTrunkThighs implements Perk {
    @Override
    public void onPick(Stats stats) {
        stats.getPerks().setPerkFlag(getName(), 1);
    }

    @Override
    public boolean checkRequirements(Stats stats) {
        if(stats.getPerks().getPerkFlag(getName()) > 0){
            return false;
        }

        if(stats.getLevel() < 6){
            return false;
        }

        if(stats.getSpecialWithImpsAndPerks("Endurance") < 6){
            return false;
        }

        return true;
    }

    @Override
    public String getName() {
        return "Tree Trunk Thighs";
    }
}
