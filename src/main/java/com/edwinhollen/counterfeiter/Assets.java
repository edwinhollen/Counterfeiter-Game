package com.edwinhollen.counterfeiter;

import org.newdawn.slick.Image;

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

    public Future<Image> getImage(String name){
        
    }
}
