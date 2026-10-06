package com.github.rudroid.starredreposandlists.createoreditlist;

import androidx.lifecycle.k1;
import com.github.rudroid.utilities.viewmodel.d;
import y71.m1;
import y71.n1;
import y71.y1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r extends k1 implements com.github.rudroid.utilities.viewmodel.d {
    public final /* synthetic */ d.a s;
    public ym.a t;
    public i1 u;
    public com.github.rudroid.activities.util.c v;
    public m1 w;
    public m1 x;
    public y1 y;
    public y1 z;

    public r(ym.a aVar, i1 i1Var, com.github.rudroid.activities.util.c cVar) {
        k71.k.g(aVar, "createNewListUseCase");
        k71.k.g(i1Var, "viewerHasCreatedListsUseCase");
        k71.k.g(cVar, "accountHolder");
        this.s = new d.a();
        this.t = aVar;
        this.u = i1Var;
        this.v = cVar;
        v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new k(this, null), 3);
        m1 b = n1.b(0, 7, (x71.a) null);
        this.w = b;
        this.x = b;
        y1 c = n1.c(Boolean.TRUE);
        this.y = c;
        this.z = c;
    }

    public final void P(f1 f1Var) {
        v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new q(this, f1Var, null), 3);
    }
}
