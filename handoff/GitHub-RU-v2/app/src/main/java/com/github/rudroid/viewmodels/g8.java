package com.github.rudroid.viewmodels;

import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.viewmodel.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g8 extends androidx.lifecycle.k1 implements com.github.rudroid.utilities.viewmodel.d {
    public String A;
    public final /* synthetic */ d.a s;
    public final zk.c0 t;
    public final zk.u0 u;
    public final com.github.rudroid.activities.util.c v;
    public final LinkedHashMap w;
    public final y71.y1 x;
    public final y71.y1 y;
    public final y71.i1 z;

    public g8(zk.c0 c0Var, zk.u0 u0Var, com.github.rudroid.activities.util.c cVar) {
        k71.k.g(c0Var, "fetchSubIssuesUseCase");
        k71.k.g(u0Var, "observeSubIssueDataUseCase");
        k71.k.g(cVar, "accountHolder");
        this.s = new d.a();
        this.t = c0Var;
        this.u = u0Var;
        this.v = cVar;
        this.w = new LinkedHashMap();
        com.github.rudroid.utilities.ui.g1.Companion.getClass();
        com.github.rudroid.utilities.ui.h0 a = g1.a.a();
        x61.t tVar = x61.t.r;
        y71.y1 c = y71.n1.c(new y7(a, false, tVar, tVar));
        this.x = c;
        this.y = c;
        this.z = com.github.rudroid.utilities.w0.f(c, androidx.lifecycle.d1.k(this), new z7(this, 0));
    }

    public static Set P(String str, List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (k71.k.b(((h01.n) obj).l, str)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            h01.n nVar = (h01.n) obj2;
            x61.m.J(arrayList2, sy.f0.n(P(nVar.a, list), nVar.a));
        }
        return x61.m.K0(arrayList2);
    }

    public final void Q(String str) {
        if (this.v.d().f(com.github.rudroid.common.a.S)) {
            LinkedHashMap linkedHashMap = this.w;
            v71.d1 d1Var = (v71.d1) linkedHashMap.get(str);
            if (d1Var != null) {
                d1Var.m((CancellationException) null);
            }
            linkedHashMap.put(str, v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new c8(this, str, null), 3));
        }
    }

    public final void R(String str) {
        Object value;
        Object value2;
        k71.k.g(str, "issueId");
        y71.y1 y1Var = this.x;
        h01.o oVar = (h01.o) ((y7) y1Var.getValue()).a.getData();
        if (oVar != null) {
            Iterator it = oVar.b.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (k71.k.b(((h01.n) it.next()).a, str)) {
                    break;
                } else {
                    i++;
                }
            }
            int i2 = i;
            Set set = ((y7) y1Var.getValue()).c;
            if (set.contains(str)) {
                h01.o oVar2 = (h01.o) ((y7) y1Var.getValue()).a.getData();
                List list = oVar2 != null ? oVar2.b : null;
                if (list == null) {
                    list = x61.r.r;
                }
                LinkedHashSet n = sy.f0.n(P(str, list), str);
                do {
                    value2 = y1Var.getValue();
                } while (!y1Var.i(value2, y7.a((y7) value2, null, false, sy.f0.l(((y7) y1Var.getValue()).c, n), null, 11)));
                return;
            }
            LinkedHashMap linkedHashMap = this.w;
            if (linkedHashMap.keySet().contains(str)) {
                do {
                    value = y1Var.getValue();
                } while (!y1Var.i(value, y7.a((y7) value, null, false, sy.f0.n(set, str), null, 11)));
                return;
            }
            v71.d1 d1Var = (v71.d1) linkedHashMap.get(str);
            if (d1Var == null || !d1Var.f()) {
                linkedHashMap.put(str, v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new f8(this, str, set, i2, null), 3));
            }
        }
    }

    public final void S() {
        y71.y1 y1Var;
        Object value;
        com.github.rudroid.utilities.ui.h0 a;
        x61.t tVar;
        LinkedHashMap linkedHashMap = this.w;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((v71.d1) it.next()).m((CancellationException) null);
        }
        linkedHashMap.clear();
        do {
            y1Var = this.x;
            value = y1Var.getValue();
            com.github.rudroid.utilities.ui.g1.Companion.getClass();
            a = g1.a.a();
            tVar = x61.t.r;
        } while (!y1Var.i(value, new y7(a, false, tVar, tVar)));
        String str = this.A;
        if (str != null) {
            Q(str);
        }
    }

    public final void T() {
        y71.y1 y1Var;
        Object value;
        do {
            y1Var = this.x;
            value = y1Var.getValue();
        } while (!y1Var.i(value, y7.a((y7) value, null, !((y7) y1Var.getValue()).b, null, null, 13)));
    }
}
