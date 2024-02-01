package sample.StatsDefs;

import sample.Stats;

public class RadiationResistance {
    private int value;
    private int radResistance;
    private int snakeater;
    private int bruiser;
    private int liverBox;
    private int mutant;

    public RadiationResistance(){
        value = 0;
        radResistance = 0;
        snakeater = 0;
        bruiser = 0;
        liverBox = 0;
    }

    public void setValue(Stats stats) {
        int enImpsAndPerks = stats.getSpecialWithImpsAndPerks("Endurance");
        bruiser = stats.getTraits().getTraitFlag("Bruiser");
        radResistance = stats.getSupportPerks().getPerkFlag("Rad Resistance");
        snakeater = stats.getSupportPerks().getPerkFlag("Snakeater");
        liverBox = stats.getImplants().getPerkFlag("Liver Box");
        mutant = stats.getMasteries().getMasteryFlag("Mutant");

        value = 2 * enImpsAndPerks + 20 * snakeater + 10 * radResistance - 10 * bruiser + 15 * liverBox + 20 * mutant;

        /*cap*/
        if (value > 95 ){
            value = 95;
        }

        if (value < 0){
            value = 0;
        }
    }

    public String getValueString() {
        return Integer.toString(value);
    }

}
