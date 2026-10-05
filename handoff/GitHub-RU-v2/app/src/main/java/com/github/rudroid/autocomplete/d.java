package com.github.rudroid.autocomplete;

import sy.y;
import v71.z;
import w61.a0;

@c71.e(c = "com.github.rudroid.autocomplete.LegacyAutoCompleteViewModel$fetchAutocomplete$1", f = "LegacyAutoCompleteViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes.dex */
final class d extends c71.j implements j71.e {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ c f8628v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f8629w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, String str, a71.c cVar2) {
        super(2, cVar2);
        this.f8628v = cVar;
        this.f8629w = str;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new d(this.f8628v, this.f8629w, cVar);
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
        this.f8628v.f8627z.j(this.f8629w);
        return a0.a;
    }
}
