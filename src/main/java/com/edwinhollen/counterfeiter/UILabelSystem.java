package com.edwinhollen.counterfeiter;

import edwinhollen.excess.*;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Edwin on 5/27/2015.
 */
public class UILabelSystem implements edwinhollen.excess.System, EntitiesRenderable {
    @Override
    public List<Class<? extends Component>> getAcceptedComponents() {
        return Arrays.asList(UILabelComponent.class, PositionComponent.class);
    }

    @Override
    public void render(List<Entity> entities, GameContainer gc, Graphics g) {
        entities.forEach(entity -> {
            UILabelComponent lc = (UILabelComponent) entity.getComponent(UILabelComponent.class);
            PositionComponent pos = (PositionComponent) entity.getComponent(PositionComponent.class);
            g.setColor(lc.color);
            g.drawString(lc.text, Math.round(pos.x), Math.round(pos.y));
        });
    }
}
