package domain.basic.point;

import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * ポイント上昇量
 */
@ToString
@EqualsAndHashCode
public class AmountOfIncrease {
    private final Point amount;

    public AmountOfIncrease(Point amount) {
        this.amount = amount;
    }
}
