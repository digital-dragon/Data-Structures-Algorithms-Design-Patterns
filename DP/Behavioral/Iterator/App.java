import java.util.List;

public class App {
    public static void main(String[] args) {
        Skill javaSkill = new Skill("Java", 10);
        Skill pythonSkill = new Skill("Python", 8);
        Skill jsSkill = new Skill("JavaScript", 7);
        Skill cppSkill = new Skill("C++", 6);

        var skillSet = new SkillSet(javaSkill, pythonSkill, jsSkill, cppSkill);

        var iterator = skillSet.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next().getName());
        }

        List<Skill> skillSetArray = List.of(javaSkill, pythonSkill, jsSkill, cppSkill);
        var it = skillSetArray.iterator();

        while (it.hasNext()) {
            System.out.println(it.next().getName());
        }

    }
}
