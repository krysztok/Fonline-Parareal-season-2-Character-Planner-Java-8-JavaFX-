package sample.Traits;

import sample.Stats;

public interface Trait {
    public void onPick(Stats stats);
    public void onRemove(Stats stats);
    public String getName();
}
