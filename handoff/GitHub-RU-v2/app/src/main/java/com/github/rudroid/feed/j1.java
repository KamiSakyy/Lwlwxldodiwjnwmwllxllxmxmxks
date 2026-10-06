package com.github.rudroid.feed;

import com.github.rudroid.utilities.viewmodel.d;

/* loaded from: /home/user/work/p/classes.dex */
public final class j1 extends androidx.lifecycle.k1 implements com.github.rudroid.utilities.viewmodel.d {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d.a f12655s;

    /* renamed from: t, reason: collision with root package name */
    public gn.r f12656t;

    /* renamed from: u, reason: collision with root package name */
    public gn.t f12657u;

    /* renamed from: v, reason: collision with root package name */
    public com.github.rudroid.activities.util.c f12658v;

    public j1(gn.r rVar, gn.t tVar, com.github.rudroid.activities.util.c cVar) {
        k71.k.g(rVar, "followUserLegacyUseCase");
        k71.k.g(tVar, "unfollowUserLegacyUseCase");
        k71.k.g(cVar, "accountHolder");
        this.f12655s = new d.a();
        this.f12656t = rVar;
        this.f12657u = tVar;
        this.f12658v = cVar;
    }

    public final void P(String str) {
        v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new h1(this, str, null), 3);
    }

    public final void Q(String str) {
        v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new i1(this, str, null), 3);
    }
}
