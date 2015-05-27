package com.edwinhollen.counterfeiter;

import edwinhollen.excess.Entity;
import edwinhollen.excess.Excess;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Edwin on 5/26/2015.
 */
public class TitleScene extends Scene {
    public TitleScene(){
        this.excess.addSystem(new ImageSystem());
        this.excess.addSystem(new PhysicsSystem());

        // bg
        this.excess.addEntity(new Entity(Arrays.asList(
            new PositionComponent(0, 0),
            new ImageComponent("lightbg.png")
        )));

        // scissors
        this.excess.addEntity(new Entity(Arrays.asList(
                new PositionComponent(200, 200),
                new ImageComponent("scissors.png", 0.8f)
        )));

        // marker
        this.excess.addEntity(new Entity(Arrays.asList(
                new PositionComponent(-20, -20),
                new ImageComponent("marker.png", 0.8f)
        )));



    }

    public void dispose() {

    }
}
