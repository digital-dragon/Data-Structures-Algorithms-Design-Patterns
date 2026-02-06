public abstract class Character {
    private DancingSkill dancingSkill;
    private
    FightingSkill fightingSkill;

    public Character() {}

    public void setDancingSkill(DancingSkill dancingSkill) {
        this.dancingSkill = dancingSkill;
    }

    public void setFightingSkill(FightingSkill fightingSkill) {
        this.fightingSkill = fightingSkill;
    }

    public void performFight() {
        fightingSkill.fight();
    }

    public void performDance() {
        dancingSkill.dance();
    }
}
