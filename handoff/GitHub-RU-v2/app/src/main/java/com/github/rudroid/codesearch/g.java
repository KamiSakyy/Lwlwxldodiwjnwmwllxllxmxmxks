package com.github.rudroid.codesearch;

import androidx.lifecycle.a1;
import androidx.lifecycle.d1;
import androidx.lifecycle.k1;
import com.github.rudroid.home.search.navigation.GlobalCodeSearchResultsRoute;
import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.ui.h1;
import com.github.rudroid.utilities.viewmodel.d;
import com.github.rudroid.viewmodels.v3;
import java.util.concurrent.CancellationException;
import v71.q1;
import y71.i1;
import y71.n1;
import y71.y1;

/* loaded from: /home/user/work/p/classes.dex */
public final class g extends k1 implements com.github.rudroid.utilities.viewmodel.d, v3 {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d.a f8835s;

    /* renamed from: t, reason: collision with root package name */
    public final com.github.rudroid.activities.util.c f8836t;

    /* renamed from: u, reason: collision with root package name */
    public final yk.a f8837u;

    /* renamed from: v, reason: collision with root package name */
    public final String f8838v;

    /* renamed from: w, reason: collision with root package name */
    public q1 f8839w;

    /* renamed from: x, reason: collision with root package name */
    public x01.i f8840x;

    /* renamed from: y, reason: collision with root package name */
    public final y1 f8841y;

    /* renamed from: z, reason: collision with root package name */
    public final i1 f8842z;

    public g(a1 a1Var, com.github.rudroid.activities.util.c cVar, yk.a aVar) {
        k71.k.g(a1Var, "savedStateHandle");
        k71.k.g(cVar, "accountHolder");
        k71.k.g(aVar, "globalCodeSearchUseCase");
        this.f8835s = new d.a();
        this.f8836t = cVar;
        this.f8837u = aVar;
        this.f8838v = ((GlobalCodeSearchResultsRoute) sy.y.m(a1Var, k71.x.a(GlobalCodeSearchResultsRoute.class), x61.s.r)).f15051a;
        x01.i.Companion.getClass();
        this.f8840x = x01.i.d;
        y1 c10 = n1.c(g1.a.c(g1.Companion));
        this.f8841y = c10;
        this.f8842z = new i1(c10);
        P();
    }

    public final void D() {
        P();
    }

    public final void P() {
        String str = this.f8840x.b;
        boolean z10 = str == null || t71.p.T(str);
        q1 q1Var = this.f8839w;
        if (q1Var != null) {
            q1Var.m((CancellationException) null);
        }
        this.f8839w = v71.b0.z(d1.k(this), (a71.h) null, (v71.a0) null, new f(this, z10, null), 3);
    }

    public final boolean a() {
        return h1.g((g1) this.f8841y.getValue()) && this.f8840x.a();
    }
}
