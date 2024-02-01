package sample.Traits;

import sample.Stats;

public class Skilled implements Trait{
    @Override
    public void onPick(Stats stats) {
        stats.getTraits().setTraitFlag(getName(), 1);
        stats.setLevelsNewPerk(4);
    }

    @Override
    public void onRemove(Stats stats) {
        stats.getTraits().setTraitFlag(getName(), 0);
        stats.setLevelsNewPerk(3);
    }

    @Override
    public String getName() {
        return "Skilled";
    }
}
