package com.github.rudroid.widget.agenttasks;

@c71.e(c = "com.github.rudroid.widget.agenttasks.AgentTasksPreferences$setUser$2", f = "AgentTasksPreferences.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class k extends c71.j implements j71.e {
    public /* synthetic */ Object v;
    public final /* synthetic */ e w;
    public final /* synthetic */ b6.c x;
    public final /* synthetic */ oa.j y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(e eVar, b6.c cVar, oa.j jVar, a71.c cVar2) {
        super(2, cVar2);
        this.w = eVar;
        this.x = cVar;
        this.y = jVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        k kVar = new k(this.w, this.x, this.y, cVar);
        kVar.v = obj;
        return kVar;
    }

    public final Object s(Object obj, Object obj2) {
        k r = r((a71.c) obj2, (s5.b) obj);
        w61.a0 a0Var = w61.a0.a;
        r.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        s5.b bVar = (s5.b) this.v;
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        s5.e Q = b91.g.Q(e.c(this.x));
        String str = this.y.a;
        bVar.getClass();
        bVar.g(Q, str);
        return w61.a0.a;
    }
}
