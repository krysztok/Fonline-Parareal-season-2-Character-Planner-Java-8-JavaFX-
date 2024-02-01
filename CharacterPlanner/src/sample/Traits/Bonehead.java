package sample.Traits;

import sample.Stats;

public class Bonehead implements Trait{
    @Override
    public void onPick(Stats stats) {
        stats.getTraits().setTraitFlag(getName(), 1);
        stats.changeSpecialBase("Intelligence", -1 );
    }

    @Override
    public void onRemove(Stats stats) {
        stats.getTraits().setTraitFlag(getName(), 0);
        stats.changeSpecialBase("Intelligence", 1 );
    }

    @Override
    public String getName() {
        return "Bonehead";
    }
}
