package com.github.rudroid.agents.sessionevents;

/* loaded from: /home/user/work/p/classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public xn.i3 f7749a;

    /* renamed from: b, reason: collision with root package name */
    public String f7750b;

    public o(xn.i3 i3Var, String str) {
        this.f7749a = i3Var;
        this.f7750b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return k71.k.b(this.f7749a, oVar.f7749a) && k71.k.b(this.f7750b, oVar.f7750b);
    }

    public final int hashCode() {
        return this.f7750b.hashCode() + (this.f7749a.hashCode() * 31);
    }

    public final String toString() {
        return "LocalUserMessage(event=" + this.f7749a + ", lastKnownSessionId=" + this.f7750b + ")";
    }
}
