package domain.member;

import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 特技
 */
@ToString
@EqualsAndHashCode
public class Ability {
    private final String name;

    public Ability(String name) {
        this.name = name;
    }
}
