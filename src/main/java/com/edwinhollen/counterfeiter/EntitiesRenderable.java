package com.edwinhollen.counterfeiter;

import edwinhollen.excess.Entity;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

import java.util.List;

/**
 * Created by Edwin on 5/26/2015.
 */
public interface EntitiesRenderable{
    void render(List<Entity> entities, GameContainer gc, Graphics g);
}
