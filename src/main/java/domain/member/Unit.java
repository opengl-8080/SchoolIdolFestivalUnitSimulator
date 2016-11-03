package domain.member;

import lombok.ToString;
import org.eclipse.collections.api.set.MutableSet;
import org.eclipse.collections.impl.factory.Sets;

/**
 * ユニット
 */
@ToString
public class Unit {
    private Member center;
    private MutableSet<Member> members = Sets.mutable.of();
}
