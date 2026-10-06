package com.github.rudroid.uitoolkit;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z1 {
    public long a;
    public long b;

    public z1(int i, long j) {
        j = (i & 1) != 0 ? d2.t.k : j;
        long j2 = d2.t.k;
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z1)) {
            return false;
        }
        z1 z1Var = (z1) obj;
        return d2.t.c(this.a, z1Var.a) && d2.t.c(this.b, z1Var.b);
    }

    public final int hashCode() {
        int i = d2.t.l;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return x.i.g("RepositoryItemFontColors(repoOwnerColor=", d2.t.i(this.a), ", repoNameColor=", d2.t.i(this.b), ")");
    }
}
