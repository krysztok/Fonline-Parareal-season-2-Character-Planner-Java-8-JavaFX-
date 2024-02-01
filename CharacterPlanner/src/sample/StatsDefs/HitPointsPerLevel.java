package sample.StatsDefs;

import sample.Stats;

public class HitPointsPerLevel{

    private int value;
    private boolean odd;
    private int brutishHulk;
    private int bruiser;

    public HitPointsPerLevel(){
        value = 0;
        odd = false;
        brutishHulk = 0;
        bruiser = 0;
    }

    public String getValueString() {
        String string = "" + value;
        if(odd){
            string += " - " +  (value + 1);
        }

        return string;
    }

    public void setValue(Stats stats) {
        int endImpsAndPerks = stats.getSpecialWithImpsAndPerks("Endurance");
        bruiser = stats.getTraits().getTraitFlag("Bruiser");
        brutishHulk = stats.getTraits().getTraitFlag("Brutish Hulk");

        odd = endImpsAndPerks%2 != 0? true : false;

        value = (int)(0.5 * endImpsAndPerks);

        if(brutishHulk > 0){
            value = bruiser > 0 ? value + 2 : value + 1;
        }

    }

    public boolean isOdd() {
        return odd;
    }

    public int getValue() {
        return value;
    }
}
