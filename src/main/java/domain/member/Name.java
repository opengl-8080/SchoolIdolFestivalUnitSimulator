package domain.member;

import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 名前
 */
@ToString
@EqualsAndHashCode
public class Name {
    private final String value;

    public Name(String value) {
        this.value = value;
    }
}
