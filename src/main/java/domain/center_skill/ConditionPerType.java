package domain.center_skill;

import domain.basic.point.RateOfIncrease;
import domain.basic.type.BelongingGroup;
import domain.basic.type.BelongingUnit;
import domain.basic.type.Grade;
import domain.basic.type.Type;
import lombok.ToString;

/**
 * Type別上昇条件
 */
@ToString
public class ConditionPerType {
    /**μ's のメンバーはさらに 3% アップ*/
    public static ConditionPerType MUSE = new ConditionPerType(BelongingGroup.μs, new RateOfIncrease(3));
    /**Aqours のメンバーはさらに 3% アップ*/
    public static ConditionPerType AQOURS = new ConditionPerType(BelongingGroup.AQOURS, new RateOfIncrease(3));

    /**BiBi のメンバーはさらに 6% アップ*/
    public static ConditionPerType BiBi = new ConditionPerType(BelongingUnit.BiBi, new RateOfIncrease(6));
    /**lily white のメンバーはさらに 6% アップ*/
    public static ConditionPerType lily_white = new ConditionPerType(BelongingUnit.lily_white, new RateOfIncrease(6));
    /**Printemps のメンバーはさらに 6% アップ*/
    public static ConditionPerType Printemps = new ConditionPerType(BelongingUnit.Printemps, new RateOfIncrease(6));

    /**１年生のメンバーはさらに 6% アップ*/
    public static ConditionPerType FIRST_GRADE = new ConditionPerType(Grade.FIRST, new RateOfIncrease(6));
    /**２年生のメンバーはさらに 6% アップ*/
    public static ConditionPerType SECOND_GRADE = new ConditionPerType(Grade.SECOND, new RateOfIncrease(6));
    /**３年生のメンバーはさらに 6% アップ*/
    public static ConditionPerType THIRD_GRADE = new ConditionPerType(Grade.THIRD, new RateOfIncrease(6));

    private final Type targetType;
    private final RateOfIncrease rateOfIncrease;

    private ConditionPerType(Type targetType, RateOfIncrease rateOfIncrease) {
        this.targetType = targetType;
        this.rateOfIncrease = rateOfIncrease;
    }
}
