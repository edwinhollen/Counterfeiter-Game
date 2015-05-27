package com.edwinhollen.counterfeiter;

import edwinhollen.excess.Entity;
import org.newdawn.slick.GameContainer;

import java.util.List;

/**
 * Created by Edwin on 5/26/2015.
 */
public interface EntitiesUpdateable{
    void update(List<Entity> entities, GameContainer gc, int dt);
}
