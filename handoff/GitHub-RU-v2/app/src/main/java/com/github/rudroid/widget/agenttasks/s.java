package com.github.rudroid.widget.agenttasks;

@c71.e(c = "com.github.rudroid.widget.agenttasks.AgentTasksWidgetSettingsActivity$getAccountName$1", f = "AgentTasksWidgetSettingsActivity.kt", l = {25}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
class s extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ AgentTasksWidgetSettingsActivity w;
    public final /* synthetic */ b6.c x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(AgentTasksWidgetSettingsActivity agentTasksWidgetSettingsActivity, b6.c cVar, a71.c cVar2) {
        super(2, cVar2);
        this.w = agentTasksWidgetSettingsActivity;
        this.x = cVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new s(this.w, this.x, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sy.y.j(obj);
            return obj;
        }
        sy.y.j(obj);
        e eVar = this.w.k0;
        if (eVar == null) {
            k71.k.m("agentTasksPreferences");
            throw null;
        }
        this.v = 1;
        Object a = eVar.a(this.x, this);
        return a == aVar ? aVar : a;
    }
    public Object C() { return null; }
    public Object N() { return null; }
    public Object S(Object p1, Object p2) { return null; }
    public Object V() { return null; }
    public Object c0(Object p1) { return null; }
    public Object d(Object p1) { return null; }
    public Object e0(Object p1) { return null; }
    public Object f(Object p1) { return null; }
    public Object h(Object p1) { return null; }
    public Object n0(Object p1) { return null; }
    public Object q(Object p1) { return null; }
    public Object t() { return null; }
    public Object S(int p1, boolean p2) { return null; }
    public Object c0(int p1) { return null; }
    public Object d(int p1) { return null; }
    public Object e0(int p1) { return null; }
    public Object q(boolean p1) { return null; }
}
