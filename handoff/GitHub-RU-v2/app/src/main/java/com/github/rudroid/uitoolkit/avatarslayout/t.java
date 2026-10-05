package com.github.rudroid.uitoolkit.avatarslayout;

import a0.s0;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.v1;
import androidx.compose.ui.layout.v0;
import com.github.rudroid.main.a2;
import com.github.rudroid.starredreposandlists.u0;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t {
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(w1.r rVar, List list, boolean z, float f, q qVar, androidx.compose.runtime.s sVar, int i, int i2) {
        w1.r rVar2;
        int i3;
        boolean z2;
        int i4;
        float f2;
        int i5;
        q qVar2;
        w1.r rVar3;
        b2 t;
        q qVar3;
        int i6;
        boolean z3;
        sVar.e0(364152610);
        int i7 = i2 & 1;
        if (i7 != 0) {
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
            i3 |= sVar.h(list) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            z2 = z;
            i3 |= sVar.g(z2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                f2 = f;
                i3 |= sVar.c(f2) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    i3 |= 8192;
                }
                i5 = i3 | 196608;
                if (sVar.S(i5 & 1, (74899 & i5) != 74898)) {
                    sVar.X();
                    if ((i & 1) == 0 || sVar.A()) {
                        rVar3 = i7 != 0 ? w1.o.a : rVar2;
                        if (i8 != 0) {
                            z2 = false;
                        }
                        if (i4 != 0) {
                            f2 = 10;
                        }
                        qVar3 = new q(ih.d.b(sVar).F, ih.d.b(sVar).b);
                        i6 = i5 & (-57345);
                    } else {
                        sVar.V();
                        i6 = i5 & (-57345);
                        rVar3 = rVar2;
                        qVar3 = qVar;
                    }
                    sVar.r();
                    if (list.isEmpty()) {
                        z3 = false;
                        sVar.c0(-618428544);
                    } else {
                        sVar.c0(-616514945);
                        boolean z4 = (458752 & i6) == 131072;
                        Object N = sVar.N();
                        if (z4 || N == androidx.compose.runtime.n.a) {
                            N = new u0(7);
                            sVar.n0(N);
                        }
                        b(com.github.rudroid.uitoolkit.extensions.d.a(rVar3, false, (j71.c) N), f2, r1.i.d(-1873746975, new com.github.rudroid.actions.checkssummary.ui.p(list, qVar3, z2, 10), sVar), sVar, ((i6 >> 6) & 112) | 384);
                        z3 = false;
                    }
                    sVar.q(z3);
                    qVar2 = qVar3;
                } else {
                    sVar.V();
                    qVar2 = qVar;
                    rVar3 = rVar2;
                }
                boolean z5 = z2;
                float f3 = f2;
                t = sVar.t();
                if (t != null) {
                    t.d = new a2(rVar3, list, z5, f3, qVar2, i, i2);
                    return;
                }
                return;
            }
            f2 = f;
            if ((i & 24576) == 0) {
            }
            i5 = i3 | 196608;
            if (sVar.S(i5 & 1, (74899 & i5) != 74898)) {
            }
            boolean z52 = z2;
            float f32 = f2;
            t = sVar.t();
            if (t != null) {
            }
        }
        z2 = z;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        f2 = f;
        if ((i & 24576) == 0) {
        }
        i5 = i3 | 196608;
        if (sVar.S(i5 & 1, (74899 & i5) != 74898)) {
        }
        boolean z522 = z2;
        float f322 = f2;
        t = sVar.t();
        if (t != null) {
        }
    }

    public static final void b(w1.r rVar, float f, r1.d dVar, androidx.compose.runtime.s sVar, int i) {
        int i2;
        sVar.e0(1758343717);
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
                N = new s(f);
                sVar.n0(N);
            }
            v0 v0Var = (v0) N;
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
            t.d = new d(rVar, f, dVar, i, 1);
        }
    }
}
