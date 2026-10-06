package com.github.rudroid.starredreposandlists.createoreditlist;

import androidx.lifecycle.k1;
import com.github.rudroid.starredreposandlists.navigation.EditListRoute;
import y71.n1;
import y71.y1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u0 extends k1 {
    public y1 A;
    public y71.i1 B;
    public ym.d s;
    public ym.c t;
    public com.github.rudroid.activities.util.c u;
    public EditListRoute v;
    public y1 w;
    public y71.i1 x;
    public y1 y;
    public y71.i1 z;

    public u0(ym.d dVar, ym.c cVar, com.github.rudroid.activities.util.c cVar2, androidx.lifecycle.a1 a1Var) {
        k71.k.g(dVar, "fetchUserListMetadataUseCase");
        k71.k.g(cVar, "editListMetadataUseCase");
        k71.k.g(cVar2, "accountHolder");
        k71.k.g(a1Var, "savedStateHandle");
        this.s = dVar;
        this.t = cVar;
        this.u = cVar2;
        this.v = (EditListRoute) sy.y.m(a1Var, k71.x.a(EditListRoute.class), x61.s.r);
        y1 s = com.github.rudroid.m0.s(fl.f.Companion, (Object) null);
        this.w = s;
        this.x = new y71.i1(s);
        y1 c = n1.c(f1.r);
        this.y = c;
        this.z = new y71.i1(c);
        y1 c2 = n1.c((Object) null);
        this.A = c2;
        this.B = new y71.i1(c2);
        v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new q0(this, null), 3);
    }
}
