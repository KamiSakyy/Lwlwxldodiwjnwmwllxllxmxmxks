package wk0;

import gn0.e10;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b {
    public final e10 a;
    public final boolean b;

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
}
