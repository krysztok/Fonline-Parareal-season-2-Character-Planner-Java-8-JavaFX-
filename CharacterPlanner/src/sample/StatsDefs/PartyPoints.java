package sample.StatsDefs;

import sample.Stats;

public class PartyPoints {
    private int value;
    private int magneticPersonality;
    private int goodNatured;

    public PartyPoints(){
        value = 0;
        magneticPersonality = 0;
        goodNatured = 0;
    }

    public void setValue(Stats stats) {
        int speech = stats.getSkills().getSkill("Speech").getSkillValue();
        int speechPP = (int)(speech / 3);
        int chDrugs = stats.getSpecialsAfterDrugs("Charisma");
        magneticPersonality = stats.getSupportPerks().getPerkFlag("Magnetic Personality");
        goodNatured = stats.getTraits().getTraitFlag("Good Natured");

        value = speechPP + 10 * chDrugs + 50 * magneticPersonality + 50 * goodNatured;
    }

    public String getValueString() {
        return Integer.toString(value);
    }
}
