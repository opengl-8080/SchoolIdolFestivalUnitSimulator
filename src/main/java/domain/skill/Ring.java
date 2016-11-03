package domain.skill;

import domain.basic.attribute.Attribute;
import domain.basic.point.RateOfIncrease;
import domain.basic.type.Grade;
import lombok.ToString;

/**
 * スキル：リング
 */
@ToString
public class Ring extends IndividualRatingSkill {

    private Ring(Attribute attribute, Grade grade) {
        super(new Cost(2), attribute, grade, new RateOfIncrease(10));
    }

    /**
     * スキル：リング（１年生）
     */
    public static class FirstGrade extends Ring {
        /**スマイルリング（１年生）*/
        public static final FirstGrade SMILE = new FirstGrade(Attribute.SMILE);
        /**クールリング（１年生）*/
        public static final FirstGrade COOL = new FirstGrade(Attribute.COOL);
        /**ピュアリング（１年生）*/
        public static final FirstGrade PURE = new FirstGrade(Attribute.PURE);

        private FirstGrade(Attribute attribute) {
            super(attribute, Grade.FIRST);
        }
    }

    /**
     * スキル：リング（２年生）
     */
    public static class SecondGrade extends Ring {
        /**スマイルリング（２年生）*/
        public static final SecondGrade SMILE = new SecondGrade(Attribute.SMILE);
        /**クールリング（２年生）*/
        public static final SecondGrade COOL = new SecondGrade(Attribute.COOL);
        /**ピュアリング（２年生）*/
        public static final SecondGrade PURE = new SecondGrade(Attribute.PURE);

        private SecondGrade(Attribute attribute) {
            super(attribute, Grade.SECOND);
        }
    }

    /**
     * スキル：リング（３年生）
     */
    public static class ThirdGrade extends Ring {
        /**スマイルリング（３年生）*/
        public static final ThirdGrade SMILE = new ThirdGrade(Attribute.SMILE);
        /**クールリング（３年生）*/
        public static final ThirdGrade COOL = new ThirdGrade(Attribute.COOL);
        /**ピュアリング（３年生）*/
        public static final ThirdGrade PURE = new ThirdGrade(Attribute.PURE);

        private ThirdGrade(Attribute attribute) {
            super(attribute, Grade.THIRD);
        }
    }
}
