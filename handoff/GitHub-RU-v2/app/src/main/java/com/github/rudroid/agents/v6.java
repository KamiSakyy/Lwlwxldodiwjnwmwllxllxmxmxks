package com.github.rudroid.agents;

/* loaded from: /home/user/work/p/classes.dex */
public final class v6 {

    /* renamed from: a, reason: collision with root package name */
    public on.l f8344a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8345b;

    public v6(on.l lVar, boolean z10) {
        this.f8344a = lVar;
        this.f8345b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v6)) {
            return false;
        }
        v6 v6Var = (v6) obj;
        return k71.k.b(this.f8344a, v6Var.f8344a) && this.f8345b == v6Var.f8345b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f8345b) + (this.f8344a.hashCode() * 31);
    }

    public final String toString() {
        return "SubagentUiModel(subagent=" + this.f8344a + ", isSelected=" + this.f8345b + ")";
    }
}
