package sample.StatsDefs;

import sample.Stats;

public class ViewRange {
    private int value;
    private int sharpshooter;

    public ViewRange(){
        value = 0;
        sharpshooter = 0;
    }


    public String getValueString() {
        return Integer.toString(value);
    }

    public void setValue(Stats stats) {
        int peDrugs = stats.getSpecialsAfterDrugs("Perception");
        sharpshooter = stats.getPerks().getPerkFlag("Sharpshooter");

        value = 20 + 3 * peDrugs + 6 * sharpshooter;
    }


}
