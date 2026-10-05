package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f3 extends e0 {
    public volatile b3 A;
    public b3 B;
    public boolean C;
    public final Object D;
    public volatile b3 u;
    public volatile b3 v;
    public b3 w;
    public final ConcurrentHashMap x;
    public com.google.android.gms.internal.measurement.w0 y;
    public volatile boolean z;

    public f3(o1 o1Var) {
        super(o1Var);
        this.D = new Object();
        this.x = new ConcurrentHashMap();
    }

    @Override // com.google.android.gms.measurement.internal.e0
    public final boolean C() {
        return false;
    }

    public final void D(b3 b3Var, boolean z, long j) {
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        z zVar = o1Var.E;
        o1.j(zVar);
        o1Var.B.getClass();
        zVar.C(SystemClock.elapsedRealtime());
        boolean z2 = b3Var != null && b3Var.d;
        y3 y3Var = o1Var.y;
        o1.l(y3Var);
        if (!y3Var.x.o(z2, z, j) || b3Var == null) {
            return;
        }
        b3Var.d = false;
    }

    public final b3 E(com.google.android.gms.internal.measurement.w0 w0Var) {
        c21.u.g(w0Var);
        Integer valueOf = Integer.valueOf(w0Var.r);
        ConcurrentHashMap concurrentHashMap = this.x;
        b3 b3Var = (b3) concurrentHashMap.get(valueOf);
        if (b3Var == null) {
            String G = G(w0Var.s);
            t4 t4Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).z;
            o1.k(t4Var);
            b3 b3Var2 = new b3(t4Var.w0(), null, G);
            concurrentHashMap.put(valueOf, b3Var2);
            b3Var = b3Var2;
        }
        return this.A != null ? this.A : b3Var;
    }

    public final b3 F(boolean z) {
        A();
        z();
        if (!z) {
            return this.w;
        }
        b3 b3Var = this.w;
        return b3Var != null ? b3Var : this.B;
    }

    public final String G(String str) {
        if (str == null) {
            return "Activity";
        }
        String[] split = str.split("\\.");
        int length = split.length;
        String str2 = length > 0 ? split[length - 1] : "";
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        int length2 = str2.length();
        o1Var.u.getClass();
        if (length2 <= 500) {
            return str2;
        }
        o1Var.u.getClass();
        return str2.substring(0, 500);
    }

    public final void H(com.google.android.gms.internal.measurement.w0 w0Var, Bundle bundle) {
        Bundle bundle2;
        if (!((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).u.N() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.x.put(Integer.valueOf(w0Var.r), new b3(bundle2.getLong("id"), bundle2.getString("name"), bundle2.getString("referrer_name")));
    }

    public final void I(String str, b3 b3Var, boolean z) {
        b3 b3Var2;
        b3 b3Var3 = this.u == null ? this.v : this.u;
        if (b3Var.b == null) {
            b3Var2 = new b3(b3Var.a, str != null ? G(str) : null, b3Var.c, b3Var.e, b3Var.f);
        } else {
            b3Var2 = b3Var;
        }
        this.v = this.u;
        this.u = b3Var2;
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        o1Var.B.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        m1 m1Var = o1Var.x;
        o1.m(m1Var);
        m1Var.I(new c3(this, b3Var2, b3Var3, elapsedRealtime, z));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J(b3 b3Var, b3 b3Var2, long j, boolean z, Bundle bundle) {
        boolean z2;
        boolean z3 = b3Var.e;
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        z();
        boolean z4 = false;
        if (b3Var2 != null) {
            if (b3Var2.c == b3Var.c && Objects.equals(b3Var2.b, b3Var.b) && Objects.equals(b3Var2.a, b3Var.a)) {
                z2 = false;
                if (z && this.w != null) {
                    z4 = true;
                }
                if (z2) {
                    Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
                    t4.r0(b3Var, bundle2, true);
                    if (b3Var2 != null) {
                        String str = b3Var2.a;
                        if (str != null) {
                            bundle2.putString("_pn", str);
                        }
                        String str2 = b3Var2.b;
                        if (str2 != null) {
                            bundle2.putString("_pc", str2);
                        }
                        bundle2.putLong("_pi", b3Var2.c);
                    }
                    if (z4) {
                        y3 y3Var = o1Var.y;
                        o1.l(y3Var);
                        a0.o2 o2Var = y3Var.x;
                        long j2 = j - o2Var.b;
                        o2Var.b = j;
                        if (j2 > 0) {
                            t4 t4Var = o1Var.z;
                            o1.k(t4Var);
                            t4Var.h0(bundle2, j2);
                        }
                    }
                    if (!o1Var.u.N()) {
                        bundle2.putLong("_mst", 1L);
                    }
                    String str3 = true != z3 ? "auto" : "app";
                    o1Var.B.getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (z3) {
                        long j3 = b3Var.f;
                        if (j3 != 0) {
                            currentTimeMillis = j3;
                        }
                    }
                    t2 t2Var = o1Var.D;
                    o1.l(t2Var);
                    t2Var.H(currentTimeMillis, bundle2, str3, "_vs");
                }
                if (z4) {
                    D(this.w, true, j);
                }
                this.w = b3Var;
                if (z3) {
                    this.B = b3Var;
                }
                p3 p = o1Var.p();
                p.z();
                p.A();
                p.N(new com.google.common.util.concurrent.b(p, b3Var));
            }
        }
        z2 = true;
        if (z) {
            z4 = true;
        }
        if (z2) {
        }
        if (z4) {
        }
        this.w = b3Var;
        if (z3) {
        }
        p3 p2 = o1Var.p();
        p2.z();
        p2.A();
        p2.N(new com.google.common.util.concurrent.b(p2, b3Var));
    }
}
