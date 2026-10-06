package w61;

import sy.c0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v implements Comparable {
    public long r;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return k71.k.i(this.r ^ Long.MIN_VALUE, ((v) obj).r ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v) {
            return this.r == ((v) obj).r;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.r);
    }

    public final String toString() {
        return c0.q(10, this.r);
    }
}
