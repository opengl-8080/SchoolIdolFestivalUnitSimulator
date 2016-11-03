package domain.skill;

import domain.basic.attribute.Attribute;
import domain.basic.point.RateOfIncrease;
import domain.basic.type.Grade;
import lombok.ToString;

/**
 * 対個人定率スキル
 */
@ToString
public class IndividualRatingSkill extends Skill {
    private final Grade grade;
    private final RateOfIncrease rateOfIncrease;

    protected IndividualRatingSkill(Cost cost, Attribute attribute, Grade grade, RateOfIncrease rateOfIncrease) {
        super(cost, attribute);
        this.grade = grade;
        this.rateOfIncrease = rateOfIncrease;
    }
}
