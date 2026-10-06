package com.github.rudroid.widget.agenttasks;

import android.content.Context;
import androidx.lifecycle.d1;
import com.github.rudroid.widget.agenttasks.AgentTasksWidgetWorker;

/* loaded from: /home/user/work/p/classes3.dex */
public final class AgentTasksWidgetSettingsActivity extends d0 {
    public static final /* synthetic */ int l0 = 0;
    public e k0;

    public AgentTasksWidgetSettingsActivity() {
        this.j0 = false;
        C(new c0(this));
    }

    @Override // com.github.rudroid.widget.f
    public final String s0(b6.c cVar) {
        return (String) v71.b0.D(a71.i.r, new s(this, cVar, null));
    }

    @Override // com.github.rudroid.widget.f
    public final int t0() {
        return 2131951748;
    }

    @Override // com.github.rudroid.widget.f
    public final void u0(Context context, oa.j jVar, b6.c cVar) {
        k71.k.g(context, "context");
        k71.k.g(jVar, "user");
        v71.b0.z(d1.i(this), (a71.h) null, (v71.a0Shadow) null, new t(this, cVar, jVar, context, null), 3).o0(new com.github.rudroid.support.u(12, this));
        AgentTasksWidgetWorker.Companion.getClass();
        AgentTasksWidgetWorker.a.a(context);
    }

    public static Object C(Object... a) {
        return null;
    }
}
