package com.github.rudroid.searchandfilter.complexfilter.user;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j {
    public yz0.f a;
    public boolean b;

    public j(yz0.f fVar, boolean z) {
        k71.k.g(fVar, "assignee");
        this.a = fVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return k71.k.b(this.a, jVar.a) && this.b == jVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RepositoryUser(assignee=" + this.a + ", isSelected=" + this.b + ")";
    }
}
