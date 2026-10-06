package com.google.android.gms.internal.measurement;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a6 implements g6 {
    public s4 a;
    public e5 b;

    public a6(e5 e5Var, s4 s4Var) {
        e5 e5Var2 = a5.a;
        this.b = e5Var;
        this.a = s4Var;
    }

    @Override // com.google.android.gms.internal.measurement.g6
    public final boolean b(Object obj) {
        throw a0.s0.d(obj);
    }

    @Override // com.google.android.gms.internal.measurement.g6
    public final g5 c() {
        s4 s4Var = this.a;
        return s4Var instanceof g5 ? (g5) ((g5) s4Var).o(4) : ((f5) ((g5) s4Var).o(5)).d();
    }

    @Override // com.google.android.gms.internal.measurement.g6
    public final void d(Object obj, Object obj2) {
        h6.b(obj, obj2);
    }

    @Override // com.google.android.gms.internal.measurement.g6
    public final int e(s4 s4Var) {
        k6 k6Var = ((g5) s4Var).zzc;
        int i = k6Var.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < k6Var.a; i3++) {
            int i4 = k6Var.b[i3] >>> 3;
            x4 x4Var = (x4) k6Var.c[i3];
            int s0 = y4.s0(8);
            int s02 = y4.s0(i4) + y4.s0(16);
            int s03 = y4.s0(24);
            int d = x4Var.d();
            i2 += s0 + s0 + s02 + com.github.rudroid.copilot.h1.e(d, d, s03);
        }
        k6Var.d = i2;
        return i2;
    }

    @Override // com.google.android.gms.internal.measurement.g6
    public final void f(Object obj, byte[] bArr, int i, int i2, androidx.glance.appwidget.protobuf.d dVar) {
        g5 g5Var = (g5) obj;
        if (g5Var.zzc == k6.f) {
            g5Var.zzc = k6.a();
        }
        throw a0.s0.d(obj);
    }

    @Override // com.google.android.gms.internal.measurement.g6
    public final void g(Object obj, t5 t5Var) {
        throw a0.s0.d(obj);
    }

    @Override // com.google.android.gms.internal.measurement.g6
    public final boolean h(g5 g5Var, g5 g5Var2) {
        return g5Var.zzc.equals(g5Var2.zzc);
    }

    @Override // com.google.android.gms.internal.measurement.g6
    public final void i(Object obj) {
        this.b.getClass();
        k6 k6Var = ((g5) obj).zzc;
        if (k6Var.e) {
            k6Var.e = false;
        }
        e5 e5Var = a5.a;
        throw a0.s0.d(obj);
    }

    @Override // com.google.android.gms.internal.measurement.g6
    public final int j(g5 g5Var) {
        return g5Var.zzc.hashCode();
    }
}
