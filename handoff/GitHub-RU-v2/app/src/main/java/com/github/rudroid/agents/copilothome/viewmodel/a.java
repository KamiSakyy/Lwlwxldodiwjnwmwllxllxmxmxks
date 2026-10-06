package com.github.rudroid.agents.copilothome.viewmodel;

import com.github.rudroid.utilities.ui.g1;

/* loaded from: /home/user/work/p/classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public g1 f6959a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6960b;

    public a(g1 g1Var, boolean z10) {
        this.f6959a = g1Var;
        this.f6960b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k71.k.b(this.f6959a, aVar.f6959a) && this.f6960b == aVar.f6960b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f6960b) + (this.f6959a.hashCode() * 31);
    }

    public final String toString() {
        return "CopilotHomeAgentSessionsSection(state=" + this.f6959a + ", hasMoreItems=" + this.f6960b + ")";
    }
}
