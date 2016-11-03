package domain.skill;

import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * コスト
 */
@ToString
@EqualsAndHashCode
public class Cost {
    private final int value;

    public Cost(int value) {
        this.value = value;
    }
}
