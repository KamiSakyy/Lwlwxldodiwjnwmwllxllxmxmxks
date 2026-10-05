package com.github.rudroid.uitoolkit;

import f1.p5;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s0 {
    public static final void a(w1.r rVar, final int i, final long j, float f, String str, androidx.compose.runtime.s sVar, final int i2, final int i3) {
        final w1.r rVar2;
        int i4;
        String str2;
        int i5;
        float f2;
        final String str3;
        sVar.e0(-141105873);
        int i6 = i3 & 1;
        if (i6 != 0) {
            i4 = i2 | 6;
            rVar2 = rVar;
        } else if ((i2 & 6) == 0) {
            rVar2 = rVar;
            i4 = i2 | (sVar.f(rVar2) ? 4 : 2);
        } else {
            rVar2 = rVar;
            i4 = i2;
        }
        int i7 = i4 | (sVar.d(i) ? 32 : 16) | (sVar.e(j) ? 256 : 128);
        int i8 = i3 & 16;
        if (i8 != 0) {
            i5 = i7 | 24576;
            str2 = str;
        } else {
            str2 = str;
            i5 = i7 | (sVar.f(str2) ? 16384 : 8192);
        }
        if (sVar.S(i5 & 1, (i5 & 9363) != 9362)) {
            w1.r rVar3 = i6 != 0 ? w1.o.a : rVar2;
            String str4 = i8 != 0 ? null : str2;
            d0.a a = c0.e.a(i, (i5 & 112) | 6, sVar);
            Object N = sVar.N();
            androidx.compose.runtime.i iVar = androidx.compose.runtime.n.a;
            Object obj = N;
            if (N == iVar) {
                androidx.compose.runtime.p1 B = androidx.compose.runtime.t.B(Boolean.FALSE);
                sVar.n0(B);
                obj = B;
            }
            androidx.compose.runtime.f1 f1Var = (androidx.compose.runtime.f1) obj;
            f2 = f;
            p5.a(c0.e.b(a, ((Boolean) f1Var.getValue()).booleanValue(), sVar), str4, androidx.compose.foundation.layout.p2.o(rVar3, f2), j, sVar, ((i5 << 3) & 7168) | ((i5 >> 9) & 112) | 8, 0);
            Object N2 = sVar.N();
            if (N2 == iVar) {
                N2 = new r0(f1Var, null);
                sVar.n0(N2);
            }
            androidx.compose.runtime.t.f(sVar, (j71.e) N2, w61.a0.a);
            rVar2 = rVar3;
            str3 = str4;
        } else {
            f2 = f;
            sVar.V();
            str3 = str2;
        }
        androidx.compose.runtime.b2 t = sVar.t();
        if (t != null) {
            final float f3 = f2;
            t.d = new j71.e() { // from class: com.github.rudroid.uitoolkit.q0
                public final Object s(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    s0.a(rVar2, i, j, f3, str3, (androidx.compose.runtime.s) obj2, androidx.compose.runtime.t.L(i2 | 1), i3);
                    return w61.a0.a;
                }
            };
        }
    }














}
