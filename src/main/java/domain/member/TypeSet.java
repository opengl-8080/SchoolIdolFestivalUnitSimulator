package domain.member;

import domain.basic.type.BelongingGroup;
import domain.basic.type.BelongingUnit;
import domain.basic.type.Grade;
import lombok.ToString;

/**
 * Typeセット
 */
@ToString
public class TypeSet {
    private BelongingUnit belongingUnit;
    private BelongingGroup belongingGroup;
    private Grade grade;
}
