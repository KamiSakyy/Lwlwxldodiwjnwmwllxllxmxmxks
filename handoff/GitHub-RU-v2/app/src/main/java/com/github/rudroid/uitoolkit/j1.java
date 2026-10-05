package com.github.rudroid.uitoolkit;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j1 {
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c3, code lost:
    
        if ((r28 & 8) != 0) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(w1.r rVar, boolean z, boolean z2, long j, j71.a aVar, r1.d dVar, androidx.compose.runtime.s sVar, int i, int i2) {
        w1.r rVar2;
        int i3;
        boolean z3;
        long j2;
        boolean z4;
        long j3;
        androidx.compose.runtime.b2 t;
        androidx.compose.runtime.s sVar2 = sVar;
        k71.k.g(aVar, "onSwipeRefresh");
        sVar2.e0(-1962290934);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            rVar2 = rVar;
        } else if ((i & 6) == 0) {
            rVar2 = rVar;
            i3 = (sVar2.f(rVar2) ? 4 : 2) | i;
        } else {
            rVar2 = rVar;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= sVar2.g(z) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            z3 = z2;
            i3 |= sVar2.g(z3) ? 256 : 128;
            if ((i & 3072) != 0) {
                j2 = j;
                i3 |= ((i2 & 8) == 0 && sVar2.e(j2)) ? 2048 : 1024;
            } else {
                j2 = j;
            }
            if ((i & 24576) == 0) {
                i3 |= sVar2.h(aVar) ? 16384 : 8192;
            }
            if ((196608 & i) == 0) {
                i3 |= sVar2.h(dVar) ? 131072 : 65536;
            }
            if (sVar2.S(i3 & 1, (74899 & i3) == 74898)) {
                sVar2.V();
                z4 = z3;
                j3 = j2;
            } else {
                sVar2.X();
                int i6 = i & 1;
                w1.r rVar3 = w1.o.a;
                if (i6 == 0 || sVar2.A()) {
                    if (i4 != 0) {
                        rVar2 = rVar3;
                    }
                    if (i5 != 0) {
                        z3 = true;
                    }
                    if ((i2 & 8) != 0) {
                        j2 = ih.d.a(sVar2).G;
                        i3 &= -7169;
                    }
                    z4 = z3;
                    long j4 = j2;
                    w1.r rVar4 = rVar2;
                    int i7 = i3;
                    sVar2.r();
                    float f = i1.i.a;
                    Object[] objArr = new Object[0];
                    Object N = sVar2.N();
                    if (N == androidx.compose.runtime.n.a) {
                        N = new hz.k(9);
                        sVar2.n0(N);
                    }
                    i1.p pVar = (i1.p) u1.j.e(objArr, i1.p.b, (j71.a) N, sVar2, 384);
                    w1.r f2 = rVar4.f(new i1.h(z, aVar, z4, pVar, i1.g.c));
                    androidx.compose.ui.layout.v0 d = androidx.compose.foundation.layout.t.d(w1.c.r, false);
                    int hashCode = Long.hashCode(sVar2.T);
                    androidx.compose.runtime.v1 l = sVar2.l();
                    w1.r c = w1.a.c(sVar2, f2);
                    v2.h.o.getClass();
                    v2.f fVar = v2.g.b;
                    sVar2.g0();
                    if (sVar2.S) {
                        sVar2.k(fVar);
                    } else {
                        sVar2.q0();
                    }
                    androidx.compose.runtime.t.I(sVar2, v2.g.f, d);
                    androidx.compose.runtime.t.I(sVar2, v2.g.e, l);
                    androidx.compose.runtime.t.w(sVar2, Integer.valueOf(hashCode), v2.g.g);
                    androidx.compose.runtime.t.E(sVar2, v2.g.h);
                    androidx.compose.runtime.t.I(sVar2, v2.g.d, c);
                    dVar.s(sVar2, Integer.valueOf((i7 >> 15) & 14));
                    rVar2 = rVar4;
                    i1.g.a.a(pVar, z, androidx.compose.foundation.layout.y.a.a(rVar3, w1.c.s), j4, ih.d.a(sVar).e, 0.0f, sVar, i7 & 7280);
                    sVar2 = sVar;
                    sVar2.q(true);
                    j3 = j4;
                } else {
                    sVar2.V();
                }
            }
            t = sVar2.t();
            if (t == null) {
                t.d = new i1(rVar2, z, z4, j3, aVar, dVar, i, i2);
                return;
            }
            return;
        }
        z3 = z2;
        if ((i & 3072) != 0) {
        }
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        if (sVar2.S(i3 & 1, (74899 & i3) == 74898)) {
        }
        t = sVar2.t();
        if (t == null) {
        }
    }
}
