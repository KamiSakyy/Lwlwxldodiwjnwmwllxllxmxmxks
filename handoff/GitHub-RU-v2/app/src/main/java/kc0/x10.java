package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x10 {
    public final v10 a;
    public final List b;

    public x10(v10 v10Var, List list) {
        this.a = v10Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x10)) {
            return false;
        }
        x10 x10Var = (x10) obj;
        return k71.k.b(this.a, x10Var.a) && k71.k.b(this.b, x10Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "StarredRepositories(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}
