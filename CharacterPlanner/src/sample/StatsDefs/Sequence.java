package sample.StatsDefs;

import sample.Stats;

public class Sequence {
    private int value;
    private int earlierSequence;

    public Sequence(){
        value = 0;
        earlierSequence = 0;
    }

    public String getValueString() {
        return Integer.toString(value);
    }

    public void setValue(Stats stats) {
        int peDrugs = stats.getSpecialsAfterDrugs("Perception");
        earlierSequence = stats.getPerks().getPerkFlag("Earlier Sequence");

        value = 2 * peDrugs + 2 * earlierSequence;
    }
}
