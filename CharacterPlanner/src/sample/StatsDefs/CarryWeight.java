package sample.StatsDefs;

import sample.Stats;

public class CarryWeight {
    private int value;
    private int smallFrame;
    private int strongBack;
    private int packRat;
    private int leftKnee;

    public CarryWeight(){
        value = 0;
        smallFrame = 0;
        strongBack = 0;
        packRat = 0;
        leftKnee = 0;
    }


    public void setValue(Stats stats) {
        int stDrugs = stats.getSpecialsAfterDrugs("Strength");
        smallFrame = stats.getTraits().getTraitFlag("Small Frame");
        int baseStMultiplier = smallFrame == 0? 25 : 15;
        int base = (int)((( 25 + (stDrugs * baseStMultiplier)) / 2.2) + 20);
        strongBack = stats.getSupportPerks().getPerkFlag("Strong Back");
        packRat = stats.getSupportPerks().getPerkFlag("Pack Rat");
        leftKnee = stats.getImplants().getPerkFlag("Left Knee");

        value =  (int)((base * (3 + packRat) / 3) + 22 * strongBack + 50 * leftKnee);
    }

    public String getValueString() {
        return Integer.toString(value);
    }
}
