package com.edwinhollen.counterfeiter;

import edwinhollen.excess.*;
import edwinhollen.excess.System;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Edwin on 5/26/2015.
 */
public class PhysicsSystem implements System {
    public List<Class<? extends Component>> getAcceptedComponents() {
        return Arrays.asList(PositionComponent.class, VelocityComponent.class);
    }
}
