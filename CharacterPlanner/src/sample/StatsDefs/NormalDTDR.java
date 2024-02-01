package sample.StatsDefs;

import sample.Stats;

public class NormalDTDR {
    private int valueDT;
    private int valueDR;
    private int toughness;
    private int evenTougher;
    private int jet;
    private int psycho;
    private int beer;
    private int dermal;
    private int bloodymess;
    private int mutant;
    private int tank;
    private int sweetScience;


    public NormalDTDR(){
        valueDT = 0;
        valueDR = 0;
        toughness = 0;
        evenTougher = 0;
        jet = 0;
        psycho = 0;
        dermal = 0;
        bloodymess = 0;
    }

    public void setValue(Stats stats) {
        toughness = stats.getPerks().getPerkFlag("Toughness");
        evenTougher = stats.getPerks().getPerkFlag("Even Tougher");
        jet = stats.getDrugFlag("Jet");
        psycho = stats.getDrugFlag("Psycho");
        dermal = stats.getImplants().getPerkFlag("Dermal");
        bloodymess = stats.getTraits().getTraitFlag("Bloody Mess");
        mutant = stats.getMasteries().getMasteryFlag("Mutant");
        tank = stats.getMasteries().getMasteryFlag("Tank");
        sweetScience = stats.getMasteries().getMasteryFlag("Sweet Science");

        int dermalDt = dermal == 2 ? 1 : 0;

        valueDT = 2 * toughness + 3 * evenTougher + dermalDt + 3 * mutant + 2 * tank;
        valueDR = 5 * toughness + 10 * evenTougher - 15 * jet + 15 * psycho + 4 * dermal - 3 * bloodymess + 10 * mutant + 5 * tank + 10 * sweetScience;
    }

    public String getValueString() {
        return valueDT + "/" + valueDR;
    }


}
