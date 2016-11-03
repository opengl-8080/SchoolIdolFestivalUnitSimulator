package domain.member;

import lombok.ToString;
import org.eclipse.collections.api.RichIterable;
import org.eclipse.collections.api.list.ListIterable;
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

    PointSet calculatePointSet() {
        PointSet summarizedPointSet = this.summarize();
        return this.center.applyCenterSkill(summarizedPointSet).normalize();
    }

    private PointSet summarize() {
        return this.allMembers()
                   .collect(this.center::applyTypeBonus)
                   .reduce(PointSet::plus)
                   .orElse(PointSet.ZERO);
    }

    private ListIterable<Member> allMembers() {
        MutableSet<Member> members = Sets.mutable.ofAll(this.members);
        members.add(this.center);
        return members.toList();
    }
}
