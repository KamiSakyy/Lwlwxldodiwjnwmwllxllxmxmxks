package com.github.rudroid.copilot.boa;

import androidx.lifecycle.d1;
import androidx.lifecycle.k1;
import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.viewmodel.d;
import v71.q1;
import y71.i1;
import y71.n1Shadow;
import y71.y1;

/* loaded from: /home/user/work/p/classes.dex */
public final class a extends k1 implements com.github.rudroid.utilities.viewmodel.d {
    public static final C0020a Companion = new C0020a();

    /* renamed from: s, reason: collision with root package name */
    public com.github.rudroid.activities.util.c f9424s;

    /* renamed from: t, reason: collision with root package name */
    public nj.t f9425t;

    /* renamed from: u, reason: collision with root package name */
    public y1 f9426u;

    /* renamed from: v, reason: collision with root package name */
    public i1 f9427v;

    /* renamed from: w, reason: collision with root package name */
    public q1 f9428w;

    /* renamed from: com.github.rudroid.copilot.boa.a$a, reason: collision with other inner class name */
    public static final class C0020a {
    }

    public a(com.github.rudroid.activities.util.c cVar, nj.t tVar) {
        k71.k.g(cVar, "accountHolder");
        k71.k.g(tVar, "fetchCopilotLicenseUseCase");
        new d.a();
        this.f9424s = cVar;
        this.f9425t = tVar;
        y1 c10 = n1Shadow.c(g1.a.c(g1.Companion));
        this.f9426u = c10;
        this.f9427v = new i1(c10);
        v71.b0.z(d1.k(this), (a71.h) null, (v71.a0Shadow) null, new f(this, null), 3);
    }
}
