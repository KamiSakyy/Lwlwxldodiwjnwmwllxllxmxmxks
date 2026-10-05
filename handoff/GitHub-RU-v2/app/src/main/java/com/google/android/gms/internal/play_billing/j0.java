package com.google.android.gms.internal.play_billing;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j0 extends b91.g {
    public final g0 c0(w0 w0Var) {
        g0 g0Var;
        g0 g0Var2 = g0.d;
        synchronized (w0Var) {
            try {
                g0Var = w0Var.s;
                if (g0Var != g0Var2) {
                    w0Var.s = g0Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return g0Var;
    }

    public final l0 e0(w0 w0Var) {
        l0 l0Var;
        l0 l0Var2 = l0.c;
        synchronized (w0Var) {
            try {
                l0Var = w0Var.t;
                if (l0Var != l0Var2) {
                    w0Var.t = l0Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return l0Var;
    }

    public final void f0(l0 l0Var, l0 l0Var2) {
        l0Var.b = l0Var2;
    }

    public final void g0(l0 l0Var, Thread thread) {
        l0Var.a = thread;
    }

    public final boolean h0(w0 w0Var, g0 g0Var, g0 g0Var2) {
        synchronized (w0Var) {
            try {
                if (w0Var.s != g0Var) {
                    return false;
                }
                w0Var.s = g0Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean i0(m0 m0Var, Object obj, Object obj2) {
        synchronized (m0Var) {
            try {
                if (m0Var.r != obj) {
                    return false;
                }
                m0Var.r = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean j0(m0 m0Var, l0 l0Var, l0 l0Var2) {
        synchronized (m0Var) {
            try {
                if (m0Var.t != l0Var) {
                    return false;
                }
                m0Var.t = l0Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
