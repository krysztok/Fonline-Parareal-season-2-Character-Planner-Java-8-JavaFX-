package sample.Traits;

import sample.Stats;

public class Bruiser implements Trait{

    @Override
    public void onPick(Stats stats) {
        stats.getTraits().setTraitFlag(getName(), 1);
        stats.changeSpecialBase("Strength", 4 );

        stats.changeSpecialMinimum("Strength", 4);

        if(stats.getTraits().getTraitFlag("Brutish Hulk") == 1){
            stats.changeSpecialBase("Charisma", -1 );
        }

    }

    @Override
    public void onRemove(Stats stats) {
        stats.getTraits().setTraitFlag(getName(), 0);
        stats.changeSpecialBase("Strength", -4 );

        stats.changeSpecialMinimum("Strength", -4);

        if(stats.getTraits().getTraitFlag("Brutish Hulk") == 1){
            stats.changeSpecialBase("Charisma", 1 );
        }
    }

    @Override
    public String getName() {
        return "Bruiser";
    }
}
