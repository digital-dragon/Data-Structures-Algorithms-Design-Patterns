public class Peacenik extends Character{
    public Peacenik() {
        setDancingSkill(new CantDanceALick());
        setFightingSkill(new Pacifist());
    }
}
