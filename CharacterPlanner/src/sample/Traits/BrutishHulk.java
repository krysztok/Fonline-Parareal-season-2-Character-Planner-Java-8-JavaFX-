package sample.Traits;

import sample.Stats;

public class BrutishHulk implements Trait{
    @Override
    public void onPick(Stats stats) {
        stats.getTraits().setTraitFlag(getName(), 1);

        int byValue = stats.getTraits().getTraitFlag("Bruiser") == 0? -1 : -2;
        stats.changeSpecialBase("Charisma", byValue );

    }

    @Override
    public void onRemove(Stats stats) {
        stats.getTraits().setTraitFlag(getName(), 0);

        int byValue = stats.getTraits().getTraitFlag("Bruiser") == 0? 1 : 2;
        stats.changeSpecialBase("Charisma", byValue);

    }

    @Override
    public String getName() {
        return "Brutish Hulk";
    }
}
