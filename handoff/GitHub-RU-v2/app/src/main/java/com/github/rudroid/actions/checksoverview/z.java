package com.github.rudroid.actions.checksoverview;

/* loaded from: /home/user/work/p/classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final String f4979a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4980b;

    public z(String str, String str2) {
        k71.k.g(str, "commitId");
        k71.k.g(str2, "pullRequestId");
        this.f4979a = str;
        this.f4980b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return k71.k.b(this.f4979a, zVar.f4979a) && k71.k.b(this.f4980b, zVar.f4980b);
    }

    public final int hashCode() {
        return this.f4980b.hashCode() + (this.f4979a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("CommitAndPrId(commitId=", this.f4979a, ", pullRequestId=", this.f4980b, ")");
    }
}
