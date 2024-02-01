package sample.Traits;

import sample.Stats;

public class SmallFrame implements Trait{
    @Override
    public void onPick(Stats stats) {
        stats.getTraits().setTraitFlag(getName(), 1);
        stats.changeSpecialBase("Agility", 1 );

        stats.changeSpecialMinimum("Agility", 1);
    }

    @Override
    public void onRemove(Stats stats) {
        stats.getTraits().setTraitFlag(getName(), 0);
        stats.changeSpecialBase("Agility", -1 );

        stats.changeSpecialMinimum("Agility", -1);
    }

    @Override
    public String getName() {
        return "Small Frame";
    }
}
