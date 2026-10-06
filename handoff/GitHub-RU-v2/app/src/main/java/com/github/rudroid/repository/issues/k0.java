package com.github.rudroid.repository.issues;

import androidx.lifecycle.a1;
import androidx.lifecycle.d1;
import androidx.lifecycle.k1;
import com.github.rudroid.utilities.h2;
import com.github.rudroid.utilities.ui.g1;
import y71.i1;
import y71.n1;
import y71.y1;

/* loaded from: /home/user/work/p/classes.dex */
public final class k0 extends k1 {
    public static final a Companion = new a();

    /* renamed from: s, reason: collision with root package name */
    public final ml.l f19897s;

    /* renamed from: t, reason: collision with root package name */
    public final com.github.rudroid.activities.util.c f19898t;

    /* renamed from: u, reason: collision with root package name */
    public final String f19899u;

    /* renamed from: v, reason: collision with root package name */
    public final String f19900v;

    /* renamed from: w, reason: collision with root package name */
    public final y1 f19901w;

    /* renamed from: x, reason: collision with root package name */
    public final i1 f19902x;

    public static final class a {
    }

    public k0(ml.l lVar, com.github.rudroid.activities.util.c cVar, a1 a1Var) {
        k71.k.g(lVar, "fetchRepositoryUseCase");
        k71.k.g(cVar, "accountHolder");
        k71.k.g(a1Var, "savedStateHandle");
        this.f19897s = lVar;
        this.f19898t = cVar;
        this.f19899u = (String) h2.a(a1Var, "EXTRA_REPOSITORY_OWNER");
        this.f19900v = (String) h2.a(a1Var, "EXTRA_REPOSITORY_NAME");
        y1 c10 = n1.c(g1.a.c(g1.Companion));
        this.f19901w = c10;
        this.f19902x = new i1(c10);
        v71.b0.z(d1.k(this), (a71.h) null, (v71.a0) null, new m0(this, null), 3);
    }
}
