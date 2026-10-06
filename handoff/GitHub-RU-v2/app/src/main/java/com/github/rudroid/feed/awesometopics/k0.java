package com.github.rudroid.feed.awesometopics;

import androidx.lifecycle.d1;
import androidx.lifecycle.k1;
import com.github.rudroid.common.logging.LogTag;
import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.ui.h1;
import com.github.rudroid.viewmodels.v3;
import v71.q1;
import y71.i1;
import y71.n1Shadow;
import y71.y1;

@LogTag(tag = "AwesomeListsViewModel")
/* loaded from: /home/user/work/p/classes.dex */
public final class k0 extends k1 implements v3 {
    public y1 A;
    public i1 B;
    public u C;
    public q1 D;
    public q1 E;

    /* renamed from: s, reason: collision with root package name */
    public rk.b f12505s;

    /* renamed from: t, reason: collision with root package name */
    public rk.a f12506t;

    /* renamed from: u, reason: collision with root package name */
    public rk.c f12507u;

    /* renamed from: v, reason: collision with root package name */
    public kj.i f12508v;

    /* renamed from: w, reason: collision with root package name */
    public kj.i0 f12509w;

    /* renamed from: x, reason: collision with root package name */
    public com.github.rudroid.explore.d f12510x;

    /* renamed from: y, reason: collision with root package name */
    public com.github.rudroid.activities.util.c f12511y;

    /* renamed from: z, reason: collision with root package name */
    public qe.a f12512z;

    public k0(rk.b bVar, rk.a aVar, rk.c cVar, kj.i iVar, kj.i0 i0Var, com.github.rudroid.explore.d dVar, com.github.rudroid.activities.util.c cVar2, qe.a aVar2) {
        k71.k.g(bVar, "observeAwesomeTopicsUseCase");
        k71.k.g(aVar, "loadAwesomeTopicsPageUseCase");
        k71.k.g(cVar, "refreshAwesomeTopicsUseCase");
        k71.k.g(iVar, "addStarUseCase");
        k71.k.g(i0Var, "removeStarUseCase");
        k71.k.g(cVar2, "accountHolder");
        this.f12505s = bVar;
        this.f12506t = aVar;
        this.f12507u = cVar;
        this.f12508v = iVar;
        this.f12509w = i0Var;
        this.f12510x = dVar;
        this.f12511y = cVar2;
        this.f12512z = aVar2;
        y1 c10 = n1Shadow.c(g1.a.c(g1.Companion));
        this.A = c10;
        this.B = com.github.rudroid.utilities.w0.f(c10, d1.k(this), new u(this, 0));
        this.C = new u(this, 1);
        n1Shadow.A(new y71.y(new i0(cVar2.f5919b), new v(this, null), 6), d1.k(this));
    }

    public final void D() {
        q1 q1Var = this.E;
        if (q1Var == null || !q1Var.f()) {
            this.E = th.a.a(this, (a71.h) null, this.f12512z, new y(this, null), 27);
        }
    }

    public final boolean a() {
        y1 y1Var = this.A;
        if (h1.g((g1) y1Var.getValue())) {
        }
        return false;
    }
}
