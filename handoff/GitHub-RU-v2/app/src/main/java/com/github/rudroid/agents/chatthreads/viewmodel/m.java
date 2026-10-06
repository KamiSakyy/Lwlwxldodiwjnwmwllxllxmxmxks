package com.github.rudroid.agents.chatthreads.viewmodel;

import androidx.lifecycle.a1;
import androidx.lifecycle.d1;
import androidx.lifecycle.k1;
import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.ui.u0;
import java.util.concurrent.CancellationException;
import nj.d0;
import nj.y;
import v71.a0;
import v71.b0;
import v71.q1;
import y71.i1;
import y71.n1;
import y71.y1;

/* loaded from: /home/user/work/p/classes.dex */
public final class m extends k1 implements com.github.rudroid.utilities.viewmodel.b {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.github.rudroid.utilities.viewmodel.c f6736s;

    /* renamed from: t, reason: collision with root package name */
    public final y f6737t;

    /* renamed from: u, reason: collision with root package name */
    public final d0 f6738u;

    /* renamed from: v, reason: collision with root package name */
    public final com.github.rudroid.activities.util.c f6739v;

    /* renamed from: w, reason: collision with root package name */
    public q1 f6740w;

    /* renamed from: x, reason: collision with root package name */
    public final y1 f6741x;

    /* renamed from: y, reason: collision with root package name */
    public final y1 f6742y;

    /* renamed from: z, reason: collision with root package name */
    public final i1 f6743z;

    public m(y yVar, d0 d0Var, com.github.rudroid.activities.util.c cVar, oa.m mVar, a1 a1Var) {
        k71.k.g(yVar, "fetchThreadsAndPruneStaleOnesUseCase");
        k71.k.g(d0Var, "observeViewerCopilotPermissionsUseCase");
        k71.k.g(cVar, "accountHolder");
        k71.k.g(mVar, "userManager");
        k71.k.g(a1Var, "savedStateHandle");
        this.f6736s = new com.github.rudroid.utilities.viewmodel.c(a1Var, mVar);
        this.f6737t = yVar;
        this.f6738u = d0Var;
        this.f6739v = cVar;
        y1 c10 = n1.c(g1.a.c(g1.Companion));
        this.f6741x = c10;
        y1 c11 = n1.c(new u0((Object) null));
        this.f6742y = c11;
        this.f6743z = n1.G(new c00.g(c10, c11, new e(3, null), 27), d1.k(this), y71.q1.a, new u0((Object) null));
        this.f6740w = b0.z(d1.k(this), (a71.h) null, (a0) null, new d(this, null), 3);
        b0.z(d1.k(this), (a71.h) null, (a0) null, new i(this, null), 3);
    }

    public final void P(boolean z10) {
        q1 q1Var = this.f6740w;
        if (q1Var != null) {
            q1Var.m((CancellationException) null);
        }
        this.f6740w = b0.z(d1.k(this), (a71.h) null, (a0) null, new l(null, this, z10), 3);
    }

    public final void Q(y71.g1 g1Var, fl.b bVar, boolean z10) {
        k71.k.g(g1Var, "<this>");
        k71.k.g(bVar, "executionError");
        this.f6736s.a(g1Var, bVar, z10);
    }
}
