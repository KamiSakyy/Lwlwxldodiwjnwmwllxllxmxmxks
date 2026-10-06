package com.github.rudroid.feed;

import com.github.rudroid.utilities.viewmodel.d;

/* loaded from: /home/user/work/p/classes.dex */
public final class v1 extends androidx.lifecycle.k1 implements com.github.rudroid.utilities.viewmodel.d {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d.a f12859s;

    /* renamed from: t, reason: collision with root package name */
    public kj.i f12860t;

    /* renamed from: u, reason: collision with root package name */
    public kj.i0 f12861u;

    /* renamed from: v, reason: collision with root package name */
    public com.github.rudroid.activities.util.c f12862v;

    public v1(kj.i iVar, kj.i0 i0Var, com.github.rudroid.activities.util.c cVar) {
        k71.k.g(iVar, "addStarUseCase");
        k71.k.g(i0Var, "removeStarUseCase");
        k71.k.g(cVar, "accountHolder");
        this.f12859s = new d.a();
        this.f12860t = iVar;
        this.f12861u = i0Var;
        this.f12862v = cVar;
    }

    public final void P(String str) {
        v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new t1(this, str, null), 3);
    }

    public final void Q(String str) {
        v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new u1(this, str, null), 3);
    }
}
