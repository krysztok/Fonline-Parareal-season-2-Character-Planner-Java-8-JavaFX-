package sample.Perks.LevelPerks;

import sample.Perks.Perk;
import sample.Stats;

public class InYourFace implements Perk {
    @Override
    public void onPick(Stats stats) {
        stats.getPerks().setPerkFlag(getName(), 1);
    }

    @Override
    public boolean checkRequirements(Stats stats) {
        if(stats.getPerks().getPerkFlag(getName()) > 0){
            return false;
        }

        if(stats.getLevel() < 6){
            return false;
        }

        if(stats.getSkills().getSkill("Small Guns").getSkillValue() < 125 &&
                stats.getSkills().getSkill("Big Guns").getSkillValue() < 125 &&
                stats.getSkills().getSkill("Close Combat").getSkillValue() < 125 &&
                stats.getSkills().getSkill("Energy Weapons").getSkillValue() < 125 &&
                stats.getSkills().getSkill("Throwing").getSkillValue() < 125 ){
            return false;
        }

        return true;
    }

    @Override
    public String getName() {
        return "In Your Face!";
    }
}
