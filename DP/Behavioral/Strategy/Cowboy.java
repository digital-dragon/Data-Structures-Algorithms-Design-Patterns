public class Cowboy extends Character{
    public Cowboy () {
        setDancingSkill(new CantDanceALick());
        setFightingSkill(new GunSlinger());
    }
}
