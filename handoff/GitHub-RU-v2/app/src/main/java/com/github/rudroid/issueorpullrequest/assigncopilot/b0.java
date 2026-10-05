package com.github.rudroid.issueorpullrequest.assigncopilot;

import com.github.rudroid.agents.x0;
import java.util.List;

/* loaded from: /home/user/work/p/classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final x0 f15204a;

    /* renamed from: b, reason: collision with root package name */
    public final List f15205b;

    public b0(x0 x0Var, List list) {
        k71.k.g(x0Var, "base");
        k71.k.g(list, "selectedAgents");
        this.f15204a = x0Var;
        this.f15205b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return k71.k.b(this.f15204a, b0Var.f15204a) && k71.k.b(this.f15205b, b0Var.f15205b);
    }

    public final int hashCode() {
        return this.f15205b.hashCode() + (this.f15204a.hashCode() * 31);
    }

    public final String toString() {
        return "AgentAssignmentUiModel(base=" + this.f15204a + ", selectedAgents=" + this.f15205b + ")";
    }
}
