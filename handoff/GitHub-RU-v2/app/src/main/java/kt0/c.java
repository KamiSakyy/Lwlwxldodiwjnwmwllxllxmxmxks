package kt0;

import a0.s0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c {
    public final int a;

    public c(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.a == ((c) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return s0.i("Discussions(totalCount=", this.a, ")");
    }
    public Object c(Object p1, Object p2) { return null; }
    public static final Object a = null;
    public static final Object f = null;
    public static final Object i = null;
}
