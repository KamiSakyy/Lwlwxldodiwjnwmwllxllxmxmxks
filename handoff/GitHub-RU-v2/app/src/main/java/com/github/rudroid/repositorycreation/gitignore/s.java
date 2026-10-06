package com.github.rudroid.repositorycreation.gitignore;

import androidx.lifecycle.a1;
import androidx.lifecycle.d1;
import androidx.lifecycle.k1;
import com.github.rudroid.utilities.ui.g1;
import rm0.r3Shadow;
import y71.i1;
import y71.n1;
import y71.q1;
import y71.y1;

/* loaded from: /home/user/work/p/classes.dex */
public final class s extends k1 {
    public static final a Companion = new a();

    /* renamed from: s, reason: collision with root package name */
    public vl.d f20375s;

    /* renamed from: t, reason: collision with root package name */
    public com.github.rudroid.activities.util.c f20376t;

    /* renamed from: u, reason: collision with root package name */
    public y1 f20377u;

    /* renamed from: v, reason: collision with root package name */
    public y1 f20378v;

    /* renamed from: w, reason: collision with root package name */
    public y1 f20379w;

    /* renamed from: x, reason: collision with root package name */
    public i1 f20380x;

    public static final class a {
    }

    public s(vl.d dVar, com.github.rudroid.activities.util.c cVar, a1 a1Var) {
        k71.k.g(dVar, "fetchGitignoreTemplatesUseCase");
        k71.k.g(cVar, "accountHolder");
        k71.k.g(a1Var, "savedStateHandle");
        this.f20375s = dVar;
        this.f20376t = cVar;
        y1 c10 = n1.c(a1Var.a("EXTRA_SELECTED_TEMPLATE"));
        this.f20377u = c10;
        y1 c11 = n1.c(g1.a.c(g1.Companion));
        this.f20378v = c11;
        y1 c12 = n1.c("");
        this.f20379w = c12;
        r3Shadow l = n1.l(c11, c12, c10, new x(4, null));
        v6.a k10 = d1.k(this);
        r.Companion.getClass();
        this.f20380x = n1.G(l, k10, q1.b, r.f20371d);
        v71.b0.z(d1.k(this), (a71.h) null, (v71.a0) null, new w(this, null), 3);
    }
}
