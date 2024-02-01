package sample.Perks.LevelPerks;

import sample.Perks.Perk;
import sample.Stats;

public class Lifegiver implements Perk {
    @Override
    public void onPick(Stats stats) {
        int flag = stats.getPerks().getPerkFlag(getName());
        stats.getPerks().setPerkFlag(getName(), flag + 1);
    }

    @Override
    public boolean checkRequirements(Stats stats){
        int perksNumber = stats.getPerks().getPerkFlag(getName());
        if(perksNumber > 2){
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

        if(perksNumber == 2){
            if(stats.getLevel() < 18){
                return false;
            }
        }

        if(perksNumber == 0 && stats.getSpecialWithImpsAndPerks("Endurance") < 5){
            return false;
        } else if (perksNumber == 1 && stats.getSpecialWithImpsAndPerks("Endurance") < 6){
            return false;
        } else if (perksNumber == 2 && stats.getSpecialWithImpsAndPerks("Endurance") < 7){
            return false;
        }

        return true;
    }

    @Override
    public String getName() {
        return "Lifegiver";
    }
}
