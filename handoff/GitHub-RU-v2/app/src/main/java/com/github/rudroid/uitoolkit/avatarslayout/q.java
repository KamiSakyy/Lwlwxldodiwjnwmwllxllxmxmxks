package com.github.rudroid.uitoolkit.avatarslayout;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q {
    public final long a;
    public final long b;

    public q(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return d2.t.c(this.a, qVar.a) && d2.t.c(this.b, qVar.b);
    }

    public final int hashCode() {
        int i = d2.t.l;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return x.i.g("ThreeFaceStackColor(selectedColor=", d2.t.i(this.a), ", unselectedColor=", d2.t.i(this.b), ")");
    }
    public Object b(Object p1, Object p2, Object p3) { return null; }
}
