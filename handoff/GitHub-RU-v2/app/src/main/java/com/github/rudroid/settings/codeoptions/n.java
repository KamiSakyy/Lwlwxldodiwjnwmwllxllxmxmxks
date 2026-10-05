package com.github.rudroid.settings.codeoptions;

import a0.r1;
import ad.a;
import android.text.Html;
import android.text.SpannableString;
import androidx.compose.foundation.layout.j2;
import androidx.compose.foundation.layout.l2;
import androidx.compose.foundation.layout.p2;
import androidx.compose.foundation.layout.w1;
import androidx.compose.foundation.lazy.layout.k0;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.l1;
import androidx.compose.runtime.v1;
import cd.s;
import com.github.rudroid.settings.codeoptions.f;
import com.github.service.models.response.RepoFileType;
import com.github.service.models.response.type.PatchStatus;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.i4;
import f0.z1;
import f1.c9;
import f1.i9;
import f1.s9;
import f1.ub;
import g3.q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import y41.t1;
import z.s0;
import z.t0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n {
    public static final a.g a = new a.g("1", "My first pull request", "actions/starter-workflows/blob/main/code-scanning/new/README.md", "actions/starter-workflows/blob/main/code-scanning/old/README.md", false, false, 2131231482, Boolean.FALSE, 2517, 5472, 4731, PatchStatus.COPIED, (String) null, RepoFileType.MARKDOWN, (String) null, false, (String) null, (String) null, false, false, true, false);
    public static final a b = new a();
    public static final b c = new b();

    public static final class a implements com.github.rudroid.interfaces.r {
        public final void d0(String str) {
            k71.k.g(str, "repoUrl");
        }

        public final void o1(String str, String str2, boolean z) {
            k71.k.g(str, "path");
        }

        public final void x2(String str) {
            k71.k.g(str, "path");
        }

        public final void y2(String str) {
            k71.k.g(str, "path");
        }
    }

    public static final class b implements s.a {
        public final void D2(String str, String str2, String str3, String str4) {
            k71.k.g(str, "repositoryOwner");
            k71.k.g(str2, "repositoryName");
            k71.k.g(str3, "path");
            k71.k.g(str4, "branchName");
        }

        public final void S(String str) {
            k71.k.g(str, "path");
        }

        public final void S2(String str, String str2, String str3, String str4) {
            k71.k.g(str, "repositoryOwner");
            k71.k.g(str2, "repositoryName");
            k71.k.g(str3, "path");
            k71.k.g(str4, "branchName");
        }

        public final void f1(String str, String str2, String str3) {
            k71.k.g(str3, "filePath");
        }

        public final void x0(String str, String str2, PatchStatus patchStatus) {
            k71.k.g(str, "path");
            k71.k.g(patchStatus, "patchStatus");
        }

        public final void z0(String str, String str2) {
            k71.k.g(str, "path");
            k71.k.g(str2, "branchName");
        }
    }

    public static final void a(w1.r rVar, f fVar, com.github.rudroid.html.a aVar, androidx.compose.runtime.s sVar, int i) {
        sVar.e0(-1076560629);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? sVar.f(fVar) : sVar.h(fVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= sVar.h(aVar) ? 256 : 128;
        }
        if (sVar.S(i2 & 1, (i2 & 147) != 146)) {
            List list = t.a;
            ArrayList arrayList = new ArrayList(x61.n.F(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(j0.a(new SpannableString(Html.fromHtml((String) it.next(), 0, null, aVar))));
            }
            c(fVar, arrayList, sVar, i2 & 126);
            rVar = w1.o.a;
        } else {
            sVar.V();
        }
        w1.r rVar2 = rVar;
        b2 t = sVar.t();
        if (t != null) {
            t.d = new k0(rVar2, fVar, aVar, i, 26);
        }
    }

    public static final void b(w1.r rVar, f fVar, j71.e eVar, j71.e eVar2, com.github.rudroid.html.a aVar, androidx.compose.runtime.s sVar, int i) {
        f fVar2 = fVar;
        androidx.compose.runtime.s sVar2 = sVar;
        sVar2.e0(507741614);
        int i2 = i | (sVar2.f(rVar) ? 4 : 2) | (sVar2.f(fVar2) ? 32 : 16) | (sVar2.h(eVar) ? 256 : 128) | (sVar2.h(eVar2) ? 2048 : 1024) | (sVar2.h(aVar) ? 16384 : 8192);
        if (sVar2.S(i2 & 1, (i2 & 9363) != 9362)) {
            w1.r d = p2.d(f0.o.w(rVar, f0.o.v(sVar2), true), 1.0f);
            androidx.compose.foundation.layout.e0 a2 = androidx.compose.foundation.layout.c0.a(androidx.compose.foundation.layout.l.c, w1.c.D, sVar2, 0);
            int hashCode = Long.hashCode(sVar2.T);
            v1 l = sVar2.l();
            w1.r c2 = w1.a.c(sVar2, d);
            v2.h.o.getClass();
            v2.f fVar3 = v2.g.b;
            sVar2.g0();
            if (sVar2.S) {
                sVar2.k(fVar3);
            } else {
                sVar2.q0();
            }
            androidx.compose.runtime.t.I(sVar2, v2.g.f, a2);
            androidx.compose.runtime.t.I(sVar2, v2.g.e, l);
            androidx.compose.runtime.t.w(sVar2, Integer.valueOf(hashCode), v2.g.g);
            androidx.compose.runtime.t.E(sVar2, v2.g.h);
            androidx.compose.runtime.t.I(sVar2, v2.g.d, c2);
            String p0 = i4.p0(2131954511, sVar2);
            boolean a3 = fVar2.a();
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object N = sVar2.N();
            Object obj = androidx.compose.runtime.n.a;
            if (z || N == obj) {
                N = new j(0, eVar);
                sVar2.n0(N);
            }
            eh.i.b(null, p0, null, null, null, null, null, a3, (j71.c) N, null, 0L, sVar2, 0, 0, 1661);
            String p02 = i4.p0(2131954512, sVar2);
            boolean c3 = fVar2.c();
            boolean z2 = i3 == 256;
            Object N2 = sVar2.N();
            if (z2 || N2 == obj) {
                N2 = new j(1, eVar);
                sVar2.n0(N2);
            }
            eh.i.b(null, p02, null, null, null, null, null, c3, (j71.c) N2, null, 0L, sVar2, 0, 0, 1661);
            String p03 = i4.p0(2131954513, sVar2);
            boolean f = fVar2.f();
            boolean z3 = i3 == 256;
            Object N3 = sVar2.N();
            if (z3 || N3 == obj) {
                N3 = new j(2, eVar);
                sVar2.n0(N3);
            }
            eh.i.b(null, p03, null, null, null, null, null, f, (j71.c) N3, null, 0L, sVar2, 0, 0, 1661);
            String p04 = i4.p0(2131954515, sVar2);
            boolean b2 = fVar2.b();
            boolean z4 = i3 == 256;
            Object N4 = sVar2.N();
            if (z4 || N4 == obj) {
                N4 = new j(3, eVar);
                sVar2.n0(N4);
            }
            eh.i.b(null, p04, null, null, null, null, null, b2, (j71.c) N4, null, 0L, sVar2, 0, 0, 1661);
            z.x.c(androidx.compose.foundation.layout.f0.a, fVar2.b(), (w1.r) null, (s0) null, (t0) null, (String) null, r1.i.d(930586144, new g(2, fVar2, eVar2), sVar2), sVar2, 1572870);
            String p05 = i4.p0(2131954514, sVar2);
            boolean d2 = fVar2.d();
            boolean z5 = i3 == 256;
            Object N5 = sVar2.N();
            if (z5 || N5 == obj) {
                N5 = new j(4, eVar);
                sVar2.n0(N5);
            }
            eh.i.b(null, p05, null, null, null, null, null, d2, (j71.c) N5, null, 0L, sVar2, 0, 0, 1661);
            w1.o oVar = w1.o.a;
            androidx.compose.foundation.layout.b.g(sVar2, p2.f(oVar, 20));
            ub.b(i4.p0(2131954516, sVar2), androidx.compose.foundation.layout.b.y(f0.o.f(p2.e(oVar, 1.0f), ih.d.b(sVar2).b, d2.a0.b), ih.a.n, ih.a.l), 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, ih.d.f(sVar2).b, sVar2, 0, 0, 131068);
            a.g gVar = a;
            com.github.rudroid.fileschanged.ui.k0.a((w1.r) null, gVar, fVar, false, cd.t.b(gVar), cd.t.a(gVar), false, c, b, sVar, ((i2 << 3) & 896) | 113249328, 65);
            fVar2 = fVar;
            sVar2 = sVar;
            a(null, fVar2, aVar, sVar2, ((i2 >> 6) & 896) | (i2 & 112));
            sVar2.q(true);
        } else {
            sVar2.V();
        }
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new com.github.rudroid.actions.checkdetail.j(rVar, fVar2, eVar, eVar2, aVar, i, 13);
        }
    }

    public static final void c(f fVar, ArrayList arrayList, androidx.compose.runtime.s sVar, int i) {
        int i2;
        sVar.e0(126171974);
        if ((i & 6) == 0) {
            i2 = (sVar.f(w1.o.a) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? sVar.f(fVar) : sVar.h(fVar) ? 32 : 16;
        }
        int i3 = i2 | (sVar.h(arrayList) ? 256 : 128);
        boolean z = true;
        if (sVar.S(i3 & 1, (i3 & 147) != 146)) {
            z1 v = f0.o.v(sVar);
            if (fVar.f()) {
                sVar.c0(693134853);
            } else {
                sVar.c0(992190811);
                z = f0.o.u(sVar);
            }
            sVar.q(false);
            ih.e.a(z, null, null, null, null, null, null, null, null, r1.i.d(-1733151880, new com.github.rudroid.profile.status.ui.x(fVar, v, arrayList), sVar), sVar, 805306368, 510);
        } else {
            sVar.V();
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new r1(fVar, arrayList, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(int i, int i2, androidx.compose.runtime.s sVar, j71.c cVar, w1.r rVar) {
        j71.c cVar2;
        w1.r rVar2;
        Object obj;
        j71.c cVar3;
        boolean f;
        Object N;
        boolean z;
        boolean f2;
        Object N2;
        androidx.compose.runtime.s sVar2 = sVar;
        sVar2.e0(1732239527);
        int i3 = i2 | 6 | (sVar.h(cVar) ? 32 : 16) | (sVar2.d(i) ? 256 : 128);
        if (sVar2.S(i3 & 1, (i3 & 147) != 146)) {
            boolean z2 = (i3 & 896) == 256;
            Object N3 = sVar2.N();
            Object obj2 = androidx.compose.runtime.n.a;
            if (z2 || N3 == obj2) {
                N3 = new l1(i);
                sVar2.n0(N3);
            }
            l1 l1Var = (l1) N3;
            w1.r rVar3 = w1.o.a;
            w1.r x = androidx.compose.foundation.layout.b.x(f0.o.f(p2.u(p2.e(rVar3, 1.0f)), ih.d.b(sVar2).b, d2.a0.b), ih.a.n);
            l2 a2 = j2.a(androidx.compose.foundation.layout.l.a, w1.c.B, sVar2, 48);
            int hashCode = Long.hashCode(sVar2.T);
            v1 l = sVar2.l();
            w1.r c2 = w1.a.c(sVar2, x);
            v2.h.o.getClass();
            v2.f fVar = v2.g.b;
            sVar2.g0();
            if (sVar2.S) {
                sVar2.k(fVar);
            } else {
                sVar2.q0();
            }
            androidx.compose.runtime.t.I(sVar2, v2.g.f, a2);
            androidx.compose.runtime.t.I(sVar2, v2.g.e, l);
            androidx.compose.runtime.t.w(sVar2, Integer.valueOf(hashCode), v2.g.g);
            androidx.compose.runtime.t.E(sVar2, v2.g.h);
            androidx.compose.runtime.t.I(sVar2, v2.g.d, c2);
            ub.b("A", (w1.r) null, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, q0.a(ih.d.f(sVar2).E, ih.d.b(sVar2).s, t1.E(b4.H(2131165296, sVar2), 4294967296L), (k3.s) null, (k3.o) null, (k3.i) null, 0L, 0, 0L, (g3.z) null, (r3.i) null, 16777212), sVar, 6, 0, 131070);
            w1.r z3 = androidx.compose.foundation.layout.b.z(rVar3, ih.a.l, 0.0f, 2);
            if (1.0f <= 0.0d) {
                l0.a.a("invalid weight; must be greater than zero");
            }
            w1.r f3 = z3.f(new w1(1.0f, true));
            int i4 = i3 & 112;
            boolean f4 = sVar.f(l1Var) | (i4 == 32);
            Object N4 = sVar.N();
            if (f4) {
                obj = obj2;
            } else {
                obj = obj2;
                if (N4 != obj) {
                    cVar3 = cVar;
                    w1.r d = o2.c.d(f3, (j71.c) N4);
                    float y = l1Var.y();
                    f.Companion.getClass();
                    List list = f.a.b;
                    q71.d dVar = new q71.d(0.0f, list.size() - 1);
                    int size = list.size() - 2;
                    i9 i9Var = i9.a;
                    Object obj3 = obj;
                    j71.c cVar4 = cVar3;
                    c9 d2 = i9.d(ih.d.b(sVar).F, ih.d.b(sVar).F, ih.d.b(sVar).s, ih.d.b(sVar).R, ih.d.b(sVar).s, sVar);
                    f = sVar.f(l1Var);
                    N = sVar.N();
                    if (!f || N == obj3) {
                        z = false;
                        N = new k(0, l1Var);
                        sVar.n0(N);
                    } else {
                        z = false;
                    }
                    j71.c cVar5 = (j71.c) N;
                    f2 = sVar.f(l1Var) | (i4 != 32 ? true : z);
                    N2 = sVar.N();
                    if (!f2 || N2 == obj3) {
                        N2 = new com.github.rudroid.projects.triagesheet.triagebottomsheets.compose.e(20, cVar4, l1Var);
                        sVar.n0(N2);
                    }
                    s9.b(y, cVar5, d, false, dVar, size, (j71.a) N2, d2, (j0.j) null, sVar, 0, 264);
                    cVar2 = cVar;
                    ub.b("A", (w1.r) null, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, q0.a(ih.d.f(sVar).E, ih.d.b(sVar).s, t1.E(b4.H(2131165295, sVar), 4294967296L), (k3.s) null, (k3.o) null, (k3.i) null, 0L, 0, 0L, (g3.z) null, (r3.i) null, 16777212), sVar, 6, 0, 131070);
                    sVar2 = sVar;
                    sVar2.q(true);
                    rVar2 = rVar3;
                }
            }
            cVar3 = cVar;
            N4 = new m(l1Var, cVar3);
            sVar.n0(N4);
            w1.r d3 = o2.c.d(f3, (j71.c) N4);
            float y2 = l1Var.y();
            f.Companion.getClass();
            List list2 = f.a.b;
            q71.d dVar2 = new q71.d(0.0f, list2.size() - 1);
            int size2 = list2.size() - 2;
            i9 i9Var2 = i9.a;
            Object obj32 = obj;
            j71.c cVar42 = cVar3;
            c9 d22 = i9.d(ih.d.b(sVar).F, ih.d.b(sVar).F, ih.d.b(sVar).s, ih.d.b(sVar).R, ih.d.b(sVar).s, sVar);
            f = sVar.f(l1Var);
            N = sVar.N();
            if (f) {
            }
            z = false;
            N = new k(0, l1Var);
            sVar.n0(N);
            j71.c cVar52 = (j71.c) N;
            f2 = sVar.f(l1Var) | (i4 != 32 ? true : z);
            N2 = sVar.N();
            if (!f2) {
            }
            N2 = new com.github.rudroid.projects.triagesheet.triagebottomsheets.compose.e(20, cVar42, l1Var);
            sVar.n0(N2);
            s9.b(y2, cVar52, d3, false, dVar2, size2, (j71.a) N2, d22, (j0.j) null, sVar, 0, 264);
            cVar2 = cVar;
            ub.b("A", (w1.r) null, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, q0.a(ih.d.f(sVar).E, ih.d.b(sVar).s, t1.E(b4.H(2131165295, sVar), 4294967296L), (k3.s) null, (k3.o) null, (k3.i) null, 0L, 0, 0L, (g3.z) null, (r3.i) null, 16777212), sVar, 6, 0, 131070);
            sVar2 = sVar;
            sVar2.q(true);
            rVar2 = rVar3;
        } else {
            cVar2 = cVar;
            sVar2.V();
            rVar2 = rVar;
        }
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new l(i, i2, cVar2, rVar2);
        }
    }
}
