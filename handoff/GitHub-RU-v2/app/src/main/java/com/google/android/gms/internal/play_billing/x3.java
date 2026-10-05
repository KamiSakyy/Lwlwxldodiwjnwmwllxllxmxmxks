package com.google.android.gms.internal.play_billing;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x3 extends com.google.android.gms.internal.measurement.b4 {
    @Override // com.google.android.gms.internal.measurement.b4
    public final boolean A0(z3 z3Var, Object obj, Object obj2) {
        synchronized (z3Var) {
            try {
                if (z3Var.r != obj) {
                    return false;
                }
                z3Var.r = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.b4
    public final boolean B0(z3 z3Var, y3 y3Var, y3 y3Var2) {
        synchronized (z3Var) {
            try {
                if (z3Var.t != y3Var) {
                    return false;
                }
                z3Var.t = y3Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.b4
    public final void w0(y3 y3Var, y3 y3Var2) {
        y3Var.b = y3Var2;
    }

    @Override // com.google.android.gms.internal.measurement.b4
    public final void y0(y3 y3Var, Thread thread) {
        y3Var.a = thread;
    }

    @Override // com.google.android.gms.internal.measurement.b4
    public final boolean z0(z3 z3Var, g2 g2Var, g2 g2Var2) {
        synchronized (z3Var) {
            try {
                if (z3Var.s != g2Var) {
                    return false;
                }
                z3Var.s = g2Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
