package sample.Perks.Support;

import sample.Perks.Perk;
import sample.Stats;

public class FasterHealing implements Perk {
    @Override
    public void onPick(Stats stats) {
        stats.getSupportPerks().setPerkFlag(getName(), 1);
    }

    @Override
    public boolean checkRequirements(Stats stats) {
        if(stats.getSupportPerks().getPerkFlag(getName()) > 0){
            return false;
        }

        if(stats.getSkills().getSkill("Doctor").getSkillValue() < 200 ||
                stats.getSkills().getSkill("First Aid").getSkillValue() < 200){
            return false;
        }

        return true;
    }

    @Override
    public String getName() {
        return "Faster Healing";
    }
}
