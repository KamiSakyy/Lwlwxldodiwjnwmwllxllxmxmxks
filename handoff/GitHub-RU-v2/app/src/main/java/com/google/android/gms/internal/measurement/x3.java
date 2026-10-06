package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class x3 {
    public static final b51.dShadow a;

    static {
        b51.dShadow dVar;
        Uri uri = y3.a;
        synchronized (z3.class) {
            try {
                if (z3.a == null) {
                    b51.dShadow dVar2 = new b51.dShadow();
                    synchronized (z3.class) {
                        if (z3.a != null) {
                            throw new IllegalStateException("init() already called");
                        }
                        z3.a = dVar2;
                    }
                }
                dVar = z3.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        a = dVar;
    }
}
