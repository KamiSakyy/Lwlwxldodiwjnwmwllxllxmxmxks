package com.github.rudroid.createissue.propertybar.tooltips;

import sy.y;
import w61.a0;

@c71.e(c = "com.github.rudroid.createissue.propertybar.tooltips.CopilotHomeTooltipsDataStorePreferences$updateOption$2", f = "CopilotHomeTooltipsDataStorePreferences.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes.dex */
final class g extends c71.j implements j71.e {

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f10504v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s5.e f10505w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Long f10506x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(a71.c cVar, Long l, s5.e eVar) {
        super(2, cVar);
        this.f10505w = eVar;
        this.f10506x = l;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        g gVar = new g(cVar, this.f10506x, this.f10505w);
        gVar.f10504v = obj;
        return gVar;
    }

    public final Object s(Object obj, Object obj2) {
        g r10 = r((a71.c) obj2, (s5.b) obj);
        a0 a0Var = a0.a;
        r10.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        s5.b bVar = (s5.b) this.f10504v;
        b71.a aVar = b71.a.r;
        y.j(obj);
        bVar.f(this.f10505w, this.f10506x);
        return a0.a;
    }
}
