package sample.StatsDefs;

import sample.Stats;

public class FireDTDR {
    private int valueDT;
    private int valueDR;
    private int phoenix;
    private int bloodymess;
    private int rotgut;


    public FireDTDR(){
        valueDT = 0;
        valueDR = 0;
        phoenix = 0;
        bloodymess = 0;
        rotgut = 0;
    }

    public void setValue(Stats stats) {
        phoenix = stats.getImplants().getPerkFlag("Phoenix");
        bloodymess = stats.getTraits().getTraitFlag("Bloody Mess");
        rotgut = stats.getDrugFlag("Rotgut");

        int phoenixDt = phoenix == 2 ? 1 : 0;

        valueDR = 4 * phoenix - 3 * bloodymess + 10 * rotgut;
        valueDT = phoenixDt;
    }

    public String getValueString() {
        return valueDT + "/" + valueDR;
    }
}
