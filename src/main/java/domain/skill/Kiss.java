package domain.skill;

import domain.basic.attribute.Attribute;
import domain.basic.point.AmountOfIncrease;
import domain.basic.point.Point;
import lombok.ToString;

/**
 * スキル：キッス
 */
@ToString
public class Kiss extends IndividualAmountingSkill {
    /**スマイルキッス*/
    public static final Kiss SMILE = new Kiss(Attribute.SMILE);
    /**クールキッス*/
    public static final Kiss COOL = new Kiss(Attribute.COOL);
    /**ピュアキッス*/
    public static final Kiss PURE = new Kiss(Attribute.PURE);

    private Kiss(Attribute attribute) {
        super(new Cost(1), attribute, new AmountOfIncrease(new Point(200)));
    }
}
