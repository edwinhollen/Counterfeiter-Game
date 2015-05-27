package com.edwinhollen.counterfeiter;

import edwinhollen.excess.Excess;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

/**
 * A game using Slick2d
 */
public class Game extends BasicGame {
    public static final int RENDER_WIDTH = 400;
    public static final int RENDER_HEIGHT = 300;
    
    /** A counter... */
    private int counter;

    public Game() {
        super("Counterfeiter");
    }

    public void render(GameContainer gc, Graphics g) throws SlickException {
        SceneManager.currentScene.render(gc, g);
    }

    @Override
    public void init(GameContainer container) throws SlickException {
        SceneManager.changeScene(TitleScene.class);
    }

    @Override
    public void update(GameContainer gc, int dt) throws SlickException {
        SceneManager.currentScene.update(gc, dt);
    }
    
    public static void main(String[] args) throws SlickException {
        AppGameContainer app = new AppGameContainer(new Game());
        app.setDisplayMode(800, 600, false);
        app.setForceExit(false);
        app.start();
    }

}
