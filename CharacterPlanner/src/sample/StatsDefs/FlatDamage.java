package sample.StatsDefs;

import sample.Stats;

public class FlatDamage {
    private int value;
    private int fastShot;
    private int weaponHandling;

    public FlatDamage(){
        value = 0;
        fastShot = 0;
    }

    public void setValue(Stats stats) {
        fastShot = stats.getTraits().getTraitFlag("Fast Shot");
        weaponHandling = stats.getPerks().getPerkFlag("Weapon Handling");

        value = 5 * fastShot;

    }



    public String getValueString() {
        String valueStr = Integer.toString(value);
        if(weaponHandling > 0){
            valueStr += " (";
            valueStr += (value+10);
            valueStr += " with big guns)";
        }
        return valueStr;
    }
}
