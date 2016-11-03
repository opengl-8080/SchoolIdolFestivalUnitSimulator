package domain.skill;

import domain.basic.attribute.Attribute;
import domain.basic.point.RateOfIncrease;
import lombok.ToString;

/**
 * スキル：オーラ
 */
@ToString
public class Aura extends CollectiveRatingSkill {
    /**スマイルオーラ*/
    public static final Aura SMILE = new Aura(Attribute.SMILE);
    /**クールオーラ*/
    public static final Aura COOL = new Aura(Attribute.COOL);
    /**ピュアオーラ*/
    public static final Aura PURE = new Aura(Attribute.PURE);

    private Aura(Attribute attribute) {
        super(new Cost(3), attribute, new RateOfIncrease(1.8));
    }
}
