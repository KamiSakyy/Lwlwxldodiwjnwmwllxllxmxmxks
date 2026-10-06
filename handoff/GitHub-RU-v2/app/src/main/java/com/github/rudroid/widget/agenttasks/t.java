package com.github.rudroid.widget.agenttasks;

import android.content.Context;
import com.google.android.gms.internal.measurement.z3;
import v8.l0;

@c71.e(c = "com.github.rudroid.widget.agenttasks.AgentTasksWidgetSettingsActivity$savePrefAndUpdateWidget$1", f = "AgentTasksWidgetSettingsActivity.kt", l = {35, 36}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class t extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ AgentTasksWidgetSettingsActivity w;
    public final /* synthetic */ b6.c x;
    public final /* synthetic */ oa.j y;
    public final /* synthetic */ Context z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(AgentTasksWidgetSettingsActivity agentTasksWidgetSettingsActivity, b6.c cVar, oa.j jVar, Context context, a71.c cVar2) {
        super(2, cVar2);
        this.w = agentTasksWidgetSettingsActivity;
        this.x = cVar;
        this.y = jVar;
        this.z = context;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new t(this.w, this.x, this.y, this.z, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
    
        if (r9 == r0) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        w61.a0 a0Var = w61.a0.a;
        if (i == 0) {
            sy.y.j(obj);
            e eVar = this.w.k0;
            if (eVar == null) {
                k71.k.m("agentTasksPreferences");
                throw null;
            }
            this.v = 1;
            Object n = z3.n(eVar.a, new k(eVar, this.x, this.y, null), this);
            if (n != aVar) {
                n = a0Var;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sy.y.j(obj);
                return a0Var;
            }
            sy.y.j(obj);
        }
        this.v = 2;
        int i2 = AgentTasksWidgetSettingsActivity.l0;
        Object S = l0.S(new d(), this.z, this);
        if (S != aVar) {
            S = a0Var;
        }
        return S == aVar ? aVar : a0Var;
    }
    public Object L(Object p1) { return null; }
    public Object f(Object p1, Object p2, Object p3) { return null; }
}
