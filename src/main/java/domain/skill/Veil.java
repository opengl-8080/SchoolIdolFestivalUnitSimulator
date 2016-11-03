package domain.skill;

import domain.basic.attribute.Attribute;
import domain.basic.point.RateOfIncrease;
import lombok.ToString;

/**
 * スキル：ヴェール
 */
@ToString
public class Veil extends CollectiveRatingSkill {
    /**スマイルヴェール*/
    public static final Veil SMILE = new Veil(Attribute.SMILE);
    /**クールヴェール*/
    public static final Veil COOL = new Veil(Attribute.COOL);
    /**ピュアヴェール*/
    public static final Veil PURE = new Veil(Attribute.PURE);

    private Veil(Attribute attribute) {
        super(new Cost(4), attribute, new RateOfIncrease(2.4));
    }
}
