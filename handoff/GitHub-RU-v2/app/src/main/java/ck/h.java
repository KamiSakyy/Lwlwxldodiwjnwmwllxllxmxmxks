package ck;

import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h {
    public static final g Companion = new g();
    public final String a;
    public final long b;

    public h(String str, long j) {
        k.g(str, "query");
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return k.b(this.a, hVar.a) && this.b == hVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RecentSearchesEntry(query=" + this.a + ", performedAt=" + this.b + ")";
    }

    public /* synthetic */ h(String str) {
        this(str, System.currentTimeMillis());
    }
}
