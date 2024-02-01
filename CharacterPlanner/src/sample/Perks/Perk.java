package sample.Perks;


import sample.Stats;

public interface Perk {
    public void onPick(Stats stats);
    public boolean checkRequirements(Stats stats);
    public String getName();
}
