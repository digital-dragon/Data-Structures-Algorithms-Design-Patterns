import java.util.Iterator;

public class SkillIterator implements Iterator<Skill> {
    private SkillSet skillSet;
    private int index;

    public SkillIterator(SkillSet skillSet) {
        this.skillSet = skillSet;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < skillSet.getSkills().length;
    }

    @Override
    public Skill next() {
        var skills = skillSet.getSkills();
        if (hasNext()) {
            return skills[index++];
        }
        return null;

    }
}