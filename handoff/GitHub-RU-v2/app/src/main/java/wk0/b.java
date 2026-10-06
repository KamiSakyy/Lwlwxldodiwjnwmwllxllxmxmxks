package wk0;

import gn0.e10;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b {
    public e10 a;
    public boolean b;

    public b(e10 e10Var, boolean z) {
        this.a = e10Var;
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
