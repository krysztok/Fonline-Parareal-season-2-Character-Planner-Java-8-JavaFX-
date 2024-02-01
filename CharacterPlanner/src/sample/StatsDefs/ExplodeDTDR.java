package sample.StatsDefs;

import sample.Stats;

public class ExplodeDTDR {
    private int valueDT;
    private int valueDR;
    private int dermal;
    private int bloodymess;

    public ExplodeDTDR(){
        valueDT = 0;
        valueDR = 0;
        dermal = 0;
        bloodymess = 0;
    }

    public void setValue(Stats stats) {
        dermal = stats.getImplants().getPerkFlag("Dermal");
        int dermalDt = dermal == 2 ? 1 : 0;
        bloodymess = stats.getTraits().getTraitFlag("Bloody Mess");

        valueDR = 4 * dermal - 3 * bloodymess;
        valueDT = dermalDt;
    }

    public String getValueString() {
        return valueDT + "/" + valueDR;
    }
}
