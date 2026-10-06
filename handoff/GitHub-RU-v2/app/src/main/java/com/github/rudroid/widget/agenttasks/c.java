package com.github.rudroid.widget.agenttasks;

@c71.e(c = "com.github.rudroid.widget.agenttasks.AgentTasksGlanceWidget$provideGlance$2$1$1", f = "AgentTasksGlanceWidget.kt", l = {38}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class c extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ com.github.rudroid.widget.agenttasks.model.c w;
    public final /* synthetic */ oa.j x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.github.rudroid.widget.agenttasks.model.c cVar, oa.j jVar, a71.c cVar2) {
        super(2, cVar2);
        this.w = cVar;
        this.x = jVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new c(this.w, this.x, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            this.v = 1;
            if (this.w.b(this.x, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sy.y.j(obj);
        }
        return w61.a0.a;
    }
    public Object v(Object p1) { return null; }
}
