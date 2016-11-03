package domain.member;

import domain.basic.attribute.Attribute;
import domain.basic.point.Point;
import domain.basic.type.Grade;
import domain.basic.type.Type;
import domain.center_skill.CenterSkill;
import domain.skill.SkillSlot;
import lombok.ToString;

/**
 * 部員
 */
@ToString
public class Member {
    private final Long id;
    private final Name name;
    private final Ability ability;
    private final CenterSkill centerSkill;
    private SkillSlot skillSlot;
    private PointSet pointSet = new PointSet();
    private TypeSet typeSet = new TypeSet();

    public Member(Long id, Name name, Ability ability, CenterSkill centerSkill) {
        this.id = id;
        this.name = name;
        this.ability = ability;
        this.centerSkill = centerSkill;
    }

    void set(Attribute attribute, Point point) {
        this.pointSet.set(attribute, point);
    }

    public Point get(Attribute attribute) {
        return this.pointSet.get(attribute);
    }

    void setGrade(Grade grade) {
        this.typeSet.setGrade(grade);
    }

    PointSet applyCenterSkill(PointSet summarizedPointSet) {
        return this.centerSkill.resolveMainBonus(summarizedPointSet);
    }

    public PointSet applyTypeBonus(Member member) {
        return this.centerSkill.resolveTypeBonus(member);
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof Member) && ((Member) obj).id.equals(this.id);
    }

    @Override
    public int hashCode() {
        return this.id.hashCode();
    }

    public PointSet getPointSet() {
        return this.pointSet;
    }

    public boolean matches(Type type) {
        return this.typeSet.matches(type);
    }
}
