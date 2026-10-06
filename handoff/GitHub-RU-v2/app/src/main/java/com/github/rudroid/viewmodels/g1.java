package com.github.rudroid.viewmodels;

import com.github.domain.database.GitHubDatabase;
import com.github.rudroid.utilities.j2;
import java.util.ArrayList;
import java.util.List;
import le.v;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g1 extends androidx.lifecycle.k1 {
    public yk.b s;
    public qj.a t;
    public com.github.rudroid.activities.util.c u;
    public v71.v v;
    public String w;
    public androidx.lifecycle.p0 x;
    public com.github.rudroid.utilities.j2 y;

    public g1(yk.b bVar, qj.a aVar, com.github.rudroid.activities.util.c cVar, v71.v vVar) {
        k71.k.g(bVar, "globalSearchUseCase");
        k71.k.g(aVar, "forUserDatabase");
        k71.k.g(cVar, "accountHolder");
        k71.k.g(vVar, "ioDispatcher");
        this.s = bVar;
        this.t = aVar;
        this.u = cVar;
        this.v = vVar;
        this.w = new String();
        this.x = new androidx.lifecycle.p0();
        this.y = new com.github.rudroid.utilities.j2();
        v71.b0.z(androidx.lifecycle.d1.k(this), vVar, (v71.a0Shadow) null, new x0(this, null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object P(g1 g1Var, c71.c cVar) {
        a1 a1Var;
        int i;
        ArrayList arrayList;
        ArrayList arrayList2;
        t71.l a;
        if (cVar instanceof a1) {
            a1Var = (a1) cVar;
            int i2 = a1Var.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a1Var.z = i2 - Integer.MIN_VALUE;
                Object obj = a1Var.x;
                b71.a aVar = b71.a.r;
                i = a1Var.z;
                if (i != 0) {
                    sy.y.j(obj);
                    ArrayList arrayList3 = new ArrayList();
                    if (!t71.p.T(g1Var.w)) {
                        if (g1Var.u.d().f(com.github.rudroid.common.a.K)) {
                            arrayList3.add(new v.g.a(g1Var.w));
                        }
                        arrayList3.addAll(x61.l.r(new v.g[]{new v.g.g(g1Var.w), new v.g.b(g1Var.w), new v.g.f(g1Var.w), new v.g.e(g1Var.w), new v.g.d(g1Var.w)}));
                        com.github.rudroid.utilities.j2 j2Var = g1Var.y;
                        String str = g1Var.w;
                        j2Var.getClass();
                        k71.k.g(str, "input");
                        j2.a aVar2 = null;
                        if (t71.p.T(str) || (a = j2Var.a.a(t71.p.a0(str, "@"))) == null || a.a().a() != 4) {
                            a = null;
                        }
                        if (a != null) {
                            String str2 = (String) a.a().get(1);
                            if (!t71.p.T(str2)) {
                                String str3 = t71.p.T((CharSequence) a.a().get(2)) ? null : (String) a.a().get(2);
                                String a0 = str3 != null ? t71.p.a0(str3, "/") : null;
                                String str4 = t71.p.T((CharSequence) a.a().get(3)) ? null : (String) a.a().get(3);
                                Integer G = str4 != null ? t71.w.G(t71.p.a0(str4, "#")) : null;
                                if (G == null || a0 != null) {
                                    aVar2 = (a0 == null || G == null) ? a0 != null ? new j2.a.b(str2, a0) : new j2.a.c(str2) : new j2.a.C0011a(str2, G.intValue(), a0);
                                }
                            }
                        }
                        if (aVar2 != null) {
                            arrayList3.add(new v.g.c(aVar2, g1Var.w));
                        }
                        return arrayList3;
                    }
                    ck.b S = g1Var.S();
                    a1Var.u = arrayList3;
                    a1Var.v = arrayList3;
                    a1Var.w = g1Var;
                    a1Var.z = 1;
                    Object a2 = ((ck.f) S).a(a1Var);
                    if (a2 == aVar) {
                        return aVar;
                    }
                    arrayList = arrayList3;
                    obj = a2;
                    arrayList2 = arrayList;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    g1Var = a1Var.w;
                    arrayList = a1Var.v;
                    arrayList2 = a1Var.u;
                    sy.y.j(obj);
                }
                g1Var.getClass();
                arrayList.addAll(X((List) obj));
                return arrayList2;
            }
        }
        a1Var = new a1(g1Var, cVar);
        Object obj2 = a1Var.x;
        b71.a aVar3 = b71.a.r;
        i = a1Var.z;
        if (i != 0) {
        }
        g1Var.getClass();
        arrayList.addAll(X((List) obj2));
        return arrayList2;
    }

    public static ArrayList X(List list) {
        ArrayList arrayList = new ArrayList();
        if (list != null && !list.isEmpty()) {
            arrayList.add(new v.d(2131954338, 2131954337, v.d.a.r));
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (!t71.p.T(((ck.h) obj).a)) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList(x61.n.F(arrayList2, 10));
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList2.get(i);
                i++;
                arrayList3.add(new v.e(((ck.h) obj2).a));
            }
            arrayList.addAll(arrayList3);
        }
        return arrayList;
    }

    public final void Q() {
        v71.b0.z(androidx.lifecycle.d1.k(this), this.v, (v71.a0Shadow) null, new y0(this, null), 2);
    }

    public final void R() {
        v71.b0.z(androidx.lifecycle.d1.k(this), this.v, (v71.a0Shadow) null, new z0(this, null), 2);
    }

    public final ck.b S() {
        return ((GitHubDatabase) this.t.a(this.u.d())).D();
    }

    public final void T(String str) {
        if (k71.k.b(this.w, str)) {
            return;
        }
        if (str == null) {
            str = "";
        }
        this.w = t71.p.t0(str).toString();
        v71.b0.z(androidx.lifecycle.d1.k(this), this.v, (v71.a0Shadow) null, new b1(this, null), 2);
    }

    public final void U(v.e eVar) {
        v71.b0.z(androidx.lifecycle.d1.k(this), this.v, (v71.a0Shadow) null, new c1(this, eVar, null), 2);
    }

    public final void V() {
        v71.b0.z(androidx.lifecycle.d1.k(this), this.v, (v71.a0Shadow) null, new d1(this, null), 2);
    }

    public final void W(String str) {
        if (str == null || t71.p.T(str)) {
            return;
        }
        this.w = t71.p.t0(str).toString();
        V();
        fl.f.Companion.getClass();
        this.x.j(fl.e.b(null));
        v71.b0.z(androidx.lifecycle.d1.k(this), this.v, (v71.a0Shadow) null, new f1(this, null), 2);
    }
}
