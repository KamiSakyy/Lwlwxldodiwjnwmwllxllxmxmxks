package com.github.rudroid.organizations;

import androidx.lifecycle.a1;
import androidx.lifecycle.d1;
import androidx.lifecycle.k1;
import com.github.rudroid.m0;
import com.github.rudroid.profile.navigation.OrganizationsRoute;
import com.github.rudroid.viewmodels.x3;
import java.util.concurrent.CancellationException;
import v71.a0Shadow;
import v71.b0;
import v71.q1;
import y71.y1;

/* loaded from: /home/user/work/p/classes.dex */
public final class t extends k1 implements x3 {

    /* renamed from: s, reason: collision with root package name */
    public lm.d f17197s;

    /* renamed from: t, reason: collision with root package name */
    public lm.h f17198t;

    /* renamed from: u, reason: collision with root package name */
    public com.github.rudroid.activities.util.c f17199u;

    /* renamed from: v, reason: collision with root package name */
    public String f17200v;

    /* renamed from: w, reason: collision with root package name */
    public String f17201w;

    /* renamed from: x, reason: collision with root package name */
    public y1 f17202x;

    /* renamed from: y, reason: collision with root package name */
    public x01.i f17203y;

    /* renamed from: z, reason: collision with root package name */
    public q1 f17204z;

    public t(lm.d dVar, lm.h hVar, com.github.rudroid.activities.util.c cVar, a1 a1Var) {
        k71.k.g(dVar, "fetchOrganizationsUseCase");
        k71.k.g(hVar, "fetchUserOrganizationsUseCase");
        k71.k.g(cVar, "accountHolder");
        k71.k.g(a1Var, "savedStateHandle");
        this.f17197s = dVar;
        this.f17198t = hVar;
        this.f17199u = cVar;
        OrganizationsRoute organizationsRoute = (OrganizationsRoute) sy.y.m(a1Var, k71.xShadow.a(OrganizationsRoute.class), x61.s.r);
        this.f17200v = organizationsRoute.f17326a;
        this.f17201w = organizationsRoute.f17327b;
        this.f17202x = m0.s(fl.f.Companion, null);
        this.f17203y = new x01.i((String) null, false, true);
    }

    public final void D() {
        String str = this.f17203y.b;
        q1 q1Var = this.f17204z;
        if (q1Var != null) {
            q1Var.m((CancellationException) null);
        }
        this.f17204z = b0.z(d1.k(this), (a71.h) null, (a0Shadow) null, new s(this, str, null), 3);
    }

    public final x01.i l() {
        return this.f17203y;
    }

    public final fl.g s() {
        return ((fl.f) this.f17202x.getValue()).a;
    }
}
