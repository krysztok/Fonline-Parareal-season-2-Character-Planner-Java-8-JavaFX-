package sample.StatsDefs;

import sample.Stats;

public class MeleeDamage {
    private int value;
    private int bonusHthDamage;
    private int heavyHanded;
    private int rightHand;
    private int sweetScience;

    public MeleeDamage(){
        value = 0;
        bonusHthDamage = 0;
        rightHand = 0;
    }

    public void setValue(Stats stats) {
        int stImpsAndPerks = stats.getSpecialWithImpsAndPerks("Strength");
        int base = stImpsAndPerks > 6 ? (1 + stImpsAndPerks - 6) : 1;
        heavyHanded = stats.getTraits().getTraitFlag("Heavy Handed");
        bonusHthDamage = stats.getPerks().getPerkFlag("Bonus HtH Damage");
        rightHand = stats.getImplants().getPerkFlag("Right Hand");
        sweetScience = stats.getMasteries().getMasteryFlag("Sweet Science");

        value = base + 7 * bonusHthDamage + 5 * heavyHanded + 6 * rightHand + 10 *sweetScience;
    }

    public String getValueString() {
        return Integer.toString(value);
    }
}
