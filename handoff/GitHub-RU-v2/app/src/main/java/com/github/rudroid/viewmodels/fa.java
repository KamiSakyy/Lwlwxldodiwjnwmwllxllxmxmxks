package com.github.rudroid.viewmodels;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

@c71.e(c = "com.github.rudroid.viewmodels.TriageReviewersViewModel$saveReviewers$1", f = "TriageReviewersViewModel.kt", l = {197}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class fa extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ t9 w;
    public final /* synthetic */ String x;
    public final /* synthetic */ androidx.lifecycle.p0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fa(t9 t9Var, String str, androidx.lifecycle.p0 p0Var, a71.c cVar) {
        super(2, cVar);
        this.w = t9Var;
        this.x = str;
        this.y = p0Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new fa(this.w, this.x, this.y, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        t9 t9Var = this.w;
        LinkedHashSet<yz0.e2> linkedHashSet = t9Var.D;
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            zk.o1 o1Var = t9Var.s;
            oa.j d = t9Var.w.d();
            LinkedHashSet linkedHashSet2 = t9Var.F;
            ArrayList arrayList = new ArrayList();
            Iterator it = linkedHashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                yz0.e2 e2Var = (yz0.e2) it.next();
                String str = k71.k.b(e2Var.e, yz0.f2.d) ? e2Var.d : null;
                if (str != null) {
                    arrayList.add(str);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (yz0.e2 e2Var2 : linkedHashSet) {
                String str2 = k71.k.b(e2Var2.e, yz0.f2.b) ? e2Var2.d : null;
                if (str2 != null) {
                    arrayList2.add(str2);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (yz0.e2 e2Var3 : linkedHashSet) {
                String str3 = k71.k.b(e2Var3.e, yz0.f2.a) ? e2Var3.d : null;
                if (str3 != null) {
                    arrayList3.add(str3);
                }
            }
            androidx.lifecycle.p0 p0Var = this.y;
            j71.c yVar = new com.github.rudroid.favorites.viewmodels.y(p0Var, 9);
            o1Var.getClass();
            String str4 = this.x;
            k71.k.g(str4, "id");
            k71.k.g(linkedHashSet2, "originalListOfReviewers");
            y71.y yVar2 = new y71.y(new da(t9Var, null), in.r.l(new y71.y(b31.b.J(o1Var.a.a(d, str4, arrayList, arrayList2, arrayList3, false, yVar), d, yVar), new zk.n1(linkedHashSet2, o1Var, d, str4, arrayList, arrayList2, null), 6)));
            ea eaVar = new ea(p0Var);
            this.v = 1;
            if (yVar2.b(eaVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sy.y.j(obj);
        }
        return w61.a0.a;
    }
}
