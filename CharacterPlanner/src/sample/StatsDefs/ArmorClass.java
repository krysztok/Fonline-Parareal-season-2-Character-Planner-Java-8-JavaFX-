package sample.StatsDefs;

import sample.Stats;

public class ArmorClass {
    private int value;
    private int dodger;
    private int dodgerP;
    private int hthEvade;
    private int hthEvadeP;
    private int lifewire;


    public ArmorClass(){
        value = 0;
        dodger = 0;
        dodgerP = 0;
        hthEvade = 0;
        hthEvadeP = 0;
        lifewire = 0;
    }

    public void setValue(Stats stats) {
        int agDrugs = stats.getSpecialsAfterDrugs("Agility");
        int base = 3 * agDrugs;
        dodger = stats.getPerks().getPerkFlag("Dodger");
        dodgerP = stats.getPerks().getPerkFlag("Dodger+");
        hthEvade = stats.getPerks().getPerkFlag("HtH Evade");
        hthEvadeP = stats.getPerks().getPerkFlag("HtH Evade+");

        if(lifewire > 0){
            base*=2;
        }

        value = base + 20 * dodger + 40 * dodgerP + 20 * hthEvade + 40 * hthEvadeP;

        /*ac cap*/
        if (value > 140 ){
            value = 140;
        }
    }


    public String getValueString() {
        return Integer.toString(value);
    }

}
