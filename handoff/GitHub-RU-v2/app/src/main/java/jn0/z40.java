package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z40 {
    public y40 a;
    public List b;

    public z40(y40 y40Var, List list) {
        this.a = y40Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z40)) {
            return false;
        }
        z40 z40Var = (z40) obj;
        return k71.k.b(this.a, z40Var.a) && k71.k.b(this.b, z40Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "TopRepositories(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}
