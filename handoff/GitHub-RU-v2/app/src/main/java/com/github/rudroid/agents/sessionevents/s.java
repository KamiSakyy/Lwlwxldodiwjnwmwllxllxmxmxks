package com.github.rudroid.agents.sessionevents;

import java.util.List;

/* loaded from: /home/user/work/p/classes.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    public Object f7817a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7818b;

    public s(List list, boolean z10) {
        this.f7817a = list;
        this.f7818b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f7817a.equals(sVar.f7817a) && this.f7818b == sVar.f7818b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f7818b) + (this.f7817a.hashCode() * 31);
    }

    public final String toString() {
        return "ProcessedEventsMultiSessionResult(sessions=" + this.f7817a + ", hasPullRequestProposal=" + this.f7818b + ")";
    }
}
