package sample.Perks.LevelPerks;

import sample.Perks.Perk;
import sample.Stats;

public class HeaveHo implements Perk {
    @Override
    public void onPick(Stats stats) {
        int flag = stats.getPerks().getPerkFlag(getName());
        stats.getPerks().setPerkFlag(getName(), flag + 1);
    }

    @Override
    public boolean checkRequirements(Stats stats) {
        int perksNumber = stats.getPerks().getPerkFlag(getName());

        if (perksNumber > 1) {
            return false;
        }

        if(perksNumber == 0) {
            if(stats.getLevel() < 6){
                return false;
            }

            if(stats.getSkills().getSkill("Throwing").getSkillValue() < 100){
                return false;
            }
        }

        if(perksNumber == 1) {
            if(stats.getLevel() < 9){
                return false;
            }

            if(stats.getSkills().getSkill("Throwing").getSkillValue() < 150){
                return false;
            }
        }

        return true;
    }

    @Override
    public String getName() {
        return "Heave Ho";
    }
}
