package com.google.android.gms.internal.play_billing;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class m0 extends x0 implements u0 {
    public static final Object u = new Object();
    public static final t0 v = new t0(w0.class);
    public static final boolean w;
    public static final b91.g x;
    public volatile Object r;
    public volatile g0 s;
    public volatile l0 t;

    static {
        boolean z;
        b91.g j0Var;
        Throwable th;
        Throwable th2;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        w = z;
        String property = System.getProperty("java.runtime.name", "");
        Throwable th3 = null;
        if (property == null || property.contains("Android")) {
            try {
                j0Var = new k0();
            } catch (Error | Exception e) {
                try {
                    j0Var = new i0();
                } catch (Error | Exception e2) {
                    th3 = e2;
                    j0Var = new j0();
                }
                th = th3;
                th2 = e;
            }
        } else {
            try {
                j0Var = new i0();
            } catch (NoClassDefFoundError unused2) {
                j0Var = new j0();
            }
        }
        th = null;
        th2 = null;
        x = j0Var;
        if (th != null) {
            t0 t0Var = v;
            Logger a = t0Var.a();
            Level level = Level.SEVERE;
            a.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            t0Var.a().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th);
        }
    }

    public final void d(l0 l0Var) {
        l0Var.a = null;
        while (true) {
            l0 l0Var2 = this.t;
            if (l0Var2 != l0.c) {
                l0 l0Var3 = null;
                while (l0Var2 != null) {
                    l0 l0Var4 = l0Var2.b;
                    if (l0Var2.a != null) {
                        l0Var3 = l0Var2;
                    } else if (l0Var3 != null) {
                        l0Var3.b = l0Var4;
                        if (l0Var3.a == null) {
                            break;
                        }
                    } else if (!x.j0(this, l0Var2, l0Var4)) {
                        break;
                    }
                    l0Var2 = l0Var4;
                }
                return;
            }
            return;
        }
    }
}
