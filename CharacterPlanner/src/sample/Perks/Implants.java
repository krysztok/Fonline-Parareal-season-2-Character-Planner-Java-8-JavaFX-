package sample.Perks;

import sample.Perks.MiscImplants.*;
import sample.Stats;

import java.util.*;

public class Implants {
    private Map<String,Integer> perksFlags;

    public Implants(){
        perksFlags = new HashMap<>();
        perksFlags.put("Adrenal Enhancement", 0);
        perksFlags.put("Cerebral Modem", 0);
        perksFlags.put("Dermal", 0);
        perksFlags.put("Eye", 0);
        perksFlags.put("Left Hand", 0);
        perksFlags.put("Left Knee", 0);
        perksFlags.put("Liver Box", 0);
        perksFlags.put("Nemean", 0);
        perksFlags.put("Noiception Clamp", 0);
        perksFlags.put("Phoenix", 0);
        perksFlags.put("Right Hand", 0);
        perksFlags.put("Right Knee", 0);
        perksFlags.put("SPECIAL +1 AG", 0);
        perksFlags.put("SPECIAL +1 CH", 0);
        perksFlags.put("SPECIAL +1 EN", 0);
        perksFlags.put("SPECIAL +1 IN", 0);
        perksFlags.put("SPECIAL +1 LK", 0);
        perksFlags.put("SPECIAL +1 PE", 0);
        perksFlags.put("SPECIAL +1 ST", 0);
    }

    public void setPerkFlag(String perk, int flag){
        perksFlags.put(perk, flag);
    }

    public Map<String, Integer> getPerksFlags() {
        return perksFlags;
    }

    public int getPerkFlag(String perk){
        return perksFlags.get(perk);
    }

    public Perk getPerkInterface(String perkName){
        Perk perkInterface = null;

        switch(perkName) {
            case "Adrenal Enhancement":
                perkInterface = new AdrenalEnhancer();
                break;
            case "Cerebral Modem":
                perkInterface = new CerebralModem();
                break;
            case "Dermal":
                perkInterface = new Dermal();
                break;
            case "Eye":
                perkInterface = new Eye();
                break;
            case "Left Hand":
                perkInterface = new LeftHand();
                break;
            case "Left Knee":
                perkInterface = new LeftKnee();
                break;
            case "Liver Box":
                perkInterface = new LiverBox();
                break;
            case "Nemean":
                perkInterface = new Nemean();
                break;
            case "Noiception Clamp":
                perkInterface = new NoiceptionClamp();
                break;
            case "Phoenix":
                perkInterface = new Phoenix();
                break;
            case "Right Hand":
                perkInterface = new RightHand();
                break;
            case "Right Knee":
                perkInterface = new RightKnee();
                break;
            case "SPECIAL +1 AG":
                perkInterface = new SpecialAg();
                break;
            case "SPECIAL +1 CH":
                perkInterface = new SpecialCh();
                break;
            case "SPECIAL +1 EN":
                perkInterface = new SpecialEn();
                break;
            case "SPECIAL +1 IN":
                perkInterface = new SpecialIn();
                break;
            case "SPECIAL +1 LK":
                perkInterface = new SpecialLk();
                break;
            case "SPECIAL +1 PE":
                perkInterface = new SpecialPe();
                break;
            case "SPECIAL +1 ST":
                perkInterface = new SpecialSt();
                break;
        }

        return perkInterface;
    }

    public List<String> getAvailablePerks(Stats stats){

        List<String> availablePerks = new ArrayList<>();
        perksFlags.forEach((k, v) -> {
            if (getPerkInterface(k).checkRequirements(stats)) {
                availablePerks.add(k);
            }
        });

        Collections.sort(availablePerks);
        return availablePerks;
    }

}
