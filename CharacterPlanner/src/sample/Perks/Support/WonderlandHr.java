package sample.Perks.Support;

import sample.Perks.Perk;
import sample.Stats;

public class WonderlandHr implements Perk {
    @Override
    public void onPick(Stats stats) {
        stats.getSupportPerks().setPerkFlag(getName(), 1);
    }

    @Override
    public boolean checkRequirements(Stats stats) {
        if(stats.getSupportPerks().getPerkFlag("Surviving in the wild +10 HP") > 0 ||
                stats.getSupportPerks().getPerkFlag("The art of the hunt +3 CC") > 0 ||
                stats.getSupportPerks().getPerkFlag("Basic Field Medicine +20 HR") > 0){
            return false;
        }
        return true;
    }

    @Override
    public String getName() {
        return "Basic Field Medicine +20 HR";
    }
}
