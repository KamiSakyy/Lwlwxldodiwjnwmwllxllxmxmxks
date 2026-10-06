package com.github.rudroid.copilot;

import android.app.Application;
import com.github.rudroid.utilities.ui.g1;

/* loaded from: /home/user/work/p/classes.dex */
public final class o4 extends androidx.lifecycle.a {

    /* renamed from: t, reason: collision with root package name */
    public nj.y f9940t;

    /* renamed from: u, reason: collision with root package name */
    public com.github.rudroid.activities.util.c f9941u;

    /* renamed from: v, reason: collision with root package name */
    public com.github.rudroid.copilot.threads.l f9942v;

    /* renamed from: w, reason: collision with root package name */
    public y71.y1 f9943w;

    /* renamed from: x, reason: collision with root package name */
    public y71.i1 f9944x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4(Application application, nj.y yVar, com.github.rudroid.activities.util.c cVar, com.github.rudroid.copilot.threads.l lVar) {
        super(application);
        k71.k.g(yVar, "fetchThreadsAndPruneStaleOnesUseCase");
        k71.k.g(cVar, "accountHolder");
        this.f9940t = yVar;
        this.f9941u = cVar;
        this.f9942v = lVar;
        y71.y1 c10 = y71.n1Shadow.c(g1.a.c(com.github.rudroid.utilities.ui.g1.Companion));
        this.f9943w = c10;
        this.f9944x = com.github.rudroid.utilities.w0.f(c10, androidx.lifecycle.d1.k(this), new k4(this, 0));
        Q();
    }

    public final void Q() {
        v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0Shadow) null, new n4(this, null), 3);
    }
}
