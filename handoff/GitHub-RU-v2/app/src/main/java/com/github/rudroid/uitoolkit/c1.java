package com.github.rudroid.uitoolkit;

import f1.e8;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c1 {
    public static final void a(final r1.d dVar, final w1.r rVar, final f1.n0 n0Var, boolean z, d2.p0 p0Var, float f, long j, long j2, float f2, long j3, long j4, final r1.d dVar2, androidx.compose.runtime.s sVar, final int i) {
        r1.d dVar3;
        int i2;
        final boolean z2;
        final d2.p0 p0Var2;
        final float f3;
        final long j5;
        final long j6;
        final float f4;
        final long j7;
        final long j8;
        float f5;
        long b;
        int i3;
        float f6;
        long j9;
        long j11;
        boolean z3;
        int i4;
        long j12;
        sVar.e0(271124258);
        if ((i & 6) == 0) {
            dVar3 = dVar;
            i2 = (sVar.h(dVar3) ? 4 : 2) | i;
        } else {
            dVar3 = dVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= sVar.f(rVar) ? 32 : 16;
        }
        int i5 = i2 | 384;
        if ((i & 3072) == 0) {
            i5 |= sVar.f(n0Var) ? 2048 : 1024;
        }
        int i6 = i5 | 24576;
        if ((196608 & i) == 0) {
            i6 = 90112 | i5;
        }
        if ((i & 1572864) == 0) {
            i6 |= 524288;
        }
        if ((12582912 & i) == 0) {
            i6 |= 4194304;
        }
        if ((100663296 & i) == 0) {
            i6 |= 33554432;
        }
        int i7 = i6 | 805306368;
        if (sVar.S(i7 & 1, (306783379 & i7) != 306783378)) {
            sVar.X();
            if ((i & 1) == 0 || sVar.A()) {
                d2.p0 p0Var3 = ih.d.e(sVar).g;
                f5 = f1.w.b;
                long j13 = ih.d.b(sVar).a;
                long b2 = f1.z1.b(j13, sVar);
                long j14 = ih.d.b(sVar).a;
                b = f1.z1.b(j14, sVar);
                p0Var2 = p0Var3;
                i3 = i7 & (-268369921);
                f6 = 0;
                j9 = j13;
                j11 = b2;
                z3 = true;
                i4 = 1572864;
                j12 = j14;
            } else {
                sVar.V();
                z3 = z;
                p0Var2 = p0Var;
                f5 = f;
                j11 = j2;
                j12 = j3;
                b = j4;
                i4 = 1572864;
                i3 = i7 & (-268369921);
                j9 = j;
                f6 = f2;
            }
            sVar.r();
            e8.b(dVar3, rVar, n0Var, f6, 0.0f, p0Var2, j9, j11, 0.0f, f5, (j71.e) null, z3, (j71.f) null, j12, b, dVar2, sVar, (i3 & 126) | ((i3 >> 3) & 896) | ((i3 >> 18) & 7168), (i3 & 896) | ((i3 >> 9) & 112) | 6 | i4);
            j6 = j11;
            z2 = z3;
            j7 = j12;
            j8 = b;
            j5 = j9;
            f3 = f5;
            f4 = f6;
        } else {
            sVar.V();
            z2 = z;
            p0Var2 = p0Var;
            f3 = f;
            j5 = j;
            j6 = j2;
            f4 = f2;
            j7 = j3;
            j8 = j4;
        }
        androidx.compose.runtime.b2 t = sVar.t();
        if (t != null) {
            t.d = new j71.e() { // from class: com.github.rudroid.uitoolkit.b1
                public final Object s(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int L = androidx.compose.runtime.t.L(i | 1);
                    c1.a(dVar, rVar, n0Var, z2, p0Var2, f3, j5, j6, f4, j7, j8, dVar2, (androidx.compose.runtime.s) obj, L);
                    return w61.a0.a;
                }
            };
        }
    }
}
