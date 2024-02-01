package sample.Perks.Support;

import sample.Perks.Perk;
import sample.Stats;

public class DeadManWalking implements Perk {
    @Override
    public void onPick(Stats stats) {
        stats.getSupportPerks().setPerkFlag(getName(), 1);
    }

    @Override
    public boolean checkRequirements(Stats stats) {
        if(stats.getSupportPerks().getPerkFlag(getName()) > 0){
            return false;
        }

        if(stats.getSpecialWithImpsAndPerks("Intelligence") < 5 ||
                stats.getSkills().getSkill("Doctor").getSkillValue() < 50){
            return false;
        }

        return true;
    }

    @Override
    public String getName() {
        return "Dead Man Walking";
    }
}
