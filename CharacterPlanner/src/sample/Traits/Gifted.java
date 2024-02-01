package sample.Traits;

import sample.Stats;

public class Gifted implements Trait{
    @Override
    public void onPick(Stats stats) {
        stats.getTraits().setTraitFlag(getName(), 1);
        stats.changeSpecialBase("Strength", 1 );
        stats.changeSpecialBase("Perception", 1 );
        stats.changeSpecialBase("Endurance", 1 );
        stats.changeSpecialBase("Charisma", 1 );
        stats.changeSpecialBase("Intelligence", 1 );
        stats.changeSpecialBase("Agility", 1 );
        stats.changeSpecialBase("Luck", 1 );

        stats.changeSpecialMinimum("Strength", 1);
        stats.changeSpecialMinimum("Perception", 1);
        stats.changeSpecialMinimum("Endurance", 1);
        stats.changeSpecialMinimum("Charisma", 1);
        stats.changeSpecialMinimum("Intelligence", 1);
        stats.changeSpecialMinimum("Agility", 1);
        stats.changeSpecialMinimum("Luck", 1);
    }

    @Override
    public void onRemove(Stats stats) {
        stats.getTraits().setTraitFlag(getName(), 0);
        stats.changeSpecialBase("Strength", -1 );
        stats.changeSpecialBase("Perception", -1 );
        stats.changeSpecialBase("Endurance", -1 );
        stats.changeSpecialBase("Charisma", -1 );
        stats.changeSpecialBase("Intelligence", -1 );
        stats.changeSpecialBase("Agility", -1 );
        stats.changeSpecialBase("Luck", -1 );

        stats.changeSpecialMinimum("Strength", -1);
        stats.changeSpecialMinimum("Perception", -1);
        stats.changeSpecialMinimum("Endurance", -1);
        stats.changeSpecialMinimum("Charisma", -1);
        stats.changeSpecialMinimum("Intelligence", -1);
        stats.changeSpecialMinimum("Agility", -1);
        stats.changeSpecialMinimum("Luck", -1);
    }

    @Override
    public String getName() {
        return "Gifted";
    }
}
