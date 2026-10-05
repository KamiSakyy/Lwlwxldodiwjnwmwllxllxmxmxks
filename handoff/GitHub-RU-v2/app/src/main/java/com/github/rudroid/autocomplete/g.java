package com.github.rudroid.autocomplete;

import sy.y;
import v71.z;
import w61.a0;

@c71.e(c = "com.github.rudroid.autocomplete.LegacyAutoCompleteViewModel$fetchDiscussionMentionableItems$1", f = "LegacyAutoCompleteViewModel.kt", l = {124}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes.dex */
final class g extends c71.j implements j71.e {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ c f8631v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f8632w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(c cVar, String str, a71.c cVar2) {
        super(2, cVar2);
        this.f8631v = cVar;
        this.f8632w = str;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new g(this.f8631v, this.f8632w, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        g r10 = r((a71.c) obj2, (z) obj);
        a0 a0Var = a0.a;
        r10.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        y.j(obj);
        return a0.a;
    }
}
