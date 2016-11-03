package domain.skill;

import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 空きスロット数
 */
@ToString
@EqualsAndHashCode
public class AmountOfEmptySlot {
    private final int amount;

    public AmountOfEmptySlot(int amount) {
        this.amount = amount;
    }
}
