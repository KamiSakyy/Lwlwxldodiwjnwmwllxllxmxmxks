package v71;

/* loaded from: /home/user/work/p/classes5.dex */
public final class y extends a71.a {
    public static final w t = new w();
    public String s;

    public y() {
        super(t);
        this.s = "Room Invalidation Tracker Refresh";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && k71.k.b(this.s, ((y) obj).s);
    }

    public final int hashCode() {
        return this.s.hashCode();
    }

    public final String toString() {
        return a0.s0.m(new StringBuilder("CoroutineName("), this.s, ')');
    }
}
