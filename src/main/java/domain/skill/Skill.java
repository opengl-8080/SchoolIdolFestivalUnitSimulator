package domain.skill;

import domain.basic.attribute.Attribute;

/**
 * スキル
 */
public abstract class Skill {
    private final Cost cost;
    private final Attribute attribute;

    protected Skill(Cost cost, Attribute attribute) {
        this.cost = cost;
        this.attribute = attribute;
    }
}
