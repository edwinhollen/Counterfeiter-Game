package com.edwinhollen.counterfeiter;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * Created by Edwin on 5/26/2015.
 */
public class Assets {
    private static Map<String, Image> loadedImages = new HashMap<>();

    public static Image getImage(String name){
        return loadedImages.getOrDefault(name, loadImage(name));
    }

    private static Image loadImage(String name){
        try {
            Image img = new Image(name);
            img.setFilter(Image.FILTER_NEAREST);
            loadedImages.put(name, img);
            return img;
        } catch (SlickException e) {
            e.printStackTrace();
        }
        return null;
    }
}
