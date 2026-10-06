package com.github.rudroid.viewmodels;

import com.github.service.models.response.SimpleLegacyProject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.CancellationException;
import le.m;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m8 extends androidx.lifecycle.k1 implements x3 {
    public static final a Companion = new a();
    public x01.i A;
    public x01.i B;
    public x01.i C;
    public LinkedHashSet D;
    public LinkedHashSet E;
    public LinkedHashSet F;
    public LinkedHashSet G;
    public LinkedHashSet H;
    public String I;
    public String J;
    public String K;
    public y71.y1 L;
    public km.b s;
    public km.d t;
    public zk.x1 u;
    public zk.z1 v;
    public com.github.rudroid.activities.util.c w;
    public b x;
    public v71.q1 y;
    public androidx.lifecycle.p0 z;

    public static final class a {
    }

    public static abstract class b {
        public int a;

        public static final class a extends b {
            public static final a b = new a(2131954869);
        }

        /* renamed from: com.github.rudroid.viewmodels.m8$b$b, reason: collision with other inner class name */
        public static final class C0016b extends b {
            public static final C0016b b = new C0016b(2131954871);
        }

        public b(int i) {
            this.a = i;
        }
    }

    public m8(km.b bVar, km.d dVar, zk.x1 x1Var, zk.z1 z1Var, com.github.rudroid.activities.util.c cVar) {
        k71.k.g(bVar, "fetchOwnerLegacyProjectsUseCase");
        k71.k.g(dVar, "fetchRepositoryLegacyProjectsUseCase");
        k71.k.g(x1Var, "updateIssueLegacyProjectsUseCase");
        k71.k.g(z1Var, "updatePullRequestLegacyProjectsUseCase");
        k71.k.g(cVar, "accountHolder");
        this.s = bVar;
        this.t = dVar;
        this.u = x1Var;
        this.v = z1Var;
        this.w = cVar;
        this.x = b.C0016b.b;
        this.z = new androidx.lifecycle.p0();
        this.A = new x01.i((String) null, false, true);
        this.B = new x01.i((String) null, false, true);
        this.C = new x01.i((String) null, false, true);
        this.D = new LinkedHashSet();
        this.E = new LinkedHashSet();
        this.F = new LinkedHashSet();
        this.G = new LinkedHashSet();
        this.H = new LinkedHashSet();
        this.I = "";
        this.J = "";
        this.K = "";
        y71.y1 c = y71.n1.c("");
        this.L = c;
        y71.n1.A(new y71.y(y71.n1.o(new y71.y(c, new w8(this, null), 6), 250L), new x8(this, null), 6), androidx.lifecycle.d1.k(this));
    }

    @Override // com.github.rudroid.viewmodels.v3
    public final void D() {
        String str = this.I;
        v71.q1 q1Var = this.y;
        if (q1Var != null) {
            q1Var.m((CancellationException) null);
        }
        this.y = v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new v8(this, str, null), 3);
    }

    public final void P() {
        String str = this.I;
        v71.q1 q1Var = this.y;
        if (q1Var != null) {
            q1Var.m((CancellationException) null);
        }
        this.y = v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new s8(this, str, null), 3);
    }

    public final ArrayList Q(boolean z) {
        Set l;
        ArrayList arrayList = new ArrayList();
        boolean T = t71.p.T(this.I);
        LinkedHashSet linkedHashSet = this.D;
        if (T) {
            arrayList.add(new m.d(2131952995));
            if (linkedHashSet.isEmpty()) {
                arrayList.add(new m.b());
            } else {
                ArrayList arrayList2 = new ArrayList(x61.n.F(linkedHashSet, 10));
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new m.g((SimpleLegacyProject) it.next()));
                }
                arrayList.addAll(arrayList2);
            }
        }
        if (this.I.length() > 0) {
            l = sy.f0.l(this.H, linkedHashSet);
        } else {
            b bVar = this.x;
            l = bVar instanceof b.C0016b ? sy.f0.l(this.G, linkedHashSet) : bVar instanceof b.a ? sy.f0.l(this.F, linkedHashSet) : x61.t.r;
        }
        if (!l.isEmpty()) {
            arrayList.add(new m.d(2131954901));
            Set set = l;
            ArrayList arrayList3 = new ArrayList(x61.n.F(set, 10));
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                arrayList3.add(new m.e((SimpleLegacyProject) it2.next()));
            }
            arrayList.addAll(arrayList3);
        }
        if (z) {
            arrayList.add(new m.c());
        }
        return arrayList;
    }

    public final androidx.lifecycle.p0 R(String str) {
        k71.k.g(str, "issueId");
        androidx.lifecycle.p0 p0Var = new androidx.lifecycle.p0();
        fl.f.Companion.getClass();
        p0Var.k(fl.e.b(null));
        v6.a k = androidx.lifecycle.d1.k(this);
        c81.e eVar = v71.l0.a;
        v71.b0.z(k, c81.d.t, (v71.a0) null, new z8(this, str, p0Var, null), 2);
        return p0Var;
    }

    public final androidx.lifecycle.p0 S(String str) {
        k71.k.g(str, "pullId");
        androidx.lifecycle.p0 p0Var = new androidx.lifecycle.p0();
        fl.f.Companion.getClass();
        p0Var.k(fl.e.b(null));
        v6.a k = androidx.lifecycle.d1.k(this);
        c81.e eVar = v71.l0.a;
        v71.b0.z(k, c81.d.t, (v71.a0) null, new b9(this, str, p0Var, null), 2);
        return p0Var;
    }

    public final void T(x01.i iVar) {
        k71.k.g(iVar, "value");
        if (!t71.p.T(this.I)) {
            this.C = iVar;
            return;
        }
        b bVar = this.x;
        if (bVar instanceof b.a) {
            this.B = iVar;
        } else if (bVar instanceof b.C0016b) {
            this.A = iVar;
        }
    }

    @Override // com.github.rudroid.viewmodels.x3
    public final x01.i l() {
        if (!t71.p.T(this.I)) {
            return this.C;
        }
        b bVar = this.x;
        if (bVar instanceof b.a) {
            return this.B;
        }
        if (bVar instanceof b.C0016b) {
            return this.A;
        }
        throw new UnknownError();
    }

    @Override // com.github.rudroid.viewmodels.x3
    public final fl.g s() {
        fl.g gVar;
        fl.f fVar = (fl.f) this.z.d();
        return (fVar == null || (gVar = fVar.a) == null) ? fl.g.r : gVar;
    }
}
