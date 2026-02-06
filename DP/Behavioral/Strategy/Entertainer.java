public class Entertainer extends Character{
    public Entertainer() {
        setDancingSkill(new BustAMove());
        setFightingSkill(new Pacifist());
    }
}
