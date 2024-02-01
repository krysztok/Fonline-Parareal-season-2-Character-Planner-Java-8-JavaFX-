package sample;

import sample.Masteries.Masteries;
import sample.Perks.Books;
import sample.Perks.Implants;
import sample.Perks.Perks;
import sample.Perks.SupportPerks;
import sample.Skills.Skills;
import sample.StatsDefs.*;
import sample.Traits.Traits;

import java.util.HashMap;
import java.util.Map;

public class Stats {
    private Character character;
    private Map<String, Integer> specialsBase;
    private Map<String, Integer> specialsWithImpsAndPerks;
    private Map<String, Integer> specialsAfterDrugs;
    private Map<String, Integer> specialMinimum;

    private Map<String, Integer> drugsFlags;

    private Traits traits;
    private Perks perks;
    private SupportPerks supportPerks;
    private Masteries masteries;
    private Implants implants;
    private Books books;

    private int levelsNewPerk;
    private boolean availablePerk;
    private boolean alertPerk;

    int specialLimit;
    int specialToUse;
    private int level;
    private int exp;

    private Skills skills;
    private int skillPoints;
    private int skillTagsLeft;

    private String trait1;
    private String trait2;


    private HitPoints hitPoints;
    private HitPointsPerLevel hitPointsPerLevel;
    private SkillPointsPerLevel skillPointsPerLevel;
    private PartyPoints partyPoints;
    private ViewRange viewRange;
    private Sequence sequence;
    private FlatDamage flatDamage;
    private ArmorClass armorClass;
    private ActionPoints actionPoints;
    private CarryWeight carryWeight;
    private MeleeDamage meleeDamage;
    private PoisonResistance poisonResistance;
    private RadiationResistance radiationResistance;
    private HealingRate healingRate;
    private CriticalChance criticalChance;
    private NormalDTDR normalDTDR;
    private LaserDTDR laserlDTDR;
    private FireDTDR fireDTDR;
    private PlasmaDTDR plasmaDTDR;
    private ElectroDTDR electroDTDR;
    private ExplodeDTDR explodeDTDR;
    private MovementSpeed movementSpeed;


    public Stats() {
        this.character = character;
        specialsBase = new HashMap<>();
        specialsBase.put("Strength", 5);
        specialsBase.put("Perception", 5);
        specialsBase.put("Endurance", 5);
        specialsBase.put("Charisma", 5);
        specialsBase.put("Intelligence", 5);
        specialsBase.put("Agility", 5);
        specialsBase.put("Luck", 5);
        specialsWithImpsAndPerks = new HashMap<>();
        specialsWithImpsAndPerks.put("Strength", 5);
        specialsWithImpsAndPerks.put("Perception", 5);
        specialsWithImpsAndPerks.put("Endurance", 5);
        specialsWithImpsAndPerks.put("Charisma", 5);
        specialsWithImpsAndPerks.put("Intelligence", 5);
        specialsWithImpsAndPerks.put("Agility", 5);
        specialsWithImpsAndPerks.put("Luck", 5);
        specialsAfterDrugs = new HashMap<>();
        specialsAfterDrugs.put("Strength", 5);
        specialsAfterDrugs.put("Perception", 5);
        specialsAfterDrugs.put("Endurance", 5);
        specialsAfterDrugs.put("Charisma", 5);
        specialsAfterDrugs.put("Intelligence", 5);
        specialsAfterDrugs.put("Agility", 5);
        specialsAfterDrugs.put("Luck", 5);
        specialLimit = 10;
        specialToUse = 5;
        specialMinimum = new HashMap<>();
        specialMinimum.put("Strength", 1);
        specialMinimum.put("Perception", 1);
        specialMinimum.put("Endurance", 1);
        specialMinimum.put("Charisma", 1);
        specialMinimum.put("Intelligence", 1);
        specialMinimum.put("Agility", 1);
        specialMinimum.put("Luck", 1);

        drugsFlags = new HashMap<>();
        drugsFlags.put("Beer", 0);
        drugsFlags.put("Jet", 0);
        drugsFlags.put("Nuka", 0);
        drugsFlags.put("Cigs", 0);
        drugsFlags.put("Buffout", 0);
        drugsFlags.put("Psycho", 0);
        drugsFlags.put("Mentats", 0);
        drugsFlags.put("Booze", 0);
        drugsFlags.put("Gamma Beer", 0);
        drugsFlags.put("Roentgen", 0);
        drugsFlags.put("Rotgut", 0);
        drugsFlags.put("Cookie", 0);
        drugsFlags.put("Fruit", 0);

        level = 1;
        exp = 0;
        levelsNewPerk = 3;
        availablePerk = false;
        perks = new Perks();
        supportPerks = new SupportPerks();
        implants = new Implants();
        books = new Books();
        traits = new Traits();
        masteries = new Masteries();
        trait1 = "";
        trait2 = "";
        skillPoints = 0;
        skillTagsLeft = 3;
        skills = new Skills();
        skills.setBaseSkillsValues(specialsBase);

        hitPoints = new HitPoints();
        hitPointsPerLevel = new HitPointsPerLevel();
        skillPointsPerLevel = new SkillPointsPerLevel();
        partyPoints = new PartyPoints();
        viewRange = new ViewRange();
        sequence = new Sequence();
        flatDamage = new FlatDamage();
        armorClass = new ArmorClass();
        actionPoints = new ActionPoints();
        carryWeight = new CarryWeight();
        meleeDamage = new MeleeDamage();
        poisonResistance = new PoisonResistance();
        radiationResistance = new RadiationResistance();
        healingRate = new HealingRate();
        criticalChance = new CriticalChance();
        normalDTDR = new NormalDTDR();
        laserlDTDR = new LaserDTDR();
        fireDTDR = new FireDTDR();
        plasmaDTDR = new PlasmaDTDR();
        electroDTDR = new ElectroDTDR();
        explodeDTDR = new ExplodeDTDR();
        movementSpeed = new MovementSpeed();

        calculateStats();


    }

    public void calculateStats() {
        hitPoints.setValue(this);
        hitPointsPerLevel.setValue(this);
        skillPointsPerLevel.setValue(this);
        partyPoints.setValue(this);
        viewRange.setValue(this);
        sequence.setValue(this);
        flatDamage.setValue(this);
        armorClass.setValue(this);
        actionPoints.setValue(this);
        carryWeight.setValue(this);
        meleeDamage.setValue(this);
        poisonResistance.setValue(this);
        radiationResistance.setValue(this);
        healingRate.setValue(this);
        criticalChance.setValue(this);
        normalDTDR.setValue(this);
        laserlDTDR.setValue(this);
        fireDTDR.setValue(this);
        plasmaDTDR.setValue(this);
        electroDTDR.setValue(this);
        explodeDTDR.setValue(this);
        movementSpeed.setValue(this);
    }


    public Map<String, Integer> getSpecialsBase() {
        return specialsBase;
    }


    public int getSpecialBase(String special) {
        return specialsBase.get(special);
    }

    public int getSpecialWithImpsAndPerks(String special) {
        return specialsWithImpsAndPerks.get(special);
    }

    public int getSpecialsAfterDrugs(String special) {
        return specialsAfterDrugs.get(special);
    }

    public void changeSpecialBase(String special, int byValue) {
        int value = specialsBase.get(special) + byValue;
        int specialMin = specialMinimum.get(special);

        if (value > 10) {
            specialToUse += value - 10;
            value = 10;
        } else if (value < specialMin) {
            specialToUse -= -value + specialMin;
            value = specialMin;
        }

        specialsBase.put(special, value);
        specialsWithImpsAndPerks.put(special, value);
        specialsAfterDrugs.put(special, value);

        getSkills().setBaseSkillsValues(specialsBase);
        calculateStats();
    }

    public void changeSpecialWithImpsAndPerks(String special, int byValue) {
        int value = specialsWithImpsAndPerks.get(special) + byValue;

        if (value > 10) {
            value = 10;
        } else if (value < 1) {
            value = 1;
        }

        specialsWithImpsAndPerks.put(special, value);
        calculateSpecialAfterDrugs();

        calculateStats();
    }

    public void calculateSpecialAfterDrugs() {
        int stChange = -2 * drugsFlags.get("Jet") + 2 * drugsFlags.get("Buffout") + drugsFlags.get("Psycho") - drugsFlags.get("Roentgen");
        int peChange = -2 * drugsFlags.get("Beer") + drugsFlags.get("Cigs") - 2 * drugsFlags.get("Psycho") + 2 * drugsFlags.get("Mentats") - drugsFlags.get("Booze") - 2 * drugsFlags.get("Roentgen") - drugsFlags.get("Rotgut");
        int endChange = drugsFlags.get("Beer") + drugsFlags.get("Buffout") + drugsFlags.get("Psycho") - 2 * drugsFlags.get("Mentats") - drugsFlags.get("Nuka") - drugsFlags.get("Booze") - 3 * drugsFlags.get("Gamma Beer");
        int chChange = drugsFlags.get("Beer") + drugsFlags.get("Gamma Beer") + drugsFlags.get("Booze") + drugsFlags.get("Roentgen") - drugsFlags.get("Cigs") ;
        int inChange = 2 * drugsFlags.get("Mentats");
        int agChange = 2 * drugsFlags.get("Gamma Beer") -drugsFlags.get("Buffout");
        int lkChange = 2 * drugsFlags.get("Booze") ;

        if(getPerks().getPerkFlag("Way of the Fruit") == 1){
            peChange += 2 * drugsFlags.get("Fruit");
        }

        int st = specialsWithImpsAndPerks.get("Strength");
        int pe = specialsWithImpsAndPerks.get("Perception");
        int en = specialsWithImpsAndPerks.get("Endurance");
        int ch = specialsWithImpsAndPerks.get("Charisma");
        int in = specialsWithImpsAndPerks.get("Intelligence");
        int ag = specialsWithImpsAndPerks.get("Agility");
        int lk = specialsWithImpsAndPerks.get("Luck");

        specialsAfterDrugs.put("Strength", (st + stChange) > 10 ? 10 : ( (st + stChange) < 1 ? 1 : (st + stChange)) );
        specialsAfterDrugs.put("Perception", (pe + peChange) > 10 ? 10 : ( (pe + peChange) < 1 ? 1 : (pe + peChange)) );
        specialsAfterDrugs.put("Endurance", (en + endChange) > 10 ? 10 : ( (en + endChange) < 1 ? 1 : (en + endChange)) );
        specialsAfterDrugs.put("Charisma", (ch + chChange) > 10 ? 10 : ( (ch + chChange) < 1 ? 1 :  (ch + chChange)) );
        specialsAfterDrugs.put("Intelligence", (in + inChange) > 10 ? 10 : ( (in + inChange) < 1 ? 1 : (in + inChange)) );
        specialsAfterDrugs.put("Agility", (ag + agChange) > 10 ? 10 : ( (ag + agChange) < 1 ? 1 :  (ag + agChange)) );
        specialsAfterDrugs.put("Luck", (lk + lkChange) > 10 ? 10 : ( (lk + lkChange) < 1 ? 1 : (lk + lkChange)) );
    }


    public int getSpecialLimit() {
        return specialLimit;
    }

    public int getSpecialToUse() {
        return specialToUse;
    }

    public void setSpecialToUse(int specialToUse) {
        this.specialToUse = specialToUse;
    }

    public int getLevel() {
        return level;
    }

    public Traits getTraits() {
        return traits;
    }

    public Masteries getMasteries() {return masteries;}

    public Perks getPerks() {
        return perks;
    }

    public SupportPerks getSupportPerks() {
        return supportPerks;
    }

    public Implants getImplants() {
        return implants;
    }

    public Books getBooks() {return books;}

    public void levelUp() {
        level++;
        exp = level * ((level - 1) * 1000) / 2;

        skillPoints += skillPointsPerLevel.getValue();

        if ((availablePerk && level < 24 && level % levelsNewPerk == levelsNewPerk - 1) || (availablePerk && level == 29)) {
            alertPerk = true;
        } else {
            alertPerk = false;
        }

        if (level < 25 && level % levelsNewPerk == 0) {
            availablePerk = true;
        }

        if (level == 30) {
            availablePerk = false;
            alertPerk = false;
        }

    }

    public void setDrug(String name, int value) {
        drugsFlags.put(name, value);
    }

    public int getDrugFlag(String name) {
        return drugsFlags.get(name);
    }

    public boolean isAvailablePerk() {
        return availablePerk;
    }

    public boolean isAlertPerk() {
        return alertPerk;
    }

    public void setAvailablePerk(boolean availablePerk) {
        this.availablePerk = availablePerk;
    }

    public int getLevelsNewPerk() {
        return levelsNewPerk;
    }

    public void setLevelsNewPerk(int levelsNewPerk) {
        this.levelsNewPerk = levelsNewPerk;
    }

    public void changeSkillPointsByValue(int value) {
        this.skillPoints += value;
    }

    public int getExp() {
        return exp;
    }

    public int getSkillTagsLeft() {
        return skillTagsLeft;
    }

    public void setSkillTagsLeft(int skillTagsLeft) {
        this.skillTagsLeft = skillTagsLeft;
    }

    public int getSkillPoints() {
        return skillPoints;
    }

    public String getTrait1() {
        return trait1;
    }

    public void setTrait1(String trait1) {
        this.trait1 = trait1;
    }

    public void setTrait2(String trait2) {
        this.trait2 = trait2;
    }

    public String getTrait2() {
        return trait2;
    }

    public String getHitPoints() {
        return hitPoints.getValueString();
    }

    public HitPointsPerLevel getHitPointsPerLevelObject(){return  hitPointsPerLevel;}

    public String getHitPointsPerLevel() {
        return hitPointsPerLevel.getValueString();
    }

    public String getSpPerLevel() {
        return skillPointsPerLevel.getValueString();
    }

    public Skills getSkills() {
        return skills;
    }

    public String getPartyPoints() {
        return partyPoints.getValueString();
    }

    public String getViewRange() {
        return viewRange.getValueString();
    }

    public String getSequence() {
        return sequence.getValueString();
    }

    public String getArmorClass() {
        return armorClass.getValueString();
    }

    public String getActionPoints() {
        return actionPoints.getValueString();
    }

    public String getCarryWeight() {
        return carryWeight.getValueString();
    }

    public String getMeleeDamage() {
        return meleeDamage.getValueString();
    }

    public String getPoisonResistance() {
        return poisonResistance.getValueString();
    }

    public String getRadiationResistance() {
        return radiationResistance.getValueString();
    }

    public String getHealingRate() {
        return healingRate.getValueString();
    }

    public String getCriticalChance() {
        return criticalChance.getValueString();
    }

    public String getNormalDTDR() {
        return normalDTDR.getValueString();
    }

    public String getLaserlDTDR() {
        return laserlDTDR.getValueString();
    }

    public String getFireDTDR() {
        return fireDTDR.getValueString();
    }

    public String getPlasmaDTDR() {
        return plasmaDTDR.getValueString();
    }

    public String getElectroDTDR() {
        return electroDTDR.getValueString();
    }

    public String getExplodeDTDR() {
        return explodeDTDR.getValueString();
    }

    public String getFlatDamage() {
        return flatDamage.getValueString();
    }

    public String getMovementSpeed() {return movementSpeed.getValueString();}

    public int getSpecialMinimum(String special) {
        return specialMinimum.get(special);
    }

    public void changeSpecialMinimum(String special, int byValue) {
        int value = specialMinimum.get(special);
        specialMinimum.put(special, value + byValue);
    }
}
