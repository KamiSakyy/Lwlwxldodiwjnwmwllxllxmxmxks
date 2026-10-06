package com.github.rudroid.feed;

import com.github.rudroid.utilities.viewmodel.d;

/* loaded from: /home/user/work/p/classes.dex */
public final class a1 extends androidx.lifecycle.k1 implements com.github.rudroid.utilities.viewmodel.d {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d.a f12458s;

    /* renamed from: t, reason: collision with root package name */
    public hl.d f12459t;

    /* renamed from: u, reason: collision with root package name */
    public hl.h f12460u;

    /* renamed from: v, reason: collision with root package name */
    public com.github.rudroid.activities.util.c f12461v;

    public a1(hl.d dVar, hl.h hVar, com.github.rudroid.activities.util.c cVar) {
        k71.k.g(dVar, "followOrganizationUseCase");
        k71.k.g(hVar, "unfollowOrganizationUseCase");
        k71.k.g(cVar, "accountHolder");
        this.f12458s = new d.a();
        this.f12459t = dVar;
        this.f12460u = hVar;
        this.f12461v = cVar;
    }

    public final void P(String str) {
        v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new y0(this, str, null), 3);
    }

    public final void Q(String str) {
        v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new z0(this, str, null), 3);
    }
}
