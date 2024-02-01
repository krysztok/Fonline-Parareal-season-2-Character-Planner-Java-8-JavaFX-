package sample.StatsDefs;

import sample.Stats;

public class PlasmaDTDR {
    private int valueDT;
    private int valueDR;
    private int phoenix;
    private int bloodymess;
    private int wayOfTheFruit;

    public PlasmaDTDR(){
        valueDT = 0;
        valueDR = 0;
        phoenix = 0;
        bloodymess = 0;
        wayOfTheFruit = 0;
    }

    public void setValue(Stats stats) {
        phoenix = stats.getImplants().getPerkFlag("Phoenix");
        bloodymess = stats.getTraits().getTraitFlag("Bloody Mess");

        if(stats.getPerks().getPerkFlag("Way of the Fruit") == 1){
            wayOfTheFruit = stats.getDrugFlag("Fruit");
        }

        int phoenixDt = phoenix == 2 ? 1 : 0;

        valueDR = 4 * phoenix - 3 * bloodymess + 5 * wayOfTheFruit;
        valueDT = phoenixDt;
    }

    public String getValueString() {
        return valueDT + "/" + valueDR;
    }
}
