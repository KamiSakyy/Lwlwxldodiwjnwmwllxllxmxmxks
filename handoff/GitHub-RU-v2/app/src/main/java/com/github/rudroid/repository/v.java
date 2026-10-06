package com.github.rudroid.repository;

import com.github.rudroid.repository.navigation.LicenseContentsRoute;

/* loaded from: /home/user/work/p/classes.dex */
public final class v extends androidx.lifecycle.k1 {

    /* renamed from: s, reason: collision with root package name */
    public com.github.rudroid.activities.util.c f20295s;

    /* renamed from: t, reason: collision with root package name */
    public ml.e f20296t;

    /* renamed from: u, reason: collision with root package name */
    public String f20297u;

    /* renamed from: v, reason: collision with root package name */
    public String f20298v;

    /* renamed from: w, reason: collision with root package name */
    public y71.y1 f20299w;

    /* renamed from: x, reason: collision with root package name */
    public y71.i1 f20300x;

    public v(com.github.rudroid.activities.util.c cVar, ml.e eVar, androidx.lifecycle.a1 a1Var) {
        k71.k.g(cVar, "accountHolder");
        k71.k.g(eVar, "fetchLicenseContentsUseCase");
        k71.k.g(a1Var, "savedStateHandle");
        this.f20295s = cVar;
        this.f20296t = eVar;
        LicenseContentsRoute licenseContentsRoute = (LicenseContentsRoute) sy.y.m(a1Var, k71.x.a(LicenseContentsRoute.class), x61.s.r);
        this.f20297u = licenseContentsRoute.f20014r;
        this.f20298v = licenseContentsRoute.f20015s;
        y71.y1 s2 = com.github.rudroid.m0.s(fl.f.Companion, null);
        this.f20299w = s2;
        this.f20300x = new y71.i1(s2);
        v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new u(this, null), 3);
    }
}
