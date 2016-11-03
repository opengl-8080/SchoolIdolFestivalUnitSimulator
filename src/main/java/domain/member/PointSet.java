package domain.member;

import domain.basic.point.Point;
import lombok.ToString;

/**
 * ポイントセット
 */
@ToString
public class PointSet {
    private Point smile;
    private Point pure;
    private Point cool;

    void setSmile(Point smile) {
        this.smile = smile;
    }

    void setPure(Point pure) {
        this.pure = pure;
    }

    void setCool(Point cool) {
        this.cool = cool;
    }

    Point getSmile() {
        return smile;
    }

    Point getPure() {
        return pure;
    }

    Point getCool() {
        return cool;
    }
}
