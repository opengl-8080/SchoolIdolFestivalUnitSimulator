package domain.skill;

import domain.basic.attribute.Attribute;
import domain.basic.point.AmountOfIncrease;
import lombok.ToString;

/**
 * 対個人定量スキル
 */
@ToString
public class IndividualAmountingSkill extends Skill {
    private final AmountOfIncrease amountOfIncrease;

    protected IndividualAmountingSkill(Cost cost, Attribute attribute, AmountOfIncrease amountOfIncrease) {
        super(cost, attribute);
        this.amountOfIncrease = amountOfIncrease;
    }
}
