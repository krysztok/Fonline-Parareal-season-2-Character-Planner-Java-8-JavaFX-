package sample.StatsDefs;

import sample.Stats;

public class CriticalChance {
    private int value;
    private int finesse;
    private int moreCritical;
    private int evenMoreCriticals;
    private int bloodyMess;
    private int eye;
    private int wonderlandCC;
    private int rambo;

    public CriticalChance() {
        value = 0;
        finesse = 0;
        moreCritical = 0;
        evenMoreCriticals = 0;
        bloodyMess = 0;
        eye = 0;
        wonderlandCC = 0;
    }

    public void setValue(Stats stats) {
        int lkDrugs = stats.getSpecialsAfterDrugs("Luck");
        finesse = stats.getTraits().getTraitFlag("Finesse");
        moreCritical = stats.getPerks().getPerkFlag("More Critical");
        evenMoreCriticals = stats.getPerks().getPerkFlag("Even More Criticals");
        bloodyMess = stats.getTraits().getTraitFlag("Bloody Mess");
        eye = stats.getImplants().getPerkFlag("Eye");
        wonderlandCC = stats.getSupportPerks().getPerkFlag("The art of the hunt +3 CC");
        rambo = stats.getMasteries().getMasteryFlag("Rambo");

        value = lkDrugs + 10 * finesse + 5 * moreCritical + 10 * evenMoreCriticals + 5 * bloodyMess + 10 * eye + 3 * wonderlandCC + 5 * rambo;
    }

    public String getValueString() {
        return Integer.toString(value);
    }
}
