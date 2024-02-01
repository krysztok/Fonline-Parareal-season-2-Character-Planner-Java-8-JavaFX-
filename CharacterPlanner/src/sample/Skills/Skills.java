package sample.Skills;

import java.util.HashMap;
import java.util.Map;

public class Skills {
    private Map<String, Skill> skills;

    public Skills(){
        skills = new HashMap<>();

        skills.put("Small Guns", new Skill("Small Guns", 300));
        skills.put("Big Guns", new Skill("Big Guns",300));
        skills.put("Energy Weapons", new Skill("Energy Weapons", 300));
        skills.put("Close Combat", new Skill("Close Combat", 300));
        skills.put("Reserved", new Skill("Reserved", 300));
        skills.put("Throwing", new Skill("Throwing", 300));
        skills.put("First Aid", new Skill("First Aid",200));
        skills.put("Doctor", new Skill("Doctor",200));
        skills.put("Sneak", new Skill("Sneak",300));
        skills.put("Lockpick", new Skill("Lockpick",150));
        skills.put("Steal", new Skill("Steal",150));
        skills.put("Traps", new Skill("Traps",150));
        skills.put("Science", new Skill("Science",125));
        skills.put("Repair", new Skill("Repair",125));
        skills.put("Speech", new Skill("Speech",300));
        skills.put("Barter", new Skill("Barter",150));
        skills.put("Gambling", new Skill("Gambling",300));
        skills.put("Outdoorsman", new Skill("Outdoorsman",175));
    }

    public void setBaseSkillsValues(Map<String, Integer> specials){
        skills.get("Small Guns").setSkillBase(5 + 4 * specials.get("Agility"));
        skills.get("Big Guns").setSkillBase(2 * specials.get("Agility"));
        skills.get("Energy Weapons").setSkillBase(2 * specials.get("Agility"));
        skills.get("Close Combat").setSkillBase(30 + 2 * (specials.get("Agility") + specials.get("Strength")));
        skills.get("Reserved").setSkillBase(1);
        skills.get("Throwing").setSkillBase(4 * specials.get("Agility"));
        skills.get("First Aid").setSkillBase(2 * (specials.get("Perception") + specials.get("Intelligence")));
        skills.get("Doctor").setSkillBase(5 + (specials.get("Perception") + specials.get("Intelligence")));
        skills.get("Sneak").setSkillBase(5 + 3 * specials.get("Agility"));
        skills.get("Lockpick").setSkillBase(10 + (specials.get("Perception") + specials.get("Agility")));
        skills.get("Steal").setSkillBase(3 * specials.get("Agility"));
        skills.get("Traps").setSkillBase(10 + (specials.get("Perception") + specials.get("Agility")));
        skills.get("Science").setSkillBase(4 * specials.get("Intelligence"));
        skills.get("Repair").setSkillBase(3 * specials.get("Intelligence"));
        skills.get("Speech").setSkillBase(5 * specials.get("Charisma"));
        skills.get("Barter").setSkillBase(4 * specials.get("Charisma"));
        skills.get("Gambling").setSkillBase(5 * specials.get("Luck"));
        skills.get("Outdoorsman").setSkillBase(2 * (specials.get("Intelligence") + specials.get("Endurance")));

    }

    public Skill getSkill(String skillName){
        return skills.get(skillName);
    }

    public void confirmSkills(){
        skills.forEach((k, v) -> {
            v.confirmSkill();
        });
    }
}
