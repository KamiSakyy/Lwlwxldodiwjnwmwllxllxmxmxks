package com.github.rudroid.widget.agenttasks;

import java.util.Iterator;

@c71.e(c = "com.github.rudroid.widget.agenttasks.AgentTasksWidgetWorker", f = "AgentTasksWidgetWorker.kt", l = {59, 61, 66}, m = "doWork", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class w extends c71.c {
    public int A;
    public int B;
    public /* synthetic */ Object C;
    public final /* synthetic */ AgentTasksWidgetWorker D;
    public int E;
    public com.github.rudroid.widget.agenttasks.model.c u;
    public e v;
    public Object w;
    public Iterator x;
    public z5.k y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(AgentTasksWidgetWorker agentTasksWidgetWorker, c71.c cVar) {
        super(cVar);
        this.D = agentTasksWidgetWorker;
    }

    public final Object v(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.c(this);
    }
}
