package domain.center_skill;

import domain.basic.attribute.Attribute;
import domain.basic.point.RateOfIncrease;
import lombok.ToString;

/**
 * センタースキル
 */
@ToString
public class CenterSkill {
    private final Attribute targetAttribute;
    private final Attribute basicAttribute;
    private final RateOfIncrease rateOfIncrease;
    private final ConditionPerType conditionPerType;

    private CenterSkill(Attribute targetAttribute, Attribute basicAttribute, RateOfIncrease rateOfIncrease, ConditionPerType conditionPerType) {
        this.targetAttribute = targetAttribute;
        this.basicAttribute = basicAttribute;
        this.rateOfIncrease = rateOfIncrease;
        this.conditionPerType = conditionPerType;
    }

    public static class Cool extends CenterSkill {

        private Cool(Attribute basicAttribute, RateOfIncrease rateOfIncrease, ConditionPerType conditionPerType) {
            super(Attribute.COOL, basicAttribute, rateOfIncrease, conditionPerType);
        }

        public static class Empress extends Cool {
            /**[クールエンプレス]クールPが9%UP＋μ'sのメンバーはさらにクールPが3%アップ*/
            public static final Empress MUSE = new Empress(ConditionPerType.MUSE);
            /**[クールエンプレス]クールPが9%UP＋AqoursのメンバーはさらにクールPが3%アップ*/
            public static final Empress AQOURS = new Empress(ConditionPerType.AQOURS);

            /**[クールエンプレス]クールPが9%UP＋BiBiのメンバーはさらにクールPが6%アップ*/
            public static final Empress BiBi = new Empress(ConditionPerType.BiBi);
            /**[クールエンプレス]クールPが9%UP＋lily whiteのメンバーはさらにクールPが6%アップ*/
            public static final Empress lily_white = new Empress(ConditionPerType.lily_white);
            /**[クールエンプレス]クールPが9%UP＋PrintempsのメンバーはさらにクールPが6%アップ*/
            public static final Empress Printemps = new Empress(ConditionPerType.Printemps);

            /**[クールエンプレス]クールPが9%UP＋1年生のメンバーはさらにクールPが6%アップ*/
            public static final Empress FIRST_GRADE = new Empress(ConditionPerType.FIRST_GRADE);
            /**[クールエンプレス]クールPが9%UP＋2年生のメンバーはさらにクールPが6%アップ*/
            public static final Empress SECOND_GRADE = new Empress(ConditionPerType.SECOND_GRADE);
            /**[クールエンプレス]クールPが9%UP＋3年生のメンバーはさらにクールPが6%アップ*/
            public static final Empress THIRD_GRADE = new Empress(ConditionPerType.THIRD_GRADE);

            private Empress(ConditionPerType conditionPerType) {
                super(Attribute.COOL, new RateOfIncrease(9), conditionPerType);
            }
        }

        public static class Princess extends Cool {
            /**[クールプリンセス]スマイルPの12%UP＋BiBiのメンバーはさらにクールPが6%アップ*/
            public static final Princess BiBi = new Princess(ConditionPerType.BiBi);
            /**[クールプリンセス]スマイルPの12%UP＋lily whiteのメンバーはさらにクールPが6%アップ*/
            public static final Princess lily_white = new Princess(ConditionPerType.lily_white);
            /**[クールプリンセス]スマイルPの12%UP＋PrintempsのメンバーはさらにクールPが6%アップ*/
            public static final Princess Printemps = new Princess(ConditionPerType.Printemps);

            /**[クールプリンセス]スマイルPの12%UP＋1年生のメンバーはさらにクールPが6%アップ*/
            public static final Princess FIRST_GRADE = new Princess(ConditionPerType.FIRST_GRADE);
            /**[クールプリンセス]スマイルPの12%UP＋2年生のメンバーはさらにクールPが6%アップ*/
            public static final Princess SECOND_GRADE = new Princess(ConditionPerType.SECOND_GRADE);
            /**[クールプリンセス]スマイルPの12%UP＋3年生のメンバーはさらにクールPが6%アップ*/
            public static final Princess THIRD_GRADE = new Princess(ConditionPerType.THIRD_GRADE);

            private Princess(ConditionPerType conditionPerType) {
                super(Attribute.SMILE, new RateOfIncrease(12), conditionPerType);
            }
        }

        public static class Angel extends Cool {
            /**[クールエンジェル]ピュアPの12%UP＋BiBiのメンバーはさらにクールPが6%アップ*/
            public static final Angel BiBi = new Angel(ConditionPerType.BiBi);
            /**[クールエンジェル]ピュアPの12%UP＋lily whiteのメンバーはさらにクールPが6%アップ*/
            public static final Angel lily_white = new Angel(ConditionPerType.lily_white);
            /**[クールエンジェル]ピュアPの12%UP＋PrintempsのメンバーはさらにクールPが6%アップ*/
            public static final Angel Printemps = new Angel(ConditionPerType.Printemps);

            /**[クールエンジェル]ピュアPの12%UP＋1年生のメンバーはさらにクールPが6%アップ*/
            public static final Angel FIRST_GRADE = new Angel(ConditionPerType.FIRST_GRADE);
            /**[クールエンジェル]ピュアPの12%UP＋2年生のメンバーはさらにクールPが6%アップ*/
            public static final Angel SECOND_GRADE = new Angel(ConditionPerType.SECOND_GRADE);
            /**[クールエンジェル]ピュアPの12%UP＋3年生のメンバーはさらにクールPが6%アップ*/
            public static final Angel THIRD_GRADE = new Angel(ConditionPerType.THIRD_GRADE);

            private Angel(ConditionPerType conditionPerType) {
                super(Attribute.PURE, new RateOfIncrease(12), conditionPerType);
            }
        }
    }


    public static class Smile extends CenterSkill {

        private Smile(Attribute basicAttribute, RateOfIncrease rateOfIncrease, ConditionPerType conditionPerType) {
            super(Attribute.SMILE, basicAttribute, rateOfIncrease, conditionPerType);
        }

        public static class Empress extends Smile {
            /**[スマイルエンプレス]クールPの12%UP＋BiBiのメンバーはさらにスマイルPが6%アップ*/
            public static final Empress BiBi = new Empress(ConditionPerType.BiBi);
            /**[スマイルエンプレス]クールPの12%UP＋lily whiteのメンバーはさらにスマイルPが6%アップ*/
            public static final Empress lily_white = new Empress(ConditionPerType.lily_white);
            /**[スマイルエンプレス]クールPの12%UP＋PrintempsのメンバーはさらにスマイルPが6%アップ*/
            public static final Empress Printemps = new Empress(ConditionPerType.Printemps);

            /**[スマイルエンプレス]クールPの12%UP＋1年生のメンバーはさらにスマイルPが6%アップ*/
            public static final Empress FIRST_GRADE = new Empress(ConditionPerType.FIRST_GRADE);
            /**[スマイルエンプレス]クールPの12%UP＋2年生のメンバーはさらにスマイルPが6%アップ*/
            public static final Empress SECOND_GRADE = new Empress(ConditionPerType.SECOND_GRADE);
            /**[スマイルエンプレス]クールPの12%UP＋3年生のメンバーはさらにスマイルPが6%アップ*/
            public static final Empress THIRD_GRADE = new Empress(ConditionPerType.THIRD_GRADE);

            private Empress(ConditionPerType conditionPerType) {
                super(Attribute.COOL, new RateOfIncrease(12), conditionPerType);
            }
        }

        public static class Princess extends Smile {
            /**[スマイルプリンセス]スマイルPが9%UP＋μ'sのメンバーはさらにスマイルPが3%アップ*/
            public static final Princess MUSE = new Princess(ConditionPerType.MUSE);
            /**[スマイルプリンセス]スマイルPが9%UP＋AqoursのメンバーはさらにスマイルPが3%アップ*/
            public static final Princess AQOURS = new Princess(ConditionPerType.AQOURS);

            /**[スマイルプリンセス]スマイルPが9%UP＋BiBiのメンバーはさらにスマイルPが6%アップ*/
            public static final Princess BiBi = new Princess(ConditionPerType.BiBi);
            /**[スマイルプリンセス]スマイルPが9%UP＋lily whiteのメンバーはさらにスマイルPが6%アップ*/
            public static final Princess lily_white = new Princess(ConditionPerType.lily_white);
            /**[スマイルプリンセス]スマイルPが9%UP＋PrintempsのメンバーはさらにスマイルPが6%アップ*/
            public static final Princess Printemps = new Princess(ConditionPerType.Printemps);

            /**[スマイルプリンセス]スマイルPが9%UP＋1年生のメンバーはさらにスマイルPが6%アップ*/
            public static final Princess FIRST_GRADE = new Princess(ConditionPerType.FIRST_GRADE);
            /**[スマイルプリンセス]スマイルPが9%UP＋2年生のメンバーはさらにスマイルPが6%アップ*/
            public static final Princess SECOND_GRADE = new Princess(ConditionPerType.SECOND_GRADE);
            /**[スマイルプリンセス]スマイルPが9%UP＋3年生のメンバーはさらにスマイルPが6%アップ*/
            public static final Princess THIRD_GRADE = new Princess(ConditionPerType.THIRD_GRADE);

            private Princess(ConditionPerType conditionPerType) {
                super(Attribute.SMILE, new RateOfIncrease(9), conditionPerType);
            }
        }

        public static class Angel extends Smile {
            /**[スマイルエンジェル]ピュアPの12%UP＋BiBiのメンバーはさらにスマイルPが6%アップ*/
            public static final Angel BiBi = new Angel(ConditionPerType.BiBi);
            /**[スマイルエンジェル]ピュアPの12%UP＋lily whiteのメンバーはさらにスマイルPが6%アップ*/
            public static final Angel lily_white = new Angel(ConditionPerType.lily_white);
            /**[スマイルエンジェル]ピュアPの12%UP＋PrintempsのメンバーはさらにスマイルPが6%アップ*/
            public static final Angel Printemps = new Angel(ConditionPerType.Printemps);

            /**[スマイルエンジェル]ピュアPの12%UP＋1年生のメンバーはさらにスマイルPが6%アップ*/
            public static final Angel FIRST_GRADE = new Angel(ConditionPerType.FIRST_GRADE);
            /**[スマイルエンジェル]ピュアPの12%UP＋2年生のメンバーはさらにスマイルPが6%アップ*/
            public static final Angel SECOND_GRADE = new Angel(ConditionPerType.SECOND_GRADE);
            /**[スマイルエンジェル]ピュアPの12%UP＋3年生のメンバーはさらにスマイルPが6%アップ*/
            public static final Angel THIRD_GRADE = new Angel(ConditionPerType.THIRD_GRADE);

            private Angel(ConditionPerType conditionPerType) {
                super(Attribute.PURE, new RateOfIncrease(12), conditionPerType);
            }
        }
    }


    public static class Pure extends CenterSkill {

        private Pure(Attribute basicAttribute, RateOfIncrease rateOfIncrease, ConditionPerType conditionPerType) {
            super(Attribute.PURE, basicAttribute, rateOfIncrease, conditionPerType);
        }

        public static class Empress extends Pure {
            /**[ピュアエンプレス]クールPの12%UP＋BiBiのメンバーはさらにスマイルPが6%アップ*/
            public static final Empress BiBi = new Empress(ConditionPerType.BiBi);
            /**[ピュアエンプレス]クールPの12%UP＋lily whiteのメンバーはさらにスマイルPが6%アップ*/
            public static final Empress lily_white = new Empress(ConditionPerType.lily_white);
            /**[ピュアエンプレス]クールPの12%UP＋PrintempsのメンバーはさらにスマイルPが6%アップ*/
            public static final Empress Printemps = new Empress(ConditionPerType.Printemps);

            /**[ピュアエンプレス]クールPの12%UP＋1年生のメンバーはさらにスマイルPが6%アップ*/
            public static final Empress FIRST_GRADE = new Empress(ConditionPerType.FIRST_GRADE);
            /**[ピュアエンプレス]クールPの12%UP＋2年生のメンバーはさらにスマイルPが6%アップ*/
            public static final Empress SECOND_GRADE = new Empress(ConditionPerType.SECOND_GRADE);
            /**[ピュアエンプレス]クールPの12%UP＋3年生のメンバーはさらにスマイルPが6%アップ*/
            public static final Empress THIRD_GRADE = new Empress(ConditionPerType.THIRD_GRADE);

            private Empress(ConditionPerType conditionPerType) {
                super(Attribute.COOL, new RateOfIncrease(12), conditionPerType);
            }
        }

        public static class Princess extends Pure {
            /**[ピュアプリンセス]スマイルPの12%UP＋BiBiのメンバーはさらにスマイルPが6%アップ*/
            public static final Princess BiBi = new Princess(ConditionPerType.BiBi);
            /**[ピュアプリンセス]スマイルPの12%UP＋lily whiteのメンバーはさらにスマイルPが6%アップ*/
            public static final Princess lily_white = new Princess(ConditionPerType.lily_white);
            /**[ピュアプリンセス]スマイルPの12%UP＋PrintempsのメンバーはさらにスマイルPが6%アップ*/
            public static final Princess Printemps = new Princess(ConditionPerType.Printemps);

            /**[ピュアプリンセス]スマイルPの12%UP＋1年生のメンバーはさらにスマイルPが6%アップ*/
            public static final Princess FIRST_GRADE = new Princess(ConditionPerType.FIRST_GRADE);
            /**[ピュアプリンセス]スマイルPの12%UP＋2年生のメンバーはさらにスマイルPが6%アップ*/
            public static final Princess SECOND_GRADE = new Princess(ConditionPerType.SECOND_GRADE);
            /**[ピュアプリンセス]スマイルPの12%UP＋3年生のメンバーはさらにスマイルPが6%アップ*/
            public static final Princess THIRD_GRADE = new Princess(ConditionPerType.THIRD_GRADE);

            private Princess(ConditionPerType conditionPerType) {
                super(Attribute.SMILE, new RateOfIncrease(12), conditionPerType);
            }
        }

        public static class Angel extends Pure {
            /**[ピュアエンジェル]ピュアPの9%UP＋μ'sのメンバーはさらにスマイルPが3%アップ*/
            public static final Angel MUSE = new Angel(ConditionPerType.MUSE);
            /**[ピュアエンジェル]ピュアPの9%UP＋AqoursのメンバーはさらにスマイルPが3%アップ*/
            public static final Angel AQOURS = new Angel(ConditionPerType.AQOURS);

            /**[ピュアエンジェル]ピュアPの9%UP＋BiBiのメンバーはさらにスマイルPが6%アップ*/
            public static final Angel BiBi = new Angel(ConditionPerType.BiBi);
            /**[ピュアエンジェル]ピュアPの9%UP＋lily whiteのメンバーはさらにスマイルPが6%アップ*/
            public static final Angel lily_white = new Angel(ConditionPerType.lily_white);
            /**[ピュアエンジェル]ピュアPの9%UP＋PrintempsのメンバーはさらにスマイルPが6%アップ*/
            public static final Angel Printemps = new Angel(ConditionPerType.Printemps);

            /**[ピュアエンジェル]ピュアPの9%UP＋1年生のメンバーはさらにスマイルPが6%アップ*/
            public static final Angel FIRST_GRADE = new Angel(ConditionPerType.FIRST_GRADE);
            /**[ピュアエンジェル]ピュアPの9%UP＋2年生のメンバーはさらにスマイルPが6%アップ*/
            public static final Angel SECOND_GRADE = new Angel(ConditionPerType.SECOND_GRADE);
            /**[ピュアエンジェル]ピュアPの9%UP＋3年生のメンバーはさらにスマイルPが6%アップ*/
            public static final Angel THIRD_GRADE = new Angel(ConditionPerType.THIRD_GRADE);

            private Angel(ConditionPerType conditionPerType) {
                super(Attribute.PURE, new RateOfIncrease(9), conditionPerType);
            }
        }
    }
}
