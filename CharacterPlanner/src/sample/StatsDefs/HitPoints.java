package sample.StatsDefs;


import sample.Stats;

public class HitPoints {
    private int value;
    private int hpFromLevels;
    private int lifegivers;
    private int nemeans;
    private int noiception;
    private int mutant;
    private int tank;
    private int wonderlandHp;
    private int buffout;
    private int rotgut;
    private int cookie;
    private int smittysMeal;
    private int enduranceImp;

    public HitPoints(){
        value = 0;
        hpFromLevels = 0;
        lifegivers = 0;
        rotgut = 0;
        cookie = 0;
        wonderlandHp = 0;
        smittysMeal = 0;
        enduranceImp = 0;
    }

    public String getValueString() {
        return Integer.toString(value);
    }

    public void setValue(Stats stats) {
        int stImpsAndPerks = stats.getSpecialWithImpsAndPerks("Strength");
        int baseEnd = stats.getSpecialWithImpsAndPerks("Endurance");
        int base = 55 + stImpsAndPerks + 2 * baseEnd;

        /*hp from levels*/
        int level = stats.getLevel() < 25? stats.getLevel() : 24;
        HitPointsPerLevel hitPointsPerLevel = stats.getHitPointsPerLevelObject();
        int hpPerLevel = hitPointsPerLevel.getValue();
        boolean isOdd = hitPointsPerLevel.isOdd();

        hpFromLevels = (level-1) * hpPerLevel; //-1 because no add hp on 1st level
        if(isOdd){
            hpFromLevels += (int)(level/2);
        }

        /****************/

        lifegivers = stats.getPerks().getPerkFlag("Lifegiver");
        /*int lifegiversHp = 0;
        if(lifegivers == 1){
            lifegiversHp = 40;
        } else if (lifegivers == 2){
            lifegiversHp = 70;
        } else if (lifegivers == 3){
            lifegiversHp = 90;
        }*/

        nemeans = stats.getImplants().getPerkFlag("Nemean");
        noiception = stats.getImplants().getPerkFlag("Noiception Clamp");

        buffout = stats.getDrugFlag("Buffout");
        rotgut = stats.getDrugFlag("Rotgut");
        cookie = stats.getDrugFlag("Cookie");

        mutant = stats.getMasteries().getMasteryFlag("Mutant");
        tank = stats.getMasteries().getMasteryFlag("Tank");

        wonderlandHp = stats.getSupportPerks().getPerkFlag("Surviving in the wild +10 HP");
        smittysMeal = stats.getSupportPerks().getPerkFlag("Smitty's Meal +5 HP");

        enduranceImp = stats.getImplants().getPerkFlag("SPECIAL +1 EN");

        value = base + hpFromLevels + 20 * nemeans + 50 * noiception + 40 * lifegivers + 100 * mutant + 20 * tank + 20 * buffout - 10 * rotgut + 10 * cookie + 10 * wonderlandHp + 5 * smittysMeal + 2 * enduranceImp;
    }

}
