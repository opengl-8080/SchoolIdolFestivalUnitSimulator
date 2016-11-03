package domain.member;

import domain.basic.point.Point;
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
    private SkillSlot skillSlot;
    private CenterSkill centerSkill;
    private PointSet pointSet = new PointSet();
    private TypeSet typeSet;

    public Member(Long id, Name name, Ability ability) {
        this.id = id;
        this.name = name;
        this.ability = ability;
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof Member) && ((Member) obj).id.equals(this.id);
    }

    @Override
    public int hashCode() {
        return this.id.hashCode();
    }

    void setSmilePoint(Point point) {
        this.pointSet.setSmile(point);
    }

    void setPurePoint(Point point) {
        this.pointSet.setPure(point);
    }

    void setCoolPoint(Point point) {
        this.pointSet.setCool(point);
    }

    Point getSmilePoint() {
        return this.pointSet.getSmile();
    }

    Point getPurePoint() {
        return this.pointSet.getPure();
    }

    Point getCoolPoint() {
        return this.pointSet.getCool();
    }
}
