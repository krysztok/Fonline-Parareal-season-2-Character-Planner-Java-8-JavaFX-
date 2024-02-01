package sample.Perks.LevelPerks;

import sample.Perks.Perk;
import sample.Stats;

public class HitTheGaps implements Perk {
    @Override
    public void onPick(Stats stats) {
        stats.getPerks().setPerkFlag(getName(), 1);
    }

    @Override
    public boolean checkRequirements(Stats stats) {
        if(stats.getPerks().getPerkFlag(getName()) > 0){
            return false;
        }

        if(stats.getLevel() < 12){
            return false;
        }

        if(stats.getSkills().getSkill("Small Guns").getSkillValue() < 150 &&
                stats.getSkills().getSkill("Big Guns").getSkillValue() < 150 &&
                stats.getSkills().getSkill("Close Combat").getSkillValue() < 150 &&
                stats.getSkills().getSkill("Energy Weapons").getSkillValue() < 150 &&
                stats.getSkills().getSkill("Throwing").getSkillValue() < 150 ){
            return false;
        }

        return true;
    }

    @Override
    public String getName() {
        return "Hit the Gaps";
    }
}