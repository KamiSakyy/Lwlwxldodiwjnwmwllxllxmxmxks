package gv;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d1 {
    public final c1 a;
    public final List b;

    public d1(c1 c1Var, List list) {
        this.a = c1Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        return k71.k.b(this.a, d1Var.a) && k71.k.b(this.b, d1Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "Patches(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}
