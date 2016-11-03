package domain.basic.point;

import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * ポイント
 */
@ToString
@EqualsAndHashCode
public class Point {
    private final int value;

    public Point(int value) {
        this.value = value;
    }

    public Point plus(Point point) {
        return new Point(this.value + point.value);
    }
}
