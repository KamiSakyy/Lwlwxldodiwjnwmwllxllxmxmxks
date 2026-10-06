package com.google.android.gms.internal.play_billing;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j2 implements o2 {
    public g1 a;
    public r1 b;

    public j2(r1 r1Var, g1 g1Var) {
        r1 r1Var2 = p1.a;
        this.b = r1Var;
        this.a = g1Var;
    }

    @Override // com.google.android.gms.internal.play_billing.o2
    public final t1 a() {
        g1 g1Var = this.a;
        return g1Var instanceof t1 ? ((t1) g1Var).n() : ((s1) ((t1) g1Var).j(5)).b();
    }

    @Override // com.google.android.gms.internal.play_billing.o2
    public final boolean b(Object obj) {
        throw a0.s0.d(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.o2
    public final void c(Object obj) {
        this.b.getClass();
        q2 q2Var = ((t1) obj).zzc;
        if (q2Var.e) {
            q2Var.e = false;
        }
        r1 r1Var = p1.a;
        throw a0.s0.d(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.o2
    public final int d(g1 g1Var) {
        q2 q2Var = ((t1) g1Var).zzc;
        int i = q2Var.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < q2Var.a; i3++) {
            int i4 = q2Var.b[i3] >>> 3;
            k1 k1Var = (k1) q2Var.c[i3];
            int z0 = m1.z0(8);
            int z02 = m1.z0(i4) + m1.z0(16);
            int z03 = m1.z0(24);
            int e = k1Var.e();
            i2 += z0 + z0 + z02 + com.github.rudroid.copilot.h1.D(e, e, z03);
        }
        q2Var.d = i2;
        return i2;
    }

    @Override // com.google.android.gms.internal.play_billing.o2
    public final void e(Object obj, c2 c2Var) {
        throw a0.s0.d(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.o2
    public final void f(Object obj, byte[] bArr, int i, int i2, androidx.glance.appwidget.protobuf.d dVar) {
        t1 t1Var = (t1) obj;
        if (t1Var.zzc == q2.f) {
            t1Var.zzc = q2.b();
        }
        throw a0.s0.d(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.o2
    public final int g(t1 t1Var) {
        return t1Var.zzc.hashCode();
    }

    @Override // com.google.android.gms.internal.play_billing.o2
    public final void h(Object obj, Object obj2) {
        p2.p(obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.o2
    public final boolean i(t1 t1Var, t1 t1Var2) {
        return t1Var.zzc.equals(t1Var2.zzc);
    }
}
