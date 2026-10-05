package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m2 implements Runnable {
    public final /* synthetic */ int r;
    public final /* synthetic */ AtomicReference s;
    public final /* synthetic */ t2 t;

    public /* synthetic */ m2(t2 t2Var, AtomicReference atomicReference, int i, boolean z) {
        this.r = i;
        this.t = t2Var;
        this.s = atomicReference;
    }

    private final void a() {
        AtomicReference atomicReference = this.s;
        synchronized (atomicReference) {
            try {
                try {
                    o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this.t).s;
                    atomicReference.set(Double.valueOf(o1Var.u.I(o1Var.r().F(), c0.e0)));
                } finally {
                    this.s.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.r) {
            case 0:
                AtomicReference atomicReference = this.s;
                synchronized (atomicReference) {
                    try {
                        try {
                            o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this.t).s;
                            atomicReference.set(Boolean.valueOf(o1Var.u.J(o1Var.r().F(), c0.a0)));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
            case 1:
                AtomicReference atomicReference2 = this.s;
                synchronized (atomicReference2) {
                    try {
                        try {
                            o1 o1Var2 = (o1) ((androidx.compose.foundation.lazy.layout.s0) this.t).s;
                            atomicReference2.set(o1Var2.u.F(o1Var2.r().F(), c0.b0));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
            case 2:
                AtomicReference atomicReference3 = this.s;
                synchronized (atomicReference3) {
                    try {
                        try {
                            o1 o1Var3 = (o1) ((androidx.compose.foundation.lazy.layout.s0) this.t).s;
                            atomicReference3.set(Long.valueOf(o1Var3.u.G(o1Var3.r().F(), c0.c0)));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
            case 3:
                AtomicReference atomicReference4 = this.s;
                synchronized (atomicReference4) {
                    try {
                        try {
                            o1 o1Var4 = (o1) ((androidx.compose.foundation.lazy.layout.s0) this.t).s;
                            atomicReference4.set(Integer.valueOf(o1Var4.u.H(o1Var4.r().F(), c0.d0)));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
            case 4:
                a();
                return;
            case 5:
                t2 t2Var = this.t;
                c1 c1Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) t2Var).s).v;
                o1.k(c1Var);
                Bundle U = c1Var.F.U();
                p3 p = ((o1) ((androidx.compose.foundation.lazy.layout.s0) t2Var).s).p();
                AtomicReference atomicReference5 = this.s;
                p.z();
                p.A();
                p.N(new a5.q1(p, atomicReference5, p.P(false), U, 7));
                return;
            default:
                p3 p2 = ((o1) ((androidx.compose.foundation.lazy.layout.s0) this.t).s).p();
                g4 j = g4.j(a3.v);
                AtomicReference atomicReference6 = this.s;
                p2.z();
                p2.A();
                p2.N(new a5.q1(p2, atomicReference6, p2.P(false), j, 8));
                return;
        }
    }

    public m2(t2 t2Var, AtomicReference atomicReference, int i) {
        this.r = i;
        switch (i) {
            case 1:
                this.s = atomicReference;
                Objects.requireNonNull(t2Var);
                this.t = t2Var;
                break;
            case 2:
                this.s = atomicReference;
                Objects.requireNonNull(t2Var);
                this.t = t2Var;
                break;
            case 3:
                this.s = atomicReference;
                Objects.requireNonNull(t2Var);
                this.t = t2Var;
                break;
            case 4:
                this.s = atomicReference;
                Objects.requireNonNull(t2Var);
                this.t = t2Var;
                break;
            default:
                this.s = atomicReference;
                Objects.requireNonNull(t2Var);
                this.t = t2Var;
                break;
        }
    }
}
