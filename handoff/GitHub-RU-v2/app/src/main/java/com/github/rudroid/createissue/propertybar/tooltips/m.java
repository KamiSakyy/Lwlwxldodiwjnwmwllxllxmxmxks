package com.github.rudroid.createissue.propertybar.tooltips;

import sy.y;
import w61.a0;

@c71.e(c = "com.github.rudroid.createissue.propertybar.tooltips.CreateNewIssueTooltipsDataStorePreferences$updateOption$2", f = "CreateNewIssueTooltipsDataStorePreferences.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes.dex */
final class m extends c71.j implements j71.e {

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f10512v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s5.e f10513w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Long f10514x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(a71.c cVar, Long l, s5.e eVar) {
        super(2, cVar);
        this.f10513w = eVar;
        this.f10514x = l;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        m mVar = new m(cVar, this.f10514x, this.f10513w);
        mVar.f10512v = obj;
        return mVar;
    }

    public final Object s(Object obj, Object obj2) {
        m r10 = r((a71.c) obj2, (s5.b) obj);
        a0 a0Var = a0.a;
        r10.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        s5.b bVar = (s5.b) this.f10512v;
        b71.a aVar = b71.a.r;
        y.j(obj);
        bVar.f(this.f10513w, this.f10514x);
        return a0.a;
    }
}
