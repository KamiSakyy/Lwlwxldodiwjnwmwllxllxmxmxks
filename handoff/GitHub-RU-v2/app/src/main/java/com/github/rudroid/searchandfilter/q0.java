package com.github.rudroid.searchandfilter;

import y71.y1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q0 extends androidx.lifecycle.k1 {
    public static final a Companion = new a();
    public com.github.rudroid.activities.util.c s;
    public dl.d t;
    public String u;
    public String v;
    public y1 w;
    public t0 x;

    public static final class a {
    }

    public q0(androidx.lifecycle.a1 a1Var, com.github.rudroid.activities.util.c cVar, dl.d dVar) {
        k71.k.g(a1Var, "savedStateHandle");
        k71.k.g(cVar, "accountHolder");
        k71.k.g(dVar, "fetchMergeQueueUseCase");
        this.s = cVar;
        this.t = dVar;
        this.u = (String) a1Var.a("EXTRA_VM_REPO_OWNER");
        this.v = (String) a1Var.a("EXTRA_VM_REPO_NAME");
        y1 c = y71.n1Shadow.c((Object) null);
        this.w = c;
        this.x = new t0(new y00.l(c, 10));
        v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0Shadow) null, new p0(this, null), 3);
    }
}
