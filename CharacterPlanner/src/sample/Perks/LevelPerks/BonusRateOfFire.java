package sample.Perks.LevelPerks;

import sample.Perks.Perk;
import sample.Stats;

public class BonusRateOfFire implements Perk {
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

        if(stats.getSkills().getSkill("Small Guns").getSkillValue() < 180 &&
                stats.getSkills().getSkill("Big Guns").getSkillValue() < 180 &&
                stats.getSkills().getSkill("Energy Weapons").getSkillValue() < 180 &&
                stats.getSkills().getSkill("Throwing").getSkillValue() < 180 ){
            return false;
        }

        return true;
    }

    @Override
    public String getName() {
        return "Bonus Rate of Fire";
    }
}
