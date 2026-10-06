package w61;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t implements Comparable {
    public int r;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return k71.k.h(this.r ^ Integer.MIN_VALUE, ((t) obj).r ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t) {
            return this.r == ((t) obj).r;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.r);
    }

    public final String toString() {
        return String.valueOf(this.r & 4294967295L);
    }
}
