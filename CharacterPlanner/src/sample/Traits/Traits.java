package sample.Traits;

import java.util.HashMap;
import java.util.Map;

public class Traits {
    private Map<String,Integer> traitsFlags;

    public Traits(){
        traitsFlags = new HashMap<>();
        traitsFlags.put("Fast Metabolism", 0);
        traitsFlags.put("Bruiser", 0);
        traitsFlags.put("One Hander", 0);
        traitsFlags.put("Finesse", 0);
        traitsFlags.put("Kamikaze", 0);
        traitsFlags.put("Heavy Handed", 0);
        traitsFlags.put("Fast Shot", 0);
        traitsFlags.put("Bloody Mess", 0);
        traitsFlags.put("Jinxed", 0);
        traitsFlags.put("Good Natured", 0);
        //traitsFlags.put("Chem Reliant", 0);
        traitsFlags.put("Bonehead", 0);
        //traitsFlags.put("Skilled", 0);
        traitsFlags.put("Small Frame", 0);
        traitsFlags.put("Loner", 0);
        traitsFlags.put("Gifted", 0);
        traitsFlags.put("Brutish Hulk", 0);
    }

    public void setTraitFlag(String trait, int flag){
        traitsFlags.put(trait, flag);
    }

    public Map<String, Integer> getTraitsFlags() {
        return traitsFlags;
    }

    public int getTraitFlag(String trait){
        return traitsFlags.get(trait);
    }

    public Trait getTraitInterface(String name){
        Trait traitInterface = null;

        switch(name) {
            case "Bloody Mess":
                traitInterface = new BloodyMess();
                break;
            case "Bonehead":
                traitInterface = new Bonehead();
                break;
            case "Bruiser":
                traitInterface = new Bruiser();
                break;
          /*  case "Chem Reliant":
                traitInterface = new ChemReliant();
                break;*/
            case "Fast Metabolism":
                traitInterface = new FastMetabolism();
                break;
            case "Fast Shot":
                traitInterface = new FastShot();
                break;
            case "Finesse":
                traitInterface = new Finesse();
                break;
            case "Good Natured":
                traitInterface = new GoodNatured();
                break;
            case "Heavy Handed":
                traitInterface = new HeavyHanded();
                break;
            case "Jinxed":
                traitInterface = new Jinxed();
                break;
            case "Kamikaze":
                traitInterface = new Kamikaze();
                break;
            case "Loner":
                traitInterface = new Loner();
                break;
            case "One Hander":
                traitInterface = new OneHander();
                break;
            /*case "Skilled":
                traitInterface = new Skilled();
                break;*/
            case "Small Frame":
                traitInterface = new SmallFrame();
                break;
            case "Gifted":
                traitInterface = new Gifted();
                break;
            case "Brutish Hulk":
                traitInterface = new BrutishHulk();
                break;
        }
        return traitInterface;
    }

}
