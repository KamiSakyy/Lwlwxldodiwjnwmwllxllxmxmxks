package com.github.rudroid.auth.saml.viewmodels;

import com.github.rudroid.utilities.w0;
import sy.y;
import w61.a0;

@c71.e(c = "com.github.rudroid.auth.saml.viewmodels.SamlErrorHandlingViewModel$resolveError$1$2", f = "SamlErrorHandlingViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes.dex */
final class b extends c71.j implements j71.e {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ e f8587v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, a71.c cVar) {
        super(2, cVar);
        this.f8587v = eVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new b(this.f8587v, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        b r10 = r((a71.c) obj2, (y71.j) obj);
        a0 a0Var = a0.a;
        r10.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        y.j(obj);
        w0.n(this.f8587v.f8595u);
        return a0.a;
    }
}
