package com.github.rudroid.feed.filter;

import androidx.lifecycle.d1;
import androidx.lifecycle.k1;
import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.ui.u0;
import com.github.rudroid.utilities.viewmodel.g;
import java.util.concurrent.CancellationException;
import v71.q1;
import y71.i1;
import y71.n1Shadow;
import y71.w1;
import y71.y1;

/* loaded from: /home/user/work/p/classes.dex */
public final class z extends k1 implements com.github.rudroid.utilities.viewmodel.g {
    public q1 A;
    public q1 B;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g.a f12621s;

    /* renamed from: t, reason: collision with root package name */
    public com.github.rudroid.activities.util.c f12622t;

    /* renamed from: u, reason: collision with root package name */
    public qk.b f12623u;

    /* renamed from: v, reason: collision with root package name */
    public qk.h f12624v;

    /* renamed from: w, reason: collision with root package name */
    public y1 f12625w;

    /* renamed from: x, reason: collision with root package name */
    public i1 f12626x;

    /* renamed from: y, reason: collision with root package name */
    public y1 f12627y;

    /* renamed from: z, reason: collision with root package name */
    public i1 f12628z;

    public z(com.github.rudroid.activities.util.c cVar, qk.b bVar, qk.h hVar) {
        k71.k.g(cVar, "accountHolder");
        k71.k.g(bVar, "fetchFeedFilterUseCase");
        k71.k.g(hVar, "updateFeedFiltersUseCase");
        this.f12621s = new g.a();
        this.f12622t = cVar;
        this.f12623u = bVar;
        this.f12624v = hVar;
        y1 c10 = n1Shadow.c(g1.a.c(g1.Companion));
        this.f12625w = c10;
        this.f12626x = new i1(c10);
        y1 c11 = n1Shadow.c(new u0((Object) null));
        this.f12627y = c11;
        this.f12628z = new i1(c11);
        q1 q1Var = this.A;
        if (q1Var == null || !q1Var.f()) {
            q1 q1Var2 = this.A;
            if (q1Var2 != null) {
                q1Var2.m((CancellationException) null);
            }
            this.A = v71.b0.z(d1.k(this), (a71.h) null, (v71.a0Shadow) null, new u(this, null), 3);
        }
    }

    public static final void P(z zVar, fl.b bVar) {
        y1 y1Var = zVar.f12625w;
        g1.a aVar = g1.Companion;
        Object data = ((g1) y1Var.getValue()).getData();
        aVar.getClass();
        y1Var.k((Object) null, g1.a.b(bVar, data));
        y1 y1Var2 = zVar.f12627y;
        u0 u0Var = new u0((Object) null);
        y1Var2.getClass();
        y1Var2.k((Object) null, u0Var);
        g.a aVar2 = zVar.f12621s;
        aVar2.getClass();
        y1 y1Var3 = aVar2.r;
        y1Var3.getClass();
        y1Var3.k((Object) null, bVar);
    }

    public final w1 J() {
        return this.f12621s.s;
    }

    public final void c(fl.b bVar) {
        k71.k.g(bVar, "executionError");
        this.f12621s.c(bVar);
    }
}
