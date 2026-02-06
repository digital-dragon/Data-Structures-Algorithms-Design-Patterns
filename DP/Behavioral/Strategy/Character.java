public abstract class Character {
    DancingSkill dancingSkill;
    FightingSkill fightingSkill;

    public Character() {}

    public void performFight() {
        fightingSkill.fight();
    }

    public void performDance() {
        dancingSkill.dance();
    }
}
