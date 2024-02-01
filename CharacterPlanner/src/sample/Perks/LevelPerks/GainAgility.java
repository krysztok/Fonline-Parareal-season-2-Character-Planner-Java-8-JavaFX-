package sample.Perks.LevelPerks;

import sample.Perks.Perk;
import sample.Stats;

public class GainAgility implements Perk {
    @Override
    public void onPick(Stats stats) {
        stats.getPerks().setPerkFlag(getName(), 1);
        stats.changeSpecialWithImpsAndPerks("Agility", 1);
    }

    @Override
    public boolean checkRequirements(Stats stats) {
        if(stats.getPerks().getPerkFlag(getName()) > 0){
            return false;
        }

        if(stats.getLevel() < 12){
            return false;
        }

        if(stats.getSpecialWithImpsAndPerks("Agility") > 9){
            return false;
        }

        return true;
    }

    @Override
    public String getName() {
        return "Gain Agility";
    }
}
