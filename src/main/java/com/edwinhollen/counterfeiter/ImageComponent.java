package com.edwinhollen.counterfeiter;

import edwinhollen.excess.Component;

/**
 * Created by Edwin on 5/27/2015.
 */
public class ImageComponent implements Component {
    public String imageName = null;
    public float scale = 1;

    public ImageComponent(String imageName) {
        this.imageName = imageName;
    }

    public ImageComponent(String imageName, float scale) {
        this.imageName = imageName;
        this.scale = scale;
    }
}
