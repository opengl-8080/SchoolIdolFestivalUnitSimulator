package domain.basic.point;

import domain.basic.attribute.Attribute;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * ポイント
 */
@ToString
@EqualsAndHashCode
public class Point {
    public static final Point ZERO = new Point(null, 0);
    private final Attribute attribute;
    private final int value;

    public Point(Attribute attribute, int value) {
        this.attribute = attribute;
        this.value = value;
    }

    public Point plus(Point point) {
        return new Point(this.attribute, this.value + point.value);
    }

    public Point multiply(RateOfIncrease rateOfIncrease) {
        int rate = rateOfIncrease.calcRate(this.value);
        return new Point(this.attribute, rate);
    }

    public Point normalize() {
        String text = String.valueOf(this.value);
        int one = Integer.parseInt(text.substring(text.length() - 1, text.length()));

        return new Point(this.attribute, this.value - one + (0 < one ? 10 : 0));
    }

    public boolean is(Attribute attribute) {
        return this.attribute == attribute;
    }
}
