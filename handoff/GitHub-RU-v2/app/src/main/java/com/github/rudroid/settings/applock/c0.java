package com.github.rudroid.settings.applock;

import android.os.Bundle;
import androidx.lifecycle.o1;
import com.google.android.gms.internal.measurement.n4;
import com.google.android.gms.internal.measurement.z3;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class c0 extends k.i implements o61.b {
    public n4 S;
    public volatile m61.b T;
    public final Object U = new Object();
    public boolean V = false;

    public c0() {
        C(new b0((AppLockActivity) this));
    }

    public final m61.b Y() {
        if (this.T == null) {
            synchronized (this.U) {
                try {
                    if (this.T == null) {
                        this.T = new m61.b(this, 0);
                    }
                } finally {
                }
            }
        }
        return this.T;
    }

    public final o1 f0() {
        return z3.r(this, super/*d.j*/.f0());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        n4 b = Y().b();
        this.S = b;
        if (((t6.c) b.s) == null) {
            b.n(g0());
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        n4 n4Var = this.S;
        if (n4Var != null) {
            n4Var.s = null;
        }
    }

    public final Object w() {
        return Y().w();
    }
    public Object C(Object p1) { return null; }
}
