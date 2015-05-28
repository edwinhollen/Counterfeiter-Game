package com.edwinhollen.counterfeiter;

import edwinhollen.excess.Excess;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

/**
 * Created by Edwin on 5/26/2015.
 */
public abstract class Scene implements Updateable, Renderable{
    protected Excess excess = new Excess();

    @Override
    public void render(GameContainer gc, Graphics g) {
        this.excess.getOrganizedEntities().entrySet().stream()
                .filter(systemListEntry -> systemListEntry.getKey() instanceof EntitiesRenderable)
                .forEachOrdered(systemListEntry -> ((EntitiesRenderable) systemListEntry.getKey()).render(systemListEntry.getValue(), gc, g));
    }

    @Override
    public void update(GameContainer gc, int dt) {
        this.excess.getOrganizedEntities().entrySet().stream()
                .filter(systemListEntry -> systemListEntry.getKey() instanceof EntitiesUpdateable)
                .forEachOrdered(systemListEntry -> ((EntitiesUpdateable) systemListEntry.getKey()).update(systemListEntry.getValue(), gc, dt));
    }

    public abstract void dispose();
}
