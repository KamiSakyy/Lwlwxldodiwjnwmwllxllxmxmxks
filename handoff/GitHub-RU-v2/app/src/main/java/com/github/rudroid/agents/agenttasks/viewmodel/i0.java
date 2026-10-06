package com.github.rudroid.agents.agenttasks.viewmodel;

import java.util.List;

/* loaded from: /home/user/work/p/classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public Object f6532a;

    /* renamed from: b, reason: collision with root package name */
    public x01.i f6533b;

    public i0(List list, x01.i iVar) {
        this.f6532a = list;
        this.f6533b = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return this.f6532a.equals(i0Var.f6532a) && this.f6533b.equals(i0Var.f6533b);
    }

    public final int hashCode() {
        return this.f6533b.hashCode() + (this.f6532a.hashCode() * 31);
    }

    public final String toString() {
        return "HomeAgentUiModel(items=" + this.f6532a + ", page=" + this.f6533b + ")";
    }
}
