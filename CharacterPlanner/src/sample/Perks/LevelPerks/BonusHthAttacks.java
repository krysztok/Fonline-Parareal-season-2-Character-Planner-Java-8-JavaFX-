package sample.Perks.LevelPerks;

import sample.Perks.Perk;
import sample.Stats;

public class BonusHthAttacks implements Perk {
    @Override
    public void onPick(Stats stats) {
        stats.getPerks().setPerkFlag(getName(), 1);
    }

    @Override
    public boolean checkRequirements(Stats stats){
        if(stats.getPerks().getPerkFlag(getName()) > 0){
            return false;
        }

        if(stats.getLevel() < 18){
            return false;
        }

        if(stats.getSkills().getSkill("Close Combat").getSkillValue() < 180){
            return false;
        }

        return true;
    }

    @Override
    public String getName() {
        return "Bonus HtH Attacks";
    }
}
