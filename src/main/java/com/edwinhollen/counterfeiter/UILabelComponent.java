package com.edwinhollen.counterfeiter;

import org.newdawn.slick.Color;

/**
 * Created by Edwin on 5/27/2015.
 */
public class UILabelComponent extends UIComponent {
    String text = "";
    Assets.FontType type = Assets.FontType.SANS_SERIF;
    Color color = Color.black;

    public UILabelComponent(String text, Assets.FontType type) {
        this.text = text;
        this.type = type;
    }

    public UILabelComponent(String text) {
        this.text = text;
    }
}
