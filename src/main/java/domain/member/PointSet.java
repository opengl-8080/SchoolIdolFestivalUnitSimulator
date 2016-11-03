package domain.member;

import domain.basic.attribute.Attribute;
import domain.basic.point.Point;
import domain.basic.point.RateOfIncrease;
import lombok.ToString;

/**
 * ポイントセット
 */
@ToString
public class PointSet {
    public static final PointSet ZERO = new PointSet();

    private Point smile = new Point(Attribute.SMILE, 0);
    private Point pure = new Point(Attribute.PURE, 0);
    private Point cool = new Point(Attribute.COOL, 0);

    public PointSet normalize() {
        PointSet result = new PointSet();

        result.smile = this.smile.normalize();
        result.pure = this.pure.normalize();
        result.cool = this.cool.normalize();

        return result;
    }

    public PointSet skillBonus(Attribute basicAttribute, Attribute targetAttribute, RateOfIncrease rateOfIncrease) {
        Point basicPoint = this.get(basicAttribute);
        Point bonusPoint = basicPoint.multiply(rateOfIncrease);
        return this.plus(targetAttribute, bonusPoint);
    }

    public PointSet plus(PointSet pointSet) {
        PointSet result = new PointSet();

        result.smile = this.smile.plus(pointSet.smile);
        result.pure = this.pure.plus(pointSet.pure);
        result.cool = this.cool.plus(pointSet.cool);

        return result;
    }

    public PointSet plus(Attribute attribute, Point point) {
        PointSet result = new PointSet();
        result.smile = this.smile;
        result.pure = this.pure;
        result.cool = this.cool;

        if (attribute == Attribute.SMILE) {
            result.smile = result.smile.plus(point);
        } else if (attribute == Attribute.PURE) {
            result.pure = result.pure.plus(point);
        } else if (attribute == Attribute.COOL) {
            result.cool = result.cool.plus(point);
        } else {
            throw new IllegalArgumentException("attribute=" + attribute);
        }

        return result;
    }

    void set(Attribute attribute, Point point) {
        if (attribute == Attribute.SMILE) {
            this.smile = point;
        } else if (attribute == Attribute.PURE) {
            this.pure = point;
        } else if (attribute == Attribute.COOL) {
            this.cool = point;
        } else {
            throw new IllegalArgumentException("attribute=" + attribute);
        }
    }

    public Point get(Attribute attribute) {
        if (attribute == Attribute.SMILE) {
            return this.smile;
        } else if (attribute == Attribute.PURE) {
            return this.pure;
        } else if (attribute == Attribute.COOL) {
            return this.cool;
        } else {
            throw new IllegalArgumentException("attribute=" + attribute);
        }
    }
}
