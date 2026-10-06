package qx;

import m10.dg0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b {
    public dg0 a;
    public boolean b;

    public b(dg0 dg0Var, boolean z) {
        this.a = dg0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && this.b == bVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "NavLink(identifier=" + this.a + ", hidden=" + this.b + ")";
    }
    public Object b(Object p1, Object p2, Object p3) { return null; }
    public Object c(Object p1, Object p2) { return null; }
    public Object e(Object p1, Object p2, Object p3) { return null; }
}
