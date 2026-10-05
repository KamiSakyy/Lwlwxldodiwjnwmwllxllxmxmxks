package qx;

import m10.dg0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b {
    public final dg0 a;
    public final boolean b;

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
}
