package com.github.rudroid.uitoolkit;

import f1.u6;
import f1.v6;
import f1.z8;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h1 {
    public static final void a(w1.r rVar, d2.p0 p0Var, float f, long j, long j2, long j3, final j71.a aVar, final z8 z8Var, final r1.d dVar, androidx.compose.runtime.s sVar, final int i, final int i2) {
        w1.r rVar2;
        int i3;
        long j4;
        final d2.p0 p0Var2;
        final float f2;
        final long j5;
        final w1.r rVar3;
        final long j6;
        final long j7;
        w1.r rVar4;
        d2.p0 p0Var3;
        int i4;
        long b;
        float f3;
        long j8;
        int i5;
        k71.k.g(z8Var, "sheetState");
        sVar.e0(-911353874);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            rVar2 = rVar;
        } else if ((i & 6) == 0) {
            rVar2 = rVar;
            i3 = (sVar.f(rVar2) ? 4 : 2) | i;
        } else {
            rVar2 = rVar;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= 16;
        }
        if ((i & 384) == 0) {
            i3 |= 128;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                j4 = j;
                if (sVar.e(j4)) {
                    i5 = 2048;
                    i3 |= i5;
                }
            } else {
                j4 = j;
            }
            i5 = 1024;
            i3 |= i5;
        } else {
            j4 = j;
        }
        if ((i & 24576) == 0) {
            i3 |= 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= sVar.h(aVar) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= sVar.f(z8Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= sVar.h(dVar) ? 67108864 : 33554432;
        }
        if (sVar.S(i3 & 1, (38347923 & i3) != 38347922)) {
            sVar.X();
            if ((i & 1) == 0 || sVar.A()) {
                rVar4 = i6 != 0 ? w1.o.a : rVar2;
                d2.p0 p0Var4 = ih.d.e(sVar).g;
                float f4 = f1.w.b;
                int i7 = i3 & (-1009);
                if ((i2 & 8) != 0) {
                    j4 = ih.d.b(sVar).a;
                    i7 = i3 & (-8177);
                }
                long b2 = f1.z1.b(j4, sVar);
                f1.w wVar = f1.w.a;
                p0Var3 = p0Var4;
                i4 = i7 & (-516097);
                b = d2.t.b(0.32f, f1.z1.d(j1.r0.a, sVar));
                f3 = f4;
                j8 = b2;
            } else {
                sVar.V();
                int i8 = i3 & (-1009);
                if ((i2 & 8) != 0) {
                    i8 = i3 & (-8177);
                }
                w1.r rVar5 = rVar2;
                i4 = i8 & (-516097);
                rVar4 = rVar5;
                p0Var3 = p0Var;
                f3 = f;
                j8 = j2;
                b = j3;
            }
            sVar.r();
            int i9 = i4 >> 15;
            rVar3 = rVar4;
            u6.a(aVar, rVar3, z8Var, 0.0f, false, p0Var3, j4, j8, f3, b, (j71.e) null, (j71.e) null, (v6) null, dVar, sVar, ((i4 >> 18) & 14) | ((i4 << 3) & 112) | (i9 & 896) | ((i4 << 9) & 3670016), (i9 & 7168) | 6);
            p0Var2 = p0Var3;
            j6 = j4;
            j7 = j8;
            f2 = f3;
            j5 = b;
        } else {
            sVar.V();
            p0Var2 = p0Var;
            f2 = f;
            j5 = j3;
            rVar3 = rVar2;
            j6 = j4;
            j7 = j2;
        }
        androidx.compose.runtime.b2 t = sVar.t();
        if (t != null) {
            t.d = new j71.e() { // from class: com.github.rudroid.uitoolkit.g1
                public final Object s(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int L = androidx.compose.runtime.t.L(i | 1);
                    h1.a(rVar3, p0Var2, f2, j6, j7, j5, aVar, z8Var, dVar, (androidx.compose.runtime.s) obj, L, i2);
                    return w61.a0.a;
                }
            };
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class z8<T1,T2,T3,T4> {
        public z8() {
        }
    }
}
