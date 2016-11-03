package domain.skill;

import domain.basic.attribute.Attribute;
import domain.basic.point.AmountOfIncrease;
import domain.basic.point.Point;
import lombok.ToString;

/**
 * スキル：パフューム
 */
@ToString
public class Perfume extends IndividualAmountingSkill {
    /**スマイルパフューム*/
    public static final Perfume SMILE = new Perfume(Attribute.SMILE);
    /**クールパフューム*/
    public static final Perfume COOL = new Perfume(Attribute.COOL);
    /**ピュアパフューム*/
    public static final Perfume PURE = new Perfume(Attribute.PURE);

    private Perfume(Attribute attribute) {
        super(new Cost(2), attribute, new AmountOfIncrease(new Point(450)));
    }
}
