package cq;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b {
    public int a;

    public b(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.a == ((b) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a0.s0.i("Following(totalCount=", this.a, ")");
    }
    public Object b(Object p1, Object p2, Object p3) { return null; }
    public Object c(Object, Object) { return null; }
    public Object e(Object, Object, Object) { return null; }
}
