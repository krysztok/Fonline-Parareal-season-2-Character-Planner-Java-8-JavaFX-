package sample.Perks.MiscImplants;

import sample.Perks.Perk;
import sample.Stats;

public class LiverBox implements Perk {
    @Override
    public void onPick(Stats stats) {
        stats.getImplants().setPerkFlag(getName(), 1);
    }

    @Override
    public boolean checkRequirements(Stats stats) {
        if(stats.getImplants().getPerkFlag("Liver Box") > 0 || stats.getImplants().getPerkFlag("Adrenal Enhancement") > 0){
            return false;
        }

        if(stats.getLevel() < 30){
            return false;
        }

        return true;
    }

    @Override
    public String getName() {
        return "Liver Box";
    }
}
