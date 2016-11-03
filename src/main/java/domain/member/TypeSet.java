package domain.member;

import domain.basic.type.BelongingGroup;
import domain.basic.type.BelongingUnit;
import domain.basic.type.Grade;
import domain.basic.type.Type;
import lombok.ToString;

/**
 * Typeセット
 */
@ToString
public class TypeSet {
    private BelongingUnit belongingUnit;
    private BelongingGroup belongingGroup;
    private Grade grade;

    void setGrade(Grade grade) {
        this.grade = grade;
    }

    public boolean matches(Type targetType) {
        return this.belongingUnit == targetType
                || this.belongingGroup == targetType
                || this.grade == targetType;
    }
}
