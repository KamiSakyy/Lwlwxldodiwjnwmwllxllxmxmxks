package com.github.rudroid.releases;

import androidx.lifecycle.k1;
import com.github.rudroid.releases.navigation.ReleasesRoute;
import com.github.rudroid.viewmodels.x3;
import y71.y1;

/* loaded from: /home/user/work/p/classes.dex */
public final class a1 extends k1 implements x3 {

    /* renamed from: s, reason: collision with root package name */
    public kl.e f18836s;

    /* renamed from: t, reason: collision with root package name */
    public com.github.rudroid.activities.util.c f18837t;

    /* renamed from: u, reason: collision with root package name */
    public y1 f18838u;

    /* renamed from: v, reason: collision with root package name */
    public x01.i f18839v;

    /* renamed from: w, reason: collision with root package name */
    public String f18840w;

    /* renamed from: x, reason: collision with root package name */
    public String f18841x;

    public a1(kl.e eVar, com.github.rudroid.activities.util.c cVar, androidx.lifecycle.a1 a1Var) {
        k71.k.g(eVar, "fetchReleasesUseCase");
        k71.k.g(cVar, "accountHolder");
        k71.k.g(a1Var, "savedStateHandle");
        this.f18836s = eVar;
        this.f18837t = cVar;
        this.f18838u = com.github.rudroid.m0.s(fl.f.Companion, null);
        this.f18839v = new x01.i((String) null, false, true);
        ReleasesRoute releasesRoute = (ReleasesRoute) sy.y.m(a1Var, k71.xShadow.a(ReleasesRoute.class), x61.s.r);
        this.f18840w = releasesRoute.f18933r;
        this.f18841x = releasesRoute.f18934s;
    }

    public final void D() {
        v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0Shadow) null, new z0(this, this.f18839v.b, null), 3);
    }

    public final x01.i l() {
        return this.f18839v;
    }

    public final fl.g s() {
        return ((fl.f) this.f18838u.getValue()).a;
    }
}
