package fw0;

import pz0.i90;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b {
    public i90 a;
    public boolean b;

    public b(i90 i90Var, boolean z) {
        this.a = i90Var;
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
    public Object c(Object, Object) { return null; }
    public Object e(Object, Object, Object) { return null; }
}
