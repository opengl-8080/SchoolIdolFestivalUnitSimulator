package domain.skill;

import domain.basic.attribute.Attribute;
import domain.basic.point.RateOfIncrease;
import lombok.ToString;

/**
 * 対全体定率スキル
 */
@ToString
public class CollectiveRatingSkill extends Skill {
    private final RateOfIncrease rateOfIncrease;

    protected CollectiveRatingSkill(Cost cost, Attribute attribute, RateOfIncrease rateOfIncrease) {
        super(cost, attribute);
        this.rateOfIncrease = rateOfIncrease;
    }
}
