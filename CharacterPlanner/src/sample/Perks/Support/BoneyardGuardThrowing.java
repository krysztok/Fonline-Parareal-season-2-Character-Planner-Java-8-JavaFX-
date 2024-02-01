package sample.Perks.Support;

import sample.Perks.Perk;
import sample.Stats;

public class BoneyardGuardThrowing implements Perk {
    @Override
    public void onPick(Stats stats) {
        stats.getSupportPerks().setPerkFlag(getName(), 1);
        stats.getSkills().getSkill("Throwing").addSkillAdded(10);
    }

    @Override
    public boolean checkRequirements(Stats stats) {
        if(stats.getSupportPerks().getPerkFlag("Boneyard Guard +10% bg") > 0 ||
                stats.getSupportPerks().getPerkFlag("Boneyard Guard +10% ew") > 0 ||
                stats.getSupportPerks().getPerkFlag("Boneyard Guard +10% melee") > 0 ||
                stats.getSupportPerks().getPerkFlag("Boneyard Guard +10% sg") > 0 ||
                stats.getSupportPerks().getPerkFlag("Boneyard Guard +10% throwing") > 0){
            return false;
        }

        if(stats.getSkills().getSkill("Small Guns").getSkillValue() > 65 ||
                stats.getSkills().getSkill("Big Guns").getSkillValue() > 65 ||
                stats.getSkills().getSkill("Energy Weapons").getSkillValue() > 65 ||
                stats.getSkills().getSkill("Close Combat").getSkillValue() > 90 ||
                stats.getSkills().getSkill("Throwing").getSkillValue() > 90 ){
            return false;
        }

        return true;
    }

    @Override
    public String getName() {
        return "Boneyard Guard +10% throwing";
    }
}
