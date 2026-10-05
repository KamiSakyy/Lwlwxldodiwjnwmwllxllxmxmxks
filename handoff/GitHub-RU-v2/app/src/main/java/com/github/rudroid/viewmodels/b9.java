package com.github.rudroid.viewmodels;

import com.github.service.models.response.SimpleLegacyProject;
import com.github.service.models.response.type.PullRequestUpdateState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

@c71.e(c = "com.github.rudroid.viewmodels.TriageLegacyProjectsViewModel$savePullProjects$1", f = "TriageLegacyProjectsViewModel.kt", l = {181}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class b9 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ m8 w;
    public final /* synthetic */ String x;
    public final /* synthetic */ androidx.lifecycle.p0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b9(m8 m8Var, String str, androidx.lifecycle.p0 p0Var, a71.c cVar) {
        super(2, cVar);
        this.w = m8Var;
        this.x = str;
        this.y = p0Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new b9(this.w, this.x, this.y, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            m8 m8Var = this.w;
            zk.z1 z1Var = m8Var.v;
            oa.j d = m8Var.w.d();
            LinkedHashSet linkedHashSet = m8Var.D;
            LinkedHashSet linkedHashSet2 = m8Var.E;
            androidx.lifecycle.p0 p0Var = this.y;
            com.github.rudroid.favorites.viewmodels.y yVar = new com.github.rudroid.favorites.viewmodels.y(p0Var, 8);
            z1Var.getClass();
            String str = this.x;
            k71.k.g(str, "id");
            k71.k.g(linkedHashSet, "projects");
            k71.k.g(linkedHashSet2, "previousProjects");
            z01.t0 t0Var = (z01.t0) z1Var.a.a(d);
            ArrayList arrayList = new ArrayList(x61.n.F(linkedHashSet, 10));
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                arrayList.add(((SimpleLegacyProject) it.next()).s);
            }
            y71.y J = b31.b.J(new y71.y(t0Var.k(str, (PullRequestUpdateState) null, (String) null, arrayList), new an.d(linkedHashSet2, linkedHashSet, z1Var, d, str, (a71.c) null, 16), 6), d, yVar);
            a9 a9Var = new a9(p0Var);
            this.v = 1;
            if (J.b(a9Var, this) == aVar) {
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
