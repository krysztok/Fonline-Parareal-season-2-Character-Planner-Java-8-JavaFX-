package sample.Traits;

import sample.Stats;

public class Kamikaze implements Trait{
    @Override
    public void onPick(Stats stats) {
        stats.getTraits().setTraitFlag(getName(), 1);
    }

    @Override
    public void onRemove(Stats stats) {
        stats.getTraits().setTraitFlag(getName(), 0);
    }

    @Override
    public String getName() {
        return "Kamikaze";
    }
}
