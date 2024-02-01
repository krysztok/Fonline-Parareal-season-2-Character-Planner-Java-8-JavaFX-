package sample.StatsDefs;

import sample.Stats;

public class ElectroDTDR {
    private int valueDT;
    private int valueDR;
    private int cerebralModem;
    private int bloodymess;


    public ElectroDTDR(){
        valueDT = 0;
        valueDR = 0;
        cerebralModem = 0;
        bloodymess = 0;
    }

    public void setValue(Stats stats) {
        cerebralModem = stats.getImplants().getPerkFlag("Cerebral Modem");
        bloodymess = stats.getTraits().getTraitFlag("Bloody Mess");

        valueDR = 10 * cerebralModem - 3 * bloodymess;
        valueDT = 0;
    }

    public String getValueString() {
        return valueDT + "/" + valueDR;
    }
}
