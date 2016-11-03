package domain.member;

import domain.basic.point.Point;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class UnitTest {

    @Test
    public void name() throws Exception {
        // setup
        Unit unit = new Unit();

        unit.setCenter(member(100, 110, 120));

        unit.addNormal(member(200, 210, 220));
        unit.addNormal(member(300, 310, 320));
        unit.addNormal(member(400, 410, 420));
        unit.addNormal(member(500, 510, 520));
        unit.addNormal(member(600, 610, 620));
        unit.addNormal(member(700, 710, 720));
        unit.addNormal(member(800, 810, 820));
        unit.addNormal(member(900, 910, 920));

        // exercise
        assertThat(unit.getSmilePoint()).as("smile").isEqualTo(new Point(4500));
        assertThat(unit.getCoolPoint()).as("cool").isEqualTo(new Point(4590));
        assertThat(unit.getPurePoint()).as("pure").isEqualTo(new Point(4680));
    }

    private long idCount;

    private Member member(int smile, int cool, int pure) {
        Member member = new Member(++idCount, new Name("name" + idCount), new Ability("ability" + idCount));
        member.setSmilePoint(new Point(smile));
        member.setCoolPoint(new Point(cool));
        member.setPurePoint(new Point(pure));

        return member;
    }
}