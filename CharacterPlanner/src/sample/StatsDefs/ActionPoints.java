package sample.StatsDefs;

import sample.Stats;

public class ActionPoints {
    private int value;
    private int bruiser;
    private int kamikaze;
    private int actionBoys;
    private int jet;
    private int nuka;
    private int cookie;

    public ActionPoints(){
        value = 0;
        bruiser = 0;
        kamikaze = 0;
        actionBoys = 0;
        jet = 0;
        nuka = 0;
        cookie = 0;
    }

    public void setValue(Stats stats) {
        int agDrugs = stats.getSpecialsAfterDrugs("Agility");
        bruiser = stats.getTraits().getTraitFlag("Bruiser");
        kamikaze = stats.getTraits().getTraitFlag("Kamikaze");
        actionBoys = stats.getPerks().getPerkFlag("Action Boy");
        jet = stats.getDrugFlag("Jet");
        nuka = stats.getDrugFlag("Nuka");
        cookie = stats.getDrugFlag("Cookie");

        value = 5 + (int)(agDrugs/2) + actionBoys + 2 * jet - bruiser + kamikaze + nuka + cookie;
    }


    public String getValueString() {
        return Integer.toString(value);
    }
}
