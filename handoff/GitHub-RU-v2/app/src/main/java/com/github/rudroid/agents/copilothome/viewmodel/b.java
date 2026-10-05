package com.github.rudroid.agents.copilothome.viewmodel;

import com.github.rudroid.utilities.ui.g1;

/* loaded from: /home/user/work/p/classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final g1 f6961a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6962b;

    public b(g1 g1Var, boolean z10) {
        this.f6961a = g1Var;
        this.f6962b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k71.k.b(this.f6961a, bVar.f6961a) && this.f6962b == bVar.f6962b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f6962b) + (this.f6961a.hashCode() * 31);
    }

    public final String toString() {
        return "CopilotHomeThreadsSection(state=" + this.f6961a + ", hasMoreItems=" + this.f6962b + ")";
    }
}
