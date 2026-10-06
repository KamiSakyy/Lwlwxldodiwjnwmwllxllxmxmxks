package com.github.rudroid.widget.agenttasks.model;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public class b {
    public oa.j a;
    public List b;

    public b(List list, oa.j jVar) {
        k71.k.g(list, "agentTasks");
        this.a = jVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k71.k.b(this.a, bVar.a) && k71.k.b(this.b, bVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AgentTasksModel(user=" + this.a + ", agentTasks=" + this.b + ")";
    }
}
