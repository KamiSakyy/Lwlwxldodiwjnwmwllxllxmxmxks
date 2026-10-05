package com.google.android.gms.internal.play_billing;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c0 {
    public static final c0 c;
    public static final c0 d;
    public final boolean a;
    public final Throwable b;

    static {
        if (m0.w) {
            d = null;
            c = null;
        } else {
            d = new c0(null, false);
            c = new c0(null, true);
        }
    }

    public c0(Throwable th, boolean z) {
        this.a = z;
        this.b = th;
    }
}
