package com.github.rudroid.favorites.viewmodels;

import androidx.lifecycle.d1;
import androidx.lifecycle.k1;
import com.github.rudroid.m0;
import java.util.ArrayList;
import java.util.List;
import y71.i1;
import y71.n1;
import y71.y1;
import zk.v1;

/* loaded from: /home/user/work/p/classes.dex */
public final class g extends k1 {

    /* renamed from: s, reason: collision with root package name */
    public com.github.rudroid.activities.util.c f12365s;

    /* renamed from: t, reason: collision with root package name */
    public v1 f12366t;

    /* renamed from: u, reason: collision with root package name */
    public zk.e0 f12367u;

    /* renamed from: v, reason: collision with root package name */
    public y1 f12368v;

    /* renamed from: w, reason: collision with root package name */
    public i1 f12369w;

    public g(com.github.rudroid.activities.util.c cVar, v1 v1Var, zk.e0 e0Var) {
        k71.k.g(cVar, "accountHolder");
        k71.k.g(v1Var, "updateDashboardNavLinksUseCase");
        k71.k.g(e0Var, "fetchUserDashboardNavLinksUseCase");
        this.f12365s = cVar;
        this.f12366t = v1Var;
        this.f12367u = e0Var;
        y1 s2 = m0.s(fl.f.Companion, null);
        this.f12368v = s2;
        this.f12369w = new i1(s2);
        v71.b0.z(d1.k(this), (a71.h) null, (v71.a0) null, new c(this, null), 3);
    }

    public final i1 P() {
        fl.f.Companion.getClass();
        y1 c10 = n1.c(fl.e.b(w61.a0.a));
        x61.r<uc.b> rVar = (List) ((fl.f) this.f12368v.getValue()).b;
        if (rVar == null) {
            rVar = x61.r.r;
        }
        ArrayList arrayList = new ArrayList(x61.n.F(rVar, 10));
        for (uc.b bVar : rVar) {
            arrayList.add(new g01.d(bVar.f32294r, bVar.f32295s));
        }
        v71.b0.z(d1.k(this), (a71.h) null, (v71.a0) null, new f(this, arrayList, c10, null), 3);
        return new i1(c10);
    }
}
