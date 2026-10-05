package com.github.rudroid.utilities.ui;

import androidx.compose.runtime.b2;
import com.github.rudroid.webview.viewholders.GitHubWebView;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z {
    /* JADX WARN: Removed duplicated region for block: B:108:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(w1.r rVar, w1 w1Var, j71.c cVar, j71.c cVar2, j71.c cVar3, j71.c cVar4, j71.c cVar5, androidx.compose.runtime.s sVar, int i, int i2) {
        w1.r rVar2;
        int i3;
        j71.c cVar6;
        j71.c cVar7;
        j71.c cVar8;
        j71.c cVar9;
        j71.c cVar10;
        j71.c cVar11;
        b2 t;
        sVar.e0(-241940444);
        if ((i & 6) == 0) {
            rVar2 = rVar;
            i3 = i | (sVar.f(rVar2) ? 4 : 2);
        } else {
            rVar2 = rVar;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= sVar.f(w1Var) ? 32 : 16;
        }
        int i4 = 224640 | i3;
        int i5 = i2 & 64;
        if (i5 != 0) {
            i4 = 1797504 | i3;
        } else if ((i & 1572864) == 0) {
            cVar6 = cVar5;
            i4 |= sVar.h(cVar6) ? 1048576 : 524288;
            if ((i2 & 128) == 0) {
                i4 |= 12582912;
            } else if ((i & 12582912) == 0) {
                i4 |= sVar.h((Object) null) ? 8388608 : 4194304;
            }
            if (sVar.S(i4 & 1, (4793491 & i4) == 4793490)) {
                sVar.V();
                cVar7 = cVar2;
                cVar8 = cVar3;
                cVar9 = cVar4;
                cVar10 = cVar6;
                cVar11 = cVar;
            } else {
                Object N = sVar.N();
                Object obj = androidx.compose.runtime.n.a;
                if (N == obj) {
                    N = new com.github.rudroid.starredreposandlists.u0(26);
                    sVar.n0(N);
                }
                j71.c cVar12 = (j71.c) N;
                Object N2 = sVar.N();
                if (N2 == obj) {
                    N2 = new com.github.rudroid.starredreposandlists.u0(27);
                    sVar.n0(N2);
                }
                j71.c cVar13 = (j71.c) N2;
                Object N3 = sVar.N();
                if (N3 == obj) {
                    N3 = new com.github.rudroid.starredreposandlists.u0(28);
                    sVar.n0(N3);
                }
                j71.c cVar14 = (j71.c) N3;
                Object N4 = sVar.N();
                if (N4 == obj) {
                    N4 = new com.github.rudroid.starredreposandlists.u0(29);
                    sVar.n0(N4);
                }
                j71.c cVar15 = (j71.c) N4;
                if (i5 != 0) {
                    Object N5 = sVar.N();
                    if (N5 == obj) {
                        N5 = new h0.r(3);
                        sVar.n0(N5);
                    }
                    cVar6 = (j71.c) N5;
                }
                GitHubWebView gitHubWebView = (GitHubWebView) w1Var.b.getValue();
                if (gitHubWebView == null) {
                    sVar.c0(-692245452);
                } else {
                    sVar.c0(-692245451);
                    boolean h = ((i4 & 112) == 32) | sVar.h(gitHubWebView);
                    Object N6 = sVar.N();
                    if (h || N6 == obj) {
                        N6 = new y(w1Var, gitHubWebView, null);
                        sVar.n0(N6);
                    }
                    androidx.compose.runtime.t.h(gitHubWebView, w1Var, (j71.e) N6, sVar);
                }
                sVar.q(false);
                boolean z = ((29360128 & i4) == 8388608) | ((i4 & 896) == 256) | ((3670016 & i4) == 1048576) | ((i4 & 112) == 32);
                Object N7 = sVar.N();
                if (z || N7 == obj) {
                    N7 = new a0.a((j71.c) null, cVar12, cVar6, w1Var);
                    sVar.n0(N7);
                }
                j71.c cVar16 = (j71.c) N7;
                boolean z2 = (458752 & i4) == 131072;
                Object N8 = sVar.N();
                if (z2 || N8 == obj) {
                    N8 = new a0.n1(14, cVar15);
                    sVar.n0(N8);
                }
                j71.c cVar17 = (j71.c) N8;
                boolean z3 = (57344 & i4) == 16384;
                Object N9 = sVar.N();
                if (z3 || N9 == obj) {
                    N9 = new a0.n1(15, cVar14);
                    sVar.n0(N9);
                }
                j71.c cVar18 = (j71.c) N9;
                boolean z4 = (i4 & 7168) == 2048;
                Object N10 = sVar.N();
                if (z4 || N10 == obj) {
                    N10 = new a0.n1(16, cVar13);
                    sVar.n0(N10);
                }
                v3.k.b(cVar16, rVar2, cVar17, cVar18, (j71.c) N10, sVar, (i4 << 3) & 112, 0);
                cVar8 = cVar14;
                cVar9 = cVar15;
                cVar10 = cVar6;
                cVar7 = cVar13;
                cVar11 = cVar12;
            }
            t = sVar.t();
            if (t == null) {
                t.d = new com.github.rudroid.agents.sessionevents.ui.d1(rVar, w1Var, cVar11, cVar7, cVar8, cVar9, cVar10, i, i2);
                return;
            }
            return;
        }
        cVar6 = cVar5;
        if ((i2 & 128) == 0) {
        }
        if (sVar.S(i4 & 1, (4793491 & i4) == 4793490)) {
        }
        t = sVar.t();
        if (t == null) {
        }
    }
}
