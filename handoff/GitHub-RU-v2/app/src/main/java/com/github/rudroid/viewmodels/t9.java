package com.github.rudroid.viewmodels;

import com.github.service.models.response.type.MobileAppAction;
import com.github.service.models.response.type.MobileAppElement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import le.o;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t9 extends androidx.lifecycle.k1 implements x3 {
    public static final a Companion = new a();
    public x01.i A;
    public x01.i B;
    public x01.i C;
    public final LinkedHashSet D;
    public final LinkedHashSet E;
    public final LinkedHashSet F;
    public final LinkedHashSet G;
    public final LinkedHashSet H;
    public final LinkedHashSet I;
    public String J;
    public String K;
    public String L;
    public int M;
    public int N;
    public final y71.y1 O;
    public final zk.o1 s;
    public final oa.g t;
    public final zk.a0 u;
    public final zk.z v;
    public final com.github.rudroid.activities.util.c w;
    public final com.github.rudroid.utilities.e x;
    public b y;
    public final androidx.lifecycle.p0 z;

    public static final class a {
    }

    public static abstract class b {
        public final int a;

        public static final class a extends b {
            public static final a b = new a(2131954895);
        }

        /* renamed from: com.github.rudroid.viewmodels.t9$b$b, reason: collision with other inner class name */
        public static final class C0017b extends b {
            public static final C0017b b = new C0017b(2131954896);
        }

        public b(int i) {
            this.a = i;
        }
    }

    public t9(zk.o1 o1Var, oa.g gVar, zk.a0 a0Var, zk.z zVar, com.github.rudroid.activities.util.c cVar, com.github.rudroid.utilities.e eVar) {
        k71.k.g(o1Var, "setReviewersUseCase");
        k71.k.g(gVar, "repositoryCollaboratorService");
        k71.k.g(a0Var, "fetchRepositoryTeamUseCase");
        k71.k.g(zVar, "fetchRepositoryCollaboratorsUseCase");
        k71.k.g(cVar, "accountHolder");
        k71.k.g(eVar, "analytics");
        this.s = o1Var;
        this.t = gVar;
        this.u = a0Var;
        this.v = zVar;
        this.w = cVar;
        this.x = eVar;
        this.y = b.a.b;
        this.z = new androidx.lifecycle.p0();
        this.A = new x01.i((String) null, false, true);
        this.B = new x01.i((String) null, false, true);
        this.C = new x01.i((String) null, false, true);
        this.D = new LinkedHashSet();
        this.E = new LinkedHashSet();
        this.F = new LinkedHashSet();
        this.G = new LinkedHashSet();
        this.H = new LinkedHashSet();
        this.I = new LinkedHashSet();
        this.J = "";
        this.K = "";
        this.L = "";
        this.N = 15;
        y71.y1 c = y71.n1.c(new w61.k("", this.y));
        this.O = c;
        y71.n1.A(new y71.y(y71.n1.o(new y71.y(c, new ba(this, null), 6), 250L), new ca(this, null), 6), androidx.lifecycle.d1.k(this));
    }

    @Override // com.github.rudroid.viewmodels.v3
    public final void D() {
        v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new aa(this, this.J, null), 3);
    }

    public final void P() {
        String str = this.J;
        fl.e eVar = fl.f.Companion;
        ArrayList Q = Q(true);
        eVar.getClass();
        this.z.j(fl.e.b(Q));
        v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new x9(this, str, null), 3);
    }

    public final ArrayList Q(boolean z) {
        Collection collection;
        ArrayList arrayList = new ArrayList();
        boolean T = t71.p.T(this.J);
        LinkedHashSet linkedHashSet = this.D;
        if (T) {
            arrayList.add(new o.d(2131952995));
            if (linkedHashSet.isEmpty()) {
                arrayList.add(new o.b(4, 2131954856));
            } else {
                ArrayList arrayList2 = new ArrayList(x61.n.F(linkedHashSet, 10));
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new o.f((yz0.e2) it.next()));
                }
                arrayList.addAll(arrayList2);
            }
        }
        if (this.J.length() > 0) {
            collection = sy.f0.l(this.I, linkedHashSet);
        } else {
            b bVar = this.y;
            if (bVar instanceof b.C0017b) {
                collection = sy.f0.l(this.G, linkedHashSet);
            } else if (bVar instanceof b.a) {
                LinkedHashSet linkedHashSet2 = this.E;
                collection = sy.f0.m(sy.f0.l(linkedHashSet2, linkedHashSet), sy.f0.l(sy.f0.l(this.H, linkedHashSet), linkedHashSet2));
            } else {
                collection = x61.t.r;
            }
        }
        if (!collection.isEmpty()) {
            arrayList.add(new o.d(2131954902));
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : collection) {
                if (!t71.p.T(((yz0.e2) obj).a.x)) {
                    arrayList3.add(obj);
                }
            }
            ArrayList arrayList4 = new ArrayList(x61.n.F(arrayList3, 10));
            int size = arrayList3.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList3.get(i);
                i++;
                arrayList4.add(new o.e((yz0.e2) obj2));
            }
            arrayList.addAll(arrayList4);
        }
        if (z) {
            arrayList.add(new o.c(5, 2131952992));
        }
        return arrayList;
    }

    public final androidx.lifecycle.p0 R(String str) {
        k71.k.g(str, "pullId");
        androidx.lifecycle.p0 p0Var = new androidx.lifecycle.p0();
        fl.f.Companion.getClass();
        p0Var.k(fl.e.b(null));
        v6.a k = androidx.lifecycle.d1.k(this);
        c81.e eVar = v71.l0.a;
        v71.b0.z(k, c81.d.t, (v71.a0) null, new fa(this, str, p0Var, null), 2);
        return p0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object S(c71.c cVar) {
        ga gaVar;
        int i;
        com.github.rudroid.utilities.e eVar;
        if (cVar instanceof ga) {
            gaVar = (ga) cVar;
            int i2 = gaVar.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gaVar.x = i2 - Integer.MIN_VALUE;
                Object obj = gaVar.v;
                b71.a aVar = b71.a.r;
                i = gaVar.x;
                if (i != 0) {
                    sy.y.j(obj);
                    com.github.rudroid.utilities.e eVar2 = this.x;
                    gaVar.u = eVar2;
                    gaVar.x = 1;
                    com.github.rudroid.activities.util.c cVar2 = this.w;
                    cVar2.getClass();
                    Object c = com.github.rudroid.activities.util.a.c(cVar2, gaVar);
                    if (c == aVar) {
                        return aVar;
                    }
                    eVar = eVar2;
                    obj = c;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    eVar = gaVar.u;
                    sy.y.j(obj);
                }
                eVar.a((oa.j) obj, new wj.e(MobileAppElement.COPILOT_CODE_REVIEW_AGENT_ASSIGNED, MobileAppAction.PRESS, null, null, 12));
                return w61.a0.a;
            }
        }
        gaVar = new ga(this, cVar);
        Object obj2 = gaVar.v;
        b71.a aVar2 = b71.a.r;
        i = gaVar.x;
        if (i != 0) {
        }
        eVar.a((oa.j) obj2, new wj.e(MobileAppElement.COPILOT_CODE_REVIEW_AGENT_ASSIGNED, MobileAppAction.PRESS, null, null, 12));
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object T(c71.c cVar) {
        ha haVar;
        int i;
        com.github.rudroid.utilities.e eVar;
        if (cVar instanceof ha) {
            haVar = (ha) cVar;
            int i2 = haVar.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                haVar.x = i2 - Integer.MIN_VALUE;
                Object obj = haVar.v;
                b71.a aVar = b71.a.r;
                i = haVar.x;
                if (i != 0) {
                    sy.y.j(obj);
                    com.github.rudroid.utilities.e eVar2 = this.x;
                    haVar.u = eVar2;
                    haVar.x = 1;
                    com.github.rudroid.activities.util.c cVar2 = this.w;
                    cVar2.getClass();
                    Object c = com.github.rudroid.activities.util.a.c(cVar2, haVar);
                    if (c == aVar) {
                        return aVar;
                    }
                    eVar = eVar2;
                    obj = c;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    eVar = haVar.u;
                    sy.y.j(obj);
                }
                eVar.a((oa.j) obj, new wj.e(MobileAppElement.COPILOT_CODE_REVIEW_AGENT_UNASSIGNED, MobileAppAction.PRESS, null, null, 12));
                return w61.a0.a;
            }
        }
        haVar = new ha(this, cVar);
        Object obj2 = haVar.v;
        b71.a aVar2 = b71.a.r;
        i = haVar.x;
        if (i != 0) {
        }
        eVar.a((oa.j) obj2, new wj.e(MobileAppElement.COPILOT_CODE_REVIEW_AGENT_UNASSIGNED, MobileAppAction.PRESS, null, null, 12));
        return w61.a0.a;
    }

    public final void U(x01.i iVar) {
        k71.k.g(iVar, "value");
        if (!t71.p.T(this.J)) {
            this.C = iVar;
            return;
        }
        b bVar = this.y;
        if (bVar instanceof b.C0017b) {
            this.A = iVar;
        } else if (bVar instanceof b.a) {
            this.B = iVar;
        }
    }

    @Override // com.github.rudroid.viewmodels.x3
    public final x01.i l() {
        if (!t71.p.T(this.J)) {
            return this.C;
        }
        b bVar = this.y;
        if (bVar instanceof b.C0017b) {
            return this.A;
        }
        if (bVar instanceof b.a) {
            return this.B;
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
