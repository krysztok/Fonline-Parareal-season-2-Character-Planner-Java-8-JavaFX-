package sample.StatsDefs;

import sample.Stats;

public class HealingRate {
    private int value;
    private int fasterHealing;
    private int livingAnatomy;
    private int adrenalEnhancement;
    private int mutant;
    private int wonderlandHr;
    private int roentgen;
    private int cookie;
    private int bruiser;

    public HealingRate(){
        value = 0;
        fasterHealing = 0;
        livingAnatomy = 0;
        adrenalEnhancement = 0;
        cookie = 0;
        wonderlandHr = 0;
    }

    public void setValue(Stats stats) {
        int enImpsAndPerks = stats.getSpecialWithImpsAndPerks("Endurance");
        int base = (int)(12 + enImpsAndPerks / 2);
        fasterHealing = stats.getSupportPerks().getPerkFlag("Faster Healing");
        livingAnatomy = stats.getPerks().getPerkFlag("Living Anatomy");
        adrenalEnhancement = stats.getImplants().getPerkFlag("Adrenal Enhancement");
        mutant = stats.getMasteries().getMasteryFlag("Mutant");
        wonderlandHr = stats.getSupportPerks().getPerkFlag("Basic Field Medicine +20 HR");
        roentgen = stats.getDrugFlag("Roentgen");
        cookie = stats.getDrugFlag("Cookie");
        bruiser = stats.getTraits().getTraitFlag("Bruiser");

        value = base + 20 * fasterHealing + 10 * livingAnatomy + 10 * adrenalEnhancement + 10 * mutant + 20 * wonderlandHr + 20 * roentgen + 20 * cookie - 10 * bruiser;
    }

    public String getValueString() {
        return Integer.toString(value);
    }

}
