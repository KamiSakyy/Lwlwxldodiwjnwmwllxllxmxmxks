package com.github.rudroid.repository.files;

/* loaded from: /home/user/work/p/classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f19531a;

    /* renamed from: b, reason: collision with root package name */
    public final String f19532b;

    public a(String str, String str2) {
        k71.k.g(str, "baseBranch");
        k71.k.g(str2, "headBranch");
        this.f19531a = str;
        this.f19532b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k71.k.b(this.f19531a, aVar.f19531a) && k71.k.b(this.f19532b, aVar.f19532b);
    }

    public final int hashCode() {
        return this.f19532b.hashCode() + (this.f19531a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("BranchingHistoryData(baseBranch=", this.f19531a, ", headBranch=", this.f19532b, ")");
    }
}
