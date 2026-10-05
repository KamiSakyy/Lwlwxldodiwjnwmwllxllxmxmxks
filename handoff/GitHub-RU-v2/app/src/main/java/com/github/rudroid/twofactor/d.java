package com.github.rudroid.twofactor;

import k5.f;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class d<T extends k5.f> extends com.github.rudroid.activities.t<T> {
    public boolean j0;

    public final void Z() {
        if (this.j0) {
            return;
        }
        this.j0 = true;
        ((f) w()).s0((TwoFactorActivity) this);
    }







}
