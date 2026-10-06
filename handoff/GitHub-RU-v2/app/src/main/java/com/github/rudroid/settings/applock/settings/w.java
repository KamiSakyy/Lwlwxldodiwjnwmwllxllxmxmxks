package com.github.rudroid.settings.applock.settings;

import com.github.rudroid.activities.p2;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class w extends p2 {
    public boolean s0;

    public final void Z() {
        if (this.s0) {
            return;
        }
        this.s0 = true;
        ((g) w()).D0((AppLockSettingsActivity) this);
    }
    public Object onCreate(Object p1) { return null; }
}
