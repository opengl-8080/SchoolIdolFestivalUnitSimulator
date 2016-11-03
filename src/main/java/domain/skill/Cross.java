package domain.skill;

import domain.basic.attribute.Attribute;
import domain.basic.point.RateOfIncrease;
import domain.basic.type.Grade;
import lombok.ToString;

/**
 * スキル：クロス
 */
@ToString
public class Cross extends IndividualRatingSkill {
    private Cross(Attribute attribute, Grade grade) {
        super(new Cost(3), attribute, grade, new RateOfIncrease(16));
    }

    /**
     * スキル：クロス（１年生）
     */
    public static class FirstGrade extends Cross {
        /**スマイルクロス（１年生）*/
        public static final FirstGrade SMILE = new FirstGrade(Attribute.SMILE);
        /**クールクロス（１年生）*/
        public static final FirstGrade COOL = new FirstGrade(Attribute.COOL);
        /**ピュアクロス（１年生）*/
        public static final FirstGrade PURE = new FirstGrade(Attribute.PURE);

        private FirstGrade(Attribute attribute) {
            super(attribute, Grade.FIRST);
        }
    }

    /**
     * スキル：クロス（２年生）
     */
    public static class SecondGrade extends Cross {
        /**スマイルクロス（２年生）*/
        public static final SecondGrade SMILE = new SecondGrade(Attribute.SMILE);
        /**クールクロス（２年生）*/
        public static final SecondGrade COOL = new SecondGrade(Attribute.COOL);
        /**ピュアクロス（２年生）*/
        public static final SecondGrade PURE = new SecondGrade(Attribute.PURE);

        private SecondGrade(Attribute attribute) {
            super(attribute, Grade.SECOND);
        }
    }

    /**
     * スキル：クロス（３年生）
     */
    public static class ThirdGrade extends Cross {
        /**スマイルクロス（３年生）*/
        public static final ThirdGrade SMILE = new ThirdGrade(Attribute.SMILE);
        /**クールクロス（３年生）*/
        public static final ThirdGrade COOL = new ThirdGrade(Attribute.COOL);
        /**ピュアクロス（３年生）*/
        public static final ThirdGrade PURE = new ThirdGrade(Attribute.PURE);

        private ThirdGrade(Attribute attribute) {
            super(attribute, Grade.THIRD);
        }
    }
}
