import java.util.Iterator;

public class SkillSet implements Iterable<Skill> {
    private final Skill[] skills;

    public SkillSet(Skill... skills) {
        this.skills = skills;
    }

    @Override
    public Iterator<Skill> iterator() {
        return new SkillIterator(this);
    }

    public Skill[] getSkills() {
        return skills;
    }

}
