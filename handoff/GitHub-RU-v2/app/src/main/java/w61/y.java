package w61;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y implements Comparable {
    public final short r;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return k71.k.h(this.r & 65535, ((y) obj).r & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y) {
            return this.r == ((y) obj).r;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.r);
    }

    public final String toString() {
        return String.valueOf(this.r & 65535);
    }
}
