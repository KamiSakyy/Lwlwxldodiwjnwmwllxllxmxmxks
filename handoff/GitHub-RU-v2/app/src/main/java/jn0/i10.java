package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i10 {
    public final k10 a;
    public final List b;

    public i10(k10 k10Var, List list) {
        this.a = k10Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i10)) {
            return false;
        }
        i10 i10Var = (i10) obj;
        return k71.k.b(this.a, i10Var.a) && k71.k.b(this.b, i10Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "Milestones(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}
