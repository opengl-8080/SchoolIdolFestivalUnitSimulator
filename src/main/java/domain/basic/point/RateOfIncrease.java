package domain.basic.point;

import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * ポイント上昇率
 */
@ToString
@EqualsAndHashCode
public class RateOfIncrease {
    private final double percent;

    public RateOfIncrease(double percent) {
        this.percent = percent;
    }
}
