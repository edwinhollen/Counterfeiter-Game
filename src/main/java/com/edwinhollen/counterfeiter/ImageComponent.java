package com.edwinhollen.counterfeiter;

import edwinhollen.excess.Component;

/**
 * Created by Edwin on 5/27/2015.
 */
public class ImageComponent implements Component {
    public String imageName = null;

    public ImageComponent(String imageName) {
        this.imageName = imageName;
    }
}
