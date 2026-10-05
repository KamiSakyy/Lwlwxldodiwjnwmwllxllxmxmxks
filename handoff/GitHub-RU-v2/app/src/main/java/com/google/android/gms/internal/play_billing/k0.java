package com.google.android.gms.internal.play_billing;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k0 extends b91.g {
    public static final Unsafe a;
    public static final long b;
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (PrivilegedActionException e2) {
                throw new RuntimeException("Could not initialize intrinsics", e2.getCause());
            }
        } catch (SecurityException unused) {
            unsafe = (Unsafe) AccessController.doPrivileged(new p0());
        }
        try {
            c = unsafe.objectFieldOffset(m0.class.getDeclaredField("t"));
            b = unsafe.objectFieldOffset(m0.class.getDeclaredField("s"));
            d = unsafe.objectFieldOffset(m0.class.getDeclaredField("r"));
            e = unsafe.objectFieldOffset(l0.class.getDeclaredField("a"));
            f = unsafe.objectFieldOffset(l0.class.getDeclaredField("b"));
            a = unsafe;
        } catch (NoSuchFieldException e3) {
            throw new RuntimeException(e3);
        }
    }

    public final g0 c0(w0 w0Var) {
        g0 g0Var;
        g0 g0Var2 = g0.d;
        do {
            g0Var = w0Var.s;
            if (g0Var2 == g0Var) {
                break;
            }
        } while (!h0(w0Var, g0Var, g0Var2));
        return g0Var;
    }

    public final l0 e0(w0 w0Var) {
        l0 l0Var;
        l0 l0Var2 = l0.c;
        do {
            l0Var = w0Var.t;
            if (l0Var2 == l0Var) {
                break;
            }
        } while (!j0(w0Var, l0Var, l0Var2));
        return l0Var;
    }

    public final void f0(l0 l0Var, l0 l0Var2) {
        a.putObject(l0Var, f, l0Var2);
    }

    public final void g0(l0 l0Var, Thread thread) {
        a.putObject(l0Var, e, thread);
    }

    public final boolean h0(w0 w0Var, g0 g0Var, g0 g0Var2) {
        return o0.a(a, w0Var, b, g0Var, g0Var2);
    }

    public final boolean i0(m0 m0Var, Object obj, Object obj2) {
        return o0.a(a, m0Var, d, obj, obj2);
    }

    public final boolean j0(m0 m0Var, l0 l0Var, l0 l0Var2) {
        return o0.a(a, m0Var, c, l0Var, l0Var2);
    }





}
