package com.rmpi.newmodpe;

import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.annotations.JSStaticFunction;

public class N_Player extends ScriptableObject {
    public N_Player() {
        super();
    }

    @Override
    public String getClassName() {
        return "N_Player";
    }

    @JSStaticFunction
    public static void setRoundAttack(boolean enable, boolean hitMob, int distance) {
        if (distance > 0)
            nativeSetRoundAttack(enable, hitMob, distance);
    }

    private static native void nativeSetRoundAttack(boolean enable, boolean hitMob, int distance);
}
