package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g0 {
    public static final g0 d = new g0();
    public Runnable a;
    public Executor b;
    public g0 c;

    public g0() {
        this.a = null;
        this.b = null;
    }

    public g0(Runnable runnable, Executor executor) {
        this.a = runnable;
        this.b = executor;
    }
}
