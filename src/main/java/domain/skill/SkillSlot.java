package domain.skill;

import lombok.ToString;
import org.eclipse.collections.api.set.MutableSet;
import org.eclipse.collections.impl.factory.Sets;

/**
 * スキルスロット
 */
@ToString
public class SkillSlot {
    private AmountOfEmptySlot amountOfEmptySlot;
    private MutableSet<Skill> skills = Sets.mutable.of();

    public SkillSlot(AmountOfEmptySlot amountOfEmptySlot) {
        this.amountOfEmptySlot = amountOfEmptySlot;
    }
}
