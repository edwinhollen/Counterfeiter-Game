package com.edwinhollen.counterfeiter;

import edwinhollen.excess.Component;

/**
 * Created by Edwin on 5/26/2015.
 */
public class PositionComponent implements Component {
    public double x = 0;
    public double y = 0;

    public PositionComponent(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
