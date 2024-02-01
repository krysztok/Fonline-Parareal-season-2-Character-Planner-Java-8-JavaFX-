package sample.Perks.Support;

import sample.Perks.Perk;
import sample.Stats;

public class CautiousNature implements Perk {
    @Override
    public void onPick(Stats stats) {
        stats.getSupportPerks().setPerkFlag(getName(), 1);
    }

    @Override
    public boolean checkRequirements(Stats stats) {
        if(stats.getSupportPerks().getPerkFlag(getName()) > 0){
            return false;
        }

        if(stats.getSpecialWithImpsAndPerks("Perception") < 6 ||
                stats.getSkills().getSkill("Outdoorsman").getSkillValue() < 100){
            return false;
        }

        return true;
    }

    @Override
    public String getName() {
        return "Cautious Nature";
    }
}
