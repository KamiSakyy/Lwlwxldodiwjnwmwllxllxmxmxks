package com.github.rudroid.uitoolkit.avatarslayout;

import a0.s0;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.v1;
import com.github.rudroid.copilot.ui.a1;
import com.github.rudroid.copilot.ui.v0;
import java.util.List;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g {
    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(w1.r rVar, final List list, int i, float f, String str, androidx.compose.runtime.s sVar, final int i2, final int i3) {
        w1.r rVar2;
        int i4;
        int i5;
        int i6;
        final String str2;
        int i7;
        final w1.r rVar3;
        final float f2;
        b2 t;
        sVar.e0(149729552);
        int i8 = i3 & 1;
        if (i8 != 0) {
            i4 = i2 | 6;
            rVar2 = rVar;
        } else {
            rVar2 = rVar;
            i4 = (sVar.f(rVar2) ? 4 : 2) | i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= sVar.h(list) ? 32 : 16;
        }
        int i9 = i3 & 4;
        if (i9 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i5 = i;
            i4 |= sVar.d(i5) ? 256 : 128;
            int i11 = i4 | 3072;
            i6 = i3 & 16;
            if (i6 == 0) {
                i7 = i4 | 27648;
                str2 = str;
            } else {
                str2 = str;
                i7 = i11 | (sVar.f(str2) ? 16384 : 8192);
            }
            if (sVar.S(i7 & 1, (i7 & 9363) == 9362)) {
                sVar.V();
                rVar3 = rVar2;
                f2 = f;
            } else {
                rVar3 = i8 != 0 ? w1.o.a : rVar2;
                if (i9 != 0) {
                    i5 = 2;
                }
                float f3 = 10;
                String str3 = i6 != 0 ? null : str2;
                if (list.isEmpty()) {
                    sVar.c0(-1879175918);
                } else {
                    sVar.c0(-1877696784);
                    boolean z = (57344 & i7) == 16384;
                    Object N = sVar.N();
                    if (z || N == androidx.compose.runtime.n.a) {
                        N = new a1(str3, 28);
                        sVar.n0(N);
                    }
                    b(d3.q.b(rVar3, false, (j71.c) N), f3, r1.i.d(-101432525, new v0(list, i5, 7), sVar), sVar, 432);
                }
                sVar.q(false);
                str2 = str3;
                f2 = f3;
            }
            final int i12 = i5;
            t = sVar.t();
            if (t == null) {
                t.d = new j71.e() { // from class: com.github.rudroid.uitoolkit.avatarslayout.c
                    public final Object s(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        g.a(rVar3, list, i12, f2, str2, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.L(i2 | 1), i3);
                        return a0.a;
                    }
                };
                return;
            }
            return;
        }
        i5 = i;
        int i112 = i4 | 3072;
        i6 = i3 & 16;
        if (i6 == 0) {
        }
        if (sVar.S(i7 & 1, (i7 & 9363) == 9362)) {
        }
        final int i122 = i5;
        t = sVar.t();
        if (t == null) {
        }
    }

    public static final void b(w1.r rVar, float f, r1.d dVar, androidx.compose.runtime.s sVar, int i) {
        int i2;
        sVar.e0(1525341537);
        if ((i & 6) == 0) {
            i2 = (sVar.f(rVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= sVar.c(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= sVar.h(dVar) ? 256 : 128;
        }
        if (sVar.S(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 112) == 32;
            Object N = sVar.N();
            if (z || N == androidx.compose.runtime.n.a) {
                N = new f(f);
                sVar.n0(N);
            }
            androidx.compose.ui.layout.v0 v0Var = (androidx.compose.ui.layout.v0) N;
            int hashCode = Long.hashCode(sVar.T);
            v1 l = sVar.l();
            w1.r c = w1.a.c(sVar, rVar);
            v2.h.o.getClass();
            v2.f fVar = v2.g.b;
            int i3 = (((((i2 << 3) & 112) | ((i2 >> 6) & 14)) << 6) & 896) | 6;
            sVar.g0();
            if (sVar.S) {
                sVar.k(fVar);
            } else {
                sVar.q0();
            }
            androidx.compose.runtime.t.I(sVar, v2.g.f, v0Var);
            androidx.compose.runtime.t.I(sVar, v2.g.e, l);
            androidx.compose.runtime.t.w(sVar, Integer.valueOf(hashCode), v2.g.g);
            androidx.compose.runtime.t.E(sVar, v2.g.h);
            androidx.compose.runtime.t.I(sVar, v2.g.d, c);
            s0.x((i3 >> 6) & 14, dVar, sVar, true);
        } else {
            sVar.V();
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new d(rVar, f, dVar, i, 0);
        }
    }
}
