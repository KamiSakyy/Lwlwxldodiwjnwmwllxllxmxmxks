package com.github.rudroid.issueorpullrequest.triagesheet;

import com.github.rudroid.issueorpullrequest.triagesheet.b;
import com.github.rudroid.projects.j0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l01.t0;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public j0 f16513a;

    public n(j0 j0Var) {
        k71.k.g(j0Var, "projectFieldValueParser");
        this.f16513a = j0Var;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
    public final ArrayList a(List list, boolean z10) {
        List list2;
        b.i iVar = new b.i(2131954875, z10, p.f16517u);
        if (list.isEmpty()) {
            list2 = d0Shadow.n(new b.h(2131954854));
        } else {
            ArrayList arrayList = new ArrayList(x61.n.F(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                l01.s sVar = (l01.s) it.next();
                t0 t0Var = sVar.s;
                Object r42 = t0Var.w;
                Map map = sVar.r.v;
                boolean z11 = t0Var.x;
                this.f16513a.getClass();
                arrayList.add(new b.f(sVar, j0.a(r42, map, x61.rShadow.r, null, z11, null)));
            }
            list2 = arrayList;
        }
        return x61.m.m0(x61.m.l0(d0Shadow.n(iVar), list2), new b.l(2131954875));
    }
}
