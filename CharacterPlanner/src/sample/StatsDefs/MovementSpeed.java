package sample.StatsDefs;

import sample.Stats;

public class MovementSpeed {
    private int value;
    private int heaveHo;
    private int bonusHthAttacks;
    private int bonusHthDamage;
    private int bonusMove;
    private int smallFrame;
    private int heavyHanded;

    public MovementSpeed(){
        value = 0;
        heaveHo = 0;
        bonusHthAttacks = 0;
        bonusHthDamage = 0;
        bonusMove = 0;
        smallFrame = 0;
        heavyHanded = 0;
    }

    public void setValue(Stats stats) {
        heaveHo = stats.getPerks().getPerkFlag("Heave Ho");
        bonusHthAttacks = stats.getPerks().getPerkFlag("Bonus HtH Attacks");
        bonusHthDamage = stats.getPerks().getPerkFlag("Bonus HtH Damage");
        bonusMove = stats.getPerks().getPerkFlag("Bonus Move");

        smallFrame = stats.getTraits().getTraitFlag("Small Frame");
        heavyHanded = stats.getTraits().getTraitFlag("Heavy Handed");

        value = 5 * heaveHo + 5 * bonusHthAttacks + 5 * bonusHthDamage + 10 * bonusMove + 5 * smallFrame - 10 * heavyHanded;
    }

    public String getValueString() {
        String valueStr = Integer.toString(value);
        return value > 0 ? "+" + valueStr : valueStr;
    }
}
