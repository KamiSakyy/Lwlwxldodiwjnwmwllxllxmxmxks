package com.github.rudroid.uitoolkit;

import com.github.rudroid.adapters.viewholders.p3;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l2 {
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(w1.r rVar, String str, String str2, String str3, boolean z, boolean z2, z1 z1Var, androidx.compose.runtime.s sVar, int i, int i2) {
        int i3;
        z1 z1Var2;
        int i4;
        int i5;
        z1 z1Var3;
        androidx.compose.runtime.b2 t;
        z1 z1Var4;
        Object N;
        Object obj;
        Object N2;
        Object N3;
        androidx.compose.runtime.f1 f1Var;
        Object N4;
        y3.m mVar;
        Object N5;
        y3.k kVar;
        boolean h;
        Object N6;
        Object N7;
        boolean h2;
        Object N8;
        k71.k.g(str, "avatarURL");
        k71.k.g(str2, "repoOwner");
        k71.k.g(str3, "repoName");
        sVar.e0(-2095504959);
        if ((i & 6) == 0) {
            i3 = (sVar.f(rVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= sVar.f(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= sVar.f(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= sVar.f(str3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= sVar.g(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= sVar.g(z2) ? 131072 : 65536;
        }
        if ((i2 & 64) == 0) {
            z1Var2 = z1Var;
            if (sVar.f(z1Var2)) {
                i4 = 1048576;
                i5 = i3 | i4;
                if (sVar.S(i5 & 1, (599187 & i5) == 599186)) {
                    sVar.V();
                    z1Var3 = z1Var2;
                } else {
                    sVar.X();
                    if ((i & 1) != 0 && !sVar.A()) {
                        sVar.V();
                    } else if ((i2 & 64) != 0) {
                        z1Var4 = new z1(3, 0L);
                        sVar.r();
                        sVar.c0(-1003410150);
                        sVar.c0(212064437);
                        sVar.q(false);
                        s3.c cVar = (s3.c) sVar.j(w2.g1.h);
                        N = sVar.N();
                        obj = androidx.compose.runtime.n.a;
                        if (N == obj) {
                            N = new y3.o(cVar);
                            sVar.n0(N);
                        }
                        y3.o oVar = (y3.o) N;
                        N2 = sVar.N();
                        if (N2 == obj) {
                            N2 = new y3.k();
                            sVar.n0(N2);
                        }
                        y3.k kVar2 = (y3.k) N2;
                        N3 = sVar.N();
                        if (N3 == obj) {
                            N3 = androidx.compose.runtime.t.B(Boolean.FALSE);
                            sVar.n0(N3);
                        }
                        f1Var = (androidx.compose.runtime.f1) N3;
                        N4 = sVar.N();
                        if (N4 == obj) {
                            N4 = new y3.m(kVar2);
                            sVar.n0(N4);
                        }
                        mVar = (y3.m) N4;
                        N5 = sVar.N();
                        if (N5 != obj) {
                            kVar = kVar2;
                            androidx.compose.runtime.p1 p1Var = new androidx.compose.runtime.p1(w61.a0.a, androidx.compose.runtime.i.u);
                            sVar.n0(p1Var);
                            N5 = p1Var;
                        } else {
                            kVar = kVar2;
                        }
                        androidx.compose.runtime.f1 f1Var2 = (androidx.compose.runtime.f1) N5;
                        h = sVar.h(oVar) | sVar.d(257);
                        N6 = sVar.N();
                        if (!h || N6 == obj) {
                            N6 = new d2(f1Var2, oVar, mVar, f1Var);
                            sVar.n0(N6);
                        }
                        androidx.compose.ui.layout.v0 v0Var = (androidx.compose.ui.layout.v0) N6;
                        N7 = sVar.N();
                        if (N7 == obj) {
                            N7 = new e2(f1Var, mVar);
                            sVar.n0(N7);
                        }
                        j71.a aVar = (j71.a) N7;
                        h2 = sVar.h(oVar);
                        N8 = sVar.N();
                        if (!h2 || N8 == obj) {
                            N8 = new f2(oVar);
                            sVar.n0(N8);
                        }
                        androidx.compose.ui.layout.z.a(d3.q.b(rVar, false, (j71.c) N8), r1.i.d(1200550679, new g2(f1Var2, kVar, aVar, str, z, z2, z1Var4, str2, str3), sVar), v0Var, sVar, 48);
                        sVar.q(false);
                        z1Var3 = z1Var4;
                    }
                    z1Var4 = z1Var2;
                    sVar.r();
                    sVar.c0(-1003410150);
                    sVar.c0(212064437);
                    sVar.q(false);
                    s3.c cVar2 = (s3.c) sVar.j(w2.g1.h);
                    N = sVar.N();
                    obj = androidx.compose.runtime.n.a;
                    if (N == obj) {
                    }
                    y3.o oVar2 = (y3.o) N;
                    N2 = sVar.N();
                    if (N2 == obj) {
                    }
                    y3.k kVar22 = (y3.k) N2;
                    N3 = sVar.N();
                    if (N3 == obj) {
                    }
                    f1Var = (androidx.compose.runtime.f1) N3;
                    N4 = sVar.N();
                    if (N4 == obj) {
                    }
                    mVar = (y3.m) N4;
                    N5 = sVar.N();
                    if (N5 != obj) {
                    }
                    androidx.compose.runtime.f1 f1Var22 = (androidx.compose.runtime.f1) N5;
                    h = sVar.h(oVar2) | sVar.d(257);
                    N6 = sVar.N();
                    if (!h) {
                    }
                    N6 = new d2(f1Var22, oVar2, mVar, f1Var);
                    sVar.n0(N6);
                    androidx.compose.ui.layout.v0 v0Var2 = (androidx.compose.ui.layout.v0) N6;
                    N7 = sVar.N();
                    if (N7 == obj) {
                    }
                    j71.a aVar2 = (j71.a) N7;
                    h2 = sVar.h(oVar2);
                    N8 = sVar.N();
                    if (!h2) {
                    }
                    N8 = new f2(oVar2);
                    sVar.n0(N8);
                    androidx.compose.ui.layout.z.a(d3.q.b(rVar, false, (j71.c) N8), r1.i.d(1200550679, new g2(f1Var22, kVar, aVar2, str, z, z2, z1Var4, str2, str3), sVar), v0Var2, sVar, 48);
                    sVar.q(false);
                    z1Var3 = z1Var4;
                }
                t = sVar.t();
                if (t == null) {
                    t.d = new p3(rVar, str, str2, str3, z, z2, z1Var3, i, i2);
                    return;
                }
                return;
            }
        } else {
            z1Var2 = z1Var;
        }
        i4 = 524288;
        i5 = i3 | i4;
        if (sVar.S(i5 & 1, (599187 & i5) == 599186)) {
        }
        t = sVar.t();
        if (t == null) {
        }
    }
}
