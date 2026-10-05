package com.github.rudroid.utilities.ui;

import androidx.compose.runtime.b2;
import androidx.compose.runtime.i3;
import f1.ub;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k0 {
    /* JADX WARN: Removed duplicated region for block: B:34:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(w1.r rVar, i3 i3Var, String str, String str2, boolean z, androidx.compose.runtime.s sVar, int i, int i2) {
        int i3;
        boolean z2;
        boolean z3;
        b2 t;
        boolean z4;
        androidx.compose.runtime.s sVar2 = sVar;
        k71.k.g(i3Var, "inFling");
        sVar2.e0(-1954725509);
        if ((i & 6) == 0) {
            i3 = (sVar2.f(rVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= sVar2.f(i3Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= sVar2.f(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= sVar2.f(str2) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            z2 = z;
            i3 |= sVar2.g(z2) ? 16384 : 8192;
            if (sVar2.S(i3 & 1, (i3 & 9363) == 9362)) {
                sVar2.V();
                z3 = z2;
            } else {
                if (i4 != 0) {
                    z2 = false;
                }
                Object N = sVar2.N();
                Object obj = androidx.compose.runtime.n.a;
                if (N == obj) {
                    N = androidx.compose.runtime.t.B(Boolean.FALSE);
                    sVar2.n0(N);
                }
                androidx.compose.runtime.f1 f1Var = (androidx.compose.runtime.f1) N;
                boolean g = sVar2.g(((Boolean) f1Var.getValue()).booleanValue()) | sVar2.g(((Boolean) i3Var.getValue()).booleanValue());
                Object N2 = sVar2.N();
                if (g || N2 == obj) {
                    N2 = androidx.compose.runtime.t.s(new com.github.rudroid.projects.triagesheet.triagebottomsheets.compose.e(28, i3Var, f1Var));
                    sVar2.n0(N2);
                }
                if (((Boolean) ((i3) N2).getValue()).booleanValue()) {
                    sVar2.c0(-2060662613);
                    boolean z5 = (57344 & i3) == 16384;
                    Object N3 = sVar2.N();
                    if (z5 || N3 == obj) {
                        N3 = new com.github.rudroid.discussions.replythread.w(z2, 5);
                        sVar2.n0(N3);
                    }
                    j71.c cVar = (j71.c) N3;
                    boolean z6 = ((i3 & 896) == 256) | ((i3 & 7168) == 2048);
                    Object N4 = sVar2.N();
                    if (z6 || N4 == obj) {
                        N4 = new k1(str, str2, f1Var, 1);
                        sVar2.n0(N4);
                    }
                    v3.k.a((i3 << 3) & 112, 0, sVar2, cVar, (j71.c) N4, rVar);
                    sVar2.q(false);
                    z4 = z2;
                } else {
                    sVar2.c0(-2059950543);
                    int i5 = ((i3 << 3) & 112) | 6;
                    z4 = z2;
                    ub.b("", rVar, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, (g3.q0) null, sVar, i5, 0, 262140);
                    sVar2 = sVar;
                    sVar2.q(false);
                }
                z3 = z4;
            }
            t = sVar2.t();
            if (t == null) {
                t.d = new com.github.rudroid.feed.ui.j(rVar, i3Var, str, str2, z3, i, i2, 2);
                return;
            }
            return;
        }
        z2 = z;
        if (sVar2.S(i3 & 1, (i3 & 9363) == 9362)) {
        }
        t = sVar2.t();
        if (t == null) {
        }
    }
}
