package domain.member;

import domain.basic.attribute.Attribute;
import domain.basic.point.Point;
import domain.basic.type.Grade;
import domain.center_skill.CenterSkill;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class UnitTest {

    @Test
    public void スキル等を一切考慮しない基本形() throws Exception {
        // setup
        Unit unit = new Unit();

        Member center = member(100, 110, 120);
        unit.setCenter(center);

        unit.addNormal(member(200, 210, 220));
        unit.addNormal(member(300, 310, 320));
        unit.addNormal(member(400, 410, 420));
        unit.addNormal(member(500, 510, 520));
        unit.addNormal(member(600, 610, 620));
        unit.addNormal(member(700, 710, 720));
        unit.addNormal(member(800, 810, 820));
        unit.addNormal(member(900, 910, 920));

        // exercise
        PointSet pointSet = unit.calculatePointSet();
        assertThat(pointSet.get(Attribute.SMILE)).as("smile").isEqualTo(new Point(Attribute.SMILE, 4500));
        assertThat(pointSet.get(Attribute.PURE)).as("pure").isEqualTo(new Point(Attribute.PURE, 4590));
        assertThat(pointSet.get(Attribute.COOL)).as("cool").isEqualTo(new Point(Attribute.COOL, 4680));
    }

    @Test
    public void センタースキルのみ考慮() throws Exception {
        // setup
        Unit unit = new Unit();

        Member center = member(4340, 3220, 2420, Grade.THIRD, CenterSkill.Smile.Angel.THIRD_GRADE);
        unit.setCenter(center);

        unit.addNormal(member(1170, 3320, 1100, Grade.THIRD));
        unit.addNormal(member(3280, 1240, 1070, Grade.SECOND));
        unit.addNormal(member(3240, 1260, 1090, Grade.FIRST));
        unit.addNormal(member(3250, 1220, 1120, Grade.THIRD));
        unit.addNormal(member(1110, 3310, 1170, Grade.FIRST));
        unit.addNormal(member(1110, 1180, 3300, Grade.THIRD));
        unit.addNormal(member(1200, 1160, 3230, Grade.SECOND));
        unit.addNormal(member(1230, 1100, 3260, Grade.FIRST));

        // exercise
        PointSet pointSet = unit.calculatePointSet();
        assertThat(pointSet.get(Attribute.SMILE)).as("smile").isEqualTo(new Point(Attribute.SMILE, 22570));
        assertThat(pointSet.get(Attribute.PURE)).as("pure").isEqualTo(new Point(Attribute.PURE, 17010));
        assertThat(pointSet.get(Attribute.COOL)).as("cool").isEqualTo(new Point(Attribute.COOL, 17760));
    }

    private long idCount;

    private Member member(int smile, int pure, int cool) {
        return this.member(smile, pure, cool, null, CenterSkill.NONE);
    }

    private Member member(int smile, int pure, int cool, Grade grade) {
        return this.member(smile, pure, cool, grade, CenterSkill.NONE);
    }

    private Member member(int smile, int pure, int cool, Grade grade, CenterSkill centerSkill) {
        Member member = new Member(++idCount, new Name("name" + idCount), new Ability("ability" + idCount), centerSkill);
        member.set(Attribute.SMILE, new Point(Attribute.SMILE, smile));
        member.set(Attribute.PURE, new Point(Attribute.PURE, pure));
        member.set(Attribute.COOL, new Point(Attribute.COOL, cool));
        member.setGrade(grade);

        return member;
    }
}