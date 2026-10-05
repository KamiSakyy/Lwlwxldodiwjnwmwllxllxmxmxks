package com.github.rudroid.uitoolkit;

import com.google.android.gms.internal.measurement.i4;
import f1.qa;
import f1.ub;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w1 {
    public static final void a(boolean z, j71.a aVar, androidx.compose.runtime.s sVar, int i) {
        long b;
        long b2;
        sVar.e0(-835864072);
        int i2 = (sVar.g(z) ? 4 : 2) | i | (sVar.h(aVar) ? 32 : 16);
        if (sVar.S(i2 & 1, (i2 & 19) != 18)) {
            String p0 = i4.p0(2131953815, sVar);
            if (z) {
                sVar.c0(-1646533485);
                b = ih.d.a(sVar).j0;
                sVar.q(false);
            } else {
                if (z) {
                    throw f1.e.r(-1646535298, sVar, false);
                }
                sVar.c0(-1646531363);
                b = d2.t.b(d(sVar), ih.d.a(sVar).j);
                sVar.q(false);
            }
            r0.d dVar = ih.d.e(sVar).f;
            float f = 1;
            if (z) {
                sVar.c0(-569656123);
                b2 = ih.d.a(sVar).l0;
                sVar.q(false);
            } else {
                if (z) {
                    throw f1.e.r(-569657936, sVar, false);
                }
                sVar.c0(-569654125);
                b2 = d2.t.b(d(sVar), ih.d.a(sVar).j);
                sVar.q(false);
            }
            qa.a((w1.r) null, dVar, b, 0L, 0.0f, 0.0f, f0.o.a(f, b2), r1.i.d(-187497773, new r1(aVar, p0, z), sVar), sVar, 12582912, 57);
        } else {
            sVar.V();
        }
        androidx.compose.runtime.b2 t = sVar.t();
        if (t != null) {
            t.d = new com.github.rudroid.issueorpullrequest.selectissue.ui.g(z, aVar, i);
        }
    }

    public static final void b(s2 s2Var, boolean z, j71.c cVar, androidx.compose.runtime.s sVar, int i) {
        String q0;
        String str;
        long b;
        long b2;
        long j;
        long j2;
        sVar.e0(109498621);
        int i2 = i | (sVar.f(s2Var) ? 4 : 2) | (sVar.g(z) ? 32 : 16) | (sVar.h(cVar) ? 256 : 128);
        if (sVar.S(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = s2Var.e;
            int i3 = s2Var.b;
            String str2 = s2Var.a;
            if (z2) {
                sVar.c0(-2101560091);
                q0 = i4.q0(2131954041, new Object[]{str2}, sVar);
                sVar.q(false);
            } else {
                sVar.c0(-2101458969);
                q0 = i4.q0(2131954042, new Object[]{str2}, sVar);
                sVar.q(false);
            }
            if (z2) {
                sVar.c0(-2101318074);
                str = i4.q0(2131954043, new Object[]{str2}, sVar);
                sVar.q(false);
            } else {
                sVar.c0(-2101220269);
                sVar.q(false);
                str = "";
            }
            String str3 = str;
            String str4 = q0;
            d3.k kVar = new d3.k(0);
            boolean z3 = ((i2 & 896) == 256) | ((i2 & 14) == 4);
            Object N = sVar.N();
            androidx.compose.runtime.i iVar = androidx.compose.runtime.n.a;
            Object obj = N;
            if (z3 || N == iVar) {
                com.github.rudroid.projects.triagesheet.triagebottomsheets.compose.e eVar = new com.github.rudroid.projects.triagesheet.triagebottomsheets.compose.e(23, cVar, s2Var);
                sVar.n0(eVar);
                obj = eVar;
            }
            w1.r m = f0.o.m(w1.o.a, z, str4, kVar, (j71.a) obj, 8);
            boolean f = sVar.f(str3);
            Object N2 = sVar.N();
            if (f || N2 == iVar) {
                N2 = new com.github.rudroid.copilot.ui.a1(str3, 27);
                sVar.n0(N2);
            }
            w1.r y = androidx.compose.foundation.layout.b.y(d3.q.b(m, false, (j71.c) N2), ih.a.l, ih.a.k);
            String str5 = str2 + " " + i3;
            long j3 = ih.d.b(sVar).A;
            if (z && z2) {
                sVar.c0(1855964347);
                b = ih.d.a(sVar).g0;
                sVar.q(false);
            } else if (z) {
                sVar.c0(1855966363);
                b = ih.d.a(sVar).l0;
                sVar.q(false);
            } else if (z2) {
                sVar.c0(1855969033);
                b = d2.t.b(d(sVar), ih.d.a(sVar).h0);
                sVar.q(false);
            } else {
                sVar.c0(1855971753);
                b = d2.t.b(d(sVar), ih.d.a(sVar).i0);
                sVar.q(false);
            }
            if (z && z2) {
                sVar.c0(-2112494667);
                b2 = ih.d.a(sVar).e0;
                sVar.q(false);
            } else if (z) {
                sVar.c0(-2112492523);
                b2 = ih.d.a(sVar).j0;
                sVar.q(false);
            } else if (z2) {
                sVar.c0(-2112489729);
                b2 = d2.t.b(d(sVar), ih.d.a(sVar).h0);
                sVar.q(false);
            } else {
                sVar.c0(-2112487009);
                b2 = d2.t.b(d(sVar), ih.d.a(sVar).i0);
                sVar.q(false);
            }
            g3.q0 q0Var = (g3.q0) sVar.j(ub.a);
            if (z && z2) {
                sVar.c0(152337327);
                j = b2;
                j2 = ih.d.a(sVar).f0;
                sVar.q(false);
            } else {
                j = b2;
                if (z) {
                    sVar.c0(152339311);
                    j2 = ih.d.a(sVar).k0;
                    sVar.q(false);
                } else if (z2) {
                    sVar.c0(152341362);
                    j2 = ih.d.a(sVar).h0;
                    sVar.q(false);
                } else {
                    sVar.c0(152343122);
                    j2 = ih.d.a(sVar).i0;
                    sVar.q(false);
                }
            }
            j.b(y, null, str5, 0.0f, g3.q0.a(q0Var, j2, 0L, (k3.s) null, (k3.o) null, (k3.i) null, 0L, 0, 0L, (g3.z) null, (r3.i) null, 16777214), null, 0, j, b, 0.0f, null, j3, i4.n0(2131820629, i3, new Object[]{Integer.valueOf(i3), str2}, sVar), sVar, 0, 0, 1642);
        } else {
            sVar.V();
        }
        androidx.compose.runtime.b2 t = sVar.t();
        if (t != null) {
            t.d = new com.github.rudroid.actions.checkssummary.ui.p(s2Var, z, cVar, i, 9);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a8, code lost:
    
        if (r9 == androidx.compose.runtime.n.a) goto L59;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(w1.r rVar, q1 q1Var, boolean z, j71.c cVar, j71.c cVar2, androidx.compose.runtime.s sVar, int i) {
        w1.r rVar2;
        int i2;
        Object obj;
        sVar.e0(33329777);
        if ((i & 6) == 0) {
            rVar2 = rVar;
            i2 = (sVar.f(rVar2) ? 4 : 2) | i;
        } else {
            rVar2 = rVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= sVar.h(q1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= sVar.g(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= sVar.h(cVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= sVar.h(cVar2) ? 16384 : 8192;
        }
        if (sVar.S(i2 & 1, (i2 & 9363) != 9362)) {
            androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.l.a;
            androidx.compose.foundation.layout.j g = androidx.compose.foundation.layout.l.g(ih.a.l);
            boolean h = ((i2 & 896) == 256) | ((i2 & 7168) == 2048) | sVar.h(q1Var) | ((57344 & i2) == 16384);
            Object N = sVar.N();
            if (!h) {
                obj = N;
            }
            com.github.rudroid.agents.copilothome.ui.z zVar = new com.github.rudroid.agents.copilothome.ui.z(q1Var, z, cVar, cVar2);
            sVar.n0(zVar);
            obj = zVar;
            com.google.common.util.concurrent.a.c(rVar2, (m0.s) null, (androidx.compose.foundation.layout.d2) null, g, (w1.i) null, (h0.h1) null, false, (f0.j) null, (j71.c) obj, sVar, (i2 & 14) | 24576, 494);
        } else {
            sVar.V();
        }
        androidx.compose.runtime.b2 t = sVar.t();
        if (t != null) {
            t.d = new com.github.rudroid.actions.workflowsummary.ui.l(rVar, q1Var, z, cVar, cVar2, i);
        }
    }

    public static final float d(androidx.compose.runtime.s sVar) {
        return f0.o.u(sVar) ? 0.32f : 0.16f;
    }








    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class r<T1,T2,T3,T4> {
        public r() {
        }
    }
}
