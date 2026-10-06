package com.github.rudroid.widget.agenttasks;

import android.content.Context;
import com.github.rudroid.widget.agenttasks.e;
import com.google.android.gms.internal.measurement.z3;

@c71.e(c = "com.github.rudroid.widget.agenttasks.AgentTasksWidgetReceiver$onDisabled$1", f = "AgentTasksWidgetReceiver.kt", l = {31}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class m extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ Context w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context, a71.c cVar) {
        super(2, cVar);
        this.w = context;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new m(this.w, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        w61.a0 a0Var = w61.a0.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sy.y.j(obj);
            return a0Var;
        }
        sy.y.j(obj);
        e.Companion.getClass();
        e a = e.b.a(this.w);
        this.v = 1;
        Object n = z3.n(a.a, new f(2, null), this);
        if (n != aVar) {
            n = a0Var;
        }
        return n == aVar ? aVar : a0Var;
    }
    public Object h(Object p1) { return null; }
    public Object h(Object) { return null; }
}
