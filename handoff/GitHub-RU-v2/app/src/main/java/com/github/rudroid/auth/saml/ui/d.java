package com.github.rudroid.auth.saml.ui;

import c71.j;
import sy.y;
import v71.z;
import w61.a0;

@c71.e(c = "com.github.rudroid.auth.saml.ui.SamlErrorContentWrapperKt$SamlErrorContentWrapper$1$1", f = "SamlErrorContentWrapper.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes.dex */
final class d extends j implements j71.e {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ com.github.rudroid.auth.saml.viewmodels.e f8572v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ fl.b f8573w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f8574x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.github.rudroid.auth.saml.viewmodels.e eVar, fl.b bVar, String str, a71.c cVar) {
        super(2, cVar);
        this.f8572v = eVar;
        this.f8573w = bVar;
        this.f8574x = str;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new d(this.f8572v, this.f8573w, this.f8574x, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        d r10 = r((a71.c) obj2, (z) obj);
        a0 a0Var = a0.a;
        r10.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        y.j(obj);
        this.f8572v.P(this.f8573w, this.f8574x);
        return a0.a;
    }
}
