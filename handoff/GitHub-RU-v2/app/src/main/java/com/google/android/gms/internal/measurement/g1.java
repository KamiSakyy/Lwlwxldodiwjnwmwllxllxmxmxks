package com.google.android.gms.internal.measurement;

import android.os.SystemClock;
import java.util.Objects;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class g1 implements Runnable {
    public long r;
    public long s;
    public boolean t;
    public final /* synthetic */ k1 u;

    public g1(k1 k1Var, boolean z) {
        Objects.requireNonNull(k1Var);
        this.u = k1Var;
        this.r = System.currentTimeMillis();
        this.s = SystemClock.elapsedRealtime();
        this.t = z;
    }

    public abstract void a();

    public void b() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        k1 k1Var = this.u;
        if (k1Var.e) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e) {
            k1Var.b(e, false, this.t);
            b();
        }
    }
}
