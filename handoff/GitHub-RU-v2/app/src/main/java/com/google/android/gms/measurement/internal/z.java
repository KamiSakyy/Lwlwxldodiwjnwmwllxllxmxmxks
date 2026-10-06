package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Iterator;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z extends a0 {
    public x.e t;
    public x.e u;
    public long v;

    public z(o1 o1Var) {
        super(o1Var);
        this.u = new x.e(0);
        this.t = new x.e(0);
    }

    public final void A(String str, long j) {
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        if (str == null || str.length() == 0) {
            s0 s0Var = o1Var.w;
            o1.m(s0Var);
            s0Var.x.a("Ad unit id must be a non-empty string");
        } else {
            m1 m1Var = o1Var.x;
            o1.m(m1Var);
            m1Var.I(new a(this, str, j, 0));
        }
    }

    public final void B(String str, long j) {
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        if (str == null || str.length() == 0) {
            s0 s0Var = o1Var.w;
            o1.m(s0Var);
            s0Var.x.a("Ad unit id must be a non-empty string");
        } else {
            m1 m1Var = o1Var.x;
            o1.m(m1Var);
            m1Var.I(new a(this, str, j, 1));
        }
    }

    public final void C(long j) {
        f3 f3Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).C;
        o1.l(f3Var);
        b3 F = f3Var.F(false);
        x.e eVar = this.t;
        Iterator it = eVar.keySet().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            E(str, j - ((Long) eVar.get(str)).longValue(), F);
        }
        if (!eVar.isEmpty()) {
            D(j - this.v, F);
        }
        F(j);
    }

    public final void D(long j, b3 b3Var) {
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        if (b3Var == null) {
            s0 s0Var = o1Var.w;
            o1.m(s0Var);
            s0Var.F.a("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            s0 s0Var2 = o1Var.w;
            o1.m(s0Var2);
            s0Var2.F.b(Long.valueOf(j), "Not logging ad exposure. Less than 1000 ms. exposure");
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            t4.r0(b3Var, bundle, true);
            t2 t2Var = o1Var.D;
            o1.l(t2Var);
            t2Var.G("am", "_xa", bundle);
        }
    }

    public final void E(String str, long j, b3 b3Var) {
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        if (b3Var == null) {
            s0 s0Var = o1Var.w;
            o1.m(s0Var);
            s0Var.F.a("Not logging ad unit exposure. No active activity");
        } else {
            if (j < 1000) {
                s0 s0Var2 = o1Var.w;
                o1.m(s0Var2);
                s0Var2.F.b(Long.valueOf(j), "Not logging ad unit exposure. Less than 1000 ms. exposure");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            t4.r0(b3Var, bundle, true);
            t2 t2Var = o1Var.D;
            o1.l(t2Var);
            t2Var.G("am", "_xu", bundle);
        }
    }

    public final void F(long j) {
        x.e eVar = this.t;
        Iterator it = eVar.keySet().iterator();
        while (it.hasNext()) {
            eVar.put((String) it.next(), Long.valueOf(j));
        }
        if (eVar.isEmpty()) {
            return;
        }
        this.v = j;
    }
    public Object C(long p1) { return null; }
}
