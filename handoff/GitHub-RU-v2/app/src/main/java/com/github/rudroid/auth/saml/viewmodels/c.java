package com.github.rudroid.auth.saml.viewmodels;

import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.ui.t1;
import com.github.service.models.response.organizations.OrganizationNameAndAvatarUrl;
import w61.a0;
import y71.y1;

/* loaded from: /home/user/work/p/classes.dex */
final class c<T> implements y71.j {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ e f8588r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f8589s;

    public c(e eVar, String str) {
        this.f8588r = eVar;
        this.f8589s = str;
    }

    public final Object c(Object obj, a71.c cVar) {
        y1 y1Var = this.f8588r.f8595u;
        g1.a aVar = g1.Companion;
        k kVar = new k(this.f8589s, (OrganizationNameAndAvatarUrl) obj);
        aVar.getClass();
        t1 t1Var = new t1(kVar);
        y1Var.getClass();
        y1Var.k((Object) null, t1Var);
        return a0.a;
    }
}
