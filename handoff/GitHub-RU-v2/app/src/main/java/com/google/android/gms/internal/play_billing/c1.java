package com.google.android.gms.internal.play_billing;

import java.util.concurrent.CancellationException;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c1 {
    public static final c1 b;
    public static final c1 c;
    public final Throwable a;

    static {
        if (z3.u) {
            c = null;
            b = null;
        } else {
            c = new c1(null);
            b = new c1(null);
        }
    }

    public c1(CancellationException cancellationException) {
        this.a = cancellationException;
    }
}
