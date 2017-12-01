package com.pluralsight.toolbox;

import com.pluralsight.fruit.IFruit;
import com.pluralsight.fruit.Tree;

import java.util.Random;

public class MeasuringTape {

    private MeasuringTape() {
    }

    public static MeasuringTape createMeasuringTape() {
        return new MeasuringTape();
    }

    public double getDistance(IFruit aFruit, Tree tree) {

        Random random = new Random();

        return random.nextDouble() * aFruit.getRollMultiplier();

    }
}
