package com.github.rudroid.autocomplete;

import sy.y;
import w61.a0;

@c71.e(c = "com.github.rudroid.autocomplete.LegacyAutoCompleteViewModel$observeChannel$1", f = "LegacyAutoCompleteViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes.dex */
final class o extends c71.j implements j71.e {

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f8645v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f8646w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(c cVar, a71.c cVar2) {
        super(2, cVar2);
        this.f8646w = cVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        o oVar = new o(this.f8646w, cVar);
        oVar.f8645v = obj;
        return oVar;
    }

    public final Object s(Object obj, Object obj2) {
        o r10 = r((a71.c) obj2, (String) obj);
        a0 a0Var = a0.a;
        r10.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        String str = (String) this.f8645v;
        b71.a aVar = b71.a.r;
        y.j(obj);
        c cVar = this.f8646w;
        cVar.getClass();
        cVar.P(str);
        return a0.a;
    }
}
