package sample.Perks.LevelPerks;


import sample.Perks.Perk;
import sample.Stats;

public class ActionBoy implements Perk {
    @Override
    public void onPick(Stats stats) {
        int flag = stats.getPerks().getPerkFlag(getName());
        stats.getPerks().setPerkFlag(getName(), flag + 1);
    }

    @Override
    public boolean checkRequirements(Stats stats) {
        int perksNumber = stats.getPerks().getPerkFlag(getName());
        if(perksNumber > 1){
            return false;
        }

        if(perksNumber == 0){
            if(stats.getLevel() < 12){
                return false;
            }
        }

        if(perksNumber == 1){
            if(stats.getLevel() < 15){
                return false;
            }
        }

        if(stats.getSpecialWithImpsAndPerks("Agility") < 6){
            return false;
        }

        return true;
    }

    @Override
    public String getName() {
        return "Action Boy";
    }
}
