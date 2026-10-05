package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k10 {
    public final j10 a;
    public final List b;

    public k10(j10 j10Var, List list) {
        this.a = j10Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k10)) {
            return false;
        }
        k10 k10Var = (k10) obj;
        return k71.k.b(this.a, k10Var.a) && k71.k.b(this.b, k10Var.b);
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
