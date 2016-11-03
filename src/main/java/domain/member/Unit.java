package domain.member;

import domain.basic.point.Point;
import lombok.ToString;
import org.eclipse.collections.api.RichIterable;
import org.eclipse.collections.api.block.function.Function;
import org.eclipse.collections.api.set.MutableSet;
import org.eclipse.collections.impl.factory.Sets;


/**
 * ユニット
 */
@ToString
public class Unit {
    private Member center;
    private MutableSet<Member> members = Sets.mutable.of();

    void setCenter(Member center) {
        this.center = center;
    }

    void addNormal(Member member) {
        this.members.add(member);
    }

    Point getSmilePoint() {
        return this.summary(Member::getSmilePoint);
    }

    Point getPurePoint() {
        return this.summary(Member::getPurePoint);
    }

    Point getCoolPoint() {
        return this.summary(Member::getCoolPoint);
    }

    private Point summary(Function<Member, Point> point) {
        return this.allMembers()
                .collect(point)
                .reduce(Point::plus)
                .orElse(new Point(0));
    }

    private RichIterable<Member> allMembers() {
        MutableSet<Member> members = Sets.mutable.ofAll(this.members);
        members.add(this.center);
        return members;
    }
}
