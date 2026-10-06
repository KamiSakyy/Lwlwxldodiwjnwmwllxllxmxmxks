package com.github.rudroid.repositorycreation.licensetemplate;

import androidx.lifecycle.a1;
import androidx.lifecycle.d1;
import androidx.lifecycle.k1;
import com.github.rudroid.utilities.ui.g1;
import rm0.r3Shadow;
import y71.i1;
import y71.n1Shadow;
import y71.q1;
import y71.y1;

/* loaded from: /home/user/work/p/classes.dex */
public final class r extends k1 {
    public static final a Companion = new a();

    /* renamed from: s, reason: collision with root package name */
    public vl.e f20420s;

    /* renamed from: t, reason: collision with root package name */
    public com.github.rudroid.activities.util.c f20421t;

    /* renamed from: u, reason: collision with root package name */
    public y1 f20422u;

    /* renamed from: v, reason: collision with root package name */
    public y1 f20423v;

    /* renamed from: w, reason: collision with root package name */
    public y1 f20424w;

    /* renamed from: x, reason: collision with root package name */
    public i1 f20425x;

    public static final class a {
    }

    public r(vl.e eVar, com.github.rudroid.activities.util.c cVar, a1 a1Var) {
        k71.k.g(eVar, "fetchLicenseTemplatesUseCase");
        k71.k.g(cVar, "accountHolder");
        k71.k.g(a1Var, "savedStateHandle");
        this.f20420s = eVar;
        this.f20421t = cVar;
        y1 c10 = n1Shadow.c(a1Var.a("EXTRA_SELECTED_LICENSE"));
        this.f20422u = c10;
        y1 c11 = n1Shadow.c(g1.a.c(g1.Companion));
        this.f20423v = c11;
        y1 c12 = n1Shadow.c("");
        this.f20424w = c12;
        r3Shadow l = n1Shadow.l(c11, c12, c10, new w(4, null));
        v6.a k10 = d1.k(this);
        q.Companion.getClass();
        this.f20425x = n1Shadow.G(l, k10, q1.b, q.f20416d);
        v71.b0.z(d1.k(this), (a71.h) null, (v71.a0Shadow) null, new v(this, null), 3);
    }
}
