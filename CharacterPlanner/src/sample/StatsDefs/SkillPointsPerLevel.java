package sample.StatsDefs;

import sample.Stats;

public class SkillPointsPerLevel {
    private int value;
    private int educated;
    private int skilled;
    private int gifted;

    public SkillPointsPerLevel(){
        value = 0;
        educated = 0;
        skilled = 0;
        gifted = 0;
    }

    public void setValue(Stats stats) {
        int inImpsAndPerks = stats.getSpecialWithImpsAndPerks("Intelligence");
        int base = 5 + 2 * inImpsAndPerks;
        educated = stats.getSupportPerks().getPerkFlag("Educated");
        //skilled = stats.getTraits().getTraitFlag("Skilled");
        gifted = stats.getTraits().getTraitFlag("Gifted");

        value = base + /*5 * skilled +*/ 2 * educated - 5 * gifted;
    }

    public String getValueString() {
        return Integer.toString(value);
    }

    public int getValue() {
        return value;
    }

}
