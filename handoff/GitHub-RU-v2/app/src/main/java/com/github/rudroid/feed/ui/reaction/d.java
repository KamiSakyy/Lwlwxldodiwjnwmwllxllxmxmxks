package com.github.rudroid.feed.ui.reaction;

import androidx.lifecycle.d1;
import androidx.lifecycle.k1;
import com.github.rudroid.utilities.viewmodel.d;
import k71.k;
import kj.g0;
import v71.a0;
import v71.b0;
import yz0.r3;

/* loaded from: /home/user/work/p/classes.dex */
public final class d extends k1 implements com.github.rudroid.utilities.viewmodel.d {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d.a f12813s;

    /* renamed from: t, reason: collision with root package name */
    public kj.g f12814t;

    /* renamed from: u, reason: collision with root package name */
    public g0 f12815u;

    /* renamed from: v, reason: collision with root package name */
    public com.github.rudroid.activities.util.c f12816v;

    public d(kj.g gVar, g0 g0Var, com.github.rudroid.activities.util.c cVar) {
        k.g(gVar, "addReactionUseCase");
        k.g(g0Var, "removeReactionUseCase");
        k.g(cVar, "accountHolder");
        this.f12813s = new d.a();
        this.f12814t = gVar;
        this.f12815u = g0Var;
        this.f12816v = cVar;
    }

    public final void P(r3 r3Var) {
        b0.z(d1.k(this), (a71.h) null, (a0) null, new b(this, r3Var, null), 3);
    }

    public final void Q(r3 r3Var) {
        b0.z(d1.k(this), (a71.h) null, (a0) null, new c(this, r3Var, null), 3);
    }
}
