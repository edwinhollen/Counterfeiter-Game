package com.edwinhollen.counterfeiter;

import edwinhollen.excess.*;
import edwinhollen.excess.System;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Edwin on 5/27/2015.
 */
public class ImageSystem implements System, EntitiesRenderable {
    @Override
    public List<Class<? extends Component>> getAcceptedComponents() {
        return Arrays.asList(ImageComponent.class, PositionComponent.class);
    }

    @Override
    public void render(List<Entity> entities, GameContainer gc, Graphics g) {
        entities.forEach(entity -> {
            ImageComponent ic = (ImageComponent) entity.getComponent(ImageComponent.class);
            PositionComponent pc = (PositionComponent) entity.getComponent(PositionComponent.class);
            g.drawImage(Assets.getImage(ic.imageName), Math.round(pc.x), Math.round(pc.y));
        });
    }
}
