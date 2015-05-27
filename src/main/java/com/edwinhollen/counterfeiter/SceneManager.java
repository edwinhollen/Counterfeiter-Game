package com.edwinhollen.counterfeiter;

/**
 * Created by Edwin on 5/27/2015.
 */
public class SceneManager {
    public static Scene currentScene;

    public static void changeScene(Class<? extends Scene> sceneClass){
        try {
            currentScene = sceneClass.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
