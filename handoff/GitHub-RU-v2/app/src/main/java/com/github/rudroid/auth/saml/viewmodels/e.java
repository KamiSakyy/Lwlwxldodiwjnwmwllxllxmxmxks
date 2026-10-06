package com.github.rudroid.auth.saml.viewmodels;

import androidx.lifecycle.d1;
import androidx.lifecycle.k1;
import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.ui.t1;
import com.github.service.models.response.organizations.OrganizationNameAndAvatarUrl;
import java.util.concurrent.CancellationException;
import v71.a0Shadow;
import v71.b0;
import v71.q1;
import y71.i1;
import y71.n1Shadow;
import y71.y1;

/* loaded from: /home/user/work/p/classes.dex */
public final class e extends k1 {

    /* renamed from: s, reason: collision with root package name */
    public com.github.rudroid.activities.util.c f8593s;

    /* renamed from: t, reason: collision with root package name */
    public xl.a f8594t;

    /* renamed from: u, reason: collision with root package name */
    public y1 f8595u;

    /* renamed from: v, reason: collision with root package name */
    public i1 f8596v;

    /* renamed from: w, reason: collision with root package name */
    public q1 f8597w;

    public e(com.github.rudroid.activities.util.c cVar, xl.a aVar) {
        k71.k.g(cVar, "accountHolder");
        k71.k.g(aVar, "fetchOrganizationForLoginUseCase");
        this.f8593s = cVar;
        this.f8594t = aVar;
        y1 c10 = n1Shadow.c(g1.a.c(g1.Companion));
        this.f8595u = c10;
        this.f8596v = new i1(c10);
    }

    public final void P(fl.b bVar, String str) {
        k71.k.g(bVar, "error");
        q1 q1Var = this.f8597w;
        if (q1Var != null) {
            q1Var.m((CancellationException) null);
        }
        String str2 = bVar.i;
        String str3 = bVar.j;
        if (str2 == null || str3 == null) {
            this.f8597w = b0.z(d1.k(this), (a71.h) null, (a0Shadow) null, new d(this, str, null), 3);
            return;
        }
        g1.a aVar = g1.Companion;
        k kVar = new k(str, new OrganizationNameAndAvatarUrl(str, str2, str3));
        aVar.getClass();
        t1 t1Var = new t1(kVar);
        y1 y1Var = this.f8595u;
        y1Var.getClass();
        y1Var.k((Object) null, t1Var);
    }
}
