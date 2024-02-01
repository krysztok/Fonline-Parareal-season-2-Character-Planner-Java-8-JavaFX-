package sample.Perks.MiscImplants;

import sample.Perks.Perk;
import sample.Stats;

public class Nemean implements Perk {
    @Override
    public void onPick(Stats stats) {
        int flag = stats.getImplants().getPerkFlag(getName());
        stats.getImplants().setPerkFlag(getName(), flag + 1);
    }

    @Override
    public boolean checkRequirements(Stats stats) {
        int perksNumber = stats.getImplants().getPerkFlag(getName());
        if(perksNumber > 1){
            return false;
        }

        if(perksNumber == 0){
            if(stats.getLevel() < 30){
                return false;
            }
        }

        if(perksNumber == 1) {
            if (stats.getLevel() < 40) {
                return false;
            }
        }

        return true;
    }

    @Override
    public String getName() {
        return "Nemean";
    }
}
